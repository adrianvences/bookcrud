package adrian.bookcrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import adrian.bookcrud.services.BookService;
import adrian.bookcrud.models.Book;
import java.util.List;

@RestController
public class BooksApi {
  
  @Autowired BookService bookService;

  // private final BookService bookService; // equivilent to @Autowired BookService bookService;
  // public BooksApi(BookService bookService){
  //   this.bookService = bookService;
  // }

  @RequestMapping ("/api/books")
  public List<Book> booksApi(){
    List<Book> books = bookService.allBooks();
    return books;

  }

}
