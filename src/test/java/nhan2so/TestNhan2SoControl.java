package nhan2so;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNhan2SoControl {
	
	@Test
	public void testExecute() {
		//input
		InputData inData = new InputData();
		inData.num1 = 2;
		inData.num2 = 2;
		//xử lý
		Nhan2SoEntity entity = new Nhan2SoEntity();//tested
		InputBoundary in = null;
		in = new Nhan2SoUseCaseControl(null, entity);
		OutputData outData =  in.execute(inData);
		//output
		
		//check input vs output
		assertEquals(4, outData.result);
	}

}
