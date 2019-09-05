package com.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class MyDemo {

    public static void main2(String path, String url) {
        try {
            System.out.println("start;"+ url);
            String[] args1 = new String[] { "python", path, url};
            Process pr=Runtime.getRuntime().exec(args1);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            pr.waitFor();
            System.out.println("end");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String main3(String url) {
        String result = "";
        try {

            String[] args1 = new String[] { "python", "D:\\space\\PyCharm\\t_001\\t_data_type\\test_1.py", url};
            Process process = Runtime.getRuntime().exec(args1);

            // Process process = Runtime.getRuntime().exec("D:\\space\\PyCharm\\t_001\\t_data_type\\test_1.py",  url);

//            process.waitFor();
            InputStreamReader ir = new InputStreamReader(process.getInputStream());
            LineNumberReader input = new LineNumberReader(ir);
            // result = input.readLine();
            while((result = input.readLine())!=null ){
                System.out.println(result);
            }
            input.close();
            ir.close();
//            process.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    // "D:\\space\\PyCharm\\t_001\\t_data_type\\MyDemo.py"
    public static void main1(String path) {
        try {
            System.out.println("start");
            String[] args1 = new String[]{"python", path};
            Process pr = Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }}

    public void test(){
        System.out.println("我的第一个方法C");
    }

    // 具体返回值可以和脚本提供者协商，常用的返回值为int类型，0代表脚本调用成功，1代表脚本方法调用失败，2代表脚本调用失败
    public static void main4(String name, String age) {
        try {
            String[] params = new String[]
                    {"python","D:\\space\\PyCharm\\t_001\\t_data_type\\test_1.py",name, age};
            Process proc = Runtime.getRuntime().exec(params); //执行py文件
            InputStreamReader stdin = new InputStreamReader(proc.getInputStream());
            LineNumberReader input = new LineNumberReader(stdin);
            String line;
            while((line=input.readLine()) != null ){
                System.out.println("line:" + line);
            }
            int re = proc.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String url ="http:baidu.com";
        String path = "D:\\space\\PyCharm\\t_001\\t_data_type\\MyDemo.py";
        main1(path);
//        main2(url);
//        System.out.println(main3(url));
//        main4("张三", "20");
    }

}
