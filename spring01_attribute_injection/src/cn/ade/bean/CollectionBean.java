package cn.ade.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 需求：集合实体
 *
 * @author ade
 * @version 1.0，2017-11-8 15:22:39
 */
public class CollectionBean {

    private List list;

    private Set set;

    private Map map;

    private Properties properties;

    public CollectionBean() {
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
