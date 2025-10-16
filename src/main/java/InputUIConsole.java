import java.io.PrintWriter;
import java.util.Scanner;

public class InputUIConsole implements InputBoundary{
	private Scanner in;
	private PrintWriter out;
	
	
	public InputUIConsole(Scanner in,
			PrintWriter out) {
		this.in = in;
		this.out = out;
	}


	@Override
	public InputData input() {
		out.print("[CHO EM XIN SỐ 1]:");
		out.flush();
		int number1 = in.nextInt();
		out.print("[CHO EM XIN SỐ 2]:");
		out.flush();
		int number2 = in.nextInt();
		InputData inData = new InputData();
		inData.num1 = number1;
		inData.num2 = number2;
		return inData;
		
	}

}
