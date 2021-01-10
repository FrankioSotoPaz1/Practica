package practice.choucair.certification.automationpractice.userinterfaces;

	import net.serenitybdd.core.annotations.findby.By;
	import net.serenitybdd.screenplay.targets.Target;
	import net.thucydides.core.annotations.DefaultUrl;
	import net.thucydides.core.pages.PageObject;

	@DefaultUrl("http://automationpractice.com/index.php")
	public class LoginHomePage extends PageObject {

		public static final Target SINGIN = Target.the("Button to sing in")
	            .locatedBy("//a[@class='login'][contains(.,'Sign in')]");

		public static final Target FIELD_EMAIL = Target.the("Field to insert user")
	            .located(By.id("email"));

	    public static final Target FIELD_PASSWORD = Target.the("Field to insert password")
	            .located(By.id("passwd"));

	    public static final Target BUTTON_LOGIN = Target.the("Button to login")
	            .located(By.id("SumitLogin"));
	}

