
//Implementing Runnable
class Multi implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + ((Multithreading2) Thread.currentThread()).getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
public class Multithreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread();
            object.start();
        }
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
