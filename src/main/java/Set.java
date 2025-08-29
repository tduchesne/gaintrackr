
/**
 * Represents a single set performed during an exercise.
 *
 * @param reps The number of repetitions completed in the set.
 * @param load The weight (in pounds or kilograms) used for the set.
 * @param rir  The RIR (Reps in Reserve) value for the set.
 * @param notes Optional notes about the set, e.g., "4th pin on the incline bench".
 */
public record Set(int reps, double load, int rir, String notes) {}
