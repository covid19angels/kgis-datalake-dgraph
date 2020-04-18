// Generated from graphql_java_gen gem with template Object.java.erb

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
* ï¿½?ï¿½è´­ç‰©ï¼šï¿½?ï¿½ä»¥è´­ä¹°è®¢è´­çš„äº§ï¿½ï¿½?æˆ–ï¿½ï¿½?åŠ¡Productï¼ŒService
*/
public class UnknownSaleable extends AbstractResponse<UnknownSaleable> implements Saleable {
    public UnknownSaleable() {
    }

    public UnknownSaleable(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "isSaleable": {
                    Boolean optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsBoolean(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public static Saleable create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Product": {
                return new Product(fields);
            }

            case "ProductModel": {
                return new ProductModel(fields);
            }

            default: {
                return new UnknownSaleable(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    *     ï¿½?ï¿½ä»¥è´­ä¹°è®¢è´­çš„äº§ï¿½ï¿½?æˆ–ï¿½ï¿½?åŠ¡Productï¼ŒService    
    */

    public Boolean getIsSaleable() {
        return (Boolean) get("isSaleable");
    }

    public UnknownSaleable setIsSaleable(Boolean arg) {
        optimisticData.put(getKey("isSaleable"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "isSaleable": return false;

            default: return false;
        }
    }
}

