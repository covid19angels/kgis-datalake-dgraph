// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum PartyRoleNameOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    DATE_CREATED,

    /**
    * 
    */
    DESCRIPTION,

    /**
    * 
    */
    GROUP,

    /**
    * 
    */
    IDENTIFIER,

    /**
    * 
    */
    NAME,

    UNKNOWN_VALUE;

    public static PartyRoleNameOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "dateCreated": {
                return DATE_CREATED;
            }

            case "description": {
                return DESCRIPTION;
            }

            case "group": {
                return GROUP;
            }

            case "identifier": {
                return IDENTIFIER;
            }

            case "name": {
                return NAME;
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

            case DATE_CREATED: {
                return "dateCreated";
            }

            case DESCRIPTION: {
                return "description";
            }

            case GROUP: {
                return "group";
            }

            case IDENTIFIER: {
                return "identifier";
            }

            case NAME: {
                return "name";
            }

            default: {
                return "";
            }
        }
    }
}

