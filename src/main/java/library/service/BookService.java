package library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import library.model.Book;
import library.repo.BookRepo;

@Service
public class BookService  {
	@Autowired
	BookRepo bookRepo;
	
	public List<Book> findAll(){
		return bookRepo.findAll();
	}
	
	public Optional<Book> findBookById(int id) {
		return bookRepo.findById(id);
	}
	
	public Book addBook(Book book) {
		bookRepo.save(book);
		return book;
	}
	
	public void deleteBookById(int bookId) {
		bookRepo.deleteById(bookId);
	}
}
