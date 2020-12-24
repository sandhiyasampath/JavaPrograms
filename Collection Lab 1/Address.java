
public class Address {
	String city;
	String street;
	long pin;
	public Address(String city, String street, long pin) {
		super();
		this.city = city;
		this.street = street;
		this.pin = pin;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Address equals method exicuted");
		if(obj instanceof Address) {
			Address a = (Address)obj;
			if(this.city.equals(a.city) && this.street.equals(a.street) && this.pin==a.pin)
				return true;
			else
				return false;
		}
		return false;
	}

}
