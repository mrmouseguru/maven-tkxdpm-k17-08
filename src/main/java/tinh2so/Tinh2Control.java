package tinh2so;


public abstract class Tinh2Control {
	protected OutputBoundary out;
	protected ResponseData2So res;
	
	protected Tinh2Control(OutputBoundary out) {
		this.out = out;
		res = new ResponseData2So();
	}

	protected abstract void execute(RequestData2So rq);
	
	public void control(RequestData2So req) {
		//code
		execute(req);//đa hình gọi đến hành của tất cả các con
	}
	
	public ResponseData2So getRes() {
		return res;
	}

}
