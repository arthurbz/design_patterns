package chainofresponsibility;

public class LogWarningHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogErrorHandle - Trying to handle request");
		String result = null;
		
		if(request == "warning") {
			result = "Accepted: Handling WARNING log";
		}
		
		return result;
	}

}
