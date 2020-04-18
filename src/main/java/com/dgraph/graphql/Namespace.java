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
* èµ„ï¿½ï¿½?å¯¹è±¡æ‰€å±žçš„namespace,æ ¹ï¿½?ï¿½ä¸€å®šè§„åˆ™ç”±å¹³ï¿½?ï¿½ç”Ÿï¿½ï¿½?æˆ–ï¿½ï¿½?ç½®å®šä¹‰å
* ¦‚ï¼šio.shurui.store001.order,
* é»˜è®¤å€¼æ˜¯defaultå¦‚æžœï¿½ï¿½?ä¸ªè§’è‰²æ‹¥æœ‰inamespaceï¼š'io.shurui'çš„ï¿½?ï¿½ï¿½ï¿½?ï¼Œåˆ™æ‹¥æœ‰
* 'io.shurui'ä¸€ä¸‹æ‰€æœ‰ï¿½ï¿½?namespaceçš„ç›¸åº”ï¿½?ï¿½ï¿½ï¿½?
*/
public class Namespace extends AbstractResponse<Namespace> implements Node, Thing {
    public Namespace() {
    }

    public Namespace(JsonObject fields) throws SchemaViolationError {
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

                case "namespace": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isNamespaceOf": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
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

    public Namespace(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Namespace";
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

    public Namespace setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Namespace setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Namespace setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Namespace setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Namespace setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *    
    * èµ„ï¿½ï¿½?å¯¹è±¡æ‰€å±žçš„namespace,æ ¹ï¿½?ï¿½ä¸€å®šè§„åˆ™ç”±å¹³ï¿½?ï¿½ç”Ÿï¿½ï¿½?æˆ–ï¿½ï¿½?ç½®å®šä¹‰å
    * ¦‚ï¼šio.shurui.store001.order, é»˜è®¤å€¼æ˜¯default   
    * å¦‚æžœï¿½ï¿½?ä¸ªè§’è‰²æ‹¥æœ‰inamespaceï¼š'io.shurui'çš„ï¿½?ï¿½ï¿½ï¿½?ï¼Œåˆ™æ‹¥æœ‰'io.shurui'ä¸€ä¸‹æ‰
    * €æœ‰ï¿½ï¿½?namespaceçš„ç›¸åº”ï¿½?ï¿½ï¿½ï¿½?    
    */

    public String getNamespace() {
        return (String) get("namespace");
    }

    public Namespace setNamespace(String arg) {
        optimisticData.put(getKey("namespace"), arg);
        return this;
    }

    /**
    *     æ‹¥æœ‰namespaceçš„ç»„ç»‡æˆ–ç”¨æˆ·    
    */

    public Party getIsNamespaceOf() {
        return (Party) get("isNamespaceOf");
    }

    public Namespace setIsNamespaceOf(Party arg) {
        optimisticData.put(getKey("isNamespaceOf"), arg);
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

            case "namespace": return false;

            case "isNamespaceOf": return false;

            default: return false;
        }
    }
}

