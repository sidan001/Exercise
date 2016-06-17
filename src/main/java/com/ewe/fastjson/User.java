/**
* @Description: TODO
 */
package com.ewe.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

public class User {
	private Long   id;
    private String name;
    @JSONField(serialize=false)//parseFeatures={Feature.AllowArbitraryCommas} 
    private String home;
    
    public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
