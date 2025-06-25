import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Dhaka to Pangsha");
        System.out.println("2. Panghsha to Dhaka");
        System.out.println("please enter your route 1 or 2");
        int route = scanner.nextInt();
        System.out.println("pleae enter your seat number");
        int seatno=scanner.nextInt();
        Ticket t1=new Ticket();
        t1.setRoute(route);
        t1.setSeatNo(seatno);
        t1.calculateSeatPosition();

    }
}