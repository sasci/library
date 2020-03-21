package library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import library.model.Book;
import library.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookService.findAll();
	}
	
	@GetMapping("/books/{bookId}")
	public Optional<Book> getBookById(@PathVariable int bookId) {
		return bookService.findBookById(bookId);
	}
	
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book) {
		bookService.addBook(book);
		return book;
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable int bookId) {
		bookService.deleteBookById(bookId);
	}
}
