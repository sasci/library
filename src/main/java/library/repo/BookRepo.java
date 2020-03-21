package library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import library.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

	Book findBookByName(String name);
	
}
