package com.cpg.lab2.ex;

class JournalPaper extends WrittenItem{
    private int yearOfPublication;

    public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int identificationNumber,String title,int noOfCopies,String author ,int yearOfPublication) {
        super.setAuthor(identificationNumber,title,noOfCopies,author);
		this.yearOfPublication = yearOfPublication;
	}

    void print(){
        super.print();
        System.out.println("Year of publication "+yearOfPublication);
        
    }
}
