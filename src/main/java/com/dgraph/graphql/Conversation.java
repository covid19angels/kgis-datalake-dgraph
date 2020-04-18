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
* ï¿½ï¿½?å¯¹ï¿½ï¿½?ã€‘ç»„ç»‡ä¹‹é—´æˆ–ç‰¹å®šä¸»é¢˜çš„äººå‘˜ä¹‹é—´çš„ä¸€ä¸ªæˆ–å¤šä¸ªæ¶ˆï¿½?ï¿½ã€‚
* ï¿½?ï¿½ä»¥ä½¿ç”¨isPartOfæˆ–hasPartå±žæ€§å°†ä¸ªäººæ¶ˆï¿½?ï¿½é“¾æŽ¥åˆ°ä¼šï¿½ï¿½?ã€‚ One or more
* messages between organizations or people on a particular topic. Individual messages can be linked to
* the conversation with isPartOf or hasPart properties.
*/
public class Conversation extends AbstractResponse<Conversation> implements Node, Thing {
    public Conversation() {
    }

    public Conversation(JsonObject fields) throws SchemaViolationError {
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

                case "about": {
                    Thing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownThing.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "accountablePerson": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
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

                case "includedInDataCatalog": {
                    DataCatalog optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DataCatalog(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hasMessages": {
                    List<Message> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Message> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Message optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Message(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "webhook": {
                    List<Webhook> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Webhook> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Webhook optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Webhook(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
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

    public Conversation(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Conversation";
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

    public Conversation setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Conversation setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Conversation setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Conversation setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Conversation setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?å…³äºŽã€‘ äº‹ç‰©çš„å…³äºŽä¿¡ï¿½?ï¿½ The subject matter of the content.    
    */

    public Thing getAbout() {
        return (Thing) get("about");
    }

    public Conversation setAbout(Thing arg) {
        optimisticData.put(getKey("about"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?è´Ÿè´£äººã€‘ å¯¹CreativeWorkè´Ÿæœ‰æ³•å¾‹è´£ä»»çš„ç‰¹å®šçš„äººã€‚ Specifies the Person
    * that is legally accountable for the CreativeWork.    
    */

    public User getAccountablePerson() {
        return (User) get("accountablePerson");
    }

    public Conversation setAccountablePerson(User arg) {
        optimisticData.put(getKey("accountablePerson"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */

    public User getCreator() {
        return (User) get("creator");
    }

    public Conversation setCreator(User arg) {
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

    public Conversation setDateCreated(DateTime arg) {
        optimisticData.put(getKey("dateCreated"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?æ‰€åœ¨æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘æ‰€åœ¨çš„æ•°ï¿½?ï¿½é›†ç›®å½• A data catalog which contains
    * this dataset.    
    */

    public DataCatalog getIncludedInDataCatalog() {
        return (DataCatalog) get("includedInDataCatalog");
    }

    public Conversation setIncludedInDataCatalog(DataCatalog arg) {
        optimisticData.put(getKey("includedInDataCatalog"), arg);
        return this;
    }

    /**
    *     ï¿½?ï¿½ç…§ hasPartï¿½ï¿½?ä½œï¿½ï¿½?ç»„ä»¶ã€‘
    * è¡¨ç¤ºï¿½ï¿½?ä¸ªä½œï¿½ï¿½?æ˜¯è¯¥ä½œï¿½ï¿½?çš„ä¸€éƒ¨åˆ†    
    */

    public List<Message> getHasMessages() {
        return (List<Message>) get("hasMessages");
    }

    public Conversation setHasMessages(List<Message> arg) {
        optimisticData.put(getKey("hasMessages"), arg);
        return this;
    }

    /**
    *    
    * æœ¬ä¼šï¿½ï¿½?Conversationç»™ç¬¬ä¸‰æ–¹è½¯ä»¶å¦‚Githubï¿½ï¿½?é˜¿é‡Œäº‘ä»£ï¿½ï¿½?åˆ›å»ºçš„webhookï¼Œç¬¬
    * ä¸‰æ–¹è½¯ä»¶ï¿½?ï¿½æœ¬ä¼šï¿½ï¿½?æŽ¨ï¿½ï¿½?äº‹ä»¶æ¶ˆï¿½?ï¿½    
    */

    public List<Webhook> getWebhook() {
        return (List<Webhook>) get("webhook");
    }

    public Conversation setWebhook(List<Webhook> arg) {
        optimisticData.put(getKey("webhook"), arg);
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

            case "about": return false;

            case "accountablePerson": return true;

            case "creator": return true;

            case "dateCreated": return false;

            case "includedInDataCatalog": return true;

            case "hasMessages": return true;

            case "webhook": return true;

            default: return false;
        }
    }
}

