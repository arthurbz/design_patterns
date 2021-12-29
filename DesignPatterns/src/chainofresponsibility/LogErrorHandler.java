package chainofresponsibility;

public class LogErrorHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogErrorHandle - Trying to handle request");
		String result = null;
		
		if(request == "error") {
			result = "Accepted: Handling ERROR log";
		}
		
		return result;
	}

}
