public class Ticket
{
    public int route;
    public int seatNo;


    public Ticket(){

    }

    public int getRoute() {
        return route;
    }

    public int getSeatNo() {
        return seatNo;
    }



    public void setRoute(int route) {
        this.route = route;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }



    public Ticket(int route, int seatNo) {
        this.route = route;
        this.seatNo = seatNo;
    }
    public void calculateSeatPosition()
    {
        if (getRoute()==1)
        {
            if(getSeatNo()>=50)
            {
                System.out.println("Your Seat position is Soja");
            }
            else
            {
                System.out.println("Your seat position is Ulto");
            }
        } else if (getRoute()==2)
        {
            if (getSeatNo()>=50)
            {
                System.out.println("Your seat position is Ulto");
            }
            else
            {
                System.out.println("Your Seat position is Soja");
            }

        }
    }

}
