package ua.khpi.oop.naimytenko08;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CarsShop {
	
	private String car_brand;
	private int year_create;
	private String specifications;
	private int price; 
	private LinkedHashMap<String, Integer> сity_fuel_consumption = new LinkedHashMap<String, Integer>();
	private LinkedHashMap<String, Integer> fuel_consumption_outside_the_city = new LinkedHashMap<String, Integer>();
	 
	 
	public String getCar_brand() {
		return car_brand;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	public int getYear_create() {
		return year_create;
	}

	public void setYear_create(int year_create) {
		this.year_create = year_create;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LinkedHashMap<String, Integer> getСity_fuel_consumption() {
		return сity_fuel_consumption;
	}

	public void setСity_fuel_consumption(LinkedHashMap<String, Integer> сity_fuel_consumption) {
		this.сity_fuel_consumption = сity_fuel_consumption;
	}

	public LinkedHashMap<String, Integer> getFuel_consumption_outside_the_city() {
		return fuel_consumption_outside_the_city;
	}

	public void setFuel_consumption_outside_the_city(LinkedHashMap<String, Integer> fuel_consumption_outside_the_city) {
		this.fuel_consumption_outside_the_city = fuel_consumption_outside_the_city;
	}

	public String toString_gas_mileage() {
		String string = сity_fuel_consumption.entrySet().stream()
				.map(e -> e.getKey() + e.getValue())
                .collect(Collectors.joining());
		string += fuel_consumption_outside_the_city.entrySet().stream()
				.map(e -> e.getKey() +  e.getValue())
                .collect(Collectors.joining());
		return string;
	}
	
	 
	 public CarsShop(String car_brand, int year_create, String specifications, int price, int city_fuel_consumption, int fuel_consumption_outside_the_city) {
		 super();
		 this.car_brand = car_brand; 
		 this.year_create = year_create; 
		 this.specifications = specifications; 
		 this.price = price; 
		 this.сity_fuel_consumption.put(" расход топлива по городу - ",city_fuel_consumption);
		 this.fuel_consumption_outside_the_city.put(" расход топлива за городом - ",fuel_consumption_outside_the_city);
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
					"Технічний стан "+ specifications + "\r\n" );
		 
	 }
}