public class FlightTicket {
  private String departure;

  private int passportNumber;



    public FlightTicket(String departure, int passportNumber, String country, String seatNo) {
        this.departure = departure;
        this.passportNumber = passportNumber;
        this.country = country;
        this.seatNo = seatNo;

    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "departure='" + departure + '\'' +
                ", passportNumber=" + passportNumber +
                ", country='" + country + '\'' +
                ", seatNo='" + seatNo + '\'' +
                '}';
    }

    private String country;

  private String seatNo;


}
