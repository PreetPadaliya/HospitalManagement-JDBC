package Management;

public class HospitalManagementSystem {

    private static final String url = "jdbc:mysql://localhost:3307/hospital";

    private static final String username  = "root";
    private static final String password = "258164";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
