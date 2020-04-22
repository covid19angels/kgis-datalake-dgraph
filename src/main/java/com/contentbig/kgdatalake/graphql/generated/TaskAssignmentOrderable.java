// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum TaskAssignmentOrderable {
    /**
    * 
    */
    ACCEPTED_AT,

    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    ASSIGNED_AT,

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
    READ_AT,

    UNKNOWN_VALUE;

    public static TaskAssignmentOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "acceptedAt": {
                return ACCEPTED_AT;
            }

            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "assignedAt": {
                return ASSIGNED_AT;
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

            case "readAt": {
                return READ_AT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ACCEPTED_AT: {
                return "acceptedAt";
            }

            case ALTERNATE_NAME: {
                return "alternateName";
            }

            case ASSIGNED_AT: {
                return "assignedAt";
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

            case READ_AT: {
                return "readAt";
            }

            default: {
                return "";
            }
        }
    }
}

