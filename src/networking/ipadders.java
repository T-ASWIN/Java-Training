package networking;
import java.net.*;
public class ipadders {
    public static void main(String[] args) throws
            UnknownHostException{
        InetAddress address=InetAddress.getLocalHost();
        System.out.println("Inetaddress of the local host: "+address);
        String hostName=address.getHostName();
        System.out.println("\nHost name of the local host: "+hostName);
    }
}
