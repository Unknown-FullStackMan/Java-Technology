package pojo;

/**
 * @Author Simple
 * @Create 2021/7/2 14:14
 */
public class cloneClass implements Cloneable {
    private String name;
    private Integer id;
    private cloneClass cloneClass;


    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public cloneClass clone() throws CloneNotSupportedException {
        return (cloneClass)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public pojo.cloneClass getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(pojo.cloneClass cloneClass) {
        this.cloneClass = cloneClass;
    }
}
