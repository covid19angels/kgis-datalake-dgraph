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
* ç½‘ç»œé’©ï¿½ï¿½?æ˜¯â€œç”¨æˆ·å®šä¹‰çš„HTTPå›žè°ƒï¿½ï¿½?ã€‚[2]ç½‘ç»œé’©ï¿½ï¿½?é€šå¸¸è¢«ï¿½ï¿½?äº›äº‹ä»
* ¶æ¿€æ´»ï¼Œæ¯”å¦‚å°†ä»£ï¿½ï¿½?æŽ¨ï¿½ï¿½?åˆ°ï¿½ï¿½?[3]æˆ–è¯„è®ºï¿½?ï¿½å®¢ã€‚[4]å½“æ­¤äº‹ä»¶ï¿½?ï¿½ç”Ÿæ
* —¶ï¼ŒåŽŸç½‘ç«™å°†ï¿½?ï¿½ä¸ºç½‘ç»œé’©ï¿½ï¿½?ï¿½ï¿½?ç½®çš„URLï¿½?ï¿½ï¿½ï¿½?HTTPè¯·æ±‚ã€‚ç”¨æˆ·ï¿½?ï¿½ï
* ¿½ï¿½?ç½®å®ƒä»¬å¼•ï¿½?ï¿½ç½‘é¡µä¸Šçš„äº‹ä»¶ä»¥è°ƒç”¨ï¿½?ï¿½ä¸€ä¸ªç½‘ç«™çš„è¡Œä¸ºã€‚Webhooks allow
* external services to be notified when certain events happen.
*/
public class WebhookTuery extends Tuery<WebhookTuery> {
    WebhookTuery(StringBuilder _queryBuilder) {
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
    public WebhookTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public WebhookTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public WebhookTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public WebhookTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public WebhookTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public WebhookTuery description() {
        startField("description");

        return this;
    }

    /**
    *     å›žè°ƒurl    
    */
    public WebhookTuery payloadUrl() {
        startField("payloadUrl");

        return this;
    }

    /**
    *     å›žè°ƒï¿½??äº¤çš„æ•°ï¿½?ï¿½å†…å®¹ç±»åž‹å¦‚application/json    
    */
    public WebhookTuery contentType() {
        startField("contentType");

        return this;
    }

    /**
    *     ä½¿ç”¨payloadUrlçš„å®‰å…¨token    
    */
    public WebhookTuery secret() {
        startField("secret");

        return this;
    }

    public class CreatorArguments extends Arguments {
        CreatorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CreatorArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreatorArgumentsDefinition {
        void define(CreatorArguments args);
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */
    public WebhookTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */
    public WebhookTuery creator(CreatorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ï¿½ï¿½?åˆ›å»ºæ—¥æœŸã€‘ åˆ›ä½œå‡ºCreativeWorkçš„æ—¥æœŸã€‚ The date on which the CreativeWork was
    * created or the item was added to a DataFeed. dateCreated    DateTime or Date or DataFeedItem or
    * CreativeWork    
    */
    public WebhookTuery dateCreated() {
        startField("dateCreated");

        return this;
    }

    public class ClientArguments extends Arguments {
        ClientArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ClientArguments filter(SoftwareApplicationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ClientArgumentsDefinition {
        void define(ClientArguments args);
    }

    /**
    *     è°ƒç”¨æ­¤webhookçš„å®¢æˆ·ç«¯    
    */
    public WebhookTuery client(SoftwareApplicationTueryDefinition queryDef) {
        return client(args -> {}, queryDef);
    }

    /**
    *     è°ƒç”¨æ­¤webhookçš„å®¢æˆ·ç«¯    
    */
    public WebhookTuery client(ClientArgumentsDefinition argsDef, SoftwareApplicationTueryDefinition queryDef) {
        startField("client");

        ClientArguments args = new ClientArguments(_queryBuilder);
        argsDef.define(args);
        ClientArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new SoftwareApplicationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
