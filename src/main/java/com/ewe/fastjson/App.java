package com.ewe.fastjson;

import java.util.Calendar;

public class App {
	public static void main(String[] args) {
		/*
		 * Group group = new Group(); group.setId(0L); group.setName("admin");
		 * 
		 * User guestUser = new User(); guestUser.setId(2L);
		 * guestUser.setName("guest");
		 * 
		 * User rootUser = new User(); rootUser.setId(3L);
		 * rootUser.setName("root");
		 * 
		 * group.addUser(guestUser); group.addUser(rootUser);
		 * 
		 * String jsonString = JSON.toJSONString(group);
		 * 
		 * System.out.println(jsonString);
		 * 
		 * JSONObject groupJson = JSON.parseObject(jsonString);
		 * 
		 * String usersJosn = groupJson.getJSONArray("users").toJSONString();
		 * 
		 * 
		 * List<User> users = JSON.parseObject(usersJosn,new
		 * TypeReference<List<User>>(){});
		 * 
		 * System.out.println(users);
		 */

		/*
		 * int [] ps = {3,4,1,5,2,9,6}; Arrays.sort(ps); for (int i = 0; i <
		 * ps.length; i++) { System.out.println(ps[i] + " >>> " +
		 * Integer.toString(ps[i], 2)); }
		 */
		/*
		 * Class c1 = new ArrayList<String>().getClass(); Class c2 = new
		 * ArrayList<Integer>().getClass();
		 * 
		 * System.out.println(c1 == c2);
		 * 
		 * List<String> list = new ArrayList<String>(); list.add("ABC"); try {
		 * list.getClass().getMethod("add",Object.class).invoke(list,123); }
		 * catch (IllegalAccessException e) { e.printStackTrace(); } catch
		 * (IllegalArgumentException e) { e.printStackTrace(); } catch
		 * (InvocationTargetException e) { e.printStackTrace(); } catch
		 * (NoSuchMethodException e) { e.printStackTrace(); } catch
		 * (SecurityException e) { e.printStackTrace(); }
		 * System.out.println(list);
		 */

		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		
		int hoy = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second =cal.get(Calendar.SECOND);
		int ms = cal.get(Calendar.MILLISECOND);
		System.out.println("Current Date: " + cal.getTime());
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);
		System.out.println("Year: " + year);
		System.out.println("Day of Week: " + dow);
		System.out.println("Day of Month: " + dom);
		System.out.println("Day of Year: " + doy);
		System.out.println("Hour of day:" + hoy);
		System.out.println("minute:" + minute);
		System.out.println("second:" + second);
		System.out.println("ms:" + ms);
		
		
		
		
		
	}
}
