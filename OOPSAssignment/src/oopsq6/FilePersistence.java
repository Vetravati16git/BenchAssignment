package oopsq6;
public class FilePersistence extends Persistence{

	@Override
	void persist() {
	System.out.println("Data is saved in file");	
	}

	public static void main(String[] args) {		
		Persistence p1= new FilePersistence(); //upcasting 
		p1.persist();
	}
}
