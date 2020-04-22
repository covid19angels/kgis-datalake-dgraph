// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum WebhookOrderable {
    /**
    * 
    */
    ALTERNATE_NAME,

    /**
    * 
    */
    CONTENT_TYPE,

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
    IDENTIFIER,

    /**
    * 
    */
    NAME,

    /**
    * 
    */
    PAYLOAD_URL,

    /**
    * 
    */
    SECRET,

    UNKNOWN_VALUE;

    public static WebhookOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "alternateName": {
                return ALTERNATE_NAME;
            }

            case "contentType": {
                return CONTENT_TYPE;
            }

            case "dateCreated": {
                return DATE_CREATED;
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

            case "payloadUrl": {
                return PAYLOAD_URL;
            }

            case "secret": {
                return SECRET;
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

            case CONTENT_TYPE: {
                return "contentType";
            }

            case DATE_CREATED: {
                return "dateCreated";
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

            case PAYLOAD_URL: {
                return "payloadUrl";
            }

            case SECRET: {
                return "secret";
            }

            default: {
                return "";
            }
        }
    }
}

