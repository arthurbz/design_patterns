package chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		/* Instancing handlers */
		LogInfoHandler logInfoHandler = new LogInfoHandler();
		LogWarningHandler logWarningHandler = new LogWarningHandler();
		LogErrorHandler logErrorHandler = new LogErrorHandler();
		
		logInfoHandler.next(logWarningHandler);
		logWarningHandler.next(logErrorHandler);
		
		
		String response = logInfoHandler.handle("error");
		System.out.println(response);
	}

}
