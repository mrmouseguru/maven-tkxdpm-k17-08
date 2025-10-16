package nhan2so;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import presenters.Nhan2SoPresenter;
import presenters.Nhan2SoViewModel;

public class TestNhan2SoControl {
	
	@Test
	public void testExecute() {
		//input
		InputData inData = new InputData();
		inData.num1 = 2;
		inData.num2 = 2;
		OutputBoundary out = null;
		Nhan2SoViewModel model = null;
		model = new Nhan2SoViewModel();
		out = new Nhan2SoPresenter(model);
		//xử lý
		Nhan2SoEntity entity = new Nhan2SoEntity();//tested
		InputBoundary in = null;
		in = new Nhan2SoUseCaseControl(out, entity);
		OutputData outData =  in.execute(inData);
		//output
		
		//check input vs output
		assertEquals(4, outData.result);
		assertEquals("4", model.result);
	}

}
