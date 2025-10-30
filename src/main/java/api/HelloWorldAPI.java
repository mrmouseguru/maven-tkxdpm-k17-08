package api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")//url
public class HelloWorldAPI {

	@GET//nhận một http Request GET
	@Produces(MediaType.TEXT_PLAIN)//tạo ra chuỗi để phản hồi
	public String hello() {
		//phản hồi chuỗi - về nơi gọi
		return "Hello tkxdpm-k17-08";
	}
}
