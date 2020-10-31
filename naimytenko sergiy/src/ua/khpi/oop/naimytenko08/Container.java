package ua.khpi.oop.naimytenko08;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Container {
	 
	CarsShop array[] = new CarsShop[3]; 
	
	public void add()
	{
		int size = array.length;
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите марку автомобил€");
		String car_brand = scan.nextLine();
		System.out.println("ќпишите техническое состо€ние автомобил€");
		String specifications = scan.nextLine();
		System.out.println("¬ведите год выпуска авто");
		int year_create =  scan.nextInt();
		System.out.println("¬ведите цену авто");
		int price =  scan.nextInt();
		System.out.println("¬ведите расход топлива по городу");
		int city_fuel_consumption = scan.nextInt();
		System.out.println("¬ведите расход топлива вне города");
		int fuel_consumption_outside_the_city = scan.nextInt(); 
		CarsShop new_el = new CarsShop(car_brand,year_create,specifications,price,city_fuel_consumption, fuel_consumption_outside_the_city);
	
		CarsShop new_arr[] = new CarsShop[++size];
		for(int i=0;i<size-1;i++)
		{
			new_arr[i]=array[i];
		}
		new_arr[size-1] = new_el;
		array = new_arr;
	}
	
	
	
	public void remove()
	{
		int size = array.length;
		if(size!=0)
		{
			CarsShop new_arr[] = new CarsShop[--size];
			for(int i=0;i<size;i++)
			{
				new_arr[i]=array[i];
			}
			array = new_arr;
		}
		else
		{
			System.out.println("¬аш масив пуст, удал€ть  нечего");
		}
		
	}
	
	public void Show()
	{
		for (CarsShop carsShop : array) {
			carsShop.Show();
		}
	}
	
	
	}
