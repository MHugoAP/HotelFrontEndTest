package co.speedup.qa.task;

import co.speedup.qa.interaction.RobotDelete;
import co.speedup.qa.model.HomeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.speedup.qa.userinterface.HomeUserInterface.*;

public class HomeTask implements Task {
    private HomeModel homeModelInstance;

    public HomeTask(HomeModel homeModel){
        this.homeModelInstance = homeModel;
    }

    @Override
    public <T extends Actor> void performAs(T actorHome) {
        actorHome.attemptsTo(Click.on(LOCATION_HOME));
        actorHome.attemptsTo(Click.on(LOCATION_HOME_NASSAU.of(homeModelInstance.getLocation())));
        actorHome.attemptsTo(Enter.theValue(homeModelInstance.getCheckIn()).into(CHECK_IN_CLICK));
        actorHome.attemptsTo(Click.on(CHECK_OUT_CLICK), RobotDelete.on() ,Enter.theValue(homeModelInstance.getCheckOut()).into(CHECK_OUT_CLICK));
    }

    public static HomeTask withData(HomeModel homeModel){
        return new HomeTask(homeModel);
    }
}
