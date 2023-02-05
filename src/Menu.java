import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu(Port port) {
        Scanner in = new Scanner(System.in);
        List<Ship> ship = new ArrayList<>();
        ship.add(new Ship(0));
        ship.add(new Ship(1));
        ship.add(new Ship(2));
        ship.add(new Ship(3));
        ship.add(new Ship(4));

        port.addContainer();
        int num;
        for(;;) {
            System.out.println(ship);
            System.out.print("Which ship you will use: ");
            int shipNumber = in.nextInt();
            System.out.println("Enter to port - 1");
            System.out.println("Exit from port - 2");
            System.out.println("Loading ship - 3");
            System.out.println("Unloading ship - 4");
            System.out.println("Gate status - 5");
            System.out.println("Exit - 6");
            System.out.println();
            System.out.print("Pick your action: ");
            System.out.println();
            num = in.nextInt();

            switch (num) {
                case 1:
                    port.enterToPort(ship.get(shipNumber));
                    break;
                case 2:
                    port.exitFromPort(ship.get(shipNumber));
                    break;
                case 3:
                    port.addContainerToShip(ship.get(shipNumber));
                    break;
                case 4:
                    port.removeContainerFromShip(ship.get(shipNumber));
                    break;
                case 5:
                    port.gateStatus();
                    break;
                case 6:
                    System.exit(1);
                    break;
            }
        }
    }
}
