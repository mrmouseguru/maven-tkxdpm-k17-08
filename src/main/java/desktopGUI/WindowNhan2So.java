package desktopGUI;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import nhan2so.InputBoundary;
import nhan2so.Nhan2SoEntity;
import nhan2so.Nhan2SoUseCaseControl;
import nhan2so.OutputBoundary;
import presenters.Nhan2SoPresenter;
import presenters.Nhan2SoViewModel;

public class WindowNhan2So extends JFrame {

	public WindowNhan2So() {
		khoiTaoCacThanhPhan();
		//đóng cửa số tắt chương trình
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//kích thước window
		//setSize(400, 400);
		pack();//gói gọn
		//hiện ra
		setVisible(true);
	}
	
	private void khoiTaoCacThanhPhan() {
		//bố cục
				GridLayout grid = new GridLayout(3, 2);
				//thiết lập bố cục cho cửa sổ của chúng ta
				setLayout(grid);
				
				JLabel lbl1 = new JLabel("Number 1:");
				JTextField tf1 = new JTextField(20);//20: chiều dài
				add(lbl1);//dòng 1 cột 1
				add(tf1);//dòng 1 cột 2
				JLabel lbl2 = new JLabel("Number 2:");
				JTextField tf2 = new JTextField(20);//20: chiều dài
				add(lbl2);//dòng 2 cột 1
				add(tf2);//dòng 2 cột 2
				//dòng 3
				JLabel lbl3 = new JLabel("");
				add(lbl3);
				JButton btX = new JButton("X");
				btX.addActionListener(
						
						new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								//sinh viên cài đặt code ở đây
								//để khi click lên nút thì nó nàm gì
								ResultDialogView view = new ResultDialogView();
								OutputBoundary out = null;
								Nhan2SoViewModel model = new Nhan2SoViewModel();
								view.setModel(model);//đăng ký
								out  = new Nhan2SoPresenter(model);
								Nhan2SoEntity entity = new Nhan2SoEntity();
								InputDTO inDTO = new InputDTO();
								InputBoundary in = null;
								in = new Nhan2SoUseCaseControl(out, entity);
								inDTO.num1 = tf1.getText();
								inDTO.num2 = tf2.getText();
								Nhan2SoController controller = 
										new Nhan2SoController(in);
								controller.execute(inDTO);//tạo dữ liệu trong model
								
								model.notifySubscribers();
								
							}
						}
						
						);
				
				
				add(btX);
				
	}
	
	public static void main(String[] args) {
		WindowNhan2So window = new WindowNhan2So();
	}
}
