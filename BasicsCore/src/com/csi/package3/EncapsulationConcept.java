package com.csi.package3;

public class EncapsulationConcept {

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		EncapsulationConcept e=new EncapsulationConcept();
	e.setId(23);
		e.setName("pr");
		System.out.println(e.getId()+" "+e.getName());
	}
}
