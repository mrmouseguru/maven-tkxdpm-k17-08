
public class Nhan2SoUseCaseControl {
	private InputInterface in;
	private OutputInterface out;
	private Nhan2SoEntity n2so;

	
	
	public Nhan2SoUseCaseControl
	(InputInterface in, OutputInterface out, 
			Nhan2SoEntity n2so) {
		this.in = in;
		this.out = out;
		this.n2so = n2so;
	}



	public void execute() {
		InputData inData =  in.input();
		//không nhân 2 số trực tiếp - gián tiếp
		int result = n2so.nhan2So(inData.num1, 
				inData.num2);
	              //định dạng dữ liệu
		OutputData outData = new OutputData();
		outData.result = result;
		out.output(outData);
	}

}
