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
* é¡¹ç›®ç»„ç»‡ï¼Œä»¥å®žçŽ°ç²¾å¿ƒè®¡åˆ’çš„ç‰¹å®šç›®æ ‡an individual or collaborative enterprise that is
* carefully planned to achieve a particular aim.
*/
public class Project extends AbstractResponse<Project> implements Node, Organization, Thing {
    public Project() {
    }

    public Project(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "parentOrganization": {
                    List<Organization> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Organization> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Organization optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownOrganization.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "subOrganizations": {
                    List<Organization> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Organization> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Organization optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownOrganization.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "departments": {
                    List<Organization> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Organization> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Organization optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownOrganization.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hasPartyRoleName": {
                    List<PartyRoleName> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<PartyRoleName> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            PartyRoleName optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new PartyRoleName(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

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

                case "availableConversations": {
                    List<Conversation> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Conversation> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Conversation optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new Conversation(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "defaultConversation": {
                    Conversation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Conversation(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "hasPart": {
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

                case "sponsor": {
                    List<Party> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<Party> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            Party optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = UnknownParty.create(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "managers": {
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

    public Project(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Project";
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

    public List<Organization> getParentOrganization() {
        return (List<Organization>) get("parentOrganization");
    }

    public Project setParentOrganization(List<Organization> arg) {
        optimisticData.put(getKey("parentOrganization"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getSubOrganizations() {
        return (List<Organization>) get("subOrganizations");
    }

    public Project setSubOrganizations(List<Organization> arg) {
        optimisticData.put(getKey("subOrganizations"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Organization> getDepartments() {
        return (List<Organization>) get("departments");
    }

    public Project setDepartments(List<Organization> arg) {
        optimisticData.put(getKey("departments"), arg);
        return this;
    }

    /**
    * 
    */

    public List<PartyRoleName> getHasPartyRoleName() {
        return (List<PartyRoleName>) get("hasPartyRoleName");
    }

    public Project setHasPartyRoleName(List<PartyRoleName> arg) {
        optimisticData.put(getKey("hasPartyRoleName"), arg);
        return this;
    }

    /**
    * 
    */

    public List<Namespace> getNamespaces() {
        return (List<Namespace>) get("namespaces");
    }

    public Project setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public Project setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public Project setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public Project setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Project setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     ï¿½?ï¿½ä»¥è®¿é—®çš„ä¼šï¿½ï¿½?    
    */

    public List<Conversation> getAvailableConversations() {
        return (List<Conversation>) get("availableConversations");
    }

    public Project setAvailableConversations(List<Conversation> arg) {
        optimisticData.put(getKey("availableConversations"), arg);
        return this;
    }

    /**
    *     æœ¬ç»„ç»‡é»˜è®¤ï¿½?ï¿½è®¿é—®çš„ä¼šï¿½ï¿½?    
    */

    public Conversation getDefaultConversation() {
        return (Conversation) get("defaultConversation");
    }

    public Project setDefaultConversation(Conversation arg) {
        optimisticData.put(getKey("defaultConversation"), arg);
        return this;
    }

    /**
    *     ï¿½?ï¿½ç…§(ç»„ç»‡ä¹‹é—´æˆ–ç‰¹å®šä¸»é¢˜çš„äººå‘˜ä¹‹é—´çš„ä¸€ä¸ªæˆ–å¤šä¸ªæ¶ˆï¿½?ï¿½ã€‚
    * ï¿½?ï¿½ä»¥ä½¿ç”¨isPartOfæˆ–hasPartå±žæ€§å°†ä¸ªäººæ¶ˆï¿½?ï¿½é“¾æŽ¥åˆ°ä¼šï¿½ï¿½?ã€‚)    
    */

    public List<Task> getHasPart() {
        return (List<Task>) get("hasPart");
    }

    public Project setHasPart(List<Task> arg) {
        optimisticData.put(getKey("hasPart"), arg);
        return this;
    }

    /**
    *     é¡¹ç›®ä¸šä¸»èµžåŠ©äºº    
    */

    public List<Party> getSponsor() {
        return (List<Party>) get("sponsor");
    }

    public Project setSponsor(List<Party> arg) {
        optimisticData.put(getKey("sponsor"), arg);
        return this;
    }

    /**
    *     é¡¹ç›®ç®¡ï¿½?ï¿½å‘˜    
    */

    public List<User> getManagers() {
        return (List<User>) get("managers");
    }

    public Project setManagers(List<User> arg) {
        optimisticData.put(getKey("managers"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "parentOrganization": return false;

            case "subOrganizations": return false;

            case "departments": return false;

            case "hasPartyRoleName": return true;

            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            case "availableConversations": return true;

            case "defaultConversation": return true;

            case "hasPart": return true;

            case "sponsor": return false;

            case "managers": return true;

            default: return false;
        }
    }
}

