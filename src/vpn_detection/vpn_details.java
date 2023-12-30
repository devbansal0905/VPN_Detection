/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vpn_detection;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import org.json.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author ASUS
 */
public class vpn_details extends JFrame{
    JLabel ip = new JLabel();
    JLabel ip_ans = new JLabel();
    JLabel vpn = new JLabel();
    JLabel vpn_ans = new JLabel();
    JLabel proxy = new JLabel();
    JLabel proxy_ans = new JLabel();
    JLabel tor = new JLabel();
    JLabel tor_ans = new JLabel();
    JLabel relay = new JLabel();
    JLabel relay_ans = new JLabel();
    JLabel country = new JLabel();
    JLabel country_ans = new JLabel();
    JLabel network_id = new JLabel();
    JLabel network_id_ans = new JLabel();
    JLabel network_org = new JLabel();
    JLabel network_org_ans = new JLabel();
    JPanel body = new JPanel();
    vpn_details(String ans)
    {
        JSONObject json = new JSONObject(ans);
        this.setTitle("VPN-Detection");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocation(300,300);
        this.setResizable(false);
        this.setSize(500,400);
        this.setVisible(true);
        this.add(ip);
        this.add(ip_ans);
        this.add(new JSeparator());
        this.add(vpn);
        this.add(vpn_ans);
        this.add(tor);
        this.add(tor_ans);
        this.add(relay);
        this.add(relay_ans);
        this.add(proxy);
        this.add(proxy_ans);
        this.add(country);
        this.add(country_ans);
        this.add(network_id);
        this.add(network_id_ans);
        this.add(network_org);
        this.add(network_org_ans);
        this.add(body);
        this.setLayout(null);
        
        body.setVisible(true);
        body.setBounds(35,25,420,250);
        body.setBackground(new Color(255,255,255));
        
        
        ip.setText("Your IP Address: ");
        ip.setFont(new Font("Mv Boli",Font.BOLD,14));
        ip.setBounds(45, 20, 200, 50);
        
        
        String ip_addr = json.getString("ip");
        ip_ans.setText(ip_addr);
        ip_ans.setFont(new Font("Mv Boli",Font.BOLD,14));
        ip_ans.setBounds(220, 20, 200, 50);
        
        vpn.setText("VPN: ");
        vpn.setFont(new Font("Mv Boli",Font.BOLD,14));
        vpn.setBounds(45, 45, 200, 50);
        
        JSONObject sec = json.getJSONObject("security");
        vpn_ans.setText(String.valueOf(sec.getBoolean("vpn")));
        vpn_ans.setFont(new Font("Mv Boli",Font.BOLD,14));
        vpn_ans.setBounds(220, 45, 200, 50);
        
        proxy.setText("Proxy: ");
        proxy.setFont(new Font("Mv Boli",Font.BOLD,14));
        proxy.setBounds(45, 70, 200, 50);
        
        proxy_ans.setText(String.valueOf(sec.getBoolean("proxy")));
        proxy_ans.setFont(new Font("Mv Boli",Font.BOLD,14));
        proxy_ans.setBounds(220, 70, 200, 50);
        
        tor.setText("Tor: ");
        tor.setFont(new Font("Mv Boli",Font.BOLD,14));
        tor.setBounds(45, 95, 200, 50);
        
        tor_ans.setText(String.valueOf(sec.getBoolean("tor")));
        tor_ans.setFont(new Font("Mv Boli",Font.BOLD,14));
        tor_ans.setBounds(220, 95, 200, 50);
        
        relay.setText("Relay: ");
        relay.setFont(new Font("Mv Boli",Font.BOLD,14));
        relay.setBounds(45, 120, 200, 50);
        
        relay_ans.setText(String.valueOf(sec.getBoolean("relay")));
        relay_ans.setFont(new Font("Mv Boli",Font.BOLD,14));
        relay_ans.setBounds(220, 120, 200, 50);
        
        country.setText("Country: ");
        country.setFont(new Font("Mv Boli",Font.BOLD,14));
        country.setBounds(45, 145, 200, 50);
        
        JSONObject coun = json.getJSONObject("location");
        country_ans.setText(coun.getString("country"));
        country_ans.setFont(new Font("Mv Boli",Font.BOLD,14));
        country_ans.setBounds(220, 145, 200, 50);
        
        network_id.setText("Network ID: ");
        network_id.setFont(new Font("Mv Boli",Font.BOLD,14));
        network_id.setBounds(45, 170, 200, 50);
        
        JSONObject net = json.getJSONObject("network");
        network_id_ans.setText(net.getString("network"));
        network_id_ans.setFont(new Font("Mv Boli",Font.BOLD,14));
        network_id_ans.setBounds(220, 170, 200, 50);
        
        network_org.setText("Network Organization: ");
        network_org.setFont(new Font("Mv Boli",Font.BOLD,14));
        network_org.setBounds(45, 195, 200, 50);
        
        network_org_ans.setText(net.getString("autonomous_system_organization"));
        network_org_ans.setFont(new Font("Mv Boli",Font.BOLD,14));
        network_org_ans.setBounds(220, 195, 280, 50);
    }
    
    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
 
        g2d.drawLine(40, 90, 460, 90);
        g2d.drawLine(40, 115, 460, 115);
        g2d.drawLine(40, 140, 460, 140);
        g2d.drawLine(40, 165, 460, 165);
        g2d.drawLine(40, 190, 460, 190);
        g2d.drawLine(40, 215, 460, 215);
        g2d.drawLine(40, 240, 460, 240);
        g2d.drawLine(40, 265, 460, 265);
 
        //g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
 
        //g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));
 
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
}
