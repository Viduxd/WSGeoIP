package wsgeoip;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root
public class GeoIP {
    @Element
    private String ReturnCode;
            
    @Element
    private String IP;
            
    @Element
    private String ReturnCodeDetails;
            
    @Element
    private String CountryName;
            
    @Element
    private String CountryCode;
    
    
    public String getReturnCode() {
        return ReturnCode;
    }

    public String getIP() {
        return IP;
    }

    public String getReturnCodeDetails() {
        return ReturnCodeDetails;
    }

    public String getCountryName() {
        return CountryName;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    
    
    
    
    
    
}
