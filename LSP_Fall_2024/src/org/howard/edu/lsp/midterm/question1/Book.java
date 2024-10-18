package org.howard.edu.lsp.midterm.question1;


public class Book {

	public static void main(String[] args) {
		
	}
		private String title;
		private String author1, ISBN;
		private int yearPublished;
		
		
		public Book(String title, String author, String ISBN, int yearPublished) {
	        this.title = title;
	        this.author1 = author;
	        this.ISBN = ISBN;
	        this.yearPublished = yearPublished;	
		}
		/**
		 * method for checking if two books are equal
		 */
		//cited from example 2 in geeks for geeks
	    public boolean equals(Object obj) {
	    	if (this == obj) return true;
	        if (obj == null || !(obj instanceof Book)) return false; 
	    	Book other = (Book) obj;
	    	return ISBN.equals(other.ISBN) & author1.equals(other.author1);
	    	
}	
/**
 * returns representation of book details
 */
	    public String toString() {
	           return "Book Title: " + title + ", Author: " + author1 + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
	    	
	}
}



