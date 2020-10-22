package com.aksonenko.concurrent;

/*
 Создать класс (Runnable) с двумя отдельными счетчиками и объект этого класса. 
 Создать несколько одинаковых потоков, каждый из которых повторяет следующее: 
 сравнивает значение счетчиков и печатает результат сравнения, увеличивает первый счетчик, 
 засыпает на 10 мсек, а затем увеличивает второй счетчик. Сравнить работу программы при условии, 
 что упомянутый блок кода синхронизирован и не синхронизирован.
 */

public class ThreadCountersSynchronized implements Runnable {
	
	static int counterA = 0;
	static int counterB = 0;
	Object obj = new Object();

	ThreadCountersSynchronized() {

	}
	
	synchronized static void threadRunMethod() {
		
	}

	@Override
	public void run() {
		synchronized (obj) {
			System.out.println(Thread.currentThread().getName() + " started");
			for (int i = 0 ; i < 500 ; i++) {			
				try {
					System.out.println(Thread.currentThread().getName() +
							" counter A: " + counterA + ", counter B: " + counterB);
					counterA ++;
					System.out.println(Thread.currentThread().getName() +
							" counter A: " + counterA + ", counter B: " + counterB);
					Thread.sleep(10);
					counterB ++;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		Thread firstThread = new Thread(new ThreadCountersSynchronized(), "Thread #1");
		Thread secondThread = new Thread(new ThreadCountersSynchronized(), "Thread #2");
		Thread thirdThread = new Thread(new ThreadCountersSynchronized(), "Thread #3");
		firstThread.start();
		secondThread.start();
		thirdThread.start();
	}

}
