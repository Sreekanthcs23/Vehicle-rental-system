/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIpack;
import javax.swing.*;
import java.awt.Dimension;
import java.sql.*;
/**
 *
 * @author sreekanth
 */
public class NewFrame extends JFrame{
    
    public static int state = 0;
    private boolean logedin = false; 
    public int userid;
    public static Statement stm;
    public static Statement stm2;
    Display display;
    
    public NewFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        display = new Display(this,stm,stm2);
        add(display);
        setLocationRelativeTo(null);
        Dimension size = new Dimension(844,686);
        //setPreferredSize(size);
        //setResizable(false);
        pack();
	setVisible(true);
    }
    
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6585873","sql6585873","ubIPuhvRVJ");
            stm = con.createStatement();
            stm2 = con.createStatement();
           /* ResultSet rs = stm.executeQuery("SELECT * FROM FavouriteNumber");
            int num;
            String name;
            while(rs.next()) {
                name = rs.getString("Name");
                num = rs.getInt("Num");
                System.out.println("Name="+name+" Num="+num);
            }
            rs.close();*/
           // stm.close();
           // con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        NewFrame nf = new NewFrame();
    }
    
    public boolean isLogedin() {
        return logedin;
    }
    
    public void setLogedin(boolean val) {
        logedin = val;
    }
    
    public void logout() {
        setLogedin(false);
        state = 0;
        display.render();
    } 
    
    public void register(String username,String password) {
        if(username.equals("") || password.equals("")) {
            return;
        }
        String query = "INSERT INTO User VALUES(\""+username+"\",\""+password+"\")";
        try {
            stm.executeUpdate(query);
        }catch(Exception e) {
            System.out.println(e);
        }
        setLogedin(true);
        state=1;
        display.render();
    }
    
    public void refresh() {
        repaint();
    } 
}
