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
* èµ„ï¿½ï¿½?å¯¹è±¡æ‰€å±žçš„namespace,æ ¹ï¿½?ï¿½ä¸€å®šè§„åˆ™ç”±å¹³ï¿½?ï¿½ç”Ÿï¿½ï¿½?æˆ–ï¿½ï¿½?ç½®å®šä¹‰å
* ¦‚ï¼šio.shurui.store001.order,
* é»˜è®¤å€¼æ˜¯defaultå¦‚æžœï¿½ï¿½?ä¸ªè§’è‰²æ‹¥æœ‰inamespaceï¼š'io.shurui'çš„ï¿½?ï¿½ï¿½ï¿½?ï¼Œåˆ™æ‹¥æœ‰
* 'io.shurui'ä¸€ä¸‹æ‰€æœ‰ï¿½ï¿½?namespaceçš„ç›¸åº”ï¿½?ï¿½ï¿½ï¿½?
*/
public class NamespaceTuery extends Tuery<NamespaceTuery> {
    NamespaceTuery(StringBuilder _queryBuilder) {
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
    public NamespaceTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public NamespaceTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public NamespaceTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public NamespaceTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public NamespaceTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public NamespaceTuery description() {
        startField("description");

        return this;
    }

    /**
    *    
    * èµ„ï¿½ï¿½?å¯¹è±¡æ‰€å±žçš„namespace,æ ¹ï¿½?ï¿½ä¸€å®šè§„åˆ™ç”±å¹³ï¿½?ï¿½ç”Ÿï¿½ï¿½?æˆ–ï¿½ï¿½?ç½®å®šä¹‰å
    * ¦‚ï¼šio.shurui.store001.order, é»˜è®¤å€¼æ˜¯default   
    * å¦‚æžœï¿½ï¿½?ä¸ªè§’è‰²æ‹¥æœ‰inamespaceï¼š'io.shurui'çš„ï¿½?ï¿½ï¿½ï¿½?ï¼Œåˆ™æ‹¥æœ‰'io.shurui'ä¸€ä¸‹æ‰
    * €æœ‰ï¿½ï¿½?namespaceçš„ç›¸åº”ï¿½?ï¿½ï¿½ï¿½?    
    */
    public NamespaceTuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    *     æ‹¥æœ‰namespaceçš„ç»„ç»‡æˆ–ç”¨æˆ·    
    */
    public NamespaceTuery isNamespaceOf(PartyTueryDefinition queryDef) {
        startField("isNamespaceOf");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
