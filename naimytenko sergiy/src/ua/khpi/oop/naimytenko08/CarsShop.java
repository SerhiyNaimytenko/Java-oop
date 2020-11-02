package ua.khpi.oop.naimytenko08;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CarsShop {
	
	private String car_brand;
	private int year_create;
	private String technical_condition;
	private int price; 
	private LinkedHashMap<String, Integer> specifications = new LinkedHashMap<String, Integer>();
	 
	 
	public void AddGas_mileage(String key, int value) {
		this.specifications.put(key, value);
	}
 

	public String toString_gas_mileage() {
		int size = specifications.size();
		String string = specifications.entrySet().stream()
				.map(e -> e.getKey() + e.getValue())
                .collect(Collectors.joining()); 
		 for (int i = 0; i < size-1; i++) {
			 string += specifications.entrySet().stream()
						.map(e -> e.getKey() + e.getValue())
		                .collect(Collectors.joining()); 
		 }
		return string;
	}
	
	 
	 public CarsShop(String car_brand, int year_create, String technical_condition, int price, int city_fuel_consumption, int fuel_consumption_outside_the_city) {
		 super();
		 this.car_brand = car_brand; 
		 this.year_create = year_create; 
		 this.technical_condition = technical_condition; 
		 this.price = price; 
		 this.specifications.put(" расход топлива по городу - ",city_fuel_consumption);
		 this.specifications.put(" расход топлива за городом - ",fuel_consumption_outside_the_city);
	 }

	public CarsShop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Show()
	 {
			System.out.println("Марка автомобиля - "+ car_brand +"\r\n" + 
					"Цена автомобиля "+ price + "\r\n" + 
					"Технічні характеристики " + toString_gas_mileage() +
					"\nГод выпуска автомобиля "+ year_create + "\r\n" + 
					"Технічний стан "+ technical_condition + "\r\n" );
		 
	 }
}