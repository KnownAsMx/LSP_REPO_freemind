package org.howard.edu.lsp.midterm;

public class helloworld {

	public static void main(String[] args) {
		
	}
		private String title,
		Private String author1, ISBN;
		private int yearPublished;
		
		
		public Book(String title, String author, String ISBN, int yearPublished) {
	        this.title = title;
	        this.author1 = author;
	        this.ISBN = ISBN;
	        this.yearPublished = yearPublished;	
		}
	        
	    public boolean equals(Object obj) {
	    	if (this == obj) return true;
	    }	else if (obj == null || !(obj instanceof Book)) return false; 
	    	Book other = (Book) obj;
	    	return ISBN.equals(other.ISBN) and author.equals(.author);
	    	
	    public String toString() {
	           return "Book Title: " + title + ", Author: " + author1 + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
	    	
	}
}
}