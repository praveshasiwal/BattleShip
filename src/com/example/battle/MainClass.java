package com.example.battle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {
	
	enum ShipType {
		X, Y
	}
	
	private static Map<String, Integer> matrix = new HashMap<String, Integer>(); 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Enter Battle Ground
		extractBattleGround(sc);	
		
		System.out.print("Enter Ship counts : ");
		int shipCount = sc.nextInt();
		
		for (int i = 0; i < shipCount; i++) {
			System.out.println("Please Enter Ship Matrix Size");
			
			System.out.print("Please enter row count : ");
			int shipX = sc.nextInt();
			
			System.out.print("Please enter col count : ");
			int shipY = sc.nextInt();
			
			System.out.print("Please enter x cordinate : ");
			int shipXCordinate = sc.nextInt();
			
			System.out.print("Please enter y cordinate : ");
			int shipYCordinate = sc.nextInt();			
			
			System.out.print("Please enter ship type (X OR Y) : ");
			ShipType shipType = ShipType.valueOf(sc.next());
			
		}
		
		System.out.println("");
	}

	private static void extractBattleGround(Scanner sc) {
		
		System.out.print("enter number of rows : ");
		int rows = sc.nextInt();
		System.out.print("enter number of cols : ");
		int cols = sc.nextInt();
		
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < cols ; j++) {
				matrix.put(i+""+j, 0);
				System.out.print(String.format("%5s", i+"-"+j+ " "));
			}
			System.out.println();
		}
	}

}
