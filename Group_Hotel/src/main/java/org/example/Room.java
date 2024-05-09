package org.example;

public class Room {
    private int numberOfBeds;

    private int price;

    private String roomType;

    private Boolean isOccupied;

    private Boolean isDirty;

    private Boolean isAvailable;

    public Room(int numberOfBeds, int price, String roomType, Boolean isOccupied, Boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.roomType = roomType;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRoomType() { return roomType; }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getNumberOfBeds() { return numberOfBeds; }

    public double getPrice(){ return price; }

    public boolean isOccupied(){ return isOccupied; }

    public boolean isDirty(){ return isDirty; }

    public boolean isAvailable(){
        this.isAvailable = (!isDirty && !isOccupied) ? true : false;
        return isAvailable;
    }
}
