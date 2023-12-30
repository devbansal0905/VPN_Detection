/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vpn_detection;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Desktop; 
import java.io.*; 
import java.net.URI; 
//import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import org.json.*;

/**
 *
 * @author ASUS
 */
public class MyFrame extends JFrame implements ActionListener{
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JPanel body = new JPanel();
    JPanel top = new JPanel();
    JTextField textField = new JTextField();
    ipAddress obj = new ipAddress();
    MyFrame() throws Exception
    {
        obj.init();
        this.setTitle("VPN-Detection");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setUndecorated(true);
        this.setLocation(300,300);
        this.setResizable(false);
        this.setSize(600,400);
        this.setVisible(true);
        
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(textField);
        this.add(body);
        //this.add(label4);
        //this.add(top);
        
        this.setLayout(null);
        
        top.setBounds(0,0,600,30);
        top.setBackground(new Color(0,255,204));
        top.setVisible(true);
        
        body.setBounds(45,25,500,300);
        body.setBackground(new Color(255,255,255));
        body.setVisible(true);
        
        label1.setText("Your IP Address: ");
        label1.setFont(new Font("Mv Boli",Font.PLAIN,18));
        label1.setBounds(140, 45, 200, 50);
        
        
        label2.setText(obj.ip);
        label2.setFont(new Font("Mv Boli",Font.PLAIN,18));
        label2.setBounds(310, 45, 200, 50);
        
        label3.setText("Enter IP Address: ");
        label3.setFont(new Font("Mv Boli",Font.PLAIN,18));
        label3.setBounds(140, 85, 200, 50);
        
        //textField.setPreferredSize(new Dimension(50,50));
        textField.setBounds(310, 85, 200, 40);
        textField.setBackground(new Color(153,255,204));
        textField.setFont(new Font("Mv Boli",Font.PLAIN,18));
        
        
        button1.setText("Check Your System");
        button1.setBounds(57, 190 , 150, 60);
        button1.setFocusable(false);
        button1.setBackground(new Color(0,255,204));
        button1.addActionListener(this);
        
        
        button2.setText("Check Other System");
        button2.setBackground(new Color(0,255,204));
        button2.setBounds(387, 190 , 150, 60);
        button2.setFocusable(false);
        button2.addActionListener(this);
        
        
        button3.setText("Get Info");
        button3.setBackground(new Color(0,255,204));
        button3.setBounds(222, 190 , 150, 60);
        button3.setFocusable(false);
        button3.addActionListener(this);
    }
    
    protected ImageIcon createImageIcon(String path,String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(e.getSource() == button1)
        {
            String temp = obj.ip;
            detailsGet myDetails = new detailsGet(temp);
            String ans="";
            try{
                ans = myDetails.getAll();
                //JSONObject json = new JSONObject(ans);  
                //System.out.println(json.toString());
                //System.out.println(json.getJSONObject("security"));
                //JSONObject se = json.getJSONObject("security");
                //System.out.println(se.getBoolean("vpn"));
            } 
            catch (Exception ex) {
            }
            vpn_details newWindow = new vpn_details(ans);
            //System.out.println(ans);
        }
        
        else if(e.getSource() == button2)
        {
            String temp = textField.getText().toString();
            //System.out.println(temp);
            detailsGet myDetails = new detailsGet(temp);
            String ans="";
            try{
                ans = myDetails.getAll();
                //JSONObject json = new JSONObject(ans);  
                //System.out.println(json.toString());
                //System.out.println(json.getJSONObject("security"));
                //JSONObject se = json.getJSONObject("security");
                //System.out.println(se.getBoolean("vpn"));
            } 
            catch (Exception ex) {
            }
            vpn_details newWindow = new vpn_details(ans);
        }
        else if(e.getSource() == button3)
        {
            Desktop desk = Desktop.getDesktop(); 
            try{
                desk.browse(new URI("https://canarytokens.org/history?token=37k3276igvjgb9cwjpshuxra1&auth=6cb3efa118a7ec904315851c89465dcc")); 
            }
            catch(Exception ex)
            {
                
            }
        }
    }
}
