package com.corejava;

public final class Address implements Comparable<Address> {
	private final String street;
	private final String city;
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((city == null) ? 0 : city.hashCode());
//		result = prime * result + pincode;
//		result = prime * result + ((street == null) ? 0 : street.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Address other = (Address) obj;
//		if (city == null) {
//			if (other.city != null)
//				return false;
//		} else if (!city.equals(other.city))
//			return false;
//		if (pincode != other.pincode)
//			return false;
//		if (street == null) {
//			if (other.street != null)
//				return false;
//		} else if (!street.equals(other.street))
//			return false;
//		return true;
//	}

	private final int pincode;

	Address(String street, String city, int pincode) {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public String getCity() {
		return city;
	}

	public int getPincode() {
		return pincode;
	}

	@Override
	public int compareTo(Address o) {
		if (this.street.equalsIgnoreCase(o.street)) {
			if (this.city.equalsIgnoreCase(o.city)) {
				if (this.pincode == o.pincode) {
					return 0;
				} else if (this.pincode < o.pincode) {
					return -1;
				} else {
					return 1;
				}
			} else {
				return this.city.compareTo(o.city);
			}

		} else {
			return this.street.compareTo(o.street);
		}

	}

}
