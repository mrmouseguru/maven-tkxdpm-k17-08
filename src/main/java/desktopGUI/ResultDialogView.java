package desktopGUI;

import javax.swing.JOptionPane;

import presenters.Nhan2SoViewModel;

public class ResultDialogView 
implements Subscriber{
	private Nhan2SoViewModel model;
	
	public void setModel(Nhan2SoViewModel model) {
		this.model = model;
		//đăng ký
		model.addSubscriber(this);
	}

	@Override
	public void update() {
		JOptionPane.showMessageDialog(null, "Result: " + model.result);
		
	}
	
	

}
