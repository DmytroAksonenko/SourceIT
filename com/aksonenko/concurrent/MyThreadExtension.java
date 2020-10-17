package com.aksonenko.concurrent;

/*
Создать дочерний поток, который бы в течение примерно 5 сек печатал свое имя каждые полсекунды. 
Сделать это двумя способами - при помощи расширения класса Thread и при помощи реализации интерфейса Runnable.
(Thread.sleep(), Thread.interrupt(), handling of interrupted exception, TimeUnit.sleep())
*/

public class MyThreadExtension extends Thread {
	public MyThreadExtension(String threadName) {
		super(threadName);
	}
	
	@Override
	public void run() {		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
	
	public static void main(String[] args) {
		new MyThreadExtension("Thread #1").start();
	}
}
