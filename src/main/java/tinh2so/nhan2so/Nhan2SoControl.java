package tinh2so.nhan2so;

import tinh2so.OutputBoundary;
import tinh2so.RequestData2So;
import tinh2so.Tinh2Control;

public class Nhan2SoControl extends Tinh2Control {
	protected Nhan2SoControl(OutputBoundary out) {
		super(out);

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

	}

}
