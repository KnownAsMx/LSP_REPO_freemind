package org.howard.edu.lsp.midterm.question1;

import org.howard.edu.lsp.midterm.Book;
import org.howard.edu.lsp.midterm.and;

public class Book {

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

}
