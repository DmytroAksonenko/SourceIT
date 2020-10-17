package com.aksonenko.concurrent;

/*
 Создать класс (Runnable) с двумя отдельными счетчиками и объект этого класса. 
 Создать несколько одинаковых потоков, каждый из которых повторяет следующее: 
 сравнивает значение счетчиков и печатает результат сравнения, увеличивает первый счетчик, 
 засыпает на 10 мсек, а затем увеличивает второй счетчик. Сравнить работу программы при условии, 
 что упомянутый блок кода синхронизирован и не синхронизирован.
 */

public class ThreadCounters implements Runnable {
	
	int counterA = 0;
	int counterB = 0;

	ThreadCounters() {

	}
	
	@Override
	public void run() {	
		System.out.println(Thread.currentThread().getName() + " started");
		for (int i = 0 ; i < 1000 ; i++) {			
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
	
	public static void main(String[] args) {
		Thread firstThread = new Thread(new ThreadCounters(), "Thread #1");
		Thread secondThread = new Thread(new ThreadCounters(), "Thread #2");
		Thread thirdThread = new Thread(new ThreadCounters(), "Thread #3");
		firstThread.start();
		secondThread.start();
		thirdThread.start();
	}

}
