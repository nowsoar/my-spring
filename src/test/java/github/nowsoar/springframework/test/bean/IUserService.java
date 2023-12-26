package github.nowsoar.springframework.test.bean;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/26
 */
public interface IUserService {

    String queryInfo();

    String register(String userName);
}
