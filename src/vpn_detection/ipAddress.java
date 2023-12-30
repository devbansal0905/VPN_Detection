/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vpn_detection;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
public class ipAddress {
    public String ip;
    ipAddress() throws Exception
    {
        this.ip = "";
    }
    public void init() throws Exception
    {
        String urlString = "https://checkip.amazonaws.com/";
        URL url = new URL(urlString);
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())))
        {
             //System.out.println(br.readLine());
             this.ip = br.readLine();
        }
    }
}
