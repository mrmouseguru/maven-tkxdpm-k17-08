package tinh2so.nhan2so;

import tinh2so.OutputBoundary;
import tinh2so.RequestData2So;
import tinh2so.Tinh2SoControl;

public class Nhan2SoControl extends Tinh2SoControl {
	protected Nhan2SoControl(OutputBoundary out) {
		super(out);
		res = new ResponseDataNhan2So();

	}

	@Override
	protected void execute(RequestData2So rq) {
		// kiểm tra đầu vào
		try {
			Nhan2SoEntity.checkInput(rq.num1);
			Nhan2SoEntity.checkInput(rq.num2);
		} catch (IllegalArgumentException e) {
			//xử lý ngoại lệ
			res.message = e.getMessage();//"INVALID_INPUT"=>ResponseData2So
		}
		
		//valid
		//sai khiến Entity
		Nhan2SoEntity entity = new Nhan2SoEntity(rq.num1, rq.num2);
		int result = entity.tinh2so();
		//nhét result vào ResponseData2So
		res.result = result;
		
		//kiểm tra even odd cho result
		//sai khiến
		ResponseDataNhan2So resNhan2So = (ResponseDataNhan2So) res;
		resNhan2So.isEven = entity.checkEven(result);
		
		//chuyển ResponseDataNhan2So thành ResponseData2So
		res = resNhan2So;

	}

}
