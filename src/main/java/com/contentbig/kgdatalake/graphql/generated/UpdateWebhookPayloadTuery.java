// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateWebhookPayloadTuery extends Tuery<UpdateWebhookPayloadTuery> {
    UpdateWebhookPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class WebhookArguments extends Arguments {
        WebhookArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public WebhookArguments filter(WebhookFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WebhookArguments order(WebhookOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WebhookArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public WebhookArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface WebhookArgumentsDefinition {
        void define(WebhookArguments args);
    }

    /**
    * 
    */
    public UpdateWebhookPayloadTuery webhook(WebhookTueryDefinition queryDef) {
        return webhook(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateWebhookPayloadTuery webhook(WebhookArgumentsDefinition argsDef, WebhookTueryDefinition queryDef) {
        startField("webhook");

        WebhookArguments args = new WebhookArguments(_queryBuilder);
        argsDef.define(args);
        WebhookArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WebhookTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateWebhookPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
