package adrian.bookcrud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // this auto incriments our id 
  private Long id; // 

  @NotBlank 
  @Size(min=1,message="must include title")
  private String title;

  @NotNull
  @Size(min=2,max=10, message="thats not really your name!")
  private String author;

  @NotNull
  @Min(1)
  private Integer pages;

// needed to be java bean
  public Book() { //book is a pojo // plain old java object 
    // has to have private attributes , no arch constructor  , consturctor that takes all parameters and getters and setters and serialized 
    // with pojo spring will be able to access the object
  }

  

  public Book(String title, String author, Integer pages) { // can be generated
    this.title = title;
    this.author = author;
    this.pages = pages;
  }

// needed to be java bean

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }



  public String getTitle() { // generate getters and setters
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Integer getPages() {
    return this.pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }


  @Override
  public String toString() {
    return "{" +
      ", title='" + getTitle() + "'" +
      ", author='" + getAuthor() + "'" +
      ", pages='" + getPages() + "'" +
      "}";
  }



}
