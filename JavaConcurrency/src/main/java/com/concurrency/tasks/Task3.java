package com.concurrency.tasks;

public class Task3  implements Runnable {

	public void run() {

		try {
			System.out.println("[ThreadName: "+ Thread.currentThread().getName()+" [Task3: Started Processing]");
			Thread.sleep(1000);
			System.out.println("[ThreadName: "+ Thread.currentThread().getName()+" [Task3: Completed Processing]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
