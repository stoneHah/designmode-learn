package com.stone.learn.designmode.factorymode.simplefactory;

import com.stone.learn.designmode.AlgorithmBook;
import com.stone.learn.designmode.Book;
import com.stone.learn.designmode.NettyBook;
import com.stone.learn.designmode.SpringCloudBook;

/**
 * @author qun.zheng
 * @description: 创建Book的简单工厂
 * @date 2019/5/7下午11:22
 */
public class SimpleBookFactory {

    public Book createBook(String bookType){
        Book book = null;
        if ("netty".equals(bookType)) {
            book = new NettyBook();
        } else if ("springcloud".equals(bookType)) {
            book = new SpringCloudBook();
        } else if ("algorithm".equals(bookType)) {
            book = new AlgorithmBook();
        }

        return book;
    }
}
