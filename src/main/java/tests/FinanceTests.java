package tests;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinanceTests {

    @Test
    public void constructorShouldCreatedObjectWhenValidData() {

        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(100000.0, f.getTotalAmount());
        Assertions.assertEquals(2000.0, f.getIncome());
        Assertions.assertEquals(80, f.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 20);
        });
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData() {

        Financing f = new Financing(100000.0, 2000.0, 80);
        f.setTotalAmount(90000.0);

        Assertions.assertEquals(90000.0, f.getTotalAmount());

    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setTotalAmount(110000.0);
        });
    }

    @Test
    public void setIncomeShouldSetDataWhenValidData() {

        Financing f = new Financing(100000.0, 2000.0, 80);
        f.setIncome(2100.0);

        Assertions.assertEquals(2100.0, f.getIncome());

    }

    @Test
    public void setIncomeAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setIncome(1900.0);
        });
    }

    @Test
    public void setMonthsShouldSetDataWhenValidData() {

        Financing f = new Financing(100000.0, 2000.0, 80);
        f.setMonths(85);

        Assertions.assertEquals(85, f.getMonths());
    }

    @Test
    public void setMonthsAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = new Financing(100000.0, 2000.0, 80);
            f.setMonths(79);
        });
    }

    @Test
    public void entryShouldCalculateEntryCorrectly() {
        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(20000.0, f.entry());
    }

    @Test
    public void quotaShouldCalculateQuotaCorrectly() {
        Financing f = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(1000.0, f.quota());
    }
}
