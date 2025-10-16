import javax.swing.JOptionPane;

public class InputGUI implements InputBoundary {

	@Override
	public InputData input() {
		String strNum1 = 
				JOptionPane.showInputDialog("[CHO EM XIN SỐ 1]");
		String strNum2 = 
				JOptionPane.showInputDialog("[CHO EM XIN SỐ 2]");
		
		int num1 = Integer.parseInt(strNum1);
		
		int num2 = Integer.parseInt(strNum2);
		
		InputData inData = new InputData(num1, num2);

		return inData;
	}
	
	

}
