// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum TaskOrderable {
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
    IDENTIFIER,

    /**
    * 
    */
    NAME,

    /**
    * 
    */
    PERCENT_COMPLETE,

    /**
    * 
    */
    PLAN_FINISH,

    /**
    * 
    */
    PLAN_START,

    /**
    * 
    */
    UPDATED_AT,

    /**
    * 
    */
    WBS_NO,

    UNKNOWN_VALUE;

    public static TaskOrderable fromGraphQl(String value) {
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

            case "identifier": {
                return IDENTIFIER;
            }

            case "name": {
                return NAME;
            }

            case "percentComplete": {
                return PERCENT_COMPLETE;
            }

            case "planFinish": {
                return PLAN_FINISH;
            }

            case "planStart": {
                return PLAN_START;
            }

            case "updatedAt": {
                return UPDATED_AT;
            }

            case "wbsNO": {
                return WBS_NO;
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

            case IDENTIFIER: {
                return "identifier";
            }

            case NAME: {
                return "name";
            }

            case PERCENT_COMPLETE: {
                return "percentComplete";
            }

            case PLAN_FINISH: {
                return "planFinish";
            }

            case PLAN_START: {
                return "planStart";
            }

            case UPDATED_AT: {
                return "updatedAt";
            }

            case WBS_NO: {
                return "wbsNO";
            }

            default: {
                return "";
            }
        }
    }
}

