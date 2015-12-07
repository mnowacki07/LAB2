package dad;

public class Message { 
	
	
private int id ; 
private String text;  
private Priority priority ;


Message(int id, String text, Priority priority ){ 
	this.id=id; 
	this.text=text; 
	this.priority=priority;
}  

@Override
public String toString() {
	return "Message id:" + id + ", text:" + text + ", priority:" + priority
			;
}





}
