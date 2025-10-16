package desktopGUI;

import nhan2so.InputBoundary;
import nhan2so.InputData;

public class Nhan2SoController {
	private InputBoundary in;

	public Nhan2SoController(InputBoundary in) {
		this.in = in;
	}
	
	public void execute(InputDTO inDTO) {
		//chuyển InputDTO sang dạng 
		//Use case và Entity sử dụng được
		InputData inData = new InputData(
			Integer.parseInt(inDTO.num1),
			Integer.parseInt(inDTO.num2));
		
		in.execute(inData);//tested - kích hoạt use case và 
		//entity
		
	}
	
	
	

}
