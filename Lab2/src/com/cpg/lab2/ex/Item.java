package com.cpg.lab2.ex;
abstract class Item{
    private int identificationNumber;
    private String title;
    private int noOfCopies;

    public Item(){
        super();
    }
    
    public Item(int identificationNumber, String title, int noOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.noOfCopies = noOfCopies;
	}

    @Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", noOfCopies=" + noOfCopies
				+ "]";
	}

    public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
    public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

     void  print(){
         System.out.println("Title  is "+title);
         System.out.println("Identification numbers is "+identificationNumber);
         System.out.println("Number of copies are "+noOfCopies);
     };
}