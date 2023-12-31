package github.nowsoar.springframework.test.bean;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/31
 */
public class Wife {

    private Husband husband;

    private IMother mother;

    public String queryHusband() {
        return husband + mother.callMother();
    }
}
