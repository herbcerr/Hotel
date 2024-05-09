package org.example;

public class Reservation {
    String RoomType;
    int NumberOfNights;
    boolean IsWeekend;
    double ReservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend, double reservationTotal) {
        RoomType = roomType;
        NumberOfNights = numberOfNights;
        IsWeekend = isWeekend;
        ReservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public int getNumberOfNights() {
        return NumberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        NumberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return IsWeekend;
    }

    public void setWeekend(boolean weekend) {
        IsWeekend = weekend;
    }

    public double getReservationTotal() {
        return ReservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        ReservationTotal = reservationTotal;
    }
}
