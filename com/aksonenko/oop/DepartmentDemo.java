package com.aksonenko.oop;

import java.util.Arrays;

public class DepartmentDemo {
	
	public static void main(String [] args) {	
			
		Department department = new Department(); 
		department.setDepartmentName("Department");
		
		Department.Cooperator cooperator1 = department.new Cooperator();
		cooperator1.setCooperatorFirstName("Mike");
		cooperator1.setCooperatorSecondName("Smith");
		department.addCooperator(cooperator1);
		
		Department.Cooperator cooperator2 = department.new Cooperator();
		cooperator2.setCooperatorFirstName("Johny");
		cooperator2.setCooperatorSecondName("Williams");
		department.addCooperator(cooperator2);
		
		Department.Cooperator cooperator3 = department.new Cooperator();
		cooperator3.setCooperatorFirstName("Adam");
		cooperator3.setCooperatorSecondName("Sandler");
		department.addCooperator(cooperator3);
		
		Department.Position position1 = department.new Position();
		position1.setPositionName("Marketing");
		department.addPosition(position1);
		cooperator1.addPosition(position1);
		
		Department.Position position2 = department.new Position();
		position2.setPositionName("Sales");
		department.addPosition(position2);
		
		
		System.out.println("All Positions: ");	
		Department.Position[] getPositions = department.getAllPositions();
		System.out.println(Arrays.toString(getPositions));
		System.out.println();
		
		System.out.println("All Cooperators: ");
		Department.Cooperator[] getStaff = department.getAllCooperators();
		System.out.println(Arrays.toString(getStaff));
		System.out.println();
		
		System.out.println("Positions held by " + cooperator1.getCooperatorFirstName() + ": ");
		Department.Position[] getPositionsHeldFor = cooperator1.getPositionsFor();
		System.out.println(Arrays.toString(getPositionsHeldFor));
		
	}

}
