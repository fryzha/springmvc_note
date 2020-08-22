package part.entity;


/**
 * @author Neo
 * @date 2020/8/4 15:31
 */
public class TestEntity{

    private Integer id;

    private Integer i;

    private String name;

    public TestEntity() {
    }

    public TestEntity(Integer id, Integer i, String name) {
        this.id = id;
        this.i = i;
        this.name = name;
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

}
