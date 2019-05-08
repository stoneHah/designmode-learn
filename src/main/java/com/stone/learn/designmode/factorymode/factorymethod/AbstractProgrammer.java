package com.stone.learn.designmode.factorymode.factorymethod;

import com.stone.learn.designmode.Book;
import com.stone.learn.designmode.factorymode.simplefactory.SimpleBookFactory;

/**
 * @author qun.zheng
 * @description: TODO
 * @date 2019/5/7下午11:22
 */
public abstract class AbstractProgrammer {

    /**
     *
     */
    public void liftingTechnology(String bookType){
        Book book = createBook(bookType);
        readBook(book);
    }

    protected abstract Book createBook(String bookType);

    private void readBook(Book book) {
        System.out.println("Read Book:" + book.getName());
    }
}
