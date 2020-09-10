package com.aksonenko.oop;

import java.util.Arrays;
import java.util.Objects;

public class Computer {
	/*
	 Создать класс Computer с внутренним классом, с помощью объектов кото-
	 рого можно хранить информацию об операционной системе, процессоре
	 и оперативной памяти.
	 */
	private static final int DEFAULT_CAPACITY = 10;
	private int lengthIndex;
	private OperatingSystem[] operatingSystems;
	private Processor[] processors;
	private OperativeMemory[]  operativeMemories;

	class OperatingSystem {
		
		private String operatingSystemName;
		
		public String getOperatingSystemName() {
			return operatingSystemName;
		}
		public void setOperatingSystemName(String operatingSystemName) {
			this.operatingSystemName = operatingSystemName;
		}
		
		public OperatingSystem() {			
			operatingSystemName = ""; 
		}
		
		public OperatingSystem(String operatingSystemName) {
			this.operatingSystemName = operatingSystemName; 			
		}
		
		public String toString () {
			return operatingSystemName + " ";
		}
		
	}
	public void addOperatingSystem(OperatingSystem operatingSystem) {
		if(operatingSystem == null)
			return;
		if(operatingSystems == null)
			operatingSystems = new OperatingSystem[DEFAULT_CAPACITY];
		if(operatingSystems.length < lengthIndex + 1)
			operatingSystems = Arrays.copyOf(operatingSystems, operatingSystems.length * 2);
		operatingSystems[lengthIndex++] = operatingSystem;
	}
	
	class Processor {
		
		private String processorName;
		private double processorFrequency;
		private int processorNumberOfCore;
		
		public String getProcessorName() {
			return processorName;
		}
		public void setProcessorName(String processorName) {
			this.processorName = processorName;
		}
		public double getProcessorFrequency() {
			return processorFrequency;
		}
		public void setProcessorFrequency(double processorFrequency) {
			this.processorFrequency = processorFrequency;
		}
		public double getProcessorNumberOfCore() {
			return processorNumberOfCore;
		}
		public void setProcessorNumberOfCore(int processorNumberOfCore) {
			this.processorNumberOfCore = processorNumberOfCore;
		}
		
		public Processor() {			
			processorName = ""; 
			processorFrequency = 0;
		}
		
		public Processor(String processorName, double processorFrequency) {
			this.processorName = processorName; 
			this.processorFrequency = processorFrequency; 		
		}
		
		public String toString () {
			return processorName + ", " + processorFrequency + " GHz, " + processorNumberOfCore + " cores";
		}
		
	}
	public void addProcessor(Processor processor) {
		if(processor == null)
			return;
		if(processors == null)
			processors = new Processor[DEFAULT_CAPACITY];
		if(processors.length < lengthIndex + 1)
			processors = Arrays.copyOf(processors, processors.length * 2);
		processors[lengthIndex++] = processor;
	}
	
	class OperativeMemory {
		
		private String operativeMemoryName;
		private int operativeMemorySize;
		
		public String getOperativeMemoryName() {
			return operativeMemoryName;
		}
		public void setOperativeMemoryName(String operativeMemoryName) {
			this.operativeMemoryName = operativeMemoryName;
		}
		public int getoperativeMemorySize() {
			return operativeMemorySize;
		}
		public void setOperativeMemorySize(int operativeMemorySize) {
			this.operativeMemorySize = operativeMemorySize;
		}
		
		public OperativeMemory() {			
			operativeMemoryName = ""; 
			operativeMemorySize = 0;
		}
		
		public OperativeMemory(String operativeMemoryName, int operativeMemorySize) {
			this.operativeMemoryName = operativeMemoryName; 
			this.operativeMemorySize = operativeMemorySize; 		
		}
		
		public String toString () {
			return operativeMemoryName + " " + operativeMemorySize + " ";
		}
		
	}
	public void addOperativeMemory(OperativeMemory operativeMemory) {
		if(operativeMemory == null)
			return;
		if(operativeMemories == null)
			operativeMemories = new OperativeMemory[DEFAULT_CAPACITY];
		if(operativeMemories.length < lengthIndex + 1)
			operativeMemories = Arrays.copyOf(operativeMemories, operativeMemories.length * 2);
		operativeMemories[lengthIndex++] = operativeMemory;
	}
	
	public OperatingSystem[] getAllOperatingSystems() {
		return Arrays.stream(operatingSystems)
				.filter(Objects::nonNull)
				.toArray(OperatingSystem[]::new);
	}
	public Processor[] getAllProcessors() {
		return Arrays.stream(processors)
				.filter(Objects::nonNull)
				.toArray(Processor[]::new);
	}
	public OperativeMemory[] getAllOperativeMemories() {
		return Arrays.stream(operativeMemories)
				.filter(Objects::nonNull)
				.toArray(OperativeMemory[]::new);
	}

}
