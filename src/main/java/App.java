/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Lancement de l'application");
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

    }
}
