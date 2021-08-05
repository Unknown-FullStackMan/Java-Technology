package pojo;

/**
 * @Author Simple
 * @Create 2021/7/2 14:28
 */
public class cloneClass2 implements Cloneable{
    private   String name;
    private Integer id;
    private cloneClass cloneClass;


    /**
     * 深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public cloneClass2 clone() throws CloneNotSupportedException {
        cloneClass2 class2 = (cloneClass2) super.clone();
        class2.cloneClass = (cloneClass)cloneClass.clone();
        return class2;
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
