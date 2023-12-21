package github.nowsoar.springframework.test.bean;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/19
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息: " +name);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
