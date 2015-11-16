package dad;


import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;



public class Messeges {

	List<String> listOfMessage = new LinkedList<String>();  
	List<Enum> listOfPriority = new LinkedList<Enum>(); 
	List<String> auxiliarylistOfID = new LinkedList<String>(); 
	List<Enum> auxiliaryListOfPriority = new LinkedList<Enum>(); 
	List<String> listOfID = new LinkedList<String>();
	public void sending(){
		Menu menu=new Menu();
		int howMany=0;
		try{
			 howMany=readLineInt();
			 }catch(InputMismatchException e) {
			     System.out.println("Blad. Nie podano liczby!!!"); 
		     };
		
		for(int i=0; i<howMany;i++){ 
			listOfPriority.add(Importence.valueOf(readLine()));
			listOfID.add(readLine())	;
			listOfMessage.add( readLine()); 
			
		}  
		
		
	} 
	
	
	
	public void allFifo(){ 
		int size=listOfID.size(); 
		for(int i=0 ; i<size ; i++){
			System.out.println(listOfID.get(i)+(" ")+listOfMessage.get(i)+(" ")+listOfPriority.get(i)); 
		}
	} 
	
	public void allLifo(){  
		int size=listOfID.size();
		for(int i=(size-1) ; i>=0 ; i--){
			System.out.println(listOfID.get(i)+(" ")+listOfMessage.get(i)+(" ")+listOfPriority.get(i)); 
			
			}
		
	} 
	
	public void searchOnPriorityFifo(){  
		int size=0; 
		String priority=readLine();
		for(int i=size; i<listOfPriority.size();i++) {
		   
			 
		    size=listOfPriority.indexOf(Importence.valueOf(priority))+1;
		    if(listOfPriority.get(i).equals(Importence.valueOf(priority))){
		    	auxiliaryListOfPriority.add(listOfPriority.get(listOfPriority.indexOf(Importence.valueOf(priority))));    
		    for(int j=0 ; j<auxiliaryListOfPriority.size(); j++){    
			    System.out.println(listOfID.get(i)+(" ")+listOfMessage.get(i)+(" ")+auxiliaryListOfPriority.get(j));  
			
			    break;
				} 
		 
		    }
		
		   }  
		
		   
		   }  
	
	public void searchOnIDFifo(){  
		int size=0; 
		String id=readLine();
		for(int i=size; i<listOfID.size();i++) {
		   
			 
		    size=listOfID.indexOf(id)+1;
		    if(listOfID.get(i).equals(id)){
		    	 auxiliarylistOfID.add(listOfID.get(listOfID.indexOf(id)));    
		    for(int j=0 ; j< auxiliarylistOfID.size(); j++){    
			    System.out.println( auxiliarylistOfID.get(j)+(" ")+listOfMessage.get(i)+(" ")+listOfPriority.get(i));  
			break;
			    
				} 
		 
		    }
			
		   }  
		  
		   
		   }  
	
	public void searchOnPriorityLifo(){  
		int size=0; 
		String priority=readLine();
		for(int i=listOfPriority.size()-1; i>size;i--) {
		   
			 
		    size=listOfPriority.indexOf(Importence.valueOf(priority))-1;
		    if(listOfPriority.get(i).equals(Importence.valueOf(priority))){
		    	auxiliaryListOfPriority.add(listOfPriority.get(listOfPriority.indexOf(Importence.valueOf(priority))));    
		    for(int j=auxiliaryListOfPriority.size()-1 ; j>=0; j--){    
			    System.out.println(listOfID.get(i)+(" ")+listOfMessage.get(i)+(" ")+auxiliaryListOfPriority.get(j));  
			break;
			  
				} 
		
		    }
		
		   }  
	
		   
		   }  
	
	public void searchOnIDLifo(){  
		int size=0; 
		String id=readLine();
		for(int i=listOfID.size()-1; i>size;i--) {
		   
			 size=listOfID.indexOf(id)-1;
		    
		    if(listOfID.get(i).equals(id)){
		    	 auxiliarylistOfID.add(listOfID.get(listOfID.indexOf(id)));    
		    for(int j= auxiliarylistOfID.size()-1 ; j>=0; j--){    
			    System.out.println( auxiliarylistOfID.get(j)+(" ")+listOfMessage.get(i)+(" ")+listOfPriority.get(i));  
			
			    break;
				} 
		 
		    }
		   
		   }  
		  
		   
		   } 
		
	
	
	public String readLine() {
		  
		   Scanner scanner = new Scanner(System.in);
		         String send = scanner.nextLine();
		  return send;
}  
	
	public int readLineInt() {

		  Scanner scanner = new Scanner(System.in);
		  int userChoice = scanner.nextInt();
		  return userChoice;

		 }
} 

