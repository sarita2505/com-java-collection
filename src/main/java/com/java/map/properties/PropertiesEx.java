package com.java.map.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        InputStream fis = PropertiesEx.class.getClassLoader().getResourceAsStream("abc.properties");
        System.out.println(fis);
        p.load(fis);
        System.out.println(p);
        String s=p.getProperty("userName");
        System.out.println(s);
        p.setProperty("name","xyz");
        FileOutputStream fos=new FileOutputStream("abc.txt");
        p.store(fos,"updated");
        System.out.println(p);

//        FileOutputStream fos = new FileOutputStream("my.txt",true);
//        fos.write("anything".getBytes());
//        fos.close();


    }
}
