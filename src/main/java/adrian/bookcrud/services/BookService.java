package adrian.bookcrud.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import adrian.bookcrud.repositories.BookRepository;
import java.util.List;
import java.util.Optional;
import adrian.bookcrud.models.Book;
// all our logic goes in our service
@Service // this makes this file a service in spring
public class BookService { //service contains business logic
  
  //connection to repo
  @Autowired BookRepository bookRepository;

  //create
  public void createBook(Book book){
    bookRepository.save(book);
  }

  //read one 
  public Book getOneBook(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id); // optional if we get it we get it and if it messes up we get null
    return optionalBook.orElse(null);
}
  

  //read all
  public List<Book> allBooks(){
    return bookRepository.findAll();
  }

  //update

  public void updateBook(Book book) {
    bookRepository.save(book);
  }

  // public Book updateBook(Long id ,String title,String author,Integer pages){
  //   Book book = this.findBook(id);
  //   System.out.println(book);
  //   book.setTitle(title);
  //   book.setAuthor(author);
  //   book.setPages(pages);
  //   bookRepository.save(book);
  //   return book;
  // }


  //delete
  public void deleteBook(Book book){ // a long is a type of int that is bigger
    bookRepository.delete(book);
  }
}
