/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vpn_detection;

/**
 *
 * @author ASUS
 */
public class response {
    public String ip;
    public Security check;
    public Location loc;
    public Network net;
    
    public class Security{
        public boolean vpn;
        public boolean proxy;
        public boolean tor;
        public boolean relay;
    }

    public class Location{
        public String city;
        public String region;
        public String country;
        public String continent;
        public String region_code;
        public String country_code;
        public String lat;
        public String lon;
        public String time_zone;
        public String locale_code;
        public String metro_code;
        public boolean is_in_european_union;
    }

    public class Network{
        public String network;
        public String autonomous_system_number;
        public String autonomous_system_organization;
    }
    
    public String toString()
    {
        return (ip + check.vpn + check.proxy + check.tor + check.relay + loc.country + net.autonomous_system_organization);
    }
}
