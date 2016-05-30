/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.domain.demo.model;

import ${package}.facade.model.PrintFriendliness;
/**
 * Hello world!
 *
 */
public class Demo extends PrintFriendliness {

    private Long id;
    private String name;
    private String test;

    public Demo() {
    }

    public Demo(Long id, String name, String test) {
        this.id = id;
        this.name = name;
        this.test = test;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
