package com.fdmgroup.bookstore.model;

public class Book {

	private int itemId;
	private double price;
	private String title;
	private String author;
	private BookGenre bookGenere;
	public Book() {
		super();
	}
	public Book(int itemId, double price, String title, String author, BookGenre bookGenere) {
		super();
		this.itemId = itemId;
		this.price = price;
		this.title = title;
		this.author = author;
		this.bookGenere = bookGenere;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BookGenre getBookGenere() {
		return bookGenere;
	}
	public void setBookGenere(BookGenre bookGenere) {
		this.bookGenere = bookGenere;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookGenere == null) ? 0 : bookGenere.hashCode());
		result = prime * result + itemId;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookGenere != other.bookGenere)
			return false;
		if (itemId != other.itemId)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [itemId=" + itemId + ", price=" + price + ", title=" + title + ", author=" + author
				+ ", bookGenere=" + bookGenere + "]";
	}
	
	
}
