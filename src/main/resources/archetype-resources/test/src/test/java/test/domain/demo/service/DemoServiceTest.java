/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.test.domain.demo.service;

import ${package}.domain.demo.model.Demo;
import ${package}.domain.demo.service.DemoService;
import ${package}.infrastructure.db.mapper.DemoMapper;
import ${package}.infrastructure.db.model.DemoPo;
import ${package}.test.WithoutDubboBaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author luoshiqian 2016/5/27 18:29
 */

public class DemoServiceTest extends WithoutDubboBaseTest{


    @Autowired
    private DemoService demoService;

    @Test
    public void test(){

        Demo demo = new Demo();
        demo.setTest("321321");
        demo.setId(131L);
        demo.setName("test");
        demoService.save(demo);


        Demo selecteddemo = demoService.findById(131L);

        Assert.assertNotNull(selecteddemo);

        Assert.assertEquals(selecteddemo.getName(),"test");
    }

}
