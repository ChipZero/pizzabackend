package com.hiennt.pizzabackend.entity;
// Generated Dec 5, 2017 10:12:51 AM by Hibernate Tools 5.1.6.Final

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product", catalog = "pizzadb")
public class Product implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer proId;
	private Protype protype;
	private String proName;
	private String proImage;
	private String proQuickView;
	private String proDetails;
	private String proPrice;

	public Product() {
	}

	public Product(Integer proId, Protype protype, String proName, String proImage, String proQuickView, String proDetails, String proPrice) {
		this.proId = proId;
		this.protype = protype;
		this.proName = proName;
		this.proImage = proImage;
		this.proQuickView = proQuickView;
		this.proDetails = proDetails;
		this.proPrice = proPrice;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "pro_id", unique = true, nullable = false)
	public Integer getProId() {
		return this.proId;
	}

	public void setProId(Integer proId) {
		this.proId = proId;
	}

	@ManyToOne
	@JoinColumn(name = "pro_type")
	public Protype getProtype() {
		return this.protype;
	}

	public void setProtype(Protype protype) {
		this.protype = protype;
	}

	@Column(name = "pro_name", length = 50)
	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	@Column(name = "pro_image", length = 100)
	public String getProImage() {
		return this.proImage;
	}

	public void setProImage(String proImage) {
		this.proImage = proImage;
	}

	@Column(name = "pro_quick_view", length = 100)
	public String getProQuickView() {
		return proQuickView;
	}

	public void setProQuickView(String proQuickView) {
		this.proQuickView = proQuickView;
	}

	@Column(name = "pro_details", length = 65535)
	public String getProDetails() {
		return this.proDetails;
	}

	public void setProDetails(String proDetails) {
		this.proDetails = proDetails;
	}

	@Column(name = "pro_price", length = 100)
	public String getProPrice() {
		return this.proPrice;
	}

	public void setProPrice(String proPrice) {
		this.proPrice = proPrice;
	}

}
