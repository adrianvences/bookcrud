package adrian.bookcrud.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import adrian.bookcrud.models.Book;
import adrian.bookcrud.services.BookService;

@Controller // @RestController allows us to return reg progamming objects //render html
public class MainController {

  // ArrayList<Book> books = new ArrayList<>();
  @Autowired
  BookService bookService;

  // create
  @RequestMapping("/books/new")
  public String newBook(@ModelAttribute("book") Book book) {
    return "new.jsp";
  }

  // @RequestMapping(value="/books" ,method= RequestMethod.POST) // this is the
  // same as createBook
  // public String createBook(){
  // return "redirect:/";
  // }

  @PostMapping("/books")
  public String createBook( // but this is simpler
      
      @ModelAttribute("book") Book book) {
    System.out.println(book);
    bookService.createBook(book);
    return "redirect:/";
  }

  // // read one
  @GetMapping("/books/{id}") //passing id in path
  public String show(@PathVariable("id")Long id,Model model){ //taking it use pathvariable 
    Book book = bookService.getOneBook(id); // pass it in to getOneBook
    model.addAttribute("book", book);
    return "show.jsp";
  }

  // read all // usually the read all is the root
  @RequestMapping("/")
  public String index(Model model) {
    List<Book> books = bookService.allBooks();
    System.out.println(books);
    model.addAttribute("books", books);
    return "index.jsp";
  }

  // update
  @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    public Book update(
        @PathVariable("id") Long id, 
        @RequestParam(value="title") String title, 
        @RequestParam(value="author") String author, 
        @RequestParam(value="pages") Integer pages) {
        Book book = bookService.updateBook(id, title,author,pages);
        System.out.println(book);
        return book;
        }


  //delete
  @DeleteMapping("/books/{id}")
  public void deleteBook(@PathVariable("id") Long id) {
    bookService.deleteBookById(id);
  }

}
