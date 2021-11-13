package com.concurrency.tasks;

public class Task2  implements Runnable {

	public void run() {
		try {
			System.out.println("[ThreadName: "+ Thread.currentThread().getName()+" [Task2: Started Processing]");
			Thread.sleep(5000);
			System.out.println("[ThreadName: "+ Thread.currentThread().getName()+" [Task2: Completed Processing]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
