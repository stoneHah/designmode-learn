package com.stone.learn.designmode.factorymode.simplefactory;

import com.stone.learn.designmode.Book;
import com.stone.learn.designmode.factorymode.simplefactory.SimpleBookFactory;

/**
 * @author qun.zheng
 * @description: TODO
 * @date 2019/5/7下午11:22
 */
public class Programmer {

    private SimpleBookFactory bookFactory;

    public Programmer(SimpleBookFactory bookFactory) {
        this.bookFactory = bookFactory;
    }

    /**
     *
     */
    public void liftingTechnology(String bookType){
        /*Book book = null;
        if ("netty".equals(bookType)) {
            book = new NettyBook();
        } else if ("springcloud".equals(bookType)) {
            book = new SpringCloudBook();
        } else if ("algorithm".equals(bookType)) {
            book = new AlgorithmBook();
        }*/
        Book book = bookFactory.createBook(bookType);
        readBook(book);
    }

    private void readBook(Book book) {
        System.out.println("Read Book:" + book.getName());
    }
}
