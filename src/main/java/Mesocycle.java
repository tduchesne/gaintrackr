import java.util.List;

/**
 * Represents a complete mesocycle (a block of weeks) in a training program.
 *
 * @param weeks A list of all weeks in the mesocycle.
 */
public record Mesocycle(List<Week> weeks) {
}
