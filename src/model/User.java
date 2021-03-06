package model;


import java.util.ArrayList;


public class User {

	private int id;
	//comme on a le type admin particulier on est pas obliger de memo �a jhe pesnse
	//private Boolean admin;
	private String lastName;
	private String firstName;
	private String bio;
	private EmailAdresse email; //proprement il faudrait cr�er un type e-mail adress
	private NumeroTelephone tel; 
	//Pour moi �a fait parti des informations sur un ride pas sur le user 
	/*
	PostCode postCode; // proposer une liste de code postaux OU utiliser google
						// map
	String service; // choix dans une liste déroulante du service dans lequel
					// travaille la personne chez Sopra
	
	// Liste contenant les trajets de la semaine */
	ArrayList<Ride> weekRides = new ArrayList<Ride>();
	/**Full constructeur that can set a user from scratsh
	 * 
	 * @param id
	 * @param lastName
	 * @param firstName
	 * @param Bio
	 */
	public User(int id, String lastName, String firstName, EmailAdresse email, String bio, NumeroTelephone telNum) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.bio = bio;
		this.email = email;
		this.tel = telNum;
		
		//this.admin = false;
		/*
		// V�rifier si le code postal est bon
		this.postCode = postCode;
		// V�rifier si le service est bon 
		this.service = service;
		*/
	}
	
	public User (User u){
		this.id = u.getID();
		this.lastName = u.getLastName();
		this.firstName = u.getFirstName();
		this.bio = u.getBio();
		this.tel = u.getTel();
		this.email = u.getEmail();
	}
	
	public User (int userID){
		//get from the data base the infos
		// yet it is simulated 
		this.id = userID;
		this.lastName = "Christ";
		this.firstName = "Jesus";
		this.bio = "le fils de dieux";
		this.email = new EmailAdresse("the.police.sting@hotmail.com");
		
		
		/*
		this.admin = true;
		this.postCode = new PostCode(31770);
		this.service = "paradie";*/
	}
	public User (String email){
		//get from the data base the infos
		// wet it is simulated 
		this.id = 666;
		this.lastName = "Christ";
		this.firstName = "Jesus";
		this.bio = "le fils de dieux";
		this.email = new EmailAdresse("the.police.sting@hotmail.com");
		/*this.admin = true;
		this.postCode = new PostCode(31770);
		this.service = "paradie";*/
	}
	
	public int getID (){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public EmailAdresse getEmail() {
		return email;
	}

	public void setEmail(EmailAdresse email) {
		this.email = email;
	}

	public NumeroTelephone getTel() {
		return tel;
	}

	public void setTel(NumeroTelephone tel) {
		this.tel = tel;
	}

	public ArrayList<Ride> getWeekRides() {
		return weekRides;
	}

	public void setWeekRides(ArrayList<Ride> weekRides) {
		this.weekRides = weekRides;
	}

	/*public boolean isAdmin(){
		return admin;
	}*/
	public String toString (){
		return this.lastName+" "+this.firstName+" : "+this.id+" ("+this.email+")\n";
	}
	public boolean equals (User u){
		return u.getID() == this.id && 
				u.getLastName().equals(this.lastName) &&
				u.getFirstName().equals(this.firstName) &&
				u.getEmail().equals(this.email) &&
				u.getTel().equals(this.tel) &&
				u.getBio().equals(this.bio);
	}
}