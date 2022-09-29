package co.speedup.qa.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class CheapHotel implements Interaction {

    @Override
    public <T extends Actor> void performAs(T t) {
        
    }

    public static CheapHotel onCheapHotel(){
        return new CheapHotel();
    }
}
