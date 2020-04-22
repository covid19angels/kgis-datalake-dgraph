// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 任务状��?
*/
public enum TaskStatus {
    /**
    * 
    */
    ASSIGNED,

    /**
    * 
    */
    CANCELLED,

    /**
    * 
    */
    CLOSED,

    /**
    * 
    */
    INPROGRESS,

    /**
    * 
    */
    NEW,

    UNKNOWN_VALUE;

    public static TaskStatus fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ASSIGNED": {
                return ASSIGNED;
            }

            case "CANCELLED": {
                return CANCELLED;
            }

            case "CLOSED": {
                return CLOSED;
            }

            case "INPROGRESS": {
                return INPROGRESS;
            }

            case "NEW": {
                return NEW;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ASSIGNED: {
                return "ASSIGNED";
            }

            case CANCELLED: {
                return "CANCELLED";
            }

            case CLOSED: {
                return "CLOSED";
            }

            case INPROGRESS: {
                return "INPROGRESS";
            }

            case NEW: {
                return "NEW";
            }

            default: {
                return "";
            }
        }
    }
}

