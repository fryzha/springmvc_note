package part.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import part.dao.TestDao;
import part.entity.TestEntity;
import part.mapper.TestEntityMapper;

import java.util.List;

/**
 * @author Neo
 * @date 2020/8/3 18:14
 */
@Controller
public class WelcomeController {

    @Autowired
    private TestDao testDao;

    @Autowired
    private TestEntityMapper mapper;

    public WelcomeController() {
    }

    @ResponseBody
    @RequestMapping(name = "/getTestEntity")
    public TestEntity getTestEntity(Integer id){
        if(id == null || id < 1)
            id = 1;
//        return testDao.getTestEntityById(id);
        return mapper.getOne(id);
    }

    @ResponseBody
    @RequestMapping("/getTestEntitys")
    public List<TestEntity> getTestEntitys(){
        return testDao.getTestEntitys();
    }

    public TestEntityMapper getMapper() {
        return mapper;
    }

    public void setMapper(TestEntityMapper mapper) {
        this.mapper = mapper;
    }

    public TestDao getTestDao() {
        return testDao;
    }

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }
}
