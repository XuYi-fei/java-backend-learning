package github.xuyifei.spring01ioc.bean;

/**
 * @program: java-backend-learning
 * @description:
 * @author: XuYifei
 * @create: 2024-09-21
 */

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryBean implements FactoryBean<MyBean> {

    private String message;

    @Override
    public MyBean getObject() throws Exception {
        return new MyBean();
    }

    @Override
    public Class<?> getObjectType() {
        return MyBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true; // 默认为单例
    }
}