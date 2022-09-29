package co.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUserInterface {

    public static final Target LOCATION_HOME = Target
            .the("Select the locate")
            .locatedBy("(//div[@class='dx-dropdowneditor-icon'])[1]");

    public static final Target LOCATION_HOME_NASSAU = Target
            .the("Nassau")
            .locatedBy("//div[@class='dx-item-content dx-list-item-content'][normalize-space()='{0}']");

    public static final Target CHECK_IN_CLICK = Target
            .the("Entry date")
            .locatedBy("(//input[@class='dx-texteditor-input'])[2]");

    public static final Target CHECK_OUT_CLICK = Target
            .the("Check Out")
            .locatedBy("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/input");

}
