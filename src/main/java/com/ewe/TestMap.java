package com.ewe;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuchou@lvmama.com
 * @create 2018-04-02 16:40
 */
public class TestMap {
    public static void main(String[] args) {
        final DataC dataC = new DataC();
        dataC.setMap(new HashMap<>());

        setDatatoMap(dataC.getMap());

        final Map<String, String> map = dataC.getMap();
        System.out.println(map);
    }

    public static void setDatatoMap(Map<String, String>  map){
        map.put("hello", "world");
        map.put("hello11", "world222");
    }

}

class DataC {
    private Map<String, String>  map;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}