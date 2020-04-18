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
* ä»»åŠ¡çŠ¶ï¿½ï¿½?
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

