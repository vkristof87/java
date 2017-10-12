package ij.example.dvdshop;

public class mainShop {

	public static void main(String args[]) {

		DVD dvd=new DVD();
		dvd.setCode("1001");
		dvd.setTitle("Nighes on Java");
		dvd.setReleaseDate(2017);
		dvd.setDirector("Ben Boss");
		dvd.setActors("Dev, End, Proj");
		
		DVD dvds[]={
				new DVD("1001", "JAVA 01", 2011, "Director1", "act1, act2, act3"),
				new DVD("1002", "JAVA 02", 2012, "Director1", "act1, act2, act3"),
				new DVD("1003", "JAVA 03", 2013, "Director1", "act1, act2, act3"),
				new DVD("1004", "JAVA 04", 2014, "Director1", "act1, act2, act3"),
		};
		
		dvds[2].setBorrowed(true); dvds[2].setPrice(3000);
		dvds[1].setPrice(1000);
		dvds[3].setBorrowed(true);
		dvdShop shop=new dvdShop(dvds);
		
	//	System.out.println(dvds[1].getCode()+" Actors:"+dvds[1].getActors());
		
		//System.out.println(shop.getBorrowedDVDCount());
		int borrowedDVDCount = shop.getBorrowedDVDCount();
		System.out.println("Kölcsönzött DVD-k száma: "+ borrowedDVDCount + " (" + borrowedDVDCount*100/shop.getDVDCount() + "%);");
		System.out.println("Összár: " + shop.getTotalPrice());
		System.out.println("Átlag: " + shop.getTotalPrice()/shop.getDVDForSaleCount());
		
	}

}
