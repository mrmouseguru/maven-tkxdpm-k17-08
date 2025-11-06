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
	
	public static void checkInput(int num) {
		//Exception handling
		if(num < 0 || num > 9)
		{
			//ném đối tượng ngoại lệ về caller / client code
			//
			throw new IllegalArgumentException("INVALID_INPUT");
		}
	}
	/*
	 * true: even
	 * false: odd
	 */
	public boolean checkEven(int result) {
		if(result % 2 ==0)
			return true;
		
		return false;
	}
	
	
	
	

}
