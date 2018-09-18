package com.vivek;

public class PojoClass {

	private int eid;
	private String name ;
	private String address;
	private int contact_num;
	
	
	public PojoClass() {
		
	}

	public PojoClass(int eid, String name, String address, int contact_num) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.contact_num = contact_num;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
		//abcdef
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact_num() {
		return contact_num;
	}

	public void setContact_num(int contact_num) {
		this.contact_num = contact_num;
	}

	@Override
	public String toString() {
		return "PojoClass [eid=" + eid + ", name=" + name + ", address=" + address + ", contact_num=" + contact_num
				+ "]";
	}
	
	
	
	
	
}
