public class Container {
    private int weight;
    private String type;
    private int id;

    protected Container(int weight, String type, int id) {
        this.weight = weight;
        this.type = type;
        this.id = id;
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    protected String getType(){
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }
}
