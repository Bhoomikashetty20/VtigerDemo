package UnitTestingTool;

import org.testng.annotations.Test;

public class ToUnderstandDependsOnMethod {

	@Test
	public void createAccount(){
		System.out.println("Account created successfully...!!!!");
		//int i=2/0;
	}
	
	@Test(dependsOnMethods = "createAccount")
	public void editAccount(){
		System.out.println("Account edited successfully...!!!!");
		//int i=2/0;
	}
	
	@Test(dependsOnMethods = {"createAccount", "editAccount"})
	public void deleteAccount(){
		System.out.println("Account deleted successfully...!!!!");
		int i=2/0;
	}
}
