package model;

public class Room {
	
	private int room_number;
	private String type;
	private double price;
	private String current_occupant;
	
	// getter methods
	public int getRoomNumber() {
		return room_number;
	}
	
	public String getRoomType() {
		return type;
	}
	
	public double getRoomPrice() {
		return price;
	}
	
	public String getCurrentOccupant() {
		return current_occupant;
	}

	// setter methods
	public void setRoomNumber(int room_number) {
		this.room_number = room_number;
	}

	public void setRoomType(String type) {
		this.type = type;
	}
	
	public void setRoomPrice(double price) {
		this.price = price;
	}
	
	public void setOccupant(String current_occupant) {
		this.current_occupant = current_occupant;
	}

}
