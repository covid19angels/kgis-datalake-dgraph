// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum CheckoutOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    COMPLETED_AT,

    /**
    * 
    */
    CREATED_AT,

    /**
    * 
    */
    DESCRIPTION,

    /**
    * 
    */
    EMAIL,

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
    NOTE,

    /**
    * 
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static CheckoutOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "completedAt": {
                return COMPLETED_AT;
            }

            case "createdAt": {
                return CREATED_AT;
            }

            case "description": {
                return DESCRIPTION;
            }

            case "email": {
                return EMAIL;
            }

            case "identifier": {
                return IDENTIFIER;
            }

            case "name": {
                return NAME;
            }

            case "note": {
                return NOTE;
            }

            case "updatedAt": {
                return UPDATED_AT;
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

            case COMPLETED_AT: {
                return "completedAt";
            }

            case CREATED_AT: {
                return "createdAt";
            }

            case DESCRIPTION: {
                return "description";
            }

            case EMAIL: {
                return "email";
            }

            case IDENTIFIER: {
                return "identifier";
            }

            case NAME: {
                return "name";
            }

            case NOTE: {
                return "note";
            }

            case UPDATED_AT: {
                return "updatedAt";
            }

            default: {
                return "";
            }
        }
    }
}

