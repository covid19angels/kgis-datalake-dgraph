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
* ï¿½ï¿½?æœºæž„ã€‘ä¸€ä¸ªç»„ç»‡ï¼Œä¾‹å¦‚å­¦æ ¡ï¿½ï¿½?ï¿½?ï¿½æ”¿åºœç»„ç»‡ï¿½ï¿½?å…¬ï¿½?ï¿½ï¿½ï¿½?ä¿±ï¿½ï
* ¿½?éƒ¨ç­‰,ä¹Ÿï¿½?ï¿½ç”¨äºŽä¸´æ—¶å‡ ä¸ªäººç»„ï¿½ï¿½?çš„ï¿½?ï¿½å¤©ï¿½ï¿½?ç»„ï¼Œæˆ¿é—´
*/
public class UnknownOrganization extends AbstractResponse<UnknownOrganization> implements Organization {
    public UnknownOrganization() {
    }

    public UnknownOrganization(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static Organization create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "GeneralOrganization": {
                return new GeneralOrganization(fields);
            }

            case "Project": {
                return new Project(fields);
            }

            case "Store": {
                return new Store(fields);
            }

            default: {
                return new UnknownOrganization(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    *     ï¿½ï¿½?ä¸Šçº§ç»„ç»‡ã€‘
    * subOrganizationçš„ï¿½??ï¿½?ï¿½å±žæ€§ï¼Œï¿½?ï¿½åŒ…ï¿½?ï¿½è¿™ä¸ªç»„ç»‡çš„æ›´å¤§ç»„ç»‡    
    */

    public List<Organization> getParentOrganization() {
        return (List<Organization>) get("parentOrganization");
    }

    public UnknownOrganization setParentOrganization(List<Organization> arg) {
        optimisticData.put(getKey("parentOrganization"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?ï¿½ï¿½?æœºæž„ã€‘
    * ä¸¤ä¸ªç»„ç»‡ä¹‹é—´çš„å…³ç³»ã€‚å…¶ä¸­ç¬¬äºŒä¸ªç»„ç»‡ï¼Œä¾‹å¦‚ä»¥ï¿½ï¿½?å…¬ï¿½?ï¿½çš„ï¿½??å­—ï¼Œå±žäºŽ
    * ç¬¬ä¸€ä¸ªç»„ç»‡ã€‚    
    */

    public List<Organization> getSubOrganizations() {
        return (List<Organization>) get("subOrganizations");
    }

    public UnknownOrganization setSubOrganizations(List<Organization> arg) {
        optimisticData.put(getKey("subOrganizations"), arg);
        return this;
    }

    /**
    *     ï¿½ï¿½?éƒ¨é—¨ã€‘
    * ç»„ç»‡ä¸Žè¯¥ç»„ç»‡ï¿½ï¿½?ä¸ªéƒ¨é—¨ä¹‹é—´çš„å…³ç³»ï¼Œä¹Ÿè¢«ï¿½??è¿°ï¿½ï¿½?ç»„ç»‡ï¼ˆï¿½ï¿½?è®¸ï¿½ï¿½?ï
    * ¿½?ï¿½çš„ç½‘ï¿½?ï¿½ï¼Œæ ‡è¯†ï¼Œå¼€æ”¾æ—¶é—´ï¼‰ã€‚
    * ä¾‹å¦‚ï¼šä¸€å®¶æœ‰ï¿½?ï¿½åº—çš„å•†åº—ï¼Œæˆ–è€…æ˜¯ä¸€é—´å¸¦å’–å•¡åŽ…çš„ï¿½?ï¿½åŒ…åº—ã€‚ A
    * relationship between an organization and a department of that organization, also described as an
    * organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy,
    * or a bakery with a cafe.    
    */

    public List<Organization> getDepartments() {
        return (List<Organization>) get("departments");
    }

    public UnknownOrganization setDepartments(List<Organization> arg) {
        optimisticData.put(getKey("departments"), arg);
        return this;
    }

    /**
    *     ç»„ç»‡å®šä¹‰çš„è§’è‰²ï¿½??ç§°,hasPartyRoleName,é€†å±žæ€§ PartyRoleName.isPartyRoleNameOf    
    */

    public List<PartyRoleName> getHasPartyRoleName() {
        return (List<PartyRoleName>) get("hasPartyRoleName");
    }

    public UnknownOrganization setHasPartyRoleName(List<PartyRoleName> arg) {
        optimisticData.put(getKey("hasPartyRoleName"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "parentOrganization": return false;

            case "subOrganizations": return false;

            case "departments": return false;

            case "hasPartyRoleName": return true;

            default: return false;
        }
    }
}

