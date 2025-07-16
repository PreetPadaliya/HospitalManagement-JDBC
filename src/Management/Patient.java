package Management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Patient{
    private Connection connection;
    private Scanner scanner;

    public Patient(Connection connection, Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    public void addPatient(){
        System.out.print("Enter Patient Name : ");
        String name = scanner.next();
        System.out.print("Enter Patient Age : ");
        int age = scanner.nextInt();
        System.out.print("Enter Patient Gender : ");
        String gender = scanner.next();

        try {
            String query = "insert into patients(name,age,gender) values(?,?.?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.setString(3,gender);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows>0){
                System.out.println("Patient Added Successfully !");
            }
            else {
                System.out.println("Failed to add Paitent !");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
