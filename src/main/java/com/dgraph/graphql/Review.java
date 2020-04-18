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
* ï¿½ï¿½?è¯„è®ºã€‘å¯¹é¡¹ç›®çš„è¯„è®º - ä¾‹å¦‚å¯¹ï¿½?ï¿½å®¢æ–‡ç« çš„è¯„è®ºã€‚
* è¯¥è¯„è®ºçš„å†…å®¹æ˜¯é€šè¿‡textå±žæ€§è¡¨ç¤ºçš„ï¼Œå…¶ä¸»é¢˜é€šè¿‡aboutï¼Œä¸Žæ‰€æœ‰CreativeWorkså…±äº«
* çš„å±žæ€§ï¿½?ï¿½è¡¨è¾¾ A comment on an item - for example, a comment on a blog post. The comment's
* content is expressed via the text property, and its topic via about, properties shared with all
* CreativeWorks.
*/
public class Review extends AbstractResponse<Review> implements Node, Thing {
    public Review() {
    }

    public Review(JsonObject fields) throws SchemaViolationError {
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

                case "itemReviewed": {
                    Thing optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownThing.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reviewAspect": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reviewBody": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "ratingValue": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "author": {
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

    public Review(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Review";
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

    public Review setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Review setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Review setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Review setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Review setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     è¯„ä¼°çš„äº‹ç‰©ï¼ŒitemReviewed    Thing    The item that is being reviewed/rated.    
    */

    public Thing getItemReviewed() {
        return (Thing) get("itemReviewed");
    }

    public Review setItemReviewed(Thing arg) {
        optimisticData.put(getKey("itemReviewed"), arg);
        return this;
    }

    /**
    *     è¯„ä¼°æ–¹ï¿½?ï¿½ï¼Œ    reviewAspect    Text    This Review or Rating is relevant to this part or
    * facet of the itemReviewed.    
    */

    public String getReviewAspect() {
        return (String) get("reviewAspect");
    }

    public Review setReviewAspect(String arg) {
        optimisticData.put(getKey("reviewAspect"), arg);
        return this;
    }

    /**
    *     è¯„ä¼°è¯´æ˜Žçš„å…·ä½“å†…å®¹    reviewBody    Text    The actual body of the review.    
    */

    public String getReviewBody() {
        return (String) get("reviewBody");
    }

    public Review setReviewBody(String arg) {
        optimisticData.put(getKey("reviewBody"), arg);
        return this;
    }

    /**
    *     è¯„åˆ†ï¼ŒratingValue     The rating for the content.    
    */

    public Integer getRatingValue() {
        return (Integer) get("ratingValue");
    }

    public Review setRatingValue(Integer arg) {
        optimisticData.put(getKey("ratingValue"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ æ­¤å†…å®¹æˆ–è¯„åˆ†çš„ä½œè€…ã€‚    
    */

    public User getAuthor() {
        return (User) get("author");
    }

    public Review setAuthor(User arg) {
        optimisticData.put(getKey("author"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?åˆ›å»ºæ—¥æœŸã€‘ åˆ›ä½œå‡ºCreativeWorkçš„æ—¥æœŸã€‚    
    */

    public DateTime getDateCreated() {
        return (DateTime) get("dateCreated");
    }

    public Review setDateCreated(DateTime arg) {
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

            case "itemReviewed": return false;

            case "reviewAspect": return false;

            case "reviewBody": return false;

            case "ratingValue": return false;

            case "author": return true;

            case "dateCreated": return false;

            default: return false;
        }
    }
}

