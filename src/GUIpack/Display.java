/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIpack;
import javax.swing.*;
import java.awt.Graphics;
/**
 *
 * @author sreekanth
 */
import java.sql.*;
public class Display extends JPanel{
    Homepage11 home1;
    LoginScreen login;
    RegisterScreen register;
    Homepage2 home2;
    Dashboard dashboard;
    FindCars findcars;
    RentCar rentcar;
    Profile profile;
    NewFrame nf;
    public Display(NewFrame nf,Statement stm) {
        this.nf = nf;
        home1 = new Homepage11(nf,this);
        register = new RegisterScreen(nf,this,stm);
        home2 = new Homepage2(nf,this);
        dashboard = new Dashboard(nf,this);
        findcars = new FindCars(nf,this);
        rentcar = new RentCar(nf,this,stm);
        profile = new Profile(nf,this,stm);
        login = new LoginScreen(nf,this,profile);
        add(home1);
    }
    
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
    }
    
    public void render() {
        if(!nf.isLogedin() && nf.state == 0) {
            removeAll();
            add(home1);
            revalidate();
            repaint();
        }
        if(!nf.isLogedin() && nf.state == 1){
            removeAll();
            add(login);
            revalidate();
            repaint();
        }
        if(!nf.isLogedin() && nf.state == 2){
            removeAll();
            add(register);
            revalidate();
            repaint();
        }
        if(nf.state == 3 && nf.isLogedin()) {
            removeAll();
            add(home2);
            revalidate();
            repaint();
        }
       if(nf.state == 4 && nf.isLogedin()) {
            removeAll();
            add(dashboard);
            revalidate();
            repaint();
        }
        if(nf.state == 5 && nf.isLogedin()) {
            removeAll();
            add(findcars);
            revalidate();
            repaint();
        }
        if(nf.state == 6 && nf.isLogedin()) {
            removeAll();
            add(rentcar);
            revalidate();
            repaint();
        }
        if(nf.state == 7 && nf.isLogedin()) {
            removeAll();
            add(profile);
            revalidate();
            repaint();
        }
        nf.refresh();
    }
}
