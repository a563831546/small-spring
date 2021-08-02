package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * baogex.com
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
