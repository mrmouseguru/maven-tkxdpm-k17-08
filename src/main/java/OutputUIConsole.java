import java.io.PrintWriter;

public class OutputUIConsole implements OutputInterface{
	private PrintWriter out;
	
	
	
	public OutputUIConsole(PrintWriter out) {
		this.out = out;
	}



	@Override
	public void output(OutputData outData) {
		// TODO Auto-generated method stub
		String strOut = String.valueOf(outData.result);
		out.println("Kết quả là: " + strOut);
		out.flush();
	}

}
