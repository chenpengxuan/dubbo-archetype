/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.test.infrastructure.db.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ${package}.infrastructure.db.mapper.DemoMapper;
import ${package}.infrastructure.db.model.DemoPo;
import ${package}.test.WithoutDubboBaseTest;

/**
 * @author luoshiqian 2016/5/27 18:29
 */

public class DemoMapperTest extends WithoutDubboBaseTest{


    @Autowired
    private DemoMapper demoMapper;

    @Test
    public void test(){

        DemoPo demoPo = new DemoPo();
        demoPo.setTest("321321");
        demoPo.setId(131L);
        demoPo.setName("test");
        demoMapper.insert(demoPo);


        DemoPo selectedPo = demoMapper.selectByPrimaryKey(131L);

        Assert.assertNotNull(selectedPo);

        Assert.assertEquals(selectedPo.getName(),"test");
    }

}
