import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WorkoutFactoryTest {

    @Test
    void shouldCreateACompleteMesocycle() {

        Mesocycle mesocycle = WorkoutFactory.createSampleMesocycle();
        assertNotNull(mesocycle, "The mesocycle should not be null.");
        assertEquals(4, mesocycle.weeks().size(), "The mesocycle should contain 4 weeks.");
        Week firstWeek = mesocycle.weeks().get(0);
        assertEquals(3, firstWeek.days().size(), "The first week should contain 3 days.");
        Day firstDay = firstWeek.days().get(0);
        assertEquals(3, firstDay.exercises().size(), "The first day should contain 3 exercises");
    }
}

