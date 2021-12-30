package mediator;

public class Main 
{
    public static void main(String[] args) 
    {
        IChatRoom chatroom = new ChatRoom();
         
        User user1 = new ChatUser(chatroom,"1", "Lewis");
        User user2 = new ChatUser(chatroom,"2", "Max");
        User user3 = new ChatUser(chatroom,"3", "Lando");
        User user4 = new ChatUser(chatroom,"4", "Pierre");
         
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        
        user1.send("Top of the morning", "2");
        user2.send("Hey buddy", "1");
        
    }
}

