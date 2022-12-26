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
public class Display extends JPanel{
    Screen1 screen1;
    Screen2 screen2;
    LoginScreen login;
    RegisterScreen register;
    NewFrame nf;
    public Display(NewFrame nf) {
        this.nf = nf;
        screen1 = new Screen1(nf,this);
        screen2 = new Screen2(nf,this);
        login = new LoginScreen(nf,this);
        register = new RegisterScreen(nf,this);
        add(login);
    }
    
    public void paintComponent(Graphics g) {
	super.paintComponent(g);
    }
    
    public void render() {
        if(!nf.isLogedin() && nf.state == 0) {
            removeAll();
            add(login);
            revalidate();
            repaint();
        }
        if(!nf.isLogedin() && nf.state == 3){
            removeAll();
            add(register);
            revalidate();
            repaint();
        }
        if(nf.state == 1 && nf.isLogedin()) {
            removeAll();
            add(screen1);
            revalidate();
            repaint();
        }
        if(nf.state == 2 && nf.isLogedin()) {
            removeAll();
            add(screen2);
            revalidate();
            repaint();
        }
        nf.refresh();
    }
}
