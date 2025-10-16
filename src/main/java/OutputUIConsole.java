import java.io.PrintWriter;

public class OutputUIConsole implements OutputBoundary{
	private PrintWriter out;
	
	
	
	public OutputUIConsole(PrintWriter out) {
		this.out = out;
	}



	@Override
	public void present(OutputData outData) {
		// TODO Auto-generated method stub
		String strOut = String.valueOf(outData.result);
		out.println("Kết quả là: " + strOut);
		out.flush();
	}

}
