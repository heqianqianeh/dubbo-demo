import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Package: PACKAGE_NAME
 * User: 何芊芊
 * Email: heqianqian1@jd.com
 * Date: 2017/12/22
 * Time: 10:32
 * Description:
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo.xml");
        System.out.println(ac.getDisplayName());
        ac.start();
        System.out.println("程序已启动……");
        System.in.read();
    }
}
