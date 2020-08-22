package part.mapper;

import org.apache.ibatis.annotations.*;
import part.entity.TestEntity;

/**
 * @author Neo
 * @date 2020/8/5 15:55
 */
@Mapper
public interface TestEntityMapper {

    @Select("select * from test where id=#{id}")
    TestEntity getOne(Integer id);
}
