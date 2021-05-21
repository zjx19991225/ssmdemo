package com.ssm.controller;


import com.github.pagehelper.PageInfo;
import com.ssm.pojo.Book;
import com.ssm.service.BookService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/findAllBook")
    public ModelAndView findAllBook(@RequestParam(defaultValue = "1")int page,
                                    @RequestParam(defaultValue = "5")int size){
        ModelAndView mv=new ModelAndView();
        List<Book> books=this.bookService.findAllBook(page,size);

        for (Book a:books) {
            System.out.println(a.toString());
        }
        PageInfo<Book> pageInfo=new PageInfo<>(books);
        mv.addObject("books",pageInfo);
        mv.setViewName("pages_doc_book");
        return mv;

    }
    @RequestMapping("/addBook")
    @ResponseBody
    public String addBook(@RequestParam("bookname") String bookname,
                       @RequestParam("number") int number,
                       @RequestParam("price") int price,
                       @RequestParam("author") String author){
        Book book= this.bookService.findBookByName(bookname);
        Book book1=new Book();

        if (book!=null){
            System.out.println(book.toString());
            book.setNumber(book.getNumber()+number);
//            this.bookService.updBook(book);
            System.out.println("数量添加成功");
        }
        else {
            book1.setBookName(bookname);
            book1.setNumber(number);
            book1.setPrice(price);
            book1.setAuthor(author);
            this.bookService.addBook(book1);
        }

        return new JSONObject().toString();
    }

    @RequestMapping("/delBook")
    public String delBook(@RequestParam("id") int id){
        this.bookService.delBook(id);

        return "redirect:findAllBook";

    }


    @RequestMapping("/findBookById")
    public ModelAndView findBookById(@RequestParam("id")int id){

        ModelAndView mv=new ModelAndView();
        Book book=this.bookService.findBookById(id);

        System.out.println(book.toString());
        mv.addObject("book",book);
        mv.setViewName("pages_book_upd");
        return mv;


    }

    @RequestMapping("/updBook")
    @ResponseBody
    public  String  updBook(@RequestParam("bookid") int bookid,
                            @RequestParam("bookName")String bookname,
                            @RequestParam("number")int number,
                            @RequestParam("price")int price,
                            @RequestParam("author")String author){
        JSONObject jsonObject=new JSONObject();
        Book book=this.bookService.findBookById(bookid);
        book.setBookId(bookid);
        book.setBookName(bookname);
        book.setNumber(number);
        book.setPrice(price);
        book.setAuthor(author);
        this.bookService.updBook(book);
        return jsonObject.toString();
    }


}
