package api;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import nhan2so.InputBoundary;
import nhan2so.InputData;
import nhan2so.Nhan2SoEntity;
import nhan2so.Nhan2SoUseCaseControl;
import nhan2so.OutputBoundary;
import presenters.Nhan2SoPresenterAPI;
import presenters.Nhan2SoViewModelAPI;

@Path("/nhan2so")
@Consumes(MediaType.APPLICATION_JSON) // nhận loại dữ liệu JSON
/*
 * { "num1": 5, "num2": 10 }
 */
@Produces(MediaType.APPLICATION_JSON) // phản hồi về bên gọi dữ liệu JSON
public class Nhan2SoRestfulWsApi {

	@POST // nhận http request POST
	public Response nhan2soAPI(RequestData body) {
		if (body == null || body.num1 == null || body.num2 == 3) {
			Nhan2SoViewModelAPI resp = new Nhan2SoViewModelAPI();
			resp.setSuccess(false);
			resp.setMessage("Missing num1 or num2 in request body");
			return Response.status(Response.Status.BAD_REQUEST)
					.entity(resp).build();//build JSON

		}

		// body valid
		// ...
		OutputBoundary out; // Presenter dành riêng cho API
		Nhan2SoViewModelAPI responseModel = new Nhan2SoViewModelAPI();
		out  = new Nhan2SoPresenterAPI(responseModel);
		Nhan2SoEntity entity = new Nhan2SoEntity();
		InputBoundary in = new Nhan2SoUseCaseControl(out, entity);
		InputData inData = new InputData(body.num1, body.num2);
		in.execute(inData);
		
		return Response.ok(responseModel).build();//build JSON

	}

}
