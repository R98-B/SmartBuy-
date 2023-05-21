import java.util.Random;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters_SamrtBuy_Final_Test_Project {
	
	
	SoftAssert myAssertion = new SoftAssert();
	WebDriver driver = new ChromeDriver();
	String BasieURL = "https://smartbuy-me.com/smartbuystore/en/";

	String Sign_up_button = "https://smartbuy-me.com/smartbuystore/en/login";

	String[] Title_Name_Womman = { "miss", "mrs", "ms" };

	String[] Title_Name_Men = { "mr" };

	String[] first_name_for_womman = { "Eslam", "hoda", "Rand", "Doaa" };

	String[] first_name_for_men = { "hamza", "hsuin", "zaid", "adam" };

	String[] last_name = { "Al-ahmad", "Al-zoubi", "battah", "Awamleah" };

	String[] Gender = { "MALE", "FEMALE" };
	String SEARCH[] = { "Iphone", "PlayStation", "samsung", "Lg" };
	String[] AddressLine = { "alqods Street", "DeadSea Street", "Adeb Awamaleh Street", "almgher Street" };

	String[] Locations = { "//*[@id=\"storeFinder\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[1]",
			"//*[@id=\"storeFinder\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[2]",
			"//*[@id=\"storeFinder\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[3]",
			"//*[@id=\"storeFinder\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[4]",
			"//*[@id=\"storeFinder\"]/div/div[2]/div/div/div[3]/div[1]/ul/li[5]" };

	String[] ChartAdd = { "//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[1]/div",

			"//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[2]/div",

			"//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[4]/div",

			"//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[5]/div",

			"//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[6]/div" };
	String[] itemsxpath = {

			" //*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[1]/div/div[3]/div[1]/div/div/form[1]/div[1]/button",

			" //*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[2]/div/div[3]/div[1]/div/div/form[1]/div[1]/button",

			"//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[4]/div/div[3]/div[1]/div/div/form[1]/div[1]/button ",

			"//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[5]/div/div[3]/div[1]/div/div/form[1]/div[1]/button ",

			"//*[@id=\"newtab-Featured\"]/div/div[1]/div/div/div/div[6]/div/div[3]/div[1]/div/div/form[1]/div[1]/button " };

	int j[] = { 0, 1, 2, 3, 4 };

	Random rand = new Random();
	int randomly_Search_items = rand.nextInt(j.length);

	int k = j[randomly_Search_items];

	int randomly_Womman = rand.nextInt(0, 3);

	int randomly_Men = rand.nextInt(0, 1);

	int randomly_first_name_for_womman = rand.nextInt(first_name_for_womman.length);

	int randomly_first_name_for_men = rand.nextInt(first_name_for_men.length);

	int randomly_last_name = rand.nextInt(last_name.length);

	int randomly_gender = rand.nextInt(Gender.length);

//	int numberRAndomly = rand.nextInt(111111111, 999999999);

}
