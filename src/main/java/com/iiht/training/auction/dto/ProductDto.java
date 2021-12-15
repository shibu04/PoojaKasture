package com.iiht.training.auction.dto;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProductDto {
	private Long productId;
	@NotBlank
	@Length(min = 3, max = 100)
	private String name;
	@NotNull
	private Long sellerId;
	@NotBlank
	@Length(min = 3, max = 100)
	private String description;
	@NotNull
	private Integer quantity;
	@NotNull
	private Double price;
	@NotNull
	private Double startingBidAmount;
	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Future
	private LocalDate lastDateOfBidding;
	@NotBlank
	@Length(min = 3, max = 100)
	private String category;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getStartingBidAmount() {
		return startingBidAmount;
	}

	public void setStartingBidAmount(Double startingBidAmount) {
		this.startingBidAmount = startingBidAmount;
	}

	public LocalDate getLastDateOfBidding() {
		return lastDateOfBidding;
	}

	public void setLastDateOfBidding(LocalDate lastDateOfBidding) {
		this.lastDateOfBidding = lastDateOfBidding;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, description, lastDateOfBidding, name, price, productId, quantity, sellerId,
				startingBidAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDto other = (ProductDto) obj;
		return Objects.equals(category, other.category) && Objects.equals(description, other.description)
				&& Objects.equals(lastDateOfBidding, other.lastDateOfBidding) && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) && Objects.equals(productId, other.productId)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(sellerId, other.sellerId)
				&& Objects.equals(startingBidAmount, other.startingBidAmount);
	}

	
}
