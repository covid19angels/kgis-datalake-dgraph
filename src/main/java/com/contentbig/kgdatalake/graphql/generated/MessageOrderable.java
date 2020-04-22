// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum MessageOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    DATE_READ,

    /**
    * 
    */
    DATE_RECEIVED,

    /**
    * 
    */
    DATE_SENT,

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

    UNKNOWN_VALUE;

    public static MessageOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "dateRead": {
                return DATE_READ;
            }

            case "dateReceived": {
                return DATE_RECEIVED;
            }

            case "dateSent": {
                return DATE_SENT;
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

            case DATE_READ: {
                return "dateRead";
            }

            case DATE_RECEIVED: {
                return "dateReceived";
            }

            case DATE_SENT: {
                return "dateSent";
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

            default: {
                return "";
            }
        }
    }
}

