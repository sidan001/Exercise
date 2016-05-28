/**
* @Description: TODO
 */
package com.exercise.bitwiseOperators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.log4j.Logger;

/**
 * @author   E-mail:liuchou.ewedata.com
 * @date 创建时间：2016年3月29日 下午12:55:22 
 * @Description 
 * @version 1.0 
 * @since  
 *  
 */
public class AssignPermissions extends TestCase {
	private static Logger logger = Logger.getLogger(AssignPermissions.class);

    // Fixtures - Class fields to allow access from anywhere in class
    HashMap bitwiseUsers;
    HashMap booleanUsers;

    // Some free memory info
    Runtime rt = Runtime.getRuntime();

    long tm, tm2;
    long free4, free5;

    // Test statistics
    static int n2 = 0;
    static long timetaken1 = 0;
    static long timetaken2 = 0;
    static long freechange1 = 0;
    static long freechange2 = 0;


    // Required constructor - takes method name to test as parameter
    public AssignPermissions(String name) {
        super(name);
    }


    // Add tests to run in order of running into the suite
    public static Test suite() {

        // Shortcut to automatically add all testXXX methods
        //return new TestSuite(assign_permissions.class);

        // Number of repetitions per test
        n2 = 1;

        TestSuite suite1 = new TestSuite();
        suite1.addTest(
                new RepeatedTest(
                    new AssignPermissions("testBitwiseOperations"), n2));

        TestSuite suite2 = new TestSuite();
        suite2.addTest(
                new RepeatedTest(
                    new AssignPermissions("testBooleanOperations"), n2));

        TestSuite suite = new TestSuite();
        //suite.addTest(new assign_permissions("testBitwiseOperations"));
        //suite.addTest(new assign_permissions("testBooleanOperations"));
        suite.addTest(suite1);
        suite.addTest(suite2);
        //TestResult result = suite.run();

        return suite;
    }




    public static void main (String[] args) {

        // Initialize static fields
        timetaken1 = 0;
        timetaken2 = 0;
        freechange1 = 0;
        freechange2 = 0;

        // Run the tests
        junit.textui.TestRunner.run( suite() );

        // Print the results
        // No sense in averaging less than 10 tests
        if (n2 > 9) {
        	logger.error(
                "Average time taken for testBitwiseOperations() = " + ((0.0 + (timetaken1*100.0/n2))/100.0) + " millisecs" );
        	logger.error(
                "Average time taken for testBooleanOperations() = " + ((0.0 + (timetaken2*100.0/n2))/100.0) + " millisecs" );

            if (timetaken1 != 0) {
            	logger.error("testBooleanOperations() takes " + ((timetaken2-timetaken1)*100/timetaken1) +
                    "% more time than testBitwiseOperations()");
            }

        }


        // Because of automatic garbage collection, no sense in measuring
        // memory usage for more than 1 tests
        if (n2 == 1) {
        	logger.error(
                "Memory used for testBitwiseOperations() = " +  freechange1 + " bytes" );
        	logger.error(
                "Memory used for testBooleanOperations() = " +  freechange2 + " bytes" );
            if (freechange1 != 0) {
            	logger.error("testBooleanOperations() uses " + ((freechange2-freechange1)*100/freechange1) +
                "% more memory than testBitwiseOperations()");
            }
        }


    }



    // This method is called before running each test
    @Override
	protected void setUp() {
    	logger.info("setUp(): Started\n");
        //System.gc();
    }



    // Test method
    public void testBitwiseOperations() {
    	logger.info("testBitwiseOperations(): Started\n");


        tm = System.currentTimeMillis();
        free4 = rt.freeMemory();

        bitwiseUsers = new HashMap();
        bitwiseUsers.put("user1",
            new Integer(BitwisePermissions.NOTHING_ALLOWED));
        bitwiseUsers.put("user2",
            new Integer(BitwisePermissions.VIEW_ALLOWED));
        bitwiseUsers.put("user3",
            new Integer(BitwisePermissions.VIEW_ADD_ALLOWED));
        bitwiseUsers.put("user4",
            new Integer(BitwisePermissions.VIEW_EDIT_ALLOWED));
        bitwiseUsers.put("user5",
            new Integer(BitwisePermissions.VIEW_ADD_EDIT_ALLOWED));
        bitwiseUsers.put("user6",
            new Integer(BitwisePermissions.ALL_ALLOWED));

        Set keys = bitwiseUsers.keySet();
        Iterator i = keys.iterator();

        while (i.hasNext()) {
            Object o = i.next();
            logger.info("User ID = " + o + "\n");
            int currentPermissions =
                ((Integer) bitwiseUsers.get(o)).intValue();

            try {
                currentPermissions =
                    BitwisePermissions.addPermissions(
                        currentPermissions,
                        new int[] {
                            BitwisePermissions.DELETE,
                            BitwisePermissions.ADD,
                            BitwisePermissions.EDIT,
                            BitwisePermissions.VIEW,
                        }
                    );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }

            try {
                currentPermissions =
                    BitwisePermissions.deletePermissions(
                        currentPermissions,
                        new int[] {
                            BitwisePermissions.ADD,
                            BitwisePermissions.EDIT,
                            BitwisePermissions.VIEW,
                        }
                    );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }

            try {
                currentPermissions =
                    BitwisePermissions.addPermissions(
                        currentPermissions,
                        new int[] {
                            BitwisePermissions.VIEW,
                        }
                    );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }

            try {
                currentPermissions =
                    BitwisePermissions.addPermissions(
                        currentPermissions,
                        new int[] {
                            BitwisePermissions.DELETE,
                            BitwisePermissions.VIEW,
                        }
                    );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }


            try {
                currentPermissions =
                    BitwisePermissions.deletePermissions(
                        currentPermissions,
                        new int[] {
                            BitwisePermissions.DELETE,
                        }
                    );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }


            try {
                currentPermissions =
                    BitwisePermissions.addPermissions(
                        currentPermissions,
                        new int[] {
                            BitwisePermissions.DELETE,
                            BitwisePermissions.EDIT,
                            BitwisePermissions.VIEW,
                        }
                    );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }

            try {
                currentPermissions =
                    BitwisePermissions.deletePermissions(
                        currentPermissions,
                        new int[] {
                            BitwisePermissions.DELETE,
                            BitwisePermissions.ADD,
                            BitwisePermissions.EDIT,
                            BitwisePermissions.VIEW,
                        }
                    );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }
        }

        tm2 = System.currentTimeMillis();
        free5 = rt.freeMemory();

        timetaken1 += (tm2-tm);
        freechange1 += (free5-free4);

        assertTrue(true);
    }



    // Test method
    public void testBooleanOperations() {

    	logger.info("testBooleanOperations(): Started\n");

        tm = System.currentTimeMillis();
        free4 = rt.freeMemory();

        booleanUsers = new HashMap();
        booleanUsers.put("user1", BooleanPermissions.NOTHING_ALLOWED);
        booleanUsers.put("user2", BooleanPermissions.VIEW_ALLOWED);
        booleanUsers.put("user3", BooleanPermissions.VIEW_ADD_ALLOWED);
        booleanUsers.put("user4", BooleanPermissions.VIEW_EDIT_ALLOWED);
        booleanUsers.put("user5", BooleanPermissions.VIEW_ADD_EDIT_ALLOWED);
        booleanUsers.put("user6", BooleanPermissions.ALL_ALLOWED);

        Set keys = booleanUsers.keySet();
        Iterator i = keys.iterator();

        while (i.hasNext()) {
            Object o = i.next();
            logger.info("User ID = " + o + "\n");
            BooleanPermissions currentPermissions =
                (BooleanPermissions) booleanUsers.get(o);

            try {
                currentPermissions.addPermissions(
                    new int[] {
                        BooleanPermissions.DELETE,
                        BooleanPermissions.ADD,
                        BooleanPermissions.EDIT,
                        BooleanPermissions.VIEW,
                    }
                );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }

            try {
                currentPermissions.deletePermissions(
                    new int[] {
                        BooleanPermissions.ADD,
                        BooleanPermissions.EDIT,
                        BooleanPermissions.VIEW,
                    }
                );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }

            try {
                currentPermissions.addPermissions(
                    new int[] {
                        BooleanPermissions.VIEW,
                    }
                );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }

            try {
                currentPermissions.addPermissions(
                    new int[] {
                        BooleanPermissions.DELETE,
                        BooleanPermissions.VIEW,
                    }
                );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }


            try {
                currentPermissions.deletePermissions(
                    new int[] {
                        BooleanPermissions.DELETE,
                    }
                );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }


            try {
                currentPermissions.addPermissions(
                    new int[] {
                        BooleanPermissions.DELETE,
                        BooleanPermissions.EDIT,
                        BooleanPermissions.VIEW,
                    }
                );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }

            try {
                currentPermissions.addPermissions(
                    new int[] {
                        BooleanPermissions.DELETE,
                        BooleanPermissions.ADD,
                        BooleanPermissions.EDIT,
                        BooleanPermissions.VIEW,
                    }
                );
            }
            catch (DBSecurityException dbse) {
            	logger.warn(dbse, dbse);
            }
        }

        tm2 = System.currentTimeMillis();
        free5 = rt.freeMemory();

        timetaken2 += (tm2-tm);
        freechange2 += (free5-free4);

        assertTrue(true);
    }

}
