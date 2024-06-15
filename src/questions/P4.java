package questions;


// Achieve Multithreading by using Thread class

//public class P4 extends Thread {
//
//	 @Override
//	    public void run() {
//	        for(int i = 1; i<=20;i++){
//	            System.out.println(i);
//	        }
//	    }
//	    public static void main(String[] args) {
//	        P4 ref1 = new P4();
//	        P4 ref2 = new P4();
//	        ref1.run();
//	        ref2.run();
//	    }
//}


// By Using Runnable interface

public class P4 implements Runnable{
	@Override
	public void run() {
		for(char ch = 'a';ch<='o';ch++) {
			System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		P4 ref = new P4();
		Thread t1 = new Thread(ref);
		Thread t2 = new Thread(ref);
		t1.start();
		t2.start();
	}
}
