import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // сканер арқылы енгізу
        Team team = new Team();
        Players Ba1 = new Players("Muller", 92); // біз ойыншыны толтырдық
        team.getPlayers().add(Ba1); // бұл команда ойыншыны қосу үшін қолданылады
        Players Ba2 = new Players("Lewandowski", 94); // біз ойыншыны толтырдық
        team.getPlayers().add(Ba2); // бұл команда ойыншыға қосу үшін қолданылады
        Players Ba3 = new Players("Neuer", 91); // біз ойыншыны толтырдық
        team.getPlayers().add(Ba3); // бұл команда ойыншыға қосу үшін қолданылады
        Players Ba4 = new Players("Kimmich", 88); // біз ойыншыны толтырдық
        team.getPlayers().add(Ba4); // бұл команда ойыншыға қосу үшін қолданылады
        Players Ba5 = new Players("Goretzka", 87); // біз ойыншыны толтырдық
        team.getPlayers().add(Ba5); // бұл команда ойыншыға қосу үшін қолданылады
        Players Real1 = new Players("Benzema", 89); // біз ойыншыны толтырдық
        team.getPlayers2().add(Real1); // бұл команда ойыншыға қосу үшін қолданылады
        Players Real2 = new Players("Modric", 87); // біз ойыншыны толтырдық
        team.getPlayers2().add(Real2); // бұл команда ойыншыға қосу үшін қолданылады
        Players Real3 = new Players("Courtois", 89); // біз ойыншыны толтырдық
        team.getPlayers2().add(Real3); // бұл команда ойыншыға қосу үшін қолданылады
        Players Real4 = new Players("Hazard", 85); // біз ойыншыны толтырдық
        team.getPlayers2().add(Real4); // бұл команда ойыншыға қосу үшін қолданылады
        Players Real5 = new Players("Kroos", 88); // біз ойыншыны толтырдық
        team.getPlayers2().add(Real5); // бұл команда ойыншыға қосу үшін қолданылады


        while (true) { // бұл жерде шексіз цикл қолданамыз
            System.out.println("[1] Start game");
            System.out.println("[2] Watch first main team");
            System.out.println("[3] Watch second main team");


            int choice = 0;
            try { // Бұл параметр String мәнін енгізу қатесін ұстайды
                choice = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    System.out.println("Game:");
                    team.resultOfGame(); // мұнда біз game интерфейсін мұра ететін Team класынан әдісті мұра етеміз
                    break;
                case 2:
                    System.out.println("Bayern" + " main team:");
                    System.out.println(team.getPlayers()); // бірінші команданың ойыншыларын экранға шығарамыз
                    System.out.println("------------------------------------");
                    break;

                case 3:
                    System.out.println("Real Madrid" + " main team:");
                    System.out.println(team.getPlayers2()); // екінші команданың ойыншыларын экранға шығарамыз
                    System.out.println("------------------------------------");
                    break;

            }
        }
    }
}