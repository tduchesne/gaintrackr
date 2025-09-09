import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Lancement de l'application");
        Scanner scanner = new Scanner(System.in);

        // Menu principal
        while(true){
            System.out.println("Veuillez choisir une option: ");
            System.out.println("1. Afficher le programme d'entraînement");
            System.out.println("2. Ajouter une séance d'entraînement");
            System.out.println("3. Quitter l'application");


            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                switch(input) {
                    case 1:
                        Mesocycle mesocycle = WorkoutFactory.createSampleMesocycle();
                        System.out.println(mesocycle.name());
                        System.out.println("==============");
                        for(Week week : mesocycle.weeks()){
                            System.out.println("Week " + week.weekNumber());
                            for(Day day : week.days()){
                                System.out.println("\t" + day.name());
                                for(Exercise exercise : day.exercises()) {
                                    System.out.println("\t\t" + exercise.name());
                                    for(Set set : exercise.sets()) {
                                        System.out.print("\t\t\t Reps : " + set.reps());
                                        System.out.println(" - Load : " +  set.load());
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Ajoute une séance - TODO");
                        break;
                    case 3:
                        System.exit(0);
                }
            } else {
                System.out.println("Entrée invalide, veuillez entrer un nombre entre 1 et 3.");
                scanner.nextLine();
            }
        }
    }
}
