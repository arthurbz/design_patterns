package chainofresponsibility;

public abstract class AbstractHandler implements HandlerInterface{

	private HandlerInterface next;
	
	
	@Override
	public HandlerInterface next(HandlerInterface handler) {
		this.next = handler;
		return handler;
	}

	/*
	 * handle method shouldn't be modified by inherited classes
	 */
	@Override
	final public String handle(String request) { 
		String result = this.process(request);
		
		if ((result == null || result.isEmpty()) && this.next!=null) {
			System.out.println("Denied: passing through next handler...");
			result = this.next.handle(request);
		}
		
		return result;
	}
	
	abstract protected String process(String request);
	
}
