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
* å•†ï¿½ï¿½?ä¾›åº”
*/
public class Offer extends AbstractResponse<Offer> implements Node, Thing {
    public Offer() {
    }

    public Offer(JsonObject fields) throws SchemaViolationError {
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

                case "itemOffered": {
                    Saleable optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownSaleable.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "offeredBy": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "price": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

    public Offer(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Offer";
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

    public Offer setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Offer setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Offer setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Offer setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Offer setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     ï¿½?ï¿½è´­ç‰©çš„ä¸€ä¸ªå•†ï¿½ï¿½?ä¾›åº”    
    */

    public Saleable getItemOffered() {
        return (Saleable) get("itemOffered");
    }

    public Offer setItemOffered(Saleable arg) {
        optimisticData.put(getKey("itemOffered"), arg);
        return this;
    }

    /**
    *     ä¾›åº”å•†ï¿½ï¿½?çš„ç»„ç»‡æˆ–ä¸ªäºº Inverse property: makesOffer.    
    */

    public Party getOfferedBy() {
        return (Party) get("offeredBy");
    }

    public Offer setOfferedBy(Party arg) {
        optimisticData.put(getKey("offeredBy"), arg);
        return this;
    }

    /**
    *     å•†ï¿½ï¿½?ä»·æ ¼The offer price of a product, or of a price component when attached to
    * PriceSpecification and its subtypes.    
    */

    public Integer getPrice() {
        return (Integer) get("price");
    }

    public Offer setPrice(Integer arg) {
        optimisticData.put(getKey("price"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ä»·æ ¼æœ‰æ•ˆå¼€å§‹æ—¥æœŸã€‘    
    */

    public DateTime getDateFrom() {
        return (DateTime) get("dateFrom");
    }

    public Offer setDateFrom(DateTime arg) {
        optimisticData.put(getKey("dateFrom"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ä»·æ ¼æœ‰æ•ˆç»“ï¿½?ï¿½æ—¥æœŸã€‘    
    */

    public DateTime getDateThrough() {
        return (DateTime) get("dateThrough");
    }

    public Offer setDateThrough(DateTime arg) {
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

            case "itemOffered": return false;

            case "offeredBy": return false;

            case "price": return false;

            case "dateFrom": return false;

            case "dateThrough": return false;

            default: return false;
        }
    }
}

