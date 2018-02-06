package ua.logos.orm.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "car")
public class Car extends BaseEntity {
	
	@Column (name = "sell_price", columnDefinition = "Decimal(9,2)")
	private BigDecimal sellPrice;

	@OneToMany (cascade = CascadeType.ALL, mappedBy = "car")
	private List<CarMake> carMake;
	
	@ManyToOne (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinColumn (name = "seller_id", foreignKey = @ForeignKey (name = "FK_car_car_seller_id"))
	private CarSeller carSeller;

	public Car() {
		
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}


	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}


	public Car(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public List<CarMake> getCarMake() {
		return carMake;
	}

	public void setCarMake(List<CarMake> carMake) {
		this.carMake = carMake;
	}

	public CarSeller getCarSeller() {
		return carSeller;
	}

	public void setCarSeller(CarSeller carSeller) {
		this.carSeller = carSeller;
	}

	@Override
	public String toString() {
		return "Car [sellPrice=" + sellPrice + ", getId()=" + getId() + "]";
	}

	
	
	
	
	
	
	
}
