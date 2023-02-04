import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Port {
    private boolean statusGateEn = false; // doesn't occupied
    private boolean statusGateTo = false; // doesn't occupied

    private final int INDEX_GATE_EN = 1;
    private final int INDEX_GATE_TO = 1;

    List<Container> containers = new ArrayList<>();

    Scanner in = new Scanner(System.in);


    public Port() {

    }

    public Port(boolean statusGateEn, boolean statusGateTo, List<Container> containers) {
        this.statusGateEn = statusGateEn;
        this.statusGateTo = statusGateTo;
        this.containers = containers;
    }


    public boolean isStatusGateEn() {
        return statusGateEn;
    }

    public void setStatusGateEn(boolean statusGateEn) {
        this.statusGateEn = statusGateEn;
    }

    public boolean isStatusGateTo() {
        return statusGateTo;
    }

    public void setStatusGateTo(boolean statusGateTo) {
        this.statusGateTo = statusGateTo;
    }

    public int getINDEX_GATE_EN() {
        return INDEX_GATE_EN;
    }

    public int getINDEX_GATE_TO() {
        return INDEX_GATE_TO;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    protected void enterToPort(Ship ship){
        System.out.println("Enter the gate: ");
        int gate = in.nextInt();

        if (!ship.getShipInPort()) {
            if (gate == 1 && !statusGateEn) {
                ship.setShipInPort(true);
                ship.setNumberGate(gate);
                statusGateEn = true;
                System.out.println("Your ship has successfully entered the port");
                System.out.println("Your ship number is: "+ ship.getShipNumber() + ". Gate number: " + ship.getNumberGate());
            } else if (gate == 2 && !statusGateTo) {
                ship.setShipInPort(true);
                ship.setNumberGate(gate);
                statusGateTo = true;
                System.out.println("Your ship has successfully entered the port");
                System.out.println("Your ship number is: "+ ship.getShipNumber() + ". Gate number: " + ship.getNumberGate());
            } else if (gate > 2 || gate < 0) {
                System.out.println("Gate number: " + gate + "does`t exist, switch the gate number to right");
            } else {
                System.out.println("This gate is occupied");
            }
        } else {
            System.out.println("Ship has been in port");
        }
    }

    protected void exitFromPort(Ship ship){
        System.out.println("Enter the gate: ");
        int gate = in.nextInt();

        if (ship.getShipInPort()) {
            if (gate == 1 && statusGateEn) {
                ship.setShipInPort(false);
                ship.setNumberGate(0);
                statusGateEn = false;
                System.out.println("Your ship can`t get in gate, gate is occupied");
                System.out.println("Your ship number is: "+ ship.getShipNumber() + ". Exit from port. Gate number: " + ship.getNumberGate());
            } else if (gate == 2 && statusGateTo) {
                ship.setShipInPort(false);
                ship.setNumberGate(0);
                statusGateTo = false;
                System.out.println("Your ship can`t get in gate, gate is occupied");
                System.out.println("Your ship number is: "+ ship.getShipNumber() + ". Exit from port. Gate number: " + ship.getNumberGate());
            } else if (gate > 2 || gate < 0) {
                System.out.println("Gate number: " + gate + "does`t exist, switch the gate number to right");
            } else {
                System.out.println("This gate is not occupied");
            }
        } else {
            System.out.println("Ship out of port");
        }
    }

    protected void addContainer(){
        for (int i = 0; i < 50; i++) {
            containers.add(new Container(1000, "Mobila epta ayfon4ik 14 pro max", i));
        }
    }
}
