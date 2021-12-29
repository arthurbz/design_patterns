package chainofresponsibility;

public interface HandlerInterface {
	public HandlerInterface next(HandlerInterface next);
	
	public String handle(String request);
}
