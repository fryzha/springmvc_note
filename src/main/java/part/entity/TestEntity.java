package part.entity;


import java.io.File;
import java.util.*;

/**
 * @author Neo
 * @date 2020/8/4 15:31
 */
public class TestEntity{

    private Integer id;

    private Integer i;

    private String name;

    private Date date;

    private File file;

    private NestedEntity nestedEntity;

    private List<NestedEntity> list;

    private Map<String, Integer> map;

    private Map<String, NestedEntity> nestedEntityMap;

    public TestEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public NestedEntity getNestedEntity() {
        return nestedEntity;
    }

    public void setNestedEntity(NestedEntity nestedEntity) {
        this.nestedEntity = nestedEntity;
    }

    public List<NestedEntity> getList() {
        return list;
    }

    public void setList(List<NestedEntity> list) {
        this.list = list;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public Map<String, NestedEntity> getNestedEntityMap() {
        return nestedEntityMap;
    }

    public void setNestedEntityMap(Map<String, NestedEntity> nestedEntityMap) {
        this.nestedEntityMap = nestedEntityMap;
    }
}
