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
* ç½‘ç»œé’©ï¿½ï¿½?æ˜¯â€œç”¨æˆ·å®šä¹‰çš„HTTPå›žè°ƒï¿½ï¿½?ã€‚[2]ç½‘ç»œé’©ï¿½ï¿½?é€šå¸¸è¢«ï¿½ï¿½?äº›äº‹ä»
* ¶æ¿€æ´»ï¼Œæ¯”å¦‚å°†ä»£ï¿½ï¿½?æŽ¨ï¿½ï¿½?åˆ°ï¿½ï¿½?[3]æˆ–è¯„è®ºï¿½?ï¿½å®¢ã€‚[4]å½“æ­¤äº‹ä»¶ï¿½?ï¿½ç”Ÿæ
* —¶ï¼ŒåŽŸç½‘ç«™å°†ï¿½?ï¿½ä¸ºç½‘ç»œé’©ï¿½ï¿½?ï¿½ï¿½?ç½®çš„URLï¿½?ï¿½ï¿½ï¿½?HTTPè¯·æ±‚ã€‚ç”¨æˆ·ï¿½?ï¿½ï
* ¿½ï¿½?ç½®å®ƒä»¬å¼•ï¿½?ï¿½ç½‘é¡µä¸Šçš„äº‹ä»¶ä»¥è°ƒç”¨ï¿½?ï¿½ä¸€ä¸ªç½‘ç«™çš„è¡Œä¸ºã€‚Webhooks allow
* external services to be notified when certain events happen.
*/
public class Webhook extends AbstractResponse<Webhook> implements Node, Thing {
    public Webhook() {
    }

    public Webhook(JsonObject fields) throws SchemaViolationError {
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

                case "payloadUrl": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "contentType": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "secret": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "client": {
                    SoftwareApplication optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new SoftwareApplication(jsonAsObject(field.getValue(), key));
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

    public Webhook(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Webhook";
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

    public Webhook setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Webhook setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Webhook setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Webhook setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Webhook setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     å›žè°ƒurl    
    */

    public String getPayloadUrl() {
        return (String) get("payloadUrl");
    }

    public Webhook setPayloadUrl(String arg) {
        optimisticData.put(getKey("payloadUrl"), arg);
        return this;
    }

    /**
    *     å›žè°ƒï¿½??äº¤çš„æ•°ï¿½?ï¿½å†…å®¹ç±»åž‹å¦‚application/json    
    */

    public String getContentType() {
        return (String) get("contentType");
    }

    public Webhook setContentType(String arg) {
        optimisticData.put(getKey("contentType"), arg);
        return this;
    }

    /**
    *     ä½¿ç”¨payloadUrlçš„å®‰å…¨token    
    */

    public String getSecret() {
        return (String) get("secret");
    }

    public Webhook setSecret(String arg) {
        optimisticData.put(getKey("secret"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */

    public User getCreator() {
        return (User) get("creator");
    }

    public Webhook setCreator(User arg) {
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

    public Webhook setDateCreated(DateTime arg) {
        optimisticData.put(getKey("dateCreated"), arg);
        return this;
    }

    /**
    *     è°ƒç”¨æ­¤webhookçš„å®¢æˆ·ç«¯    
    */

    public SoftwareApplication getClient() {
        return (SoftwareApplication) get("client");
    }

    public Webhook setClient(SoftwareApplication arg) {
        optimisticData.put(getKey("client"), arg);
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

            case "payloadUrl": return false;

            case "contentType": return false;

            case "secret": return false;

            case "creator": return true;

            case "dateCreated": return false;

            case "client": return true;

            default: return false;
        }
    }
}

