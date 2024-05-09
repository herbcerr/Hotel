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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
    }

    public Boolean getDirty() {
        return isDirty;
    }

    public void setDirty(Boolean dirty) {
        isDirty = dirty;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    void getNumberOfBeds(){

    }

    void getPrice(){

    }

    void isOccupied(){

    }

    void isDirty(){

    }
}
