
public class Nhan2SoEntity {
	// trừu tượng input/ output
	private int number1;
	private int number2;

	public Nhan2SoEntity(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
	}
	
	public Nhan2SoEntity() {
		
	}

	int nhan2So() {

		return number1 * number2;

	}
	
	int nhan2So(int num1, int num2) {
		this.number1 = num1;
		this.number2 = num2;
		return number1 * number2;

	}


}
