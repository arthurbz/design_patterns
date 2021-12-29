package chainofresponsibility;

public class LogInfoHandler extends AbstractHandler{

	@Override
	protected String process(String request) {
		System.out.println("LogErrorHandle - Trying to handle request");
		String result = null;
		
		if(request == "info") {
			result = "Accepted: Handling INFO log";
		}
		
		return result;
	}

}
