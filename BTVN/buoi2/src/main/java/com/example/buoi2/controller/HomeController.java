package com.example.buoi2.controller;
import com.example.buoi2.model.Book;
import com.example.buoi2.repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class HomeController {
    @Autowired
    private BookDao bookDao;
    @GetMapping("/show")
    public ResponseEntity getAll(){
        return ResponseEntity.ok(bookDao.getAll());
    }
    @GetMapping("/show/{id}")
    public ResponseEntity getbyID(@PathVariable int id){
        return ResponseEntity.ok(bookDao.get(id));
    }
    @PostMapping("/add")
    public void add(@RequestBody Book book){
        bookDao.add(book);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody Book book, @PathVariable int id){
        bookDao.update(book,id);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id){
        bookDao.deleteByID(id);
    }   
}
