import java.util.List;

/**
 * Represents a week in a mesocycle.
 *
 * @param weekNumber The sequential number of the week in the mesocycle.
 * @param days       A list of workout days within the week.
 */
public record Week(int weekNumber, List<Day> days) {
}
