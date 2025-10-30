package tinh2so.nhan2so;

import tinh2so.Tinh2So;

public class Nhan2SoEntity extends Tinh2So{

	public Nhan2SoEntity(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int tinh2so() {
		return num1 * num2;
	}
	
	public static boolean checkInput(int num) {
		if(num >=0 && num <=10) {
			return true;
		}
		
		return false;
	}
	
	//sinh viên tự them
	
	
	
	

}
