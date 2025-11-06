package tinh2so;

public abstract class Tinh2SoControl {
	protected OutputBoundary out;
	protected ResponseData2So res;

	protected Tinh2SoControl(OutputBoundary out) {
		this.out = out;
	}

	protected abstract void execute(RequestData2So rq);

	public void control(RequestData2So req) {
		// code
		res.currentDay = Tinh2So.getCurrentDay();
		execute(req);// đa hình gọi đến hành của tất cả các con

		present();
	}

	public ResponseData2So getRes() {
		return res;
	}

	private void present() {
		if (out != null) {
			out.present(res);

		}
	}

}
