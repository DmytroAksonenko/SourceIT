package com.aksonenko.oop;

import java.util.Arrays;
import java.util.Objects;

public class Department {
	
	/*
	 Создать класс Department с внутренним классом, с помощью объектов
	 которого можно хранить информацию обо всех должностях отдела и обо
	 всех сотрудниках, когда-либо занимавших конкретную должность.
	 */
	private static final int DEFAULT_CAPACITY = 10;
	private int lengthIndex;
	@SuppressWarnings("unused")
	private String departmentName; 
	private Position[] positions;
	private String positionName;
	private Cooperator[] staff;
	private String cooperatorFirstName;	
	private String cooperatorSecondName;
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}	
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
	
	class Position {		
		private String positionName;
		//private Cooperator[] staff;
		
		public String getPositionName() {
			return positionName;
		}
		public void setPositionName(String positionName) {
			this.positionName = positionName;
		}
		
		public Position() {			
			positionName = ""; 			
		}
		
		public Position(String positionName) {
			this.positionName = positionName; 
			
		}
		
		public String toString () {
			return "Position: " + positionName + " ";
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
	class Cooperator {	
		
		private String cooperatorFirstName;	
		private String cooperatorSecondName;
		private Position[] positions;
		
		public void addPosition(Position position) {
			if(position == null)
				return;
			if(positions == null)
				positions = new Position[DEFAULT_CAPACITY];
			if(positions.length < lengthIndex + 1)
				positions = Arrays.copyOf(positions, positions.length * 2);
			positions[lengthIndex++] = position;
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
		
		@SuppressWarnings("unused")
		public Cooperator() {		
			
			cooperatorFirstName = "";
			cooperatorSecondName = "";
		}
		
		public Cooperator(String cooperatorFirstName, String cooperatorSecondName) {
			this.cooperatorFirstName = cooperatorFirstName; 
			this.cooperatorSecondName = cooperatorSecondName; 
		}
		
		public String toString () {
			return "Cooperator: " + cooperatorFirstName + " " + cooperatorSecondName + " ";
		}
		
		public Position[] getPositionsFor() {
			return Arrays.stream(positions)
									.filter(Objects::nonNull)
									.toArray(Position[]::new);
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

	}
	public Department(String departmentName) {
		this.departmentName = departmentName; 
	}
	
	public Position[] getAllPositions() {
		return Arrays.stream(positions)
								.filter(Objects::nonNull)
								.toArray(Position[]::new);
	}
	
	public Cooperator[] getAllCooperators() {
		return Arrays.stream(staff)
								.filter(Objects::nonNull)
								.toArray(Cooperator[]::new);
	}
	

}
