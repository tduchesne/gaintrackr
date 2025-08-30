import java.util.List;

/**
 * Represents a single day in a workout program.
 *
 * @param name      The name of the workout day, e.g., "Monday - Arms".
 * @param exercises A list of exercises scheduled for this day.
 */
public record Day(String name, List<Exercise> exercises) {
}
