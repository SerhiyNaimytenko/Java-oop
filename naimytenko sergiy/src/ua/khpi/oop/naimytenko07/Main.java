package ua.khpi.oop.naimytenko07;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

import ua.khpi.oop.naimytenko08.CarsShop;

public class Main {

	public static void main(String[] args) {
		 
		CarsShop array[] = new CarsShop[3];
		array[0] = new CarsShop("mazda",2020,"Хорошое состояние, требуется косметический ремонт",400000,25,20);
		 
		array[1] = new CarsShop("ВАЗ",1980,"Плохое состояние, после ДТП",30000,15,10);
	 
		array[2] = new CarsShop("Rolls-royce",2013,"Отличное состояние",7000000,49,30);
		
		 
		for (CarsShop car : array) {
			car.Show();
			
		}
        
	}

}
