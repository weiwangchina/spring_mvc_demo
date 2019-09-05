package com.example.controller;

import org.springframework.boot.SpringApplication;
import sun.util.calendar.BaseCalendar;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author issuser
 * @Date 2019/9/6 6:31
 * @Version 1.0.0
 */
public class BaseController {

    public String findItemPath() {
        String filePath = "";
        try {
            filePath = new File("").getCanonicalPath();
        } catch (IOException e) {}
        return filePath;
    }

    public static void main(String[] args) throws Exception {
        new BaseController().getLujing();
    }

//    @GetMapping("/lujing")
    public void getLujing() throws Exception{
        //当前项目下路径
        File file = new File("");
        String filePath = file.getCanonicalPath();
        System.out.println(filePath);

        //当前项目下xml文件夹
        File file1 = new File("");
        String filePath1 = file1.getCanonicalPath()+ File.separator+"xml\\";
        System.out.println(filePath1);

        //获取类加载的根路径
        File file3 = new File(this.getClass().getResource("/").getPath());
        System.out.println(file3);

        //获取当前类的所在工程路径
        File file4 = new File(this.getClass().getResource("").getPath());
        System.out.println(file4);

        //获取所有的类路径 包括jar包的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
