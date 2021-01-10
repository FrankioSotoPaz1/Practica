package practice.choucair.certification.automationpractice.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import  static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheApp implements Task {

    private PageObject page;

    public OpenTheApp(PageObject page) {
        this.page = page;
    }

    @Override
    @Step("{0} goes to #OpenTheApp")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static OpenTheApp on(PageObject page){
        return instrumented(OpenTheApp.class);
    }
   
}


	
