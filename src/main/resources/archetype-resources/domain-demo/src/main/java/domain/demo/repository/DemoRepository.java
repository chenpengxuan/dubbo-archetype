/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.domain.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ${package}.infrastructure.db.mapper.DemoMapper;

/**
 * Hello world!
 *
 */
@Component
public class DemoRepository {

    @Autowired
    private DemoMapper demoMapper;
}
