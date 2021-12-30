package mediator;

public interface IChatRoom {
	public void sendMessage(String msg, String userId);
	public void addUser(User user);
}

