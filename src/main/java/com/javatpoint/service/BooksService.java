package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Books;

//defining the business logic
@Service
public class BooksService 
{
@Autowired

//getting all books record by using the method findaAll() of CrudRepository
public List<Books> getAllBooks() 
{
List<Books> books = new ArrayList<Books>();
    Books book=new Books();
    book.setBookname("asg");
    books.add(book);
return books;
}

}