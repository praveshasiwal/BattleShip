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
		//Enter Ship Count
		System.out.print("Enter Ship counts : ");
		int shipCount = sc.nextInt();
		//Enter Ship Placement and Place them as well
		extractedShipInformation(sc, shipCount);
		
		
		System.out.println("");
	}

	private static void extractedShipInformation(Scanner sc, int shipCount) {
		for (int i = 0; i < shipCount; i++) {
			
			System.out.print("Please enter ship type (X OR Y) : ");
			ShipType shipType = ShipType.valueOf(sc.next());			
			
			System.out.println("Please Enter Ship Matrix Size");
			
			System.out.print("Please enter row count : ");
			int shipX = sc.nextInt();
			
			System.out.print("Please enter col count : ");
			int shipY = sc.nextInt();			
			
			System.out.print("Please enter x cordinate : ");
			int shipXCordinate = sc.nextInt();
			
			System.out.print("Please enter y cordinate : ");
			int shipYCordinate = sc.nextInt();			
			
			extractedShipPlacement(shipType, shipX, shipY, shipXCordinate, shipYCordinate);			
			
		}
	}

	private static void extractedShipPlacement(ShipType shipType, int shipX, int shipY, int shipXCordinate,
			int shipYCordinate) {
		for(int k = shipXCordinate; k <= (shipX + shipXCordinate); k++) {
			for(int l = shipYCordinate; l <= (shipY + shipYCordinate); l++) {
				
				if(!matrix.containsKey(k+"-"+l)) {
					break;
				}else if(matrix.get(k+"-"+l) > 0) {
					break;
				}else {
					if(shipType == ShipType.X) {
						matrix.put(k+"-"+l, 1);
					} else {
						matrix.put(k+"-"+l, 2);
					}
				}
				
			}
		}
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
