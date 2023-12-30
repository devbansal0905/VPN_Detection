/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vpn_detection;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URI;

/**
 *
 * @author ASUS
 */
public class detailsGet {
    String ip;
    detailsGet(String ip){
        this.ip = ip;
    }
    
    public String getAll() throws Exception{
        //String ip = "185.107.56.139";
        //String output;
        var url = "https://vpnapi.io/api/"+ip+"?key=641e6eaa216d4dcaba53e99b4eb048d2";
        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        var client = HttpClient.newBuilder().build();
        var response = client.send(request,HttpResponse.BodyHandlers.ofString());
        String ans = response.body();
        return ans;
    }
}
