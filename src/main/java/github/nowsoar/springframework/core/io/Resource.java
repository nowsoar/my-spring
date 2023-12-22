package github.nowsoar.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/12/22
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
