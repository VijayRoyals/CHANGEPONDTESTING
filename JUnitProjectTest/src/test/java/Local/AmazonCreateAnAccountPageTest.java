package Local;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AmazonCreateAnAccountPageTest {

    private static Scanner scanner;

    @BeforeAll
    public static void setUp() {
        scanner = new Scanner(System.in);
    }

    @AfterAll
    public static void tearDown() {
        scanner.close();
    }

    @Test
    public void testYourName() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);

        assertNotNull(name);
    }

    @Test
    public void testMobNOAndEmail() {
        System.out.print("Enter mobile number: ");
        String mobNo = scanner.nextLine();
        System.out.print("Enter email address: ");
        String email = scanner.nextLine();
        
        AmazonCreateAnAccountPage page = new AmazonCreateAnAccountPage();
        assertEquals(mobNo + email, page.MobNOAndEmail(mobNo, email));
    }

    @Test
    public void testCheckPassword() {
        System.out.print("Enter password to test (6 characters or more): ");
        String password = scanner.nextLine();
        
        AmazonCreateAnAccountPage page = new AmazonCreateAnAccountPage();
        assertTrue(page.CheckPassword(password)); 
    }

    @Test
    public void testClickContinue() {
        System.out.println("Enter details to test Click Continue:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        
        AmazonCreateAnAccountPage page = new AmazonCreateAnAccountPage();
        assertTrue(page.clickContinue(name, email, password));
    }
    
    
    @Test
    void testContinueButton() { 
    	AmazonCreateAnAccountPage a = new AmazonCreateAnAccountPage(); 
    	
    	String name = "Harry Potter"; 
    	String email = "harry@gmail.com"; 
    	String password = "pass@12"; 
    	
    	boolean result = a.clickContinue(name, email, password); 
    	assertTrue(result); 
    }
}
