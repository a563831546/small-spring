package cn.bugstack.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * baogex.com
 */
public class PropertyValues {

    
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    /**
     * 添加一个属性值
     *
     * @param pv
     */
    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    /**
     * 获取一个属性值数组
     *
     * @return 属性值数组
     */
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    /**
     * 根据属性名获取一个属性值对象
     *
     * @param propertyName 属性名
     * @return 一个属性名实例对象
     */
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }

}
