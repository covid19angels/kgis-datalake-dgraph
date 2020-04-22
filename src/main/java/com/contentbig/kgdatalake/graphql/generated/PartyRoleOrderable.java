// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum PartyRoleOrderable {
    /**
    * 
    */
    DATE_FROM,

    /**
    * 
    */
    DATE_THROUGH,

    UNKNOWN_VALUE;

    public static PartyRoleOrderable fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "dateFrom": {
                return DATE_FROM;
            }

            case "dateThrough": {
                return DATE_THROUGH;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case DATE_FROM: {
                return "dateFrom";
            }

            case DATE_THROUGH: {
                return "dateThrough";
            }

            default: {
                return "";
            }
        }
    }
}

