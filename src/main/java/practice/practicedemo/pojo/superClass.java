package practice.practicedemo.pojo;

/**
 * @Author Simple
 * @Create 2021/7/2 11:07
 */
public class superClass  {
    private String name;
    private Integer id;
    /**
     * 人们希望超类中的某些方法允许被子类访问， 或允许子类的方法访
     * 问超类的某个域。为此， 需要将这些方法或域声明为 protected。
     */
    protected String  name2;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
