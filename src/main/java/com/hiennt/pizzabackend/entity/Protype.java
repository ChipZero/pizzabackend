package com.hiennt.pizzabackend.entity;
// Generated Dec 5, 2017 10:12:51 AM by Hibernate Tools 5.1.6.Final

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Protype generated by hbm2java
 */
@Entity
@Table(name = "protype", catalog = "pizzadb")
public class Protype implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer prtId;
	private String prtName;
	private Set<Product> products = new HashSet<Product>(0);

	public Protype() {
	}

	public Protype(String prtName, Set<Product> products) {
		this.prtName = prtName;
		this.products = products;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "prt_id", unique = true, nullable = false)
	public Integer getPrtId() {
		return this.prtId;
	}

	public void setPrtId(Integer prtId) {
		this.prtId = prtId;
	}

	@Column(name = "prt_name", length = 50)
	public String getPrtName() {
		return this.prtName;
	}

	public void setPrtName(String prtName) {
		this.prtName = prtName;
	}

	@OneToMany(mappedBy = "protype", cascade = CascadeType.ALL)
	@JsonIgnore
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
