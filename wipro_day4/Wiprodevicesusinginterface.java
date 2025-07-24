package wipro_day4;

interface WiproSystems{
	void deviceType();
	void compilespeed();
}
class Desktop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provide devices: DESKTOP");
	}
	public void compilespeed() {
		System.out.println("code is compled in fast in desktop");
	}
}
class LAPTOP implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provide devices: LAPTOP");
	}
	public void compilespeed() {
		System.out.println("code is compled in fast in LAPTOPS");
	}
	
}
public class Wiprodevicesusinginterface {
	public static void main(String[] args) {
		WiproSystems ws = new Desktop();
		WiproSystems ls = new LAPTOP();
		ws.deviceType();
		ws.compilespeed();
		ls.deviceType();
		ls.compilespeed();
	}

}
