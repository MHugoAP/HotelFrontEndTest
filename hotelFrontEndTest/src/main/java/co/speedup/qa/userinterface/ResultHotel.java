package co.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ResultHotel {

    public static final Target HOLTE_VALUE_1 = Target
            .the("Hotel value 1")
            .locatedBy("//p[normalize-space()='$399']");

    public static final Target BOOK_IT_1 = Target
            .the("")
            .locatedBy("(//div[@class='dx-button-content'])[13]");

    public static final Target HOLTE_VALUE_2 = Target
            .the("Hotel value 2")
            .locatedBy("//p[normalize-space()='$299']");

    public static final Target BOOK_IT_2 = Target
            .the("")
            .locatedBy("(//div[@class='dx-button-content'])[14]");

    public static final Target HOLTE_VALUE_3 = Target
            .the("Hotel value 4")
            .locatedBy("//p[normalize-space()='$249']");

    public static final Target BOOK_IT_3 = Target
            .the("")
            .locatedBy("(//div[@class='dx-button-content'])[15]");
}
