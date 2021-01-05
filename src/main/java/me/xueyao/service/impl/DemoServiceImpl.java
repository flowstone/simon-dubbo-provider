package me.xueyao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.xueyao.service.DemoService;

/**
 * @author Simon.Xue
 * @date 1/5/21 1:30 PM
 **/
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
