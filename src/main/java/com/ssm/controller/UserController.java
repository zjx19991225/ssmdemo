package com.ssm.controller;


import com.github.pagehelper.PageInfo;
import com.ssm.dao.UserDao;
import com.ssm.pojo.Reader;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    @ResponseBody
    public String Login(@RequestParam("account")String account,
                        @RequestParam("password") String password,
                        HttpSession session){
       User user= this.userService.findUserByaccount(account);
        JSONObject jsonObject=new JSONObject();

       if (user==null){
           System.out.println("用户不存在");
           jsonObject.put("result","0");
       }else if (!user.getPassword().equals(password)){
           System.out.println("密码错误");
           jsonObject.put("result","1");

       }else {
           System.out.println("登陆成功");
           session.setAttribute("user",user);
           jsonObject.put("result","2");
       }
        return jsonObject.toString();
    }


    @RequestMapping("/register")
    @ResponseBody
    public String register(String username,String account,String password){
       User user= this.userService.findUserByaccount(account);
       JSONObject jsonObject=new JSONObject();
       if (user!=null){
           System.out.println("账号已存在，注册失败");
           jsonObject.put("result","0");
       }else {
           this.userService.addUser(username,account,password);
           System.out.println("注册成功");
           jsonObject.put("result","1");
       }
       return  jsonObject.toString();
    }



    @RequestMapping("/updInfomation")
    @ResponseBody
    public String updInfomation(@RequestParam("username") String username,
                                HttpSession session){
        JSONObject jsonObject=new JSONObject();
        User user= (User) session.getAttribute("user");
        user.setUser(username);
        System.out.println(user.toString());
        this.userService.updInfomation(user);
        return jsonObject.toString();

    }


    @RequestMapping("/updpassword")
    @ResponseBody
    public String  updatepassword(HttpSession session,
                               @RequestParam("oldpassword")String oldpassword,
                                  @RequestParam("newpassword")String newpassword){
        System.out.println("进入修改密码controller");
        User user= (User) session.getAttribute("user");
        JSONObject jsonObject=new JSONObject();
        if (user==null){
            jsonObject.put("result","0");
            return jsonObject.toString();
        }
        if (!user.getPassword().equals(oldpassword)){
            jsonObject.put("result","2");
            return jsonObject.toString();
        }
        user.setPassword(newpassword);
        this.userService.updateUser(user);
        jsonObject.put("result","1");
        return jsonObject.toString();
    }

    @RequestMapping("/findAllReader")
    public ModelAndView findAllUser(@RequestParam(defaultValue = "1") Integer page,
                                    @RequestParam(defaultValue = "5") Integer size){
        ModelAndView mv=new ModelAndView();
        List<Reader> readers=this.userService.findAllReader(page,size);
        PageInfo<Reader> pageInfo=new PageInfo<>(readers);
        mv.addObject("Readers",pageInfo);
        mv.setViewName("pages_doc_user");
        return mv;

    }

    @RequestMapping("/addReader")
    @ResponseBody
    public String addReader(@RequestParam("username") String username,
                                  @RequestParam("password") String password,
                                  @RequestParam("phone") int phone){
        JSONObject jsonObject=new JSONObject();
        Reader reader=new Reader();
        Reader reader1=this.userService.findReaderByPhone(phone);
        if (reader1!=null){
            jsonObject.put("result","1");

        }else {
            reader.setUsername(username);
            reader.setPassword(password);
            reader.setPhone(phone);
            this.userService.addReader(reader);
            jsonObject.put("result","2");
        }
        return jsonObject.toString();
    }

    @RequestMapping("/findReaderById")
    public ModelAndView findReaderById(@RequestParam("id")int id){
        ModelAndView mv =new ModelAndView();
      Reader reader=  this.userService.findReaderById(id);
      mv.addObject("reader",reader);
      mv.setViewName("pages_user_upd");
      return mv;

    }

    @RequestMapping("/updReader")
    @ResponseBody
    public String  updReader(@RequestParam("readerId") int id,
                          @RequestParam("username") String username,
                          @RequestParam("password") String password,
                          @RequestParam("phone") int phone){

        Reader reader=this.userService.findReaderById(id);
       reader.setUsername(username);
       reader.setPassword(password);
       reader.setPhone(phone);
       this.userService.updReader(reader);
       return new JSONObject().toString();

    }
    @RequestMapping("/delReader")
    public String delReader(@RequestParam("id")int id){
    this.userService.delReaderById(id);
    return "redirect:findAllReader";

    }



}
