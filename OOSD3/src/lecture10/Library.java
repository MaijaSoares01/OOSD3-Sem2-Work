package lecture10;

import java.util.ArrayList;
import java.util.List;

public class Library{
	public List<Book> libraryCollection = new ArrayList<Book>();
	public synchronized int findBookIndex(String isbn){
		boolean found = false;
		int index = 0;
		while(index < libraryCollection.size() && !found){
			Book book = libraryCollection.get(index);
			if(book.getIsbn().equals(isbn)){
				return index;
			}
			index++;
		}
		return -1;
	}
	public synchronized Book loanBook(int bookIndex){
		if(bookIndex < 0 || bookIndex > libraryCollection.size()){
			return null;
		}
		Book book = libraryCollection.get(bookIndex);
		libraryCollection.remove(bookIndex);
		return book;
	}
	public void returnBook(Book book){
		libraryCollection.add(book);
	}
	public static void main(String[] args){
		Library library = new Library();
		Book book = new Book("Joe","Murphy","Ab11228",2015);
		library.libraryCollection.add(book);
		Member member1 = new Member(library);
		Member member2 = new Member(library);
		member1.start();
		member2.start();
	}
}
class Member extends Thread{
	Library library;
	String isbn = "Ab11228";
	public Member(Library library) {
		this.library = library;
	}
	public void run(){
		int bookIndex = library.findBookIndex(isbn);
		if(bookIndex != -1){
			Book loanedBook = library.loanBook(bookIndex);
			try {
				this.currentThread().sleep(2000);
			}catch(InterruptedException e){}
			library.returnBook(loanedBook);
		}
	}
}
class Book {
	private String authorFirstName;
	private String authorSurname;
	private String isbn;
	private int publishYear;
	
	public Book(String authorFirstName, String authorSurname, String isbn, int publishYear) {
		this.authorFirstName = authorFirstName;
		this.authorSurname = authorSurname;
		this.isbn = isbn;
		this.publishYear = publishYear;
	}
	
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public String getAuthorSurname() {
		return authorSurname;
	}
	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	@Override
	public String toString() {
		return "Book [authorFirstName=" + authorFirstName + ", authorSurname=" + authorSurname + ", isbn=" + isbn
				+ ", publishYear=" + publishYear + "]";
	}
}