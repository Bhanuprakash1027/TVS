package bhanu.prakash.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer proId;
	private String proname;
	private Double procost;
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public Double getProcost() {
		return procost;
	}
	public void setProcost(Double procost) {
		this.procost = procost;
	}
	public Product(Integer proId, String proname, Double procost) {
		super();
		this.proId = proId;
		this.proname = proname;
		this.procost = procost;
	}
	
	
	public Product()
	{
		
	}
}
