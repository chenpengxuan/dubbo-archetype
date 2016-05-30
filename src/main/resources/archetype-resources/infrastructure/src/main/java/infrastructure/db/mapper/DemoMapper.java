/*
 *
 *  (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *  All rights reserved.
 *
 */

package ${package}.infrastructure.db.mapper;

import ${package}.infrastructure.db.model.DemoExample;
import ${package}.infrastructure.db.model.DemoPo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoMapper {
    int countByExample(DemoExample example);

    int deleteByExample(DemoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DemoPo record);

    int insertSelective(DemoPo record);

    List<DemoPo> selectByExample(DemoExample example);

    DemoPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DemoPo record, @Param("example") DemoExample example);

    int updateByExample(@Param("record") DemoPo record, @Param("example") DemoExample example);

    int updateByPrimaryKeySelective(DemoPo record);

    int updateByPrimaryKey(DemoPo record);
}