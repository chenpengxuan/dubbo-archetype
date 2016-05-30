/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.infrastructure.db.model;

public class DemoPo {
    /**
     * BIGINT(19) 必填<br>
     *
     */
    private Long id;

    /**
     * VARCHAR(255)<br>
     *
     */
    private String name;

    /**
     * VARCHAR(255)<br>
     *
     */
    private String test;

    /**
     * BIGINT(19) 必填<br>
     */
    public Long getId() {
        return id;
    }

    /**
     * BIGINT(19) 必填<br>
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * VARCHAR(255)<br>
     */
    public String getName() {
        return name;
    }

    /**
     * VARCHAR(255)<br>
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * VARCHAR(255)<br>
     */
    public String getTest() {
        return test;
    }

    /**
     * VARCHAR(255)<br>
     */
    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", test=").append(test);
        sb.append("]");
        return sb.toString();
    }
}