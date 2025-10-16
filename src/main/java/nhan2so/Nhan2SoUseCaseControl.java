package nhan2so;

public class Nhan2SoUseCaseControl implements InputBoundary
{
	
	private OutputInterface out;
	private Nhan2SoEntity n2so;

	
	
	public Nhan2SoUseCaseControl
	(OutputInterface out, 
			Nhan2SoEntity n2so) {
		
		this.out = out;
		this.n2so = n2so;
	}

	@Override
	public OutputData execute(InputData inData) {
				int result = n2so.nhan2So(inData.num1, 
				inData.num2);
	              //định dạng dữ liệu
		OutputData outData = new OutputData();
		outData.result = result;
		return outData;//testing
		//out.output(outData);
	}

}
