// Generated from graphql_java_gen gem  with template Interface.java.erb

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

public interface Organization {
    String getGraphQlTypeName();

    List<Organization> getParentOrganization();

    List<Organization> getSubOrganizations();

    List<Organization> getDepartments();

    List<PartyRoleName> getHasPartyRoleName();
}

