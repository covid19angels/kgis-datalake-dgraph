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
* 
*/
public class UpdateCheckoutItemPayloadTuery extends Tuery<UpdateCheckoutItemPayloadTuery> {
    UpdateCheckoutItemPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CheckoutitemArguments extends Arguments {
        CheckoutitemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CheckoutitemArguments filter(CheckoutItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutitemArguments order(CheckoutItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutitemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutitemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CheckoutitemArgumentsDefinition {
        void define(CheckoutitemArguments args);
    }

    /**
    * 
    */
    public UpdateCheckoutItemPayloadTuery checkoutitem(CheckoutItemTueryDefinition queryDef) {
        return checkoutitem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCheckoutItemPayloadTuery checkoutitem(CheckoutitemArgumentsDefinition argsDef, CheckoutItemTueryDefinition queryDef) {
        startField("checkoutitem");

        CheckoutitemArguments args = new CheckoutitemArguments(_queryBuilder);
        argsDef.define(args);
        CheckoutitemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateCheckoutItemPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
