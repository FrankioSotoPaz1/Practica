package practice.choucair.certification.automationpractice.runners;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resource/features/login.feature" ,
glue = "practice.choucair.certification.automationpractice.stepdefinitions",
snippets = SnippetType.CAMELCASE
)

public class LoginRunner {

}
