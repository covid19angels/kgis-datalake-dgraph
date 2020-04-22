// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum PersonOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    DESCRIPTION,

    /**
    * 
    */
    FAMILY_NAME,

    /**
    * 
    */
    GIVEN_NAME,

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
    PERSONAL_ID,

    UNKNOWN_VALUE;

    public static PersonOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "description": {
                return DESCRIPTION;
            }

            case "familyName": {
                return FAMILY_NAME;
            }

            case "givenName": {
                return GIVEN_NAME;
            }

            case "identifier": {
                return IDENTIFIER;
            }

            case "name": {
                return NAME;
            }

            case "personalID": {
                return PERSONAL_ID;
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

            case DESCRIPTION: {
                return "description";
            }

            case FAMILY_NAME: {
                return "familyName";
            }

            case GIVEN_NAME: {
                return "givenName";
            }

            case IDENTIFIER: {
                return "identifier";
            }

            case NAME: {
                return "name";
            }

            case PERSONAL_ID: {
                return "personalID";
            }

            default: {
                return "";
            }
        }
    }
}

