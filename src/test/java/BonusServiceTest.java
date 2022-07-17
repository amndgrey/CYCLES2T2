import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void shouldCalcBonusIfSmallAmountAndRegistered() {
        BonusService service = new BonusService();

        long actual = service.calculate(1_000, true);
        long expected = 30;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBonusIfHugeAmountAndRegistered() {
        BonusService service = new BonusService();

        long actual = service.calculate(1_000_000, true);
        long expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBonusIfSmallAmountAndNotRegistered() {
        BonusService service = new BonusService();

        long actual = service.calculate(1_000, false);
        long expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBonusIfHugeAmountAndNotRegistered() {
        BonusService service = new BonusService();

        long actual = service.calculate(1_000_000, false);
        long expected = 500;

        assertEquals(expected, actual);
    }
}
