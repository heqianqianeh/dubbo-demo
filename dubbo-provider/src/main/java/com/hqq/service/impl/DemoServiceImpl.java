package com.hqq.service.impl;

import com.hqq.service.impl.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Package: com.hqq.service.impl
 * User: 何芊芊
 * Email: heqianqian1@jd.com
 * Date: 2017/12/22
 * Time: 10:28
 * Description:
 */
public class DemoServiceImpl implements DemoService {

    private Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    public String echName(String name) {
        logger.debug("======DemoServiceImpl echName=====" + name);
        return name;
    }
}
