// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 任务优先级
*/
public enum TaskPriority {
    /**
    * 
    */
    HIGH,

    /**
    * 
    */
    HIGHEST,

    /**
    * 
    */
    LOW,

    /**
    * 
    */
    LOWEST,

    /**
    * 
    */
    MEDIUM,

    UNKNOWN_VALUE;

    public static TaskPriority fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "HIGH": {
                return HIGH;
            }

            case "HIGHEST": {
                return HIGHEST;
            }

            case "LOW": {
                return LOW;
            }

            case "LOWEST": {
                return LOWEST;
            }

            case "MEDIUM": {
                return MEDIUM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case HIGH: {
                return "HIGH";
            }

            case HIGHEST: {
                return "HIGHEST";
            }

            case LOW: {
                return "LOW";
            }

            case LOWEST: {
                return "LOWEST";
            }

            case MEDIUM: {
                return "MEDIUM";
            }

            default: {
                return "";
            }
        }
    }
}

