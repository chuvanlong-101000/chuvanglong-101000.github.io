package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    /*@GetMapping()
    public String showHomePage(Model model){
        model.addAttribute("name", "old");
        return "index";
    }
    @GetMapping("book")
    public String showBook(Model model){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("DẾ Mèn", "Tố Hữu"));
        books.add(new Book("Doremon","Hoya"));
        model.addAttribute("books", books);
        return "book";
    }*/

}
