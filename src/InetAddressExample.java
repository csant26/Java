import java.net.*;
public class InetAddressExample {
    public static void main(String[] args) throws Exception{
        InetAddress address = InetAddress.getByName("www.google.com");
        System.out.println(address.getHostAddress());
    }
}
