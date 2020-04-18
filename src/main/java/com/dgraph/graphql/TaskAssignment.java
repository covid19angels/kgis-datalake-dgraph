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
* ä»»åŠ¡åˆ†æ´¾
*/
public class TaskAssignment extends AbstractResponse<TaskAssignment> implements Node, Thing {
    public TaskAssignment() {
    }

    public TaskAssignment(JsonObject fields) throws SchemaViolationError {
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
                    Task optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Task(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "comment": {
                    Review optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Review(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "assignee": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "assigner": {
                    Party optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownParty.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "readAt": {
                    responseData.put(key, Utils.parseDateTime(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "acceptedAt": {
                    responseData.put(key, Utils.parseDateTime(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "assignedAt": {
                    responseData.put(key, Utils.parseDateTime(jsonAsString(field.getValue(), key)));

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

    public TaskAssignment(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "TaskAssignment";
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

    public TaskAssignment setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public TaskAssignment setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public TaskAssignment setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public TaskAssignment setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public TaskAssignment setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     ç›¸å…³ä»»åŠ¡    
    */

    public Task getAbout() {
        return (Task) get("about");
    }

    public TaskAssignment setAbout(Task arg) {
        optimisticData.put(getKey("about"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡æœ¬æ¬¡åˆ†ï¿½ï¿½?è¯´æ˜Ž    
    */

    public Review getComment() {
        return (Review) get("comment");
    }

    public TaskAssignment setComment(Review arg) {
        optimisticData.put(getKey("comment"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡æ‰§è¡Œäºº    
    */

    public Party getAssignee() {
        return (Party) get("assignee");
    }

    public TaskAssignment setAssignee(Party arg) {
        optimisticData.put(getKey("assignee"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡åˆ†ï¿½ï¿½?äºº    
    */

    public Party getAssigner() {
        return (Party) get("assigner");
    }

    public TaskAssignment setAssigner(Party arg) {
        optimisticData.put(getKey("assigner"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡æ‰§è¡Œäººé˜…è¯»æ—¶é—´    
    */

    public DateTime getReadAt() {
        return (DateTime) get("readAt");
    }

    public TaskAssignment setReadAt(DateTime arg) {
        optimisticData.put(getKey("readAt"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡æ‰§è¡ŒäººæŽ¥æ”¶æ—¶é—´    
    */

    public DateTime getAcceptedAt() {
        return (DateTime) get("acceptedAt");
    }

    public TaskAssignment setAcceptedAt(DateTime arg) {
        optimisticData.put(getKey("acceptedAt"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡åˆ†ï¿½ï¿½?æ—¶é—´    
    */

    public DateTime getAssignedAt() {
        return (DateTime) get("assignedAt");
    }

    public TaskAssignment setAssignedAt(DateTime arg) {
        optimisticData.put(getKey("assignedAt"), arg);
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

            case "about": return true;

            case "comment": return true;

            case "assignee": return false;

            case "assigner": return false;

            case "readAt": return false;

            case "acceptedAt": return false;

            case "assignedAt": return false;

            default: return false;
        }
    }
}

