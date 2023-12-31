package github.nowsoar.springframework.test.bean;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public class Husband {

    private Wife wife;

    public String queryWife() {
        return "" + wife;
    }
}
