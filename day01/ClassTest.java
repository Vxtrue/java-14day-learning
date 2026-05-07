// 类名必须和文件名完全一致，这是Java的强制规则
public class ClassTest {
    public static void main(String[] args) {
        // 创建类的实例，类比JS的new User()
        User user = new User("张三", 20);
        user.sayHello();
        // 无参构造方法，用于创建默认的用户对象
        User defaultUser = new User();
        defaultUser.sayHello();
    }
}

// 定义用户类
class User {
    // 成员变量，必须声明类型，private表示只能在类内部访问
    private String name;
    private int age;
    
    // 构造方法，类比JS的constructor()
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
        // 无参构造方法，用于创建默认的用户对象
        name = "默认用户";
        age = 0;
           }
    
    // 成员方法，必须声明返回值类型
    public void sayHello() {
        System.out.println("我叫" + name + "，今年" + age + "岁");
        
    }
}