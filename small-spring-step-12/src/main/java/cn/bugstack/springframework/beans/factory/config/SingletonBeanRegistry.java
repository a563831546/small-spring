package cn.bugstack.springframework.beans.factory.config;

/**
 * baogex.com
 * <p>
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);

}
                                                