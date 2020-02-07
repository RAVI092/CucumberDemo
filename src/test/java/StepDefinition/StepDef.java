package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {

	WebDriver d1;
@Given("I am at the Etsy Login Page,I entered my User Name {string} Password {string}")
public void i_am_at_the_Etsy_Login_Page_I_entered_my_User_Name_Password(String Usr_Nme, String PWD) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Selenium\\chromedriver_win32\\chromedriver.exe");
    d1=new ChromeDriver();
    d1.get("https://www.etsy.com/");
    d1.findElement(By.xpath("//*[@id=\'gnav-header-inner\']/div[4]/nav/ul/li[1]/button")).click();
 //   d1.findElement(By.id("join_neu_email_field")).sendKeys("Usr_Nme");
 //      d1.findElement(By.xpath("//*[@id=\'join_neu_password_field\']")).sendKeys(PWD);
    
}

@Given("Click the Login btn")
public void click_the_Login_btn() {
   
}

@Given("I entered the product name {string} in the search box.")
public void i_entered_the_product_name_in_the_search_box(String string) {
    
    
}

@Given("click the search button.")
public void click_the_search_button() {
    
    
}

@When("I select the product and add it into my cart.")
public void i_select_the_product_and_add_it_into_my_cart() {
    
    
}

@When("I confirm my product and proceed to checkout page.")
public void i_confirm_my_product_and_proceed_to_checkout_page() {
    
    
}

@Then("I enter my Delivery Address {string},{string},{string},{string},{string}")
public void i_enter_my_Delivery_Address(String string, String string2, String string3, String string4, String string5) {
    
    
}

@Then("I move to payment page and enter my credit card details {string},{string},{string}.")
public void i_move_to_payment_page_and_enter_my_credit_card_details(String string, String string2, String string3) {
    
    d1.quit();
}


@Given("I xam at the Etsy Login Page,I entered my User Name  Password")
public void i_xam_at_the_Etsy_Login_Page_I_entered_my_User_Name_Password() {
    // Write code here that turns the phrase above into concrete actions

}

@Given("Clickx the Login btn")
public void clickx_the_Login_btn() {
    // Write code here that turns the phrase above into concrete actions

}

@Given("I entexred the product name  in the search box.")
public void i_entexred_the_product_name_in_the_search_box() {
    // Write code here that turns the phrase above into concrete actions

}

@Given("click txhe search button.")
public void click_txhe_search_button() {
    // Write code here that turns the phrase above into concrete actions

}

@When("I selecxt the product and add it into my cart.")
public void i_selecxt_the_product_and_add_it_into_my_cart() {
    // Write code here that turns the phrase above into concrete actions

}

@When("I confirmx my product and proceed to checkout page.")
public void i_confirmx_my_product_and_proceed_to_checkout_page() {
    // Write code here that turns the phrase above into concrete actions

}

@Then("I enter mxy Delivery Address")
public void i_enter_mxy_Delivery_Address() {
    // Write code here that turns the phrase above into concrete actions

}

@Then("I move to pxayment page and enter my credit card details")
public void i_move_to_pxayment_page_and_enter_my_credit_card_details() {


}

	
	
	
}
