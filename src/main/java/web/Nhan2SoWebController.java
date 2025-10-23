package web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import nhan2so.InputBoundary;
import nhan2so.InputData;
import nhan2so.Nhan2SoEntity;
import nhan2so.Nhan2SoUseCaseControl;
import nhan2so.OutputBoundary;
import presenters.Nhan2SoPresenter;
import presenters.Nhan2SoViewModel;

@WebServlet("/nhan2so")
public class Nhan2SoWebController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Lấy dữ liêu từ Web Server
		String strNum1 = req.getParameter("num1");
		String strNum2 = req.getParameter("num2");
		
		//chuyển sang dạng Use case và entities
		InputData inData = new InputData();
		inData.num1 = Integer.parseInt(strNum1);
		inData.num2 = Integer.parseInt(strNum2);
		Nhan2SoEntity entity = new Nhan2SoEntity();
		Nhan2SoViewModel model = new Nhan2SoViewModel();
		//gọi đến Use case thông qua InputBoundary
		OutputBoundary out = new Nhan2SoPresenter(model);
		InputBoundary in = new Nhan2SoUseCaseControl(out, entity);
		in.execute(inData);
		
		//chờ 1 2 3
		//đóng gói model vào trong req
		req.setAttribute("model", model);
		
		//đẩy sang result.jsp để trình diễn
		req.getRequestDispatcher("/result.jsp")
		.forward(req, resp);
	}
	
	
}
