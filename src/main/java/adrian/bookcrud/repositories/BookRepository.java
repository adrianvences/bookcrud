package adrian.bookcrud.repositories;
import org.springframework.data.repository.CrudRepository;
import adrian.bookcrud.models.Book;
import java.util.List;


// findall returns an irritable which we dont want 
// so we want to override what it returns 
// we want a list of books instead
// when ever we want to overide what crud repo returns
//we need to list it here when we want a different return 
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
