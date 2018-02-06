package ua.logos.orm.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_make")
public class CarMake extends BaseEntity {
	
	@Column (name = "make_title")
			//unique = true
	private String makeTitle;
	
	@ManyToOne (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumn (name = "car_id", foreignKey = @ForeignKey (name = "FK_car_make_car_id"))
	private Car car;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "carMake")
	private List<CarModel> carModel;

	public CarMake() {
	}

	public CarMake(String makeTitle) {
		this.makeTitle = makeTitle;
	}

	public String getMakeTitle() {
		return makeTitle;
	}

	public void setMakeTitle(String makeTitle) {
		this.makeTitle = makeTitle;
	}


	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public List<CarModel> getCarModel() {
		return carModel;
	}

	public void setCarModel(List<CarModel> carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "CarMake [makeTitle=" + makeTitle + ", getId()=" + getId() + "]";
	}

	
	
	

	
}
