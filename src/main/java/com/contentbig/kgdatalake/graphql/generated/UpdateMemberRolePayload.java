// Generated from graphql_java_gen gem with template Object.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* 
*/
public class UpdateMemberRolePayload extends AbstractResponse<UpdateMemberRolePayload> {
    public UpdateMemberRolePayload() {
    }

    public UpdateMemberRolePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "memberrole": {
                    List<MemberRole> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<MemberRole> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            MemberRole optional2 = null;
                            if (!element1.isJsonNull()) {
                                optional2 = new MemberRole(jsonAsObject(element1, key));
                            }

                            list1.add(optional2);
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "numUids": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

    public String getGraphQlTypeName() {
        return "UpdateMemberRolePayload";
    }

    /**
    * 
    */

    public List<MemberRole> getMemberrole() {
        return (List<MemberRole>) get("memberrole");
    }

    public UpdateMemberRolePayload setMemberrole(List<MemberRole> arg) {
        optimisticData.put(getKey("memberrole"), arg);
        return this;
    }

    /**
    * 
    */

    public Integer getNumUids() {
        return (Integer) get("numUids");
    }

    public UpdateMemberRolePayload setNumUids(Integer arg) {
        optimisticData.put(getKey("numUids"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "memberrole": return true;

            case "numUids": return false;

            default: return false;
        }
    }
}

