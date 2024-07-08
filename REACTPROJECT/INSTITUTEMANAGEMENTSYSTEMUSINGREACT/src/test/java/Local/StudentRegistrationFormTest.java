package Local;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentRegistrationFormTest {

    @Test
    void testRollNo() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setRollNo("19751A0547");
        assertEquals("19751A0547", form.getRollNo());
    }

    @Test
    void testFullName() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setFullName("VIJAY KUMAR");
        assertEquals("VIJAY KUMAR", form.getFullName());
    }

    @Test
    void testDepartment() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setDepartment("Computer Science");
        assertEquals("Computer Science", form.getDepartment());
    }

    @Test
    void testContactNo() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setContactNo("6379616860");
        assertEquals("6379616860", form.getContactNo());
    }

    @Test
    void testEmail() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setEmail("Raghulsundar@gmail.com");
        assertEquals("Raghulsundar@gmail.com", form.getEmail());
    }

    @Test
    void testGender() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setGender("Male");
        assertEquals("Male", form.getGender());
    }

    @Test
    void testDob() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setDob("01/01/2000");
        assertEquals("01/01/2000", form.getDob());
    }

    @Test
    void testAddress() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setAddress("2-382 Main St");
        assertEquals("2-382 Main St", form.getAddress());
    }

    @Test
    void testPassword() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        form.setPassword("password");
        assertEquals("password", form.getPassword());
    }
}
