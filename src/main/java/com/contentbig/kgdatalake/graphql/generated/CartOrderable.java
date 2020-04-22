// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum CartOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

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
    NOTES,

    /**
    * 
    */
    UPDATED_AT,

    UNKNOWN_VALUE;

    public static CartOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
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

            case "notes": {
                return NOTES;
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

            case NOTES: {
                return "notes";
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

