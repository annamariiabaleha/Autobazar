package ua.logos.orm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "car_color")
public class CarColor extends BaseEntity {
	
	@Column (name = "color")
	private String color;
	
	@OneToMany (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "carColor")
	private List<CarModel> carModel;

	public CarColor() {
	}

	public CarColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<CarModel> getCarModel() {
		return carModel;
	}

	public void setCarModel(List<CarModel> carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "CarColor [color=" + color + ", carModel=" + carModel + ", getId()=" + getId() + "]";
	}

	
	
	
	
	

}
