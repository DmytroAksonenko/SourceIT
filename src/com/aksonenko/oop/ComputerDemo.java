package com.aksonenko.oop;

import java.util.Arrays;

public class ComputerDemo {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		Computer.OperatingSystem windows10 = computer.new OperatingSystem();
		windows10.setOperatingSystemName("Windows 10");
		
		Computer.Processor intelB950 = computer.new Processor();
		intelB950.setProcessorName("Intel Pentium B950");
		intelB950.setProcessorFrequency(2.10);
		intelB950.setProcessorNumberOfCore(2);
		
		Computer.OperativeMemory hynix512 = computer.new OperativeMemory();
		hynix512.setOperativeMemoryName("Hynix DDR2");
		hynix512.setOperativeMemorySize(512);
		
		Computer.OperativeMemory hynix1024 = computer.new OperativeMemory();
		hynix1024.setOperativeMemoryName("Hynix DDR2");
		hynix1024.setOperativeMemorySize(1024);
		
		computer.addOperatingSystem(windows10);
		computer.addProcessor(intelB950);
		computer.addOperativeMemory(hynix512);
		computer.addOperativeMemory(hynix1024);
		System.out.println("My PC");	
		Computer.OperatingSystem[] getOperatingSystems = computer.getAllOperatingSystems();
		System.out.println(Arrays.toString(getOperatingSystems));
		Computer.Processor[] getProcessors = computer.getAllProcessors();
		System.out.println(Arrays.toString(getProcessors));
		Computer.OperativeMemory[] getOperativeMemories = computer.getAllOperativeMemories();
		System.out.println(Arrays.toString(getOperativeMemories));
	}

}
