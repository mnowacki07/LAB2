package dad;

public class ReceiveLIFO extends MyAbstract {

	Sending sending = new Sending();

	public void takingMessage() {
		for (int i = sending.messageList.size() - 1; i >= 0; i--) {
			System.out.println(sending.messageList.get(i));
		}
		sending.messageList.clear();
	}

}