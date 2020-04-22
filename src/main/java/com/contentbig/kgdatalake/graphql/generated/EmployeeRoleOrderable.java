// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum EmployeeRoleOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    DATE_FROM,

    /**
    * 
    */
    DATE_THROUGH,

    /**
    * 
    */
    DESCRIPTION,

    /**
    * 
    */
    IDENTIFIER,

    /**
    * 
    */
    NAME,

    /**
    * 
    */
    NUMBER,

    UNKNOWN_VALUE;

    public static EmployeeRoleOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "dateFrom": {
                return DATE_FROM;
            }

            case "dateThrough": {
                return DATE_THROUGH;
            }

            case "description": {
                return DESCRIPTION;
            }

            case "identifier": {
                return IDENTIFIER;
            }

            case "name": {
                return NAME;
            }

            case "number": {
                return NUMBER;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ALTERNATE_NAME: {
                return "alternateName";
            }

            case DATE_FROM: {
                return "dateFrom";
            }

            case DATE_THROUGH: {
                return "dateThrough";
            }

            case DESCRIPTION: {
                return "description";
            }

            case IDENTIFIER: {
                return "identifier";
            }

            case NAME: {
                return "name";
            }

            case NUMBER: {
                return "number";
            }

            default: {
                return "";
            }
        }
    }
}

