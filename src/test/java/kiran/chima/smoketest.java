package kiran.chima;



	import cucumber.annotation.en.Given;
	import cucumber.annotation.en.Then;
	import cucumber.annotation.en.When;

	public class smoketest {
		
		@Given("^Admin is in login page$")
		public void Admin_is_in_login_page() {
			System.out.println("Given");
		   
		}

		@When("^Admin enters 'testlabadmin' as username$")
		public void Admin_enters_testlabadmin_as_username() {
			System.out.println("when");
		}

		@When("^Admin enters 'Admin(\\d+)' as password$")
		public void Admin_enters_Admin_as_password(int arg1) {
			System.out.println("when2");
		}

		@When("^Admin clicks on 'login' button$")
		public void Admin_clicks_on_login_button() {
			System.out.println("when3");
		   
		}

		@Then("^Admin should login successfully$")
		public void Admin_should_login_successfully() {
			System.out.println("Then");
		   
		}

		@Then("^Admin should see 'Welcome Admin' text message,dashboard$")
		public void Admin_should_see_Welcome_Admin_text_message_dashboard() {
			System.out.println("Then2");
		  
		}

	}

	
	
	
