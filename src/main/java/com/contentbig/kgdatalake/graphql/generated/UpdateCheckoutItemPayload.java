// Generated from graphql_java_gen gem with template Object.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 
*/
public class UpdateCheckoutItemPayload extends AbstractResponse<UpdateCheckoutItemPayload> {
    public UpdateCheckoutItemPayload() {
    }

    public UpdateCheckoutItemPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "checkoutitem": {
                    List<CheckoutItem> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<CheckoutItem> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            CheckoutItem optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new CheckoutItem(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "numUids": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

    public String getGraphQlTypeName() {
        return "UpdateCheckoutItemPayload";
    }

    /**
    * 
    */

    public List<CheckoutItem> getCheckoutitem() {
        return (List<CheckoutItem>) get("checkoutitem");
    }

    public UpdateCheckoutItemPayload setCheckoutitem(List<CheckoutItem> arg) {
        optimisticData.put(getKey("checkoutitem"), arg);
        return this;
    }

    /**
    * 
    */

    public Integer getNumUids() {
        return (Integer) get("numUids");
    }

    public UpdateCheckoutItemPayload setNumUids(Integer arg) {
        optimisticData.put(getKey("numUids"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "checkoutitem": return true;

            case "numUids": return false;

            default: return false;
        }
    }
}

