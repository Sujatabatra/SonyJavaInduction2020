package com.sujata.demo;

public class Account implements Runnable {

	static int balance = 1000;

	@Override
	/*synchronized*/ public void run() {

		/*
		 * Class level lock : If any object of class is accessing below block //
		 * then any other object will not be allowed to execute this block till
		 * the time previous object is not completed with its execution
		 */
		// synchronized (Account.class) {

		/*
		 * Object Level Lock : if any thread is running below block with ob1
		 * object then any other thread will not get the access of below block
		 * with ob1 but will get the access of below block with any other object
		 */
		synchronized (this) {
			if (balance > 800) {
				System.out.println(Thread.currentThread().getName()
						+ " you have sufficient balance to withdraw , your balance is : Rs." + balance);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				balance -= 800;
				System.out
						.println(Thread.currentThread().getName() + " you balance after withdrawl is : Rs." + balance);
			} else {
				System.out.println(Thread.currentThread().getName()
						+ " you don't have sufficient balance to withdraw , your balance is : Rs." + balance);
			}

		}
	}

}
