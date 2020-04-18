// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.dgraph.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Utils;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* è´­ç‰©è½¦å†…ç‰©ï¿½ï¿½?ï¿½ï¿½?ï¿½ï¿½?åŠ¡ï¿½ï¿½?ä¼˜æƒ åˆ¸ç­‰ç±»åž‹
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

