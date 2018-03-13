package wsgeoip;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class WSGeoIP {

    public static void main(String[] args) throws MalformedURLException, IOException, Exception {

        String s = "http://www.webservicex.net/geoipservice.asmx/GetGeoIPContext";
        URL url = new URL(s);
        Scanner scan = new Scanner(url.openStream());
        String source = new String();
        while(scan.hasNext()) {
            source+=scan.nextLine();
        }
        
        Serializer serializer = new Persister();
        GeoIP geoIp = new GeoIP();
        serializer.read(geoIp, source);
        System.out.println("La ip es: " + geoIp.getIP());
        System.out.println("El codigo del pais es: " + geoIp.getCountryCode());
        System.out.println("El nombre del pais es: " + geoIp.getCountryName());


        
        
    }
    
    
}
