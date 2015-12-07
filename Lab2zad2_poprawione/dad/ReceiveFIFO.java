package dad;

public class ReceiveFIFO extends MyAbstract {
	Sending sending = new Sending();

	public void takingMessage() {
		System.out.println(sending.messageList.size());
		for (int i = 0; i < sending.messageList.size(); i++) {
			System.out.println(sending.messageList.get(i));
		}
		sending.messageList.clear();
	}

}
