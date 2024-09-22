
//Factory Method : creates socket instance; getByName(), getLocalHost() etc. are used to get InetAddress obj
//Getter Method : retrieves properties of a socket instance; getHostName(), getHostAddress() etc. are used to retrieve information about the object.

import java.net.*;
public class InetAddressExample {
    public static void main(String[] args) throws Exception{
        InetAddress address = InetAddress.getByName("www.google.com");
        System.out.println(address);
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);
    }
}
