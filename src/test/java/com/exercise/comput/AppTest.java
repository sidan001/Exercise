package com.exercise.comput;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.ewe.fastjson.User;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	
/*    	User guestUser = new User();
    	guestUser.setId(2L);
    	guestUser.setName("flym");
    	
       SimplePropertyPreFilter filter = new SimplePropertyPreFilter(User.class, "name");
       String result = JSON.toJSONString(guestUser, filter);
       System.out.println(result);
       Assert.assertEquals("{\"name\":\"flym\"}",result );*/
       
    	
    	
    	User guestUser = new User();
    	guestUser.setId(2L);
    	
    	User guestUser1 = new User();
    	guestUser1.setName("flym");
    	guestUser1.setHome("home address");
       PropertyFilter propertyFilter = new PropertyFilter(){
			@Override
			public boolean apply(Object object, String name, Object value) {
				
				if( value == null){
					return false;
				}
				return true;
			}
       };
       String guestUserResult = JSON.toJSONString(guestUser, propertyFilter);
       System.out.println(guestUserResult);
       String guestUser1Result = JSON.toJSONString(guestUser1, propertyFilter);
       System.out.println(guestUser1Result);
       
       
//       JSONObject jsonObj = JSONObject.parseObject(guestUser1Result);
//       jsonObj.pu
       
    }
}
