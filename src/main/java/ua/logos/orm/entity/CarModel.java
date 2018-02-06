package ua.logos.orm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_model")
public class CarModel extends BaseEntity{
	
	@Column(name = "model_title")
	private String modelTitle;
	
	@Column (name = "manufacture_year")
	private int manufactureYear;
	
	@ManyToOne (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumn (name = "make_id", foreignKey = @ForeignKey (name = "FK_car_model_car_make_id"))
	private CarMake carMake;
	
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn (name = "engine_capacity_id", foreignKey = @ForeignKey (name = "FK_car_model_engine_capacity_id"))
	private CarEngineCapacity engineCapasity;
	
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn (name = "fuel_tupe_id", foreignKey = @ForeignKey (name = "FK_car_model_fuel_tupe_id"))
	private CarFuelType fuelType;
	
	@ManyToOne (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn (name = "color_id", foreignKey = @ForeignKey (name = "FK_car_model_color_id"))
	private CarColor carColor;
	
	public CarModel () {
		
	}

	public CarModel(String modelTitle, int manufactureYear) {
		this.modelTitle = modelTitle;
		this.manufactureYear = manufactureYear;
	}

	public String getModelTitle() {
		return modelTitle;
	}

	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}

	public CarMake getCarMake() {
		return carMake;
	}

	public void setCarMake(CarMake carModel) {
		this.carMake = carModel;
	}

	public CarEngineCapacity getEngineCapasity() {
		return engineCapasity;
	}

	public void setEngineCapasity(CarEngineCapacity engineCapasity) {
		this.engineCapasity = engineCapasity;
	}

	public CarFuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(CarFuelType fuelType) {
		this.fuelType = fuelType;
	}

	public CarColor getCarColor() {
		return carColor;
	}

	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}
	
	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	
	@Override
	public String toString() {
		return "CarModel [modelTitle=" + modelTitle + ", manufactureYear=" + manufactureYear + ", getId()=" + getId()
				+ "]";
	}

}
