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
* Canonical URL: http://cnschema.org/DataCatalogï¿½ï¿½?æ•°ï¿½?ï¿½ç›®å½•ã€‘æ•°ï¿½?ï¿½é›†çš„ç›®å½• A
* collection of datasets.
*/
public class DataCatalog extends AbstractResponse<DataCatalog> implements Node, Thing {
    public DataCatalog() {
    }

    public DataCatalog(JsonObject fields) throws SchemaViolationError {
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

                case "parentDataCatalog": {
                    DataCatalog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DataCatalog(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subDataCatalogs": {
                    List<DataCatalog> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<DataCatalog> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            DataCatalog optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new DataCatalog(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "creator": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dateCreated": {
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

    public DataCatalog(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "DataCatalog";
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

    public DataCatalog setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public DataCatalog setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public DataCatalog setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public DataCatalog setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public DataCatalog setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?æ‰€åœ¨çˆ¶æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘æ‰€åœ¨çš„çˆ¶æ•°ï¿½?ï¿½é›†ç›®å½• A data catalog which
    * contains this dataset.    
    */

    public DataCatalog getParentDataCatalog() {
        return (DataCatalog) get("parentDataCatalog");
    }

    public DataCatalog setParentDataCatalog(DataCatalog arg) {
        optimisticData.put(getKey("parentDataCatalog"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?åŒ…ï¿½?ï¿½ï¿½ï¿½?æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘åŒ…ï¿½?ï¿½ï¿½ï¿½?çš„æ•°ï¿½?ï¿½é›†ç›®å½•    
    */

    public List<DataCatalog> getSubDataCatalogs() {
        return (List<DataCatalog>) get("subDataCatalogs");
    }

    public DataCatalog setSubDataCatalogs(List<DataCatalog> arg) {
        optimisticData.put(getKey("subDataCatalogs"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */

    public User getCreator() {
        return (User) get("creator");
    }

    public DataCatalog setCreator(User arg) {
        optimisticData.put(getKey("creator"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?åˆ›å»ºæ—¥æœŸã€‘ åˆ›ä½œå‡ºCreativeWorkçš„æ—¥æœŸã€‚ The date on which the CreativeWork was
    * created or the item was added to a DataFeed. dateCreated    DateTime or Date or DataFeedItem or
    * CreativeWork    
    */

    public DateTime getDateCreated() {
        return (DateTime) get("dateCreated");
    }

    public DataCatalog setDateCreated(DateTime arg) {
        optimisticData.put(getKey("dateCreated"), arg);
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

            case "parentDataCatalog": return true;

            case "subDataCatalogs": return true;

            case "creator": return true;

            case "dateCreated": return false;

            default: return false;
        }
    }
}

