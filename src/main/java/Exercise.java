import java.util.List;

/**
 * Represents a complete exercise during a workout day.
 * It contains the name of the exercise and a list of all sets performed.
 *
 * @param sets The list of all sets performed for this exercise.
 */
public record Exercise(String name, List<Set> sets) {}