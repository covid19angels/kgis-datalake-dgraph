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
* ä»»åŠ¡ä¼˜å…ˆçº§
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

