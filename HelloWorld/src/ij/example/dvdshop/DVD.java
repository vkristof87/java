package ij.example.dvdshop;

public class DVD {
	protected String code;
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code=code;
	}
	
	
	protected String title;
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	
	
	protected int releaseDate;
	public int getReleaseDate(){
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate){
		this.releaseDate=releaseDate;
	}
	
	
	protected String director;
	public String getDirector(){
		return director;
	}
	public void setDirector(String director){
		this.director=director;
	}
	
		
	protected String actors;
	public String getActors(){
		return actors;
	}
	public void setActors(String actors){
		this.actors=actors;
	}
	
	protected boolean borrowed;
	public boolean isBorrowed(){
		return borrowed;
	}
	public void setBorrowed(boolean borrowed){
		this.borrowed=borrowed;
	}
	
	public boolean isForSale() {
		return price != 0;
	}
	
	protected double price;
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	public DVD(String code, String title, int releaseDate, String director, String actors) {
		this.code = code;
		this.title = title;
		this.releaseDate = releaseDate;
		this.director = director;
		this.actors = actors;
	}
	
	public DVD() {
		// TODO Auto-generated constructor stub
	}
	
	
}
