package part.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.Repository;
import part.entity.TestEntity;

import java.util.List;

/**
 * @author Neo
 * @date 2020/8/4 15:30
 */
@Repository
public class TestDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public TestDao() {
    }

    public TestEntity getTestEntityById(Integer id){
        return jdbcTemplate.query(
                "select * from test where id=?",new Object[]{id}, BeanPropertyRowMapper.newInstance(TestEntity.class)).get(0);
    }


    public List<TestEntity> getTestEntitys() {
        return jdbcTemplate.query("select * from test",BeanPropertyRowMapper.newInstance(TestEntity.class));
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
