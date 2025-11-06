package tinh2so.nhan2so;

import java.text.SimpleDateFormat;
import java.util.Date;

import tinh2so.OutputBoundary;
import tinh2so.ResponseData2So;

public class Nhan2SoPresenter implements OutputBoundary{
	private Nhan2SoViewModel model;

	public Nhan2SoPresenter(Nhan2SoViewModel model) {
		this.model = model;
	}



	@Override
	public void present(ResponseData2So res) {
		model.currenDay = converter(res.currentDay);
		//invalid
		if(res.message != null) {
			model.message = res.message;
			return;
		}
		//valid
		model.result = String.valueOf(res.result);
		//chẵn lẻ
		
		ResponseDataNhan2So resNhan2So = (ResponseDataNhan2So) res;
		if(resNhan2So.isEven) {
			model.color = "GREEN";

		}else {
			model.color = "YELLOW";
		}
	}



	private String converter(Date currentDay) {
		SimpleDateFormat converter = new SimpleDateFormat("dd/MM/yyyy");
		return converter.format(currentDay);
	}
	
}
