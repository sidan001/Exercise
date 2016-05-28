/**
 * @Description: TODO
 */
package com.ewe.fastjson;

import java.util.ArrayList;
import java.util.List;

/**
 * @author E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年3月22日 下午2:48:35
 * @Description
 * @version 1.0
 * @since
 * 
 */
public class Group {
	private Long id;
	private String name;
	private List<User> users = new ArrayList<User>();

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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void addUser(User user) {
		users.add(user);
	}
}
