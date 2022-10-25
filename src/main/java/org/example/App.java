package org.example;

import com.alibaba.excel.EasyExcel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {//1.获取文件地址
//        String fileName = "/excel/test.xlsx";
//        //2、调用easyExcel里面的方法实现写操作
//        EasyExcel.write(fileName, User.class).sheet("某某报表").doWrite(new ArrayList<>());

        final Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello world!");
    }
}
