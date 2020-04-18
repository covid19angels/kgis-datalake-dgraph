// Generated from graphql_java_gen gem  with template Tuery.java.erb

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
* ï¿½?ï¿½è´­ç‰©ï¼šï¿½?ï¿½ä»¥è´­ä¹°è®¢è´­çš„äº§ï¿½ï¿½?æˆ–ï¿½ï¿½?åŠ¡Productï¼ŒService
*/
public class SaleableTuery extends Tuery<SaleableTuery> {
    SaleableTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    *     ï¿½?ï¿½ä»¥è´­ä¹°è®¢è´­çš„äº§ï¿½ï¿½?æˆ–ï¿½ï¿½?åŠ¡Productï¼ŒService    
    */
    public SaleableTuery isSaleable() {
        startField("isSaleable");

        return this;
    }

    public SaleableTuery onProduct(ProductTueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleableTuery onProductModel(ProductModelTueryDefinition queryDef) {
        startInlineFragment("ProductModel");
        queryDef.define(new ProductModelTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
