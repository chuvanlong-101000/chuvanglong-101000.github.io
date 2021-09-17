package com.example.buoi2.repository;
import com.example.buoi2.model.Book;

import java.util.List;
import java.util.stream.Collectors;

public class BookDao extends Dao<Book>{
    public BookDao() {
        list.add(new Book(1, "Hoạt Hình" ," Tom and Jerry"));
        list.add(new Book(2, "Hành động ", "Kẻ hủy diệt"));
        list.add(new Book(3, "Kinh dị ", "Anabell"));
        list.add(new Book(4, "Tình cảm", "Ngày mai bình yên"));
    }

    @Override
    public List<Book> getAll() {
        // TODO Auto-generated method stub
        return list;
    }

    @Override
    public List<Book> get(int id) {
        // TODO Auto-generated method stub
        return list.stream()
               .filter( b -> b.getId() == id )
               .collect(Collectors.toList());
    }

    @Override
    public void add(Book t) {
        // TODO Auto-generated method stub
        Book book = new Book();
        book.setId(list.size() + 1);
        book.setDescription(t.getDescription());
        book.setTitle(t.getTitle());
        list.add(book);
        
    }

    @Override
    public void update(Book t, int id) {
        // TODO Auto-generated method stub
        for (Book b : list) {
            if(b.getId() == id) {
                b.setTitle(t.getTitle());
                b.setDescription(t.getDescription());
            }
        }
        
    }

    @Override
    public void deleteByID(int id) {
        // TODO Auto-generated method stub
        boolean check = true ;
        for(Book b : list){
            if(b.getId() == id){
                list.remove(b);
                check = true;
            }
        }
        if(check == true){
            System.out.println("Delete succesfull");
        }else{
            System.out.println("Not found id");
        }
    }

    @Override
    public void delete(Book t) {
        // TODO Auto-generated method stub
        boolean check = false ;
        for(Book b : list){
            if(b.getId() == t.getId()){
               list.remove(b);
               check = true;
            }
        }
    }
    
}
