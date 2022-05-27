package app;

import java.util.ArrayList;

public class Persona {

	private String id;
	private int index;
	private String guid;
	private boolean isActive;
	private String balance;
	private String picture;
	private int age;
	private String eyeColor;
	private String name;
	private String gender;
	private String company;
	private String email;
	private String phone;
	private String address;
	private String about;
	private String registered;
	private Double latitude;
	private Double longitude;
	private ArrayList<String> arrayTags;
	private ArrayList<Amigo> arrayAmigos;
	private String greeting;
	private String favoriteFruit;

	public Persona() {
		this.id = id;
		this.index = index;
		this.guid = guid;
		this.isActive = isActive;
		this.balance = balance;
		this.picture = picture;
		this.age = age;
		this.eyeColor = eyeColor;
		this.name = name;
		this.gender = gender;
		this.company = company;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.about = about;
		this.registered = registered;
		this.latitude = latitude;
		this.longitude = longitude;
		this.arrayTags = arrayTags;
		this.arrayAmigos = arrayAmigos;
		this.greeting = greeting;
		this.favoriteFruit = favoriteFruit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getRegistered() {
		return registered;
	}

	public void setRegistered(String registered) {
		this.registered = registered;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public ArrayList<String> getArrayTags() {
		return arrayTags;
	}

	public void setArrayTags(ArrayList<String> arrayTags) {
		this.arrayTags = arrayTags;
	}

	public ArrayList<Amigo> getArrayAmigos() {
		return arrayAmigos;
	}

	public void setArrayAmigos(ArrayList<Amigo> arrayAmigos) {
		this.arrayAmigos = arrayAmigos;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getFavoriteFruit() {
		return favoriteFruit;
	}

	public void setFavoriteFruit(String favoriteFruit) {
		this.favoriteFruit = favoriteFruit;
	}

	@Override
	public String toString() {
		return "Persona {id=" + id + "\n, index=" + index + "\n, guid=" + guid + "\n, isActive=" + isActive + "\n, balance="
				+ balance + "\n, picture=" + picture + "\n, age=" + age + "\n, eyeColor=" + eyeColor + "\n, name=" + name
				+ "\n, gender=" + gender + "\n, company=" + company + "\n, email=" + email + "\n, phone=" + phone + "\n, address="
				+ address + "\n, about=" + about + ", registered=" + registered + "\n, latitude=" + latitude
				+ "\n, longitude=" + longitude + "\n, Tags=" + arrayTags + "\n, Amigos=" + arrayAmigos
				+ "\n, greeting=" + greeting + "\n, favoriteFruit=" + favoriteFruit + "}\n\n";
	}
	
	

}
