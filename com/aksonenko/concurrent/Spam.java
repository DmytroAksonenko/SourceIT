package com.aksonenko.concurrent;

import java.util.Timer;
import java.util.TimerTask;

/*
 Создать класс Spam, который получает массив интервалов времени в миллисекундах и согласованный 
 с ним массив сообщений, и выводит соответствующие сообщения на экран через заданные интервалы 
 времени. По нажатию на клавишу Enter приложение должно завершать свою работу 
 (данную функциональность поместить в метод Spam.main). 
 При демонстрации работы смоделировать ввод Enter через 5 сек (данную функциональность поместить 
 в метод Part2.main). (track input of new line character or enter button press with Robot class)
 */
public class Spam implements Runnable {
	static boolean enterPressed = false;
	int[]arrayInt = {500,2000,100,3000,800};
	String[]arrayStr = {"500 ms", "2000 ms", "100 ms", "3000 ms", "800 ms"};
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5;) {
			System.out.println(arrayStr[i]);
			try {
				Thread.sleep(arrayInt[i]);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (enterPressed != true) {
				if (i == 4) {
					i = 0;
				} else {
					i++;
				}
			} else {
				Thread.interrupted();
				i = 5;
			}
		}	
	}
	
	public static void interruptThread() {
		if (enterPressed == false) {
			TimerTask task = new TimerTask () {
				public void run() {
					enterPressed = true;
					System.out.println("break");
				}		
			};
			Timer timer = new Timer("Timer");
			long delay = 5000L;
			timer.schedule(task, delay);
		}
	}
	
	public static void main(String[] args) {
		Thread myThread = new Thread(new Spam(), "Thread #1");
		myThread.start();
		interruptThread();
	}
}
