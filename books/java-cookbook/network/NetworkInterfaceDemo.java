import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Show some uses of the new-in-1.4 NetworkInterface class.
 */
public class NetworkInterfaceDemo {
	public static void main(String[] a) throws IOException {
		Enumeration list = NetworkInterface.getNetworkInterfaces();
		while (list.hasMoreElements()) {
			// Get one NetworkInterface
			NetworkInterface iface = (NetworkInterface) list.nextElement();
			// Print its name
			System.out.println(iface.getDisplayName());
			Enumeration addrs = iface.getInetAddresses();
			// And its address(es)
			while (addrs.hasMoreElements()) {
				InetAddress addr = (InetAddress) addrs.nextElement();
				System.out.println(addr);
			}

		}
		// Try to get the Interface for a given local (this machine's) address
		InetAddress destAddr = InetAddress.getByName("daroad");
		try {
			NetworkInterface dest = NetworkInterface.getByInetAddress(destAddr);
			System.out.println("Address for " + destAddr + " is " + dest);
		} catch (SocketException ex) {
			System.err.println("Couldn't get address for " + destAddr);
		}
	}
}
