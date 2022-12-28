package pb9_4;

public class Facebook {

	public static void main(String[] args) {
		
		FacebookAccount user1 = new FacebookAccount("Cata",20," ");
		
		FacebookAccount user2 = new FacebookAccount("Maria",20," ");

		user1.addFriend(user2);
		user1.listFriends();
	}

}
