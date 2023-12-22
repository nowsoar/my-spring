package github.nowsoar.springframework.core.io;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
