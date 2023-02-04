import java.util.ArrayList;
import java.util.List;

public class Ship {

    private int shipNumber;
    private boolean shipInPort = false;


    private int numberGate;
    private List<Container> containers = new ArrayList<>();

    public Ship(int shipNumber, boolean shipInPort, int numberGate, List<Container> containers) {
        this.shipNumber = shipNumber;
        this.shipInPort = shipInPort;
        this.numberGate = numberGate;
        this.containers = containers;
    }

    public int getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(int shipNumber) {
        this.shipNumber = shipNumber;
    }

    public boolean getShipInPort() {
        return shipInPort;
    }

    public void setShipInPort(boolean shipInPort) {
        this.shipInPort = shipInPort;
    }

    public boolean isShipInPort() {
        return shipInPort;
    }

    public int getNumberGate() {
        return numberGate;
    }

    public void setNumberGate(int numberGate) {
        this.numberGate = numberGate;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }
}
