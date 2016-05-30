/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.domain.demo.service.impl;

import ${package}.domain.demo.model.Demo;
import ${package}.infrastructure.db.mapper.DemoMapper;
import ${package}.infrastructure.db.model.DemoPo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ${package}.domain.demo.service.DemoService;


@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private DemoMapper demoMapper;


    @Override
    public void save(Demo demo) {
        DemoPo demoPo = new DemoPo();
        BeanUtils.copyProperties(demo,demoPo);
        demoMapper.insert(demoPo);
    }

    @Override
    public Demo findById(Long id) {
        DemoPo demoPo = demoMapper.selectByPrimaryKey(id);
        Demo demo = new Demo();
        BeanUtils.copyProperties(demoPo,demo);
        return demo;
    }

}
