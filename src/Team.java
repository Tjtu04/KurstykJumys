import java.util.ArrayList;
import java.util.List;
public class Team implements Game{
    private static ArrayList<Players> players = new ArrayList<>(); // мұнда біз бірінші команданың ойыншыларын сақтаймыз
    private static ArrayList<Players> players2 = new ArrayList<>(); // мұнда біз екінші команданың ойыншыларын сақтаймыз
    public List<Players> getPlayers() {
        return players; // бұл әдіс бірінші команданың барлық ойыншыларының деректерін қайтарады
    }
    public List<Players> getPlayers2() {
        return players2; // бұл әдіс екінші команданың барлық ойыншыларының деректерін қайтарады
    }
    @Override
    public void resultOfGame() {
        double allPower = 0; // мұнда біз олардың күші негізінде қай команда күшті екенін есептейміз
        for (int i = 0; i < 5; i++) {
            double commands = players.get(i).getPower();
            allPower += commands;
        }
        double allPower2 = 0; // мұнда біз олардың күші негізінде қай команда күшті екенін есептейміз
        for (int i = 0; i < 5; i++) {
            double commands2 = players2.get(i).getPower();
            allPower2 += commands2;
        }
        int count = 0;
        if (allPower >= 50) {
            count = 1;
        }
        if (allPower >= 70) {
            count = 2;
        }
        if (allPower > 90) {
            count = 3;
        }
//              -------------------------------------------------------------------------
        int count2 = 0;
        if (allPower2 >= 50) {
            count2 = 1;
        }
        if (allPower2 >= 70) {
            count2 = 2;
        }
//              -------------------------------------------------------------------------
        if (count == count2){
            System.out.println("equals");
        }else if (count > count2){
            System.out.println("Bayern" + " win");
        }else {
            System.out.println("Real Madrid" + " win");
        }
        System.out.println("Score:" + count + ":" + count2);
    }
}