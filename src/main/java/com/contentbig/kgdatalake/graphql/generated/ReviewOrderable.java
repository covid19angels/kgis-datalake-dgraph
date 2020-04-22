// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum ReviewOrderable {
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
    IDENTIFIER,

    /**
    * 
    */
    NAME,

    /**
    * 
    */
    RATING_VALUE,

    /**
    * 
    */
    REVIEW_ASPECT,

    /**
    * 
    */
    REVIEW_BODY,

    UNKNOWN_VALUE;

    public static ReviewOrderable fromGraphQl(String value) {
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

            case "identifier": {
                return IDENTIFIER;
            }

            case "name": {
                return NAME;
            }

            case "ratingValue": {
                return RATING_VALUE;
            }

            case "reviewAspect": {
                return REVIEW_ASPECT;
            }

            case "reviewBody": {
                return REVIEW_BODY;
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

            case IDENTIFIER: {
                return "identifier";
            }

            case NAME: {
                return "name";
            }

            case RATING_VALUE: {
                return "ratingValue";
            }

            case REVIEW_ASPECT: {
                return "reviewAspect";
            }

            case REVIEW_BODY: {
                return "reviewBody";
            }

            default: {
                return "";
            }
        }
    }
}

