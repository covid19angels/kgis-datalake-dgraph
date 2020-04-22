// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum UserOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    BIO,

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
    PASSWORD,

    /**
    * 
    */
    USERNAME,

    UNKNOWN_VALUE;

    public static UserOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "bio": {
                return BIO;
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

            case "password": {
                return PASSWORD;
            }

            case "username": {
                return USERNAME;
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

            case BIO: {
                return "bio";
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

            case PASSWORD: {
                return "password";
            }

            case USERNAME: {
                return "username";
            }

            default: {
                return "";
            }
        }
    }
}

