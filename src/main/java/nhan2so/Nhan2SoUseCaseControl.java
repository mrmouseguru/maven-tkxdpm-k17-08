package nhan2so;

public class Nhan2SoUseCaseControl implements InputBoundary
{
	private OutputBoundary out;
	private Nhan2SoEntity n2so;

	
	
	public Nhan2SoUseCaseControl
	(OutputBoundary out, 
			Nhan2SoEntity n2so) {
		
		this.out = out;
		this.n2so = n2so;
	}

	@Override
	public OutputData execute(InputData inData) {
				int result = n2so.nhan2So(inData.num1, 
				inData.num2);//tested
	              //định dạng dữ liệu
		OutputData outData = new OutputData();
		outData.result = result;//tested
		
		out.present(outData);//chuyển dữ liệu cho Pressenter- tested
		return outData;//testing
	}

}
