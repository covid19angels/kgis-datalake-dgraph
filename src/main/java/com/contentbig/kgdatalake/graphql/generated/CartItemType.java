// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 购物车内物��?��?��?务��?优惠券等类型
*/
public enum CartItemType {
    /**
    * 
    */
    SHIPPING,

    /**
    * 
    */
    SKU,

    /**
    * 
    */
    TAX,

    UNKNOWN_VALUE;

    public static CartItemType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "SHIPPING": {
                return SHIPPING;
            }

            case "SKU": {
                return SKU;
            }

            case "TAX": {
                return TAX;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case SHIPPING: {
                return "SHIPPING";
            }

            case SKU: {
                return "SKU";
            }

            case TAX: {
                return "TAX";
            }

            default: {
                return "";
            }
        }
    }
}

