package com.example.testing;

public class Stock {
	private String stockId;

	private String name;

	private int quantity;

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", name=" + name + ", quantity=" + quantity + "]";
	}

	public Stock(String stockId, String name, int quantity) {
		super();
		this.stockId = stockId;
		this.name = name;
		this.quantity = quantity;
	}

	public Stock() {
		super();
	}
	
}
