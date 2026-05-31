

public class LocalInner_Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public LocalInner_Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void ReserveRoom(String guestName, int num_Of_Rooms) {
        class ReservationValidator {
            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("Guest Name cannot be empty!!");
                    return false;
                }
                if (num_Of_Rooms < 0) {
                    System.out.println("Number Of Rooms Cannot Be Empty!!");
                    return false;
                }
                if (reservedRooms + num_Of_Rooms > totalRooms) {
                    System.out.println("Not Enough Rooms!!");
                    return false;
                }
                return true;
            }

        }
        ReservationValidator v1 = new ReservationValidator();
        if (v1.validate()) {
            reservedRooms += num_Of_Rooms;
            System.out.println("Reservation Succeed For"+" "+guestName+" "+"for"+" "+num_Of_Rooms+" "+"Rooms");
        }
        else{
            System.out.println("Reservation Failed!! For"+" "+guestName+" "+"for"+" "+num_Of_Rooms+" "+"Rooms");
        }
    }
}
