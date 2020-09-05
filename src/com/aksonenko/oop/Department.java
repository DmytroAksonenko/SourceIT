package com.aksonenko.oop;

import java.util.Arrays;

public class Department {
	
	// This task is in progress ...
	
	/*
	 Создать класс Department с внутренним классом, с помощью объектов
	 которого можно хранить информацию обо всех должностях отдела и обо
	 всех сотрудниках, когда-либо занимавших конкретную должность.
	 */
	private static final int DEFAULT_CAPACITY = 10;
	private int lengthIndex;
	private String departmentName; 
	private int departmentStaff;
	private int departmentPositions;
	private Position[] positions;
	private String positionName;
	private Cooperator[] staff;
	private String cooperatorFirstName;	
	private String cooperatorSecondName;
	
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public String getCooperatorFirstName() {
		return cooperatorFirstName;
	}
	public void setCooperatorFirstName(String cooperatorFirstName) {
		this.cooperatorFirstName = cooperatorFirstName;
	}
	public String getCooperatorSecondName() {
		return cooperatorSecondName;
	}
	public void setCooperatorSecondName(String cooperatorSecondName) {
		this.cooperatorSecondName = cooperatorSecondName;
	}
	
	private class Position {		
		private String positionName;
		
		@SuppressWarnings("unused")
		public Position() {			
			positionName = ""; 			
		}
		
		public Position(String positionName) {
			this.positionName = positionName; 		
		}		
	}
	public void addPosition(Position position) {
		if(position == null)
			return;
		if(positions == null)
			positions = new Position[DEFAULT_CAPACITY];
		if(positions.length < lengthIndex + 1)
			positions = Arrays.copyOf(positions, positions.length * 2);
		positions[lengthIndex++] = position;
	}
	private class Cooperator {		
		private String cooperatorFirstName;	
		private String cooperatorSecondName;
		
		@SuppressWarnings("unused")
		public Cooperator() {		
			
			cooperatorFirstName = "";
			cooperatorSecondName = "";
		}
		
		public Cooperator(String cooperatorFirstName, String cooperatorSecondName) {
			this.cooperatorFirstName = cooperatorFirstName; 
			this.cooperatorSecondName = cooperatorSecondName; 
		}		
	}
	public void addCooperator(Cooperator cooperator) {
		if(cooperator == null)
			return;
		if(staff == null)
			staff = new Cooperator[DEFAULT_CAPACITY];
		if(staff.length < lengthIndex + 1)
			staff = Arrays.copyOf(staff, staff.length * 2);
		staff[lengthIndex++] = cooperator;
	}
	public Department() {
		this.departmentName = ""; 
		this.departmentStaff = 0;
		this.departmentPositions = 0;

	}
	public Department(String name) {
		this.departmentName = departmentName; 
		this.departmentStaff = departmentStaff;
		this.departmentPositions = departmentPositions;
	}
	
	

}
