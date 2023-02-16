package adrian.bookcrud.repositories;
import org.springframework.data.repository.CrudRepository;
import adrian.bookcrud.models.Book;
import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
