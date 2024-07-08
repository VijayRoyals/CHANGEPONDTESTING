package Local;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class StudentRegistrationFormTest {

    @Test
    void testStudentRegistrationForm() {
        StudentRegistrationForm form = new StudentRegistrationForm();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Roll No:");
        String rollNo = scanner.nextLine();
        form.setRollNo(rollNo);
        System.out.println("Enter Full Name:");
        String fullName = scanner.nextLine();
        form.setFullName(fullName);
        System.out.println("Enter Department:");
        String department = scanner.nextLine();
        form.setDepartment(department);
        System.out.println("Enter Contact No:");
        String contactNo = scanner.nextLine();
        form.setContactNo(contactNo);
        System.out.println("Enter Email:");
        String email = scanner.nextLine();
        form.setEmail(email);
        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();
        form.setGender(gender);
        System.out.println("Enter Date of Birth (dd/mm/yyyy):");
        String dob = scanner.nextLine();
        form.setDob(dob);
        System.out.println("Enter Address:");
        String address = scanner.nextLine();
        form.setAddress(address);
        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        form.setPassword(password);

        System.out.println("Testing Roll No...");
        assertEquals(rollNo, form.getRollNo());
        System.out.println("Testing Full Name...");
        assertEquals(fullName, form.getFullName());
        System.out.println("Testing Department...");
        assertEquals(department, form.getDepartment());
        System.out.println("Testing Contact No...");
        assertEquals(contactNo, form.getContactNo());
        System.out.println("Testing Email...");
        assertEquals(email, form.getEmail());
        System.out.println("Testing Gender...");
        assertEquals(gender, form.getGender());
        System.out.println("Testing Date of Birth...");
        assertEquals(dob, form.getDob());
        System.out.println("Testing Address...");
        assertEquals(address, form.getAddress());
        System.out.println("Testing Password...");
        assertEquals(password, form.getPassword());

        scanner.close();
    }
}
