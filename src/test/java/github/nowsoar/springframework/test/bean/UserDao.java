package github.nowsoar.springframework.test.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/21
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("1", "zkp");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}