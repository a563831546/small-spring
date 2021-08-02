package cn.bugstack.springframework.beans.factory.config;

/**
 * baogex.com
 *
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
                                                