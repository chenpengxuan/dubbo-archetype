/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */
package ${package}.test;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author tuwenjie 2016年5月18日 下午12:57:49
 *
 */
public class ThreadPoolTest {

    @Test
    public void testExceptionInThread() throws IOException {

        ExecutorService es = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 10; i++) {
            es.execute(new Runnable() {

                @Override
                public void run() {
                    RuntimeException e = new RuntimeException("error in thread");
                    e.printStackTrace();
                    throw e;
                }
            });
        }
        


        ThreadPoolTaskExecutor tpte = new ThreadPoolTaskExecutor();
        tpte.setMaxPoolSize(1);
        tpte.initialize();
        
        for (int i = 0; i < 10; i++) {
            tpte.execute(new Runnable() {

                @Override
                public void run() {
                    RuntimeException e = new RuntimeException("error in thread");
                    e.printStackTrace();
                    throw e;
                }
            });
        }
        
        System.in.read();
        
    }

}
