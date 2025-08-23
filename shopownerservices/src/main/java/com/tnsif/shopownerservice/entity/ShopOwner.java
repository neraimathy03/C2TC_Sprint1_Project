package com.tnsif.shopownerservice.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ShopOwner {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String ownerName;
	    private String shopName;
	    private String email;
	    private String phone;
	    private String mallName;
	    private String shopCategory;

	    // Default constructor
	    public ShopOwner() {}

	    // Constructor with all fields except ID
	    public ShopOwner(String ownerName, String shopName, String email, String phone, String mallName, String shopCategory) {
	        this.ownerName = ownerName;
	        this.shopName = shopName;
	        this.email = email;
	        this.phone = phone;
	        this.mallName = mallName;
	        this.shopCategory = shopCategory;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getOwnerName() {
	        return ownerName;
	    }

	    public void setOwnerName(String ownerName) {
	        this.ownerName = ownerName;
	    }

	    public String getShopName() {
	        return shopName;
	    }

	    public void setShopName(String shopName) {
	        this.shopName = shopName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getMallName() {
	        return mallName;
	    }

	    public void setMallName(String mallName) {
	        this.mallName = mallName;
	    }

	    public String getShopCategory() {
	        return shopCategory;
	    }

	    public void setShopCategory(String shopCategory) {
	        this.shopCategory = shopCategory;
	    }

}