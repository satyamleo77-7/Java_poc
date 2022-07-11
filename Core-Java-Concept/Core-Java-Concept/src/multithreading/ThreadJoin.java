package multithreading;

public class ThreadJoin {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 9; i++) {
				System.out.println("Maa sita");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
		};
		Thread t = new Thread(r);
		t.start();
		try {
			t.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 9; i++) {
			System.out.println("Sri Ram"); 
		}
		
	}
}
