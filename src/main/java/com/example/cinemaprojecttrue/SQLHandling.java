package com.example.cinemaprojecttrue;
import java.sql.*;
import java.util.ArrayList;

public class SQLHandling {

    public static ArrayList<String>UserDetails = new ArrayList<>();


    public static void SQLTest() {
        String DatabaseLocation = System.getProperty("user.dir")+"\\CourseworkDatabase.accdb";

        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");

            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sql = "SELECT * FROM UserDetails";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next())   {
                System.out.println("Username: " + rs.getString("Username"));
                UserDetails.add(rs.getString("Username")+","+rs.getString("Password"));

            }
            rs.close();
            con.close();




        } catch (Exception e) {
            System.out.println("Error in the SQL class:" + e);
        }

    }

}
