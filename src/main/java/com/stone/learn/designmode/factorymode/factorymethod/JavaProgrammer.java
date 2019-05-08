package com.stone.learn.designmode.factorymode.factorymethod;

import com.stone.learn.designmode.AlgorithmBook;
import com.stone.learn.designmode.Book;
import com.stone.learn.designmode.NettyBook;
import com.stone.learn.designmode.SpringCloudBook;

/**
 * @author qun.zheng
 * @description: TODO
 * @date 2019/5/8下午7:33
 */
public class JavaProgrammer extends AbstractProgrammer {
    protected Book createBook(String bookType) {
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
