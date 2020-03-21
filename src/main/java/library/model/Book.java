package library.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book  {
	@Id
	@GeneratedValue
	private int id;
	private String author;
	private String name;
	@Enumerated(EnumType.STRING)
	private BookCategory category;
	private LocalDate publishdate;

	public Book() {}
	
	public Book(int id, String author, String name, BookCategory category, LocalDate publishDate) {
		this.id = id;
		this.author = author;
		this.name = name;
		this.category = category;
		this.publishdate = publishDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BookCategory getCategory() {
		return category;
	}

	public void setCategory(BookCategory category) {
		this.category = category;
	}

	public LocalDate getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(LocalDate publishdate) {
		this.publishdate = publishdate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", name=" + name + ", category=" + category + ", publishdate="
				+ publishdate + "]";
	}
	
	
	
}
