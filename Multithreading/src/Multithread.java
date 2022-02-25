
//Extending Thread
class Multithreading extends Thread {
    public void run()
    {
        try {
           
            System.out.println(
                "Thread " + ( (Multithreading) Thread.currentThread()).getId()
                + " is running");
        }
        catch (Exception e) {
            
            System.out.println("Exception is caught");
        }
    }

	private String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	            Multithreading object
	                = new Multithreading();
	            object.start();
	}

}
}