package github.nowsoar.springframework.test.bean;

import github.nowsoar.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/21
 */
@Component
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1", "zkp 北京");
    }

    public void initDataMethod() {
        System.out.println("执行: init-method");
        hashMap.put("1", "zkp");
    }

    public void destroyDataMethod() {
        System.out.println("执行: destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
