package com.jts.crs;

public class CRSEntry {
	public static void main(String[] args)
	{
		Car tataCar = new Car();
		tataCar.setCarId("CAR-1");
		tataCar.setBrand("Tata");
		tataCar.setModel("Harier");
		tataCar.setNoOfAvailableCar(2);
		tataCar.setPricePerDay(3500);
		
		Car toyotaCar = new Car();
		toyotaCar.setCarId("CAR-2");
		toyotaCar.setBrand("Toyota");
		toyotaCar.setModel("Fortuner");
		toyotaCar.setNoOfAvailableCar(1);
		toyotaCar.setPricePerDay(3000);
		
		Car mahindraCar = new Car();
		mahindraCar.setCarId("CAR-3");
		mahindraCar.setBrand("Mahindra");
		mahindraCar.setModel("XUV 700");
		mahindraCar.setNoOfAvailableCar(2);
		mahindraCar.setPricePerDay(3500);
		
		CarRentalService carRentalService = new CarRentalService();
		carRentalService.addCars(tataCar);
		carRentalService.addCars(toyotaCar);
		carRentalService.addCars(mahindraCar);
		
		carRentalService.options();
;
	}

}
