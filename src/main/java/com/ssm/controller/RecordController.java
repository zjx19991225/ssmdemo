package com.ssm.controller;


import com.github.pagehelper.PageInfo;
import com.ssm.pojo.Book;
import com.ssm.pojo.Record;
import com.ssm.service.RecordService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/record")
@Controller
public class RecordController {

    @Autowired
    private RecordService recordService;


    @RequestMapping("/findAllRecord")
    public ModelAndView findAllRecord(@RequestParam(defaultValue = "1") int page,
                                      @RequestParam(defaultValue = "5") int size) {
        ModelAndView mv = new ModelAndView();
        List<Record> record = this.recordService.findAllRecord(page, size);

        for (Record r:record) {
            System.out.println(r.toString());
        }
        PageInfo<Record> pageInfo = new PageInfo<>(record);
        mv.addObject("record", pageInfo);
        mv.setViewName("pages_doc_record");
        return mv;
    }

    @RequestMapping("/findbykey")
    public ModelAndView findbykey(
            @RequestParam("key") String key ,
            @RequestParam("keyword") String keyword){
        ModelAndView mv= new ModelAndView();
        if (key.equals("借阅人")){
            List<Record> records=this.recordService.findByReader(keyword);
            PageInfo<Record> pageInfo=new PageInfo<>(records);
            mv.addObject("record",pageInfo);

        }else if (key.equals("书籍")){
            List<Book> books=this.recordService.findByBook(keyword);
            PageInfo<Book> pageInfo=new PageInfo<>(books);
           mv.addObject("record",pageInfo);
        }else {

           this.findAllRecord(1,5);

        }
        mv.setViewName("pages_doc_record");
        return mv;




    }







}
