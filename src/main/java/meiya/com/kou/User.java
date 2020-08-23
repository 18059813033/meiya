package meiya.com.kou;

/**
 * @ClassName User
 * @Author kouxl
 * @Date 2020/8/22 6:00 PM
 */
public class User {
    private int id;
    private String name;
    private String address;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("kouxl456修改了equals方法");
        System.out.println("kouxl456修改了equals方法");
        System.out.println("kouxl456修改了equals方法");
        System.out.println("kouxl123修改了equals方法");
        System.out.println("kouxl123修改了equals方法");
        System.out.println("kouxl456修改了equals方法");
        System.out.println("kouxl4567修改了equals方法");
        System.out.println("kouxl456修改了equals方法");
        return super.equals(obj);
    }
}
