public class Players {
    private String name;
    private int power;
    public Players(String name, int power) { // бұл ақпаратты толтыруға арналған конструктор
        this.name = name;
        this.power = power;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String toString() {
        return name + " " + power;
    } // бұл әдіс String  players мәнін қайтарады
}