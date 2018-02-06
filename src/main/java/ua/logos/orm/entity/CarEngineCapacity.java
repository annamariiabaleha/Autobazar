package ua.logos.orm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "car_engine_capacity")
public class CarEngineCapacity extends BaseEntity {
	
	@Column (name = "engine_capacity")
	private Double engineCapacity;
	
	@OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "engineCapasity")
	private List<CarModel> carModel;

	public CarEngineCapacity() {
	}

	public CarEngineCapacity(Double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public Double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(Double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public List<CarModel> getCarModel() {
		return carModel;
	}

	public void setCarModel(List<CarModel> carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "CarEngineCapacity [engineCapacity=" + engineCapacity + ", getId()=" + getId() + "]";
	}

	
	
	
	
	

	
}
