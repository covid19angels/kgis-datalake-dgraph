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
* ï¿½??è¿°äº§ï¿½ï¿½?çš„æ‰€æœ‰è€…æˆ–æ‰€å±žæœºæž„çš„ä¿¡ï¿½?ï¿½
*/
public class Ownership extends AbstractResponse<Ownership> implements Node, Thing {
    public Ownership() {
    }

    public Ownership(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "namespaces": {
                    List<Namespace> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Namespace> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new Namespace(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "identifier": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "alternateName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "acquiredFrom": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "owned": {
                    Thing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownThing.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "owner": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dateFrom": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dateThrough": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
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

    public Ownership(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Ownership";
    }

    /**
    * 
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * 
    */

    public List<Namespace> getNamespaces() {
        return (List<Namespace>) get("namespaces");
    }

    public Ownership setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Ownership setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Ownership setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Ownership setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Ownership setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?èŽ·ï¿½?ï¿½ï¿½?ï¿½ï¿½ï¿½?ã€‘ äº§ï¿½ï¿½?èŽ·ï¿½?ï¿½çš„æœºæž„ï¿½?ï¿½ï¿½ï¿½? The organization
    * or person from which the product was acquired.    
    */

    public Party getAcquiredFrom() {
        return (Party) get("acquiredFrom");
    }

    public Ownership setAcquiredFrom(Party arg) {
        optimisticData.put(getKey("acquiredFrom"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ä¸œè¥¿ç±»åž‹ã€‘ æ‹¥æœ‰çš„ä¸œè¥¿Thingã€‚    
    */

    public Thing getOwned() {
        return (Thing) get("owned");
    }

    public Ownership setOwned(Thing arg) {
        optimisticData.put(getKey("owned"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ä¸ªäººæˆ–ç»„ç»‡ã€‘æ‹¥æœ‰è€…    
    */

    public Party getOwner() {
        return (Party) get("owner");
    }

    public Ownership setOwner(Party arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?å¼€å§‹æ—¥æœŸã€‘ ï¿½ï¿½?äº‹çš„å¼€å§‹æ—¥æœŸå’Œæ—¶é—´    
    */

    public DateTime getDateFrom() {
        return (DateTime) get("dateFrom");
    }

    public Ownership setDateFrom(DateTime arg) {
        optimisticData.put(getKey("dateFrom"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ç»“ï¿½?ï¿½æ—¥æœŸã€‘ æ´»åŠ¨ï¼ˆäº‹ä»¶ï¼‰ç»“ï¿½?ï¿½æ—¶é—´ã€‚ The end date and time of the
    * item (in ISO 8601 date format).    
    */

    public DateTime getDateThrough() {
        return (DateTime) get("dateThrough");
    }

    public Ownership setDateThrough(DateTime arg) {
        optimisticData.put(getKey("dateThrough"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            case "acquiredFrom": return false;

            case "owned": return false;

            case "owner": return false;

            case "dateFrom": return false;

            case "dateThrough": return false;

            default: return false;
        }
    }
}

