package com.bel.training.springcore;

// DI -using Constructor
public class Book {

	private int BookId;
	private String bookName;
	private Long price;
	
	
	public Book() {
		System.out.println("DI Using Constructor Injection");
		
	}


	public Book(int bookId, String bookName, Long price) {
		super();
		BookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	

	public Book(int bookId) {
		super();
		BookId = bookId;
	}


	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}


	public Book(Long price) {
		super();
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
	void show()
	{
		System.out.println("********** Book Details ************");
		System.out.println(this.toString());
	}
}
