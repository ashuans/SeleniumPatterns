package bizdomain.common;

import org.junit.AfterClass;
import org.junit.Before;

import util.browserdriver.BrowserDriver;
import bizdomain.pages.DashBoard;
import bizdomain.pages.LoginPage;


public class BaseWebTest {
	protected DashBoard homePage;
	protected LoginPage loginPage;
	
	@Before
	public void baseSetupMethod() throws Exception {
		BrowserDriver.open(DashBoard.HOME_PAGE_URL);
		loginPage = new LoginPage();
		homePage = loginPage.login("patrickwilsonwelsh", "password");
	}
	
	@AfterClass
	public static void baseTearDownSuite() throws Exception {
		BrowserDriver.stopEverything();
	}
}
