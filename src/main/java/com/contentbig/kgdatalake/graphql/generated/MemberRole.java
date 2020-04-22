// Generated from graphql_java_gen gem with template Object.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.Utils;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* [��?会员角色】OrganizationRole的��?类，�??述会员关系,有时间��?制](http://cnschema.org/EmployeeRole)
*/
public class MemberRole extends AbstractResponse<MemberRole> implements Node, PartyRole, Thing {
    public MemberRole() {
    }

    public MemberRole(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "person": {
                    Person optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Person(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "roleName": {
                    PartyRoleName optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PartyRoleName(jsonAsObject(field.getValue(), key));
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

                case "number": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

    public MemberRole(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "MemberRole";
    }

    /**
    * 
    */

    public Person getPerson() {
        return (Person) get("person");
    }

    public MemberRole setPerson(Person arg) {
        optimisticData.put(getKey("person"), arg);
        return this;
    }

    /**
    * 
    */

    public PartyRoleName getRoleName() {
        return (PartyRoleName) get("roleName");
    }

    public MemberRole setRoleName(PartyRoleName arg) {
        optimisticData.put(getKey("roleName"), arg);
        return this;
    }

    /**
    * 
    */

    public DateTime getDateFrom() {
        return (DateTime) get("dateFrom");
    }

    public MemberRole setDateFrom(DateTime arg) {
        optimisticData.put(getKey("dateFrom"), arg);
        return this;
    }

    /**
    * 
    */

    public DateTime getDateThrough() {
        return (DateTime) get("dateThrough");
    }

    public MemberRole setDateThrough(DateTime arg) {
        optimisticData.put(getKey("dateThrough"), arg);
        return this;
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

    public MemberRole setNamespaces(List<Namespace> arg) {
        optimisticData.put(getKey("namespaces"), arg);
        return this;
    }

    /**
    * 
    */

    public String getIdentifier() {
        return (String) get("identifier");
    }

    public MemberRole setIdentifier(String arg) {
        optimisticData.put(getKey("identifier"), arg);
        return this;
    }

    /**
    * 
    */

    public String getName() {
        return (String) get("name");
    }

    public MemberRole setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * 
    */

    public String getAlternateName() {
        return (String) get("alternateName");
    }

    public MemberRole setAlternateName(String arg) {
        optimisticData.put(getKey("alternateName"), arg);
        return this;
    }

    /**
    * 
    */

    public String getDescription() {
        return (String) get("description");
    }

    public MemberRole setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    *     ��?会员编�?�】    
    */

    public String getNumber() {
        return (String) get("number");
    }

    public MemberRole setNumber(String arg) {
        optimisticData.put(getKey("number"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "person": return true;

            case "roleName": return true;

            case "dateFrom": return false;

            case "dateThrough": return false;

            case "id": return false;

            case "namespaces": return true;

            case "identifier": return false;

            case "name": return false;

            case "alternateName": return false;

            case "description": return false;

            case "number": return false;

            default: return false;
        }
    }
}

