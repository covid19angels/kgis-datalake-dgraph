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
* A Thing with an IDï¼Œåœ¨KGISå¹³ï¿½?ï¿½å†…æ‰€æœ‰å†…å®¹éƒ½æ˜¯ä¸œè¥¿Thing,ä¹Ÿå°±æ˜¯èµ„ï¿½ï¿½?Resource
*/

public interface Thing {
    String getGraphQlTypeName();

    List<Namespace> getNamespaces();

    String getIdentifier();

    String getName();

    String getAlternateName();

    String getDescription();
}

