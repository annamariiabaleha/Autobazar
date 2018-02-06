package ua.logos.orm.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "car_fuel_type")
public class CarFuelType extends BaseEntity{

	@Column (name = "fuel_type")
	private String fuelType;

	public CarFuelType() {
	}

	@OneToMany (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "fuelType")
	private List<CarModel> carModel;

	public CarFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public List<CarModel> getCarModel() {
		return carModel;
	}

	public void setCarModel(List<CarModel> carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "CarFuelType [fuelType=" + fuelType + ", getId()=" + getId() + "]";
	}	
	
}
