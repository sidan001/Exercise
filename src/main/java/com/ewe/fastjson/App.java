package com.ewe.fastjson;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
/*    	Group group = new Group();
    	group.setId(0L);
    	group.setName("admin");

    	User guestUser = new User();
    	guestUser.setId(2L);
    	guestUser.setName("guest");

    	User rootUser = new User();
    	rootUser.setId(3L);
    	rootUser.setName("root");

    	group.addUser(guestUser);
    	group.addUser(rootUser);

    	String jsonString = JSON.toJSONString(group);

    	System.out.println(jsonString);
    	
    	JSONObject groupJson = JSON.parseObject(jsonString);
    	
    	String usersJosn = groupJson.getJSONArray("users").toJSONString();
    	
    	
    	List<User> users = JSON.parseObject(usersJosn,new TypeReference<List<User>>(){});
    	
    	System.out.println(users);*/
    
/*    	int [] ps = {3,4,1,5,2,9,6};
    	Arrays.sort(ps);
    	for (int i = 0; i < ps.length; i++) {
    		System.out.println(ps[i] + " >>> " + Integer.toString(ps[i], 2));
    	}*/
    	  Class c1 = new ArrayList<String>().getClass();
          Class c2 = new ArrayList<Integer>().getClass();

          System.out.println(c1 == c2);
    	
        List<String> list = new ArrayList<String>();
        list.add("ABC");
        try {
			list.getClass().getMethod("add",Object.class).invoke(list,123);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
        System.out.println(list);
    	
    	
    	
    }
}
