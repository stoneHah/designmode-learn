package com.stone.learn.designmode.factorymode.factorymethod;

import com.stone.learn.designmode.*;

/**
 * @author qun.zheng
 * @description: TODO
 * @date 2019/5/8下午7:36
 */
public class PythonProgrammer extends AbstractProgrammer {
    protected Book createBook(String bookType) {
        Book book = null;
        if ("netty".equals(bookType)) {
        } else if ("springcloud".equals(bookType)) {

        } else if ("algorithm".equals(bookType)) {
            book = new PythonAlgorithmBook();
        }

        return book;
    }
}
