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
* ï¿½??è¿°äº§ï¿½ï¿½?çš„æ‰€æœ‰è€…æˆ–æ‰€å±žæœºæž„çš„ä¿¡ï¿½?ï¿½
*/
public class OwnershipTuery extends Tuery<OwnershipTuery> {
    OwnershipTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public OwnershipTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public OwnershipTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public OwnershipTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public OwnershipTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public OwnershipTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public OwnershipTuery description() {
        startField("description");

        return this;
    }

    /**
    *     ï¿½ï¿½?èŽ·ï¿½?ï¿½ï¿½?ï¿½ï¿½ï¿½?ã€‘ äº§ï¿½ï¿½?èŽ·ï¿½?ï¿½çš„æœºæž„ï¿½?ï¿½ï¿½ï¿½? The organization
    * or person from which the product was acquired.    
    */
    public OwnershipTuery acquiredFrom(PartyTueryDefinition queryDef) {
        startField("acquiredFrom");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OwnedArguments extends Arguments {
        OwnedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OwnedArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface OwnedArgumentsDefinition {
        void define(OwnedArguments args);
    }

    /**
    *     ï¿½ï¿½?ä¸œè¥¿ç±»åž‹ã€‘ æ‹¥æœ‰çš„ä¸œè¥¿Thingã€‚    
    */
    public OwnershipTuery owned(ThingTueryDefinition queryDef) {
        return owned(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ä¸œè¥¿ç±»åž‹ã€‘ æ‹¥æœ‰çš„ä¸œè¥¿Thingã€‚    
    */
    public OwnershipTuery owned(OwnedArgumentsDefinition argsDef, ThingTueryDefinition queryDef) {
        startField("owned");

        OwnedArguments args = new OwnedArguments(_queryBuilder);
        argsDef.define(args);
        OwnedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ï¿½ï¿½?ä¸ªäººæˆ–ç»„ç»‡ã€‘æ‹¥æœ‰è€…    
    */
    public OwnershipTuery owner(PartyTueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ï¿½ï¿½?å¼€å§‹æ—¥æœŸã€‘ ï¿½ï¿½?äº‹çš„å¼€å§‹æ—¥æœŸå’Œæ—¶é—´    
    */
    public OwnershipTuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    *     ï¿½ï¿½?ç»“ï¿½?ï¿½æ—¥æœŸã€‘ æ´»åŠ¨ï¼ˆäº‹ä»¶ï¼‰ç»“ï¿½?ï¿½æ—¶é—´ã€‚ The end date and time of the
    * item (in ISO 8601 date format).    
    */
    public OwnershipTuery dateThrough() {
        startField("dateThrough");

        return this;
    }
}
