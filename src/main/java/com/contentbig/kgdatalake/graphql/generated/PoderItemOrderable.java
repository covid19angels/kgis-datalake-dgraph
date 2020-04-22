// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum PoderItemOrderable {
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
    IDENTIFIER,

    /**
    * 
    */
    NAME,

    /**
    * 
    */
    PODER_ITEM_NUMBER,

    /**
    * 
    */
    PODER_QUANTITY,

    UNKNOWN_VALUE;

    public static PoderItemOrderable fromGraphQl(String value) {
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

            case "identifier": {
                return IDENTIFIER;
            }

            case "name": {
                return NAME;
            }

            case "poderItemNumber": {
                return PODER_ITEM_NUMBER;
            }

            case "poderQuantity": {
                return PODER_QUANTITY;
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

            case IDENTIFIER: {
                return "identifier";
            }

            case NAME: {
                return "name";
            }

            case PODER_ITEM_NUMBER: {
                return "poderItemNumber";
            }

            case PODER_QUANTITY: {
                return "poderQuantity";
            }

            default: {
                return "";
            }
        }
    }
}

