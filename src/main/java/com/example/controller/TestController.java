package com.example.controller;

import com.example.test.MyDemo;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author issuser
 * @Date 2019/9/5 22:50
 * @Version 1.0.0
 */
@RestController
@RequestMapping("test")
public class TestController extends BaseController {

    @RequestMapping("test")
    public String test() {
        String itemPath = findItemPath();
        return "succcess:" + itemPath;
    }

    @RequestMapping("python01")
    public String python01(@RequestParam(name = "path", required = false) String path) {
        String itemPath = findItemPath();
        if(StringUtils.isEmpty(path)) {
            path = itemPath + File.separator + "01.py";
            // path =  "D:\\space\\PyCharm\\t_001\\t_data_type\\MyDemo.py"; //"/usr/local/temp/01.py";
        }
        // "D:\\space\\PyCharm\\t_001\\t_data_type\\MyDemo.py"
        MyDemo.main1(path);
        return "python";
    }

    @RequestMapping("python02")
    public String python02(@RequestParam(name = "path", required = false) String path,
                           @RequestParam(name = "url", required = false) String url) {
        if(StringUtils.isEmpty(path)) {
            path = findItemPath() + File.separator + "02.py";
            // path = "D:\\space\\PyCharm\\t_001\\t_data_type\\test_1.py"; //"/usr/local/temp/02.py";
        }
        if(StringUtils.isEmpty(url)) {
            url = "baidu.com";
        }
        // "D:\\space\\PyCharm\\t_001\\t_data_type\\test_1.py"
        MyDemo.main2(path, url);
        return "python";
    }

}
