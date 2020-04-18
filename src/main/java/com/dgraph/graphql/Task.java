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
* å·¥ï¿½?ï¿½æˆ–ä»»åŠ¡ï¼Œéœ€ï¿½ï¿½?è®¡åˆ’åœ¨ï¿½ï¿½?æ®µæ—¶é—´å†…å®Œï¿½ï¿½?çš„å·¥ä½œ
*/
public class Task extends AbstractResponse<Task> implements Node, Thing {
    public Task() {
    }

    public Task(JsonObject fields) throws SchemaViolationError {
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
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isPartOf": {
                    Project optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Project(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "wbsNO": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "priority": {
                    TaskPriority optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = TaskPriority.fromGraphQl(jsonAsString(field.getValue(), key));
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

                case "watcher": {
                    List<User> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<User> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            User optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new User(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "planStart": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "planFinish": {
                    DateTime optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Utils.parseDateTime(jsonAsString(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "percentComplete": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, Utils.parseDateTime(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "updatedAt": {
                    responseData.put(key, Utils.parseDateTime(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "parentTask": {
                    Task optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Task(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "previousTask": {
                    Task optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Task(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subTasks": {
                    List<Task> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Task> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Task optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Task(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dependsOn": {
                    List<Task> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Task> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Task optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Task(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "assignments": {
                    List<TaskAssignment> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<TaskAssignment> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            TaskAssignment optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new TaskAssignment(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "status": {
                    TaskStatus optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = TaskStatus.fromGraphQl(jsonAsString(field.getValue(), key));
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

    public Task(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Task";
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

    public Task setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Task setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Task setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Task setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Task setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     The subject matter of the content.    
    */

    public Issue getAbout() {
        return (Issue) get("about");
    }

    public Task setAbout(Issue arg) {
        optimisticData.put(getKey("about"), arg);
        return this;
    }

    /**
    *     ï¿½?ï¿½ç…§(ç»„ç»‡ä¹‹é—´æˆ–ç‰¹å®šä¸»é¢˜çš„äººå‘˜ä¹‹é—´çš„ä¸€ä¸ªæˆ–å¤šä¸ªæ¶ˆï¿½?ï¿½ã€‚
    * ï¿½?ï¿½ä»¥ä½¿ç”¨isPartOfæˆ–hasPartå±žæ€§å°†ä¸ªäººæ¶ˆï¿½?ï¿½é“¾æŽ¥åˆ°ä¼šï¿½ï¿½?ã€‚)    
    */

    public Project getIsPartOf() {
        return (Project) get("isPartOf");
    }

    public Task setIsPartOf(Project arg) {
        optimisticData.put(getKey("isPartOf"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡WBSç¼–ï¿½?ï¿½    
    */

    public String getWbsNo() {
        return (String) get("wbsNO");
    }

    public Task setWbsNo(String arg) {
        optimisticData.put(getKey("wbsNO"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡ä¼˜å…ˆçº§    
    */

    public TaskPriority getPriority() {
        return (TaskPriority) get("priority");
    }

    public Task setPriority(TaskPriority arg) {
        optimisticData.put(getKey("priority"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡åˆ›å»ºäºº    
    */

    public User getCreator() {
        return (User) get("creator");
    }

    public Task setCreator(User arg) {
        optimisticData.put(getKey("creator"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡å…³æ³¨äºº    
    */

    public List<User> getWatcher() {
        return (List<User>) get("watcher");
    }

    public Task setWatcher(List<User> arg) {
        optimisticData.put(getKey("watcher"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡è®¡åˆ’å¼€å§‹æ—¶é—´    
    */

    public DateTime getPlanStart() {
        return (DateTime) get("planStart");
    }

    public Task setPlanStart(DateTime arg) {
        optimisticData.put(getKey("planStart"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡è®¡åˆ’ç»“ï¿½?ï¿½æ—¶é—´    
    */

    public DateTime getPlanFinish() {
        return (DateTime) get("planFinish");
    }

    public Task setPlanFinish(DateTime arg) {
        optimisticData.put(getKey("planFinish"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡å®Œï¿½ï¿½?ç™¾åˆ†æ¯”    
    */

    public Integer getPercentComplete() {
        return (Integer) get("percentComplete");
    }

    public Task setPercentComplete(Integer arg) {
        optimisticData.put(getKey("percentComplete"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡åˆ›å»ºæ—¶é—´    
    */

    public DateTime getCreatedAt() {
        return (DateTime) get("createdAt");
    }

    public Task setCreatedAt(DateTime arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡ä¿®æ”¹æ—¶é—´    
    */

    public DateTime getUpdatedAt() {
        return (DateTime) get("updatedAt");
    }

    public Task setUpdatedAt(DateTime arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡ä¸Šçº§    
    */

    public Task getParentTask() {
        return (Task) get("parentTask");
    }

    public Task setParentTask(Task arg) {
        optimisticData.put(getKey("parentTask"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡ï¿½ï¿½?ä¸€ï¿½?ï¿½    
    */

    public Task getPreviousTask() {
        return (Task) get("previousTask");
    }

    public Task setPreviousTask(Task arg) {
        optimisticData.put(getKey("previousTask"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡ä¸‹çº§    
    */

    public List<Task> getSubTasks() {
        return (List<Task>) get("subTasks");
    }

    public Task setSubTasks(List<Task> arg) {
        optimisticData.put(getKey("subTasks"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡ï¿½ï¿½?èµ–    
    */

    public List<Task> getDependsOn() {
        return (List<Task>) get("dependsOn");
    }

    public Task setDependsOn(List<Task> arg) {
        optimisticData.put(getKey("dependsOn"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡åˆ†ï¿½ï¿½?åŽ†ï¿½?ï¿½    
    */

    public List<TaskAssignment> getAssignments() {
        return (List<TaskAssignment>) get("assignments");
    }

    public Task setAssignments(List<TaskAssignment> arg) {
        optimisticData.put(getKey("assignments"), arg);
        return this;
    }

    /**
    *     ä»»åŠ¡çŠ¶ï¿½ï¿½?    
    */

    public TaskStatus getStatus() {
        return (TaskStatus) get("status");
    }

    public Task setStatus(TaskStatus arg) {
        optimisticData.put(getKey("status"), arg);
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

            case "isPartOf": return true;

            case "wbsNO": return false;

            case "priority": return false;

            case "creator": return true;

            case "watcher": return true;

            case "planStart": return false;

            case "planFinish": return false;

            case "percentComplete": return false;

            case "createdAt": return false;

            case "updatedAt": return false;

            case "parentTask": return true;

            case "previousTask": return true;

            case "subTasks": return true;

            case "dependsOn": return true;

            case "assignments": return true;

            case "status": return false;

            default: return false;
        }
    }
}

