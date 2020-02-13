package com.cpg.lab2.ex;

abstract class WrittenItem extends Item{
    private String author;

    public String getAuthor() {
		return author;
	}

	public void setAuthor(int identificationNumber,String title,int noOfCopies,String author) {
        super.setIdentificationNumber(identificationNumber);
        super.setTitle(title);
        super.setNoOfCopies(noOfCopies);
		this.author = author;
	}

    void print(){
        super.print();
        System.out.println("Author is "+author);
    }


}