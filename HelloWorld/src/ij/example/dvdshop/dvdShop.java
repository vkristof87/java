package ij.example.dvdshop;

public class dvdShop {
	protected DVD dvds[];
	public DVD[] getDVDs(){
		return dvds;
	}
	public dvdShop(DVD dvds[]){
		this.dvds=dvds;
	}

	public int getDVDCount() {
		return dvds.length;
	}
	
	public int getBorrowedDVDCount(){
		int n=0;
		for (DVD dvd :getDVDs()){
			if (dvd.isBorrowed()) 
				++n;
		}
		return n;
	}

	public double getTotalPrice() {
		double p = 0;
		for(DVD dvd :getDVDs()) {
			if (dvd.isForSale()) p+=dvd.getPrice();
		}
		return p;
	}
	
	public double getDVDForSaleCount() {
		int n=0;
		for (DVD dvd :getDVDs()) {
			if (dvd.isForSale()) ++n;
		}
		return n;
	

	
	}
}
     