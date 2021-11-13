package com.concurrency.tasks;

public class Task1  implements Runnable{

	public void run() {

		try {
			System.out.println("[ThreadName: "+ Thread.currentThread().getName()+" [Task1: Started Processing]");
			Thread.sleep(2000);
			System.out.println("[ThreadName: "+ Thread.currentThread().getName()+" [Task1: Completed Processing]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
