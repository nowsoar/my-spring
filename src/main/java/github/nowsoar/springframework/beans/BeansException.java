package github.nowsoar.springframework.beans;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/20
 */
public class BeansException extends RuntimeException {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
