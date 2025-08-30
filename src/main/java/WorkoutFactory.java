import java.util.ArrayList;
import java.util.List;

/**
 * A factory class for creating workout-related objects.
 * This class centralizes the creation logic, ensuring that workout programs
 * are built consistently and correctly.
 */
public class WorkoutFactory {

    /**
     * Creates and returns a sample mesocycle with pre-defined workout days and exercises.
     * This method serves as a demonstration of the workout object hierarchy.
     *
     * @return A complete Mesocycle object.
     */
    public static Mesocycle createSampleMesocycle() {
        // Crée des listes d'exercices pour chaque jour
        List<Exercise> mondayExercises = new ArrayList<>();
        List<Exercise> wednesdayExercises = new ArrayList<>();
        List<Exercise> fridayExercises = new ArrayList<>();

        // Sets de l'exercice 1
        List<Set> sets1 = new ArrayList<>();
        sets1.add(new Set(12, 100.00, 2, "1th pin"));
        sets1.add(new Set(10, 100.00, 2, "1th pin"));
        sets1.add(new Set(8, 100.00, 2, "1th pin"));

        // Exercice 1
        Exercise exercise1 = new Exercise("Cable Upright Row", sets1);

        // Sets de l'exercice 2
        List<Set> sets2 = new ArrayList<>();
        sets2.add(new Set(15, 25.00, 3, "4th pin on the bench"));
        sets2.add(new Set(12, 25.00, 3, "4th pin on the bench"));
        sets2.add(new Set(10, 25.00, 3, "4th pin on the bench"));

        // Exercice 2
        Exercise exercise2 = new Exercise("Incline Dumbbell Curl", sets2);

        // Sets de l'exercice 3
        List<Set> sets3 = new ArrayList<>();
        sets3.add(new Set(20, 70.00, 3, "1th pin"));
        sets3.add(new Set(18, 70.00, 3, "1th pin"));
        sets3.add(new Set(15, 70.00, 3, "1th pin"));

        // Exercice 3
        Exercise exercise3 = new Exercise("Cable Overhead Triceps Extension", sets3);

        // Crée les jours et ajoute les exercices appropriés
        mondayExercises.add(exercise1);
        mondayExercises.add(exercise2);
        mondayExercises.add(exercise3);

        wednesdayExercises.add(exercise1);
        wednesdayExercises.add(exercise2);
        wednesdayExercises.add(exercise3);

        fridayExercises.add(exercise1);
        fridayExercises.add(exercise2);
        fridayExercises.add(exercise3);

        List<Day> days = new ArrayList<Day>();
        days.add(new Day("Monday - Arms1", mondayExercises));
        days.add(new Day("Wednesday - Arms2", wednesdayExercises));
        days.add(new Day("Friday - Arms3", fridayExercises));

        // Crée des listes de semaines
        List<Week> weeks = new ArrayList<Week>();
        weeks.add(new Week(1, days));
        weeks.add(new Week(2, days));
        weeks.add(new Week(3, days));
        weeks.add(new Week(4, days));

        return new Mesocycle(weeks);
    }
}