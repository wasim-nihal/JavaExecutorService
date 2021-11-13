package com.concurrency.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.concurrency.tasks.Task1;
import com.concurrency.tasks.Task2;
import com.concurrency.tasks.Task3;

public class Main {
	private static ExecutorService pool;

	public static void main(String[] args) throws Exception {
		System.out.println("[Main Thread: " + Thread.currentThread().getName() + " STARTED");
		try {
			//Create pool with 3 threads
			pool = Executors.newFixedThreadPool(3);
			
			//Submit tasks to the pool
			Future f1 = pool.submit(new Task1());
			Future f2 = pool.submit(new Task2());
			Future f3 = pool.submit(new Task3());

			//wait for threads to complete execution
			f1.get();
			f2.get();
			f3.get();
			System.out.println("[Main Thread: " + Thread.currentThread().getName() + " COMPLETED]");
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			pool.shutdown();
		}

	}

}
