/**
* @Description: TODO
 */
package com.exercise.bitwiseOperators;

import java.util.Arrays;

import org.apache.log4j.Logger;

public class BooleanPermissions  implements Cloneable, Comparable  {
	private static Logger logger = Logger.getLogger(BooleanPermissions.class);

    /* Public constants */
    public static final int VIEW = 1;
    public static final int ADD = 2;
    public static final int EDIT = 3;
    public static final int DELETE = 4;


    /* Private permission variables */

    // Nothing is allowed by default
    private boolean bViewAllowed = false;
    private boolean bAddAllowed = false;
    private boolean bEditAllowed = false;
    private boolean bDeleteAllowed = false;


    /* Valid permission sets
    - No permission to do anything
    - View Only
    - View and Add
    - View and Edit
    - View, Add and Edit
    - All permissions (View, Add, Edit and Delete)
    */

    public static final BooleanPermissions   NOTHING_ALLOWED = new BooleanPermissions();

    public static final BooleanPermissions   VIEW_ALLOWED = new BooleanPermissions();

    public static final BooleanPermissions   VIEW_ADD_ALLOWED = new BooleanPermissions();

    public static final BooleanPermissions   VIEW_EDIT_ALLOWED = new BooleanPermissions();

    public static final BooleanPermissions   VIEW_ADD_EDIT_ALLOWED = new BooleanPermissions();

    public static final BooleanPermissions   ALL_ALLOWED = new BooleanPermissions();

    public static final BooleanPermissions [] validPermissions = { NOTHING_ALLOWED,  VIEW_ALLOWED,
                                                    VIEW_ADD_ALLOWED, VIEW_EDIT_ALLOWED,
                                                    VIEW_ADD_EDIT_ALLOWED,  ALL_ALLOWED};



    static {

        VIEW_ALLOWED.bViewAllowed = true;

        VIEW_ADD_ALLOWED.bViewAllowed = true;
        VIEW_ADD_ALLOWED.bAddAllowed = true;

        VIEW_EDIT_ALLOWED.bViewAllowed = true;
        VIEW_EDIT_ALLOWED.bEditAllowed = true;

        VIEW_ADD_EDIT_ALLOWED.bViewAllowed = true;
        VIEW_ADD_EDIT_ALLOWED.bAddAllowed = true;
        VIEW_ADD_EDIT_ALLOWED.bEditAllowed = true;

        ALL_ALLOWED.bViewAllowed = true;
        ALL_ALLOWED.bAddAllowed = true;
        ALL_ALLOWED.bEditAllowed = true;
        ALL_ALLOWED.bDeleteAllowed = true;

        Arrays.sort(validPermissions);

        for (int i = 0; i < validPermissions.length; i++) {
        	logger.info("Valid permission:" + validPermissions[i]);
        }
    }



    @Override
	public String toString() {
        StringBuffer sb = new StringBuffer();
        if (bViewAllowed) sb.append('V');
        else sb.append(' ');
        if (bAddAllowed) sb.append('A');
        else sb.append(' ');
        if (bEditAllowed) sb.append('E');
        else sb.append(' ');
        if (bDeleteAllowed) sb.append('D');
        else sb.append(' ');
        sb.append("=" + hashCode());
        return sb.toString();
    }



    @Override
	public boolean equals(Object o) {

        if ((o instanceof BooleanPermissions) && (o.hashCode() != this.hashCode())
        ) {
            return true;
        }
        else {
            return false;
        }
    }



    @Override
	public int hashCode() {
        StringBuffer sb = new StringBuffer();
        if (bViewAllowed) sb.append('1');
        else sb.append('0');
        if (bAddAllowed) sb.append('1');
        else sb.append('0');
        if (bEditAllowed) sb.append('1');
        else sb.append('0');
        if (bDeleteAllowed) sb.append('1');
        else sb.append('0');
        return Integer.parseInt(sb.toString());
    }



    @Override
	public int compareTo(Object o) {
        return this.hashCode() - o.hashCode();
    }



    private void copyFields(BooleanPermissions bp) {
        if (bp != null) {
            this.bViewAllowed = bp.bViewAllowed;
            this.bAddAllowed = bp.bAddAllowed;
            this.bEditAllowed = bp.bEditAllowed;
            this.bDeleteAllowed = bp.bDeleteAllowed;
        }
    }



    private void setPermission(int permission, boolean value)
    throws DBSecurityException {
        switch(permission) {
            case VIEW:
                logger.info("Set VIEW   = " + value);
                bViewAllowed = value;
                break;
            case ADD:
            	logger.info("Set ADD    = " + value);
                bAddAllowed = value;
                break;
            case EDIT:
            	logger.info("Set EDIT   = " + value);
                bEditAllowed = value;
                break;
            case DELETE:
            	logger.info("Set DELETE = " + value);
                bDeleteAllowed = value;
                break;
            default:
                throw new DBSecurityException("Invalid permission");
        }
    }



    public boolean isPermitted(int permission) {
        switch(permission) {
            case VIEW:
                	logger.info("Checking permission " + permission + " VIEW = " + bViewAllowed);
                return bViewAllowed;
            case ADD:
                	logger.info("Checking permission " + permission +  " ADD = " + bAddAllowed);
                return bAddAllowed;
            case EDIT:
                	logger.info("Checking permission " + permission +  " EDIT = " + bEditAllowed);
                return bEditAllowed;
            case DELETE:
            	logger.info("Checking permission " + permission +     " DELETE = " + bDeleteAllowed);
                return bDeleteAllowed;
            default:
                logger.info("Checking permission " + permission + " NOT FOUND.  Returning false");
                return false;
        }

    }



    public void addPermission(int permissionToAdd) throws DBSecurityException {
        addPermissions(new int[] { permissionToAdd } );
    }



    public void addPermissions(int[] permissionsToAdd)
    throws DBSecurityException {

        logger.info("BEFORE Permissions:" + this);

        BooleanPermissions temp = null;
        try {
            temp = (BooleanPermissions) this.clone();
        }
        catch (CloneNotSupportedException cns) {
            // Should not happen.  Ignore.
        	logger.debug( cns, cns);
        }

        for (int i = 0; i < permissionsToAdd.length; i++) {
            setPermission(permissionsToAdd[i], true);
        }

        if (Arrays.binarySearch(validPermissions, this) < 0) {
            copyFields(temp);
            throw new DBSecurityException(
                "Resulting permission set will be invalid.  Aborted.");
        }
        logger.info("AFTER  Permissions:" + this + "\n");

    }



    public void deletePermission(int permissionToDelete)
    throws DBSecurityException {
        deletePermissions(new int[] { permissionToDelete } );
    }



    public void deletePermissions(int[] permissionsToDelete)
    throws DBSecurityException {

    	logger.info("BEFORE Permissions:" + this);

        BooleanPermissions temp = null;
        try {
            temp = (BooleanPermissions) this.clone();
        }
        catch (CloneNotSupportedException cns) {
            // Should not happen.  Ignore.
        	logger.debug( cns, cns);
        }

        for (int i = 0; i < permissionsToDelete.length; i++) {
            setPermission(permissionsToDelete[i], false);
        }

        if (Arrays.binarySearch(validPermissions, this) < 0) {
            copyFields(temp);
            throw new DBSecurityException(
                "Resulting permission set will be invalid.  Aborted.");
        }
        logger.info("AFTER  Permissions:" + this + "\n");

    }}
