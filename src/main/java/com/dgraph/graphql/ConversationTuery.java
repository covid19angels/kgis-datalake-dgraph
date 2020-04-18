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
* ï¿½ï¿½?å¯¹ï¿½ï¿½?ã€‘ç»„ç»‡ä¹‹é—´æˆ–ç‰¹å®šä¸»é¢˜çš„äººå‘˜ä¹‹é—´çš„ä¸€ä¸ªæˆ–å¤šä¸ªæ¶ˆï¿½?ï¿½ã€‚
* ï¿½?ï¿½ä»¥ä½¿ç”¨isPartOfæˆ–hasPartå±žæ€§å°†ä¸ªäººæ¶ˆï¿½?ï¿½é“¾æŽ¥åˆ°ä¼šï¿½ï¿½?ã€‚ One or more
* messages between organizations or people on a particular topic. Individual messages can be linked to
* the conversation with isPartOf or hasPart properties.
*/
public class ConversationTuery extends Tuery<ConversationTuery> {
    ConversationTuery(StringBuilder _queryBuilder) {
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
    public ConversationTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ConversationTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public ConversationTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ConversationTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ConversationTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ConversationTuery description() {
        startField("description");

        return this;
    }

    public class AboutArguments extends Arguments {
        AboutArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AboutArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AboutArgumentsDefinition {
        void define(AboutArguments args);
    }

    /**
    *     ï¿½ï¿½?å…³äºŽã€‘ äº‹ç‰©çš„å…³äºŽä¿¡ï¿½?ï¿½ The subject matter of the content.    
    */
    public ConversationTuery about(ThingTueryDefinition queryDef) {
        return about(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?å…³äºŽã€‘ äº‹ç‰©çš„å…³äºŽä¿¡ï¿½?ï¿½ The subject matter of the content.    
    */
    public ConversationTuery about(AboutArgumentsDefinition argsDef, ThingTueryDefinition queryDef) {
        startField("about");

        AboutArguments args = new AboutArguments(_queryBuilder);
        argsDef.define(args);
        AboutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AccountablePersonArguments extends Arguments {
        AccountablePersonArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AccountablePersonArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AccountablePersonArgumentsDefinition {
        void define(AccountablePersonArguments args);
    }

    /**
    *     ï¿½ï¿½?è´Ÿè´£äººã€‘ å¯¹CreativeWorkè´Ÿæœ‰æ³•å¾‹è´£ä»»çš„ç‰¹å®šçš„äººã€‚ Specifies the Person
    * that is legally accountable for the CreativeWork.    
    */
    public ConversationTuery accountablePerson(UserTueryDefinition queryDef) {
        return accountablePerson(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?è´Ÿè´£äººã€‘ å¯¹CreativeWorkè´Ÿæœ‰æ³•å¾‹è´£ä»»çš„ç‰¹å®šçš„äººã€‚ Specifies the Person
    * that is legally accountable for the CreativeWork.    
    */
    public ConversationTuery accountablePerson(AccountablePersonArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("accountablePerson");

        AccountablePersonArguments args = new AccountablePersonArguments(_queryBuilder);
        argsDef.define(args);
        AccountablePersonArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

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
    public ConversationTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */
    public ConversationTuery creator(CreatorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
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
    public ConversationTuery dateCreated() {
        startField("dateCreated");

        return this;
    }

    public class IncludedInDataCatalogArguments extends Arguments {
        IncludedInDataCatalogArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IncludedInDataCatalogArguments filter(DataCatalogFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IncludedInDataCatalogArgumentsDefinition {
        void define(IncludedInDataCatalogArguments args);
    }

    /**
    *     ï¿½ï¿½?æ‰€åœ¨æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘æ‰€åœ¨çš„æ•°ï¿½?ï¿½é›†ç›®å½• A data catalog which contains
    * this dataset.    
    */
    public ConversationTuery includedInDataCatalog(DataCatalogTueryDefinition queryDef) {
        return includedInDataCatalog(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?æ‰€åœ¨æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘æ‰€åœ¨çš„æ•°ï¿½?ï¿½é›†ç›®å½• A data catalog which contains
    * this dataset.    
    */
    public ConversationTuery includedInDataCatalog(IncludedInDataCatalogArgumentsDefinition argsDef, DataCatalogTueryDefinition queryDef) {
        startField("includedInDataCatalog");

        IncludedInDataCatalogArguments args = new IncludedInDataCatalogArguments(_queryBuilder);
        argsDef.define(args);
        IncludedInDataCatalogArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasMessagesArguments extends Arguments {
        HasMessagesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasMessagesArguments filter(MessageFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasMessagesArguments order(MessageOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasMessagesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasMessagesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasMessagesArgumentsDefinition {
        void define(HasMessagesArguments args);
    }

    /**
    *     ï¿½?ï¿½ç…§ hasPartï¿½ï¿½?ä½œï¿½ï¿½?ç»„ä»¶ã€‘
    * è¡¨ç¤ºï¿½ï¿½?ä¸ªä½œï¿½ï¿½?æ˜¯è¯¥ä½œï¿½ï¿½?çš„ä¸€éƒ¨åˆ†    
    */
    public ConversationTuery hasMessages(MessageTueryDefinition queryDef) {
        return hasMessages(args -> {}, queryDef);
    }

    /**
    *     ï¿½?ï¿½ç…§ hasPartï¿½ï¿½?ä½œï¿½ï¿½?ç»„ä»¶ã€‘
    * è¡¨ç¤ºï¿½ï¿½?ä¸ªä½œï¿½ï¿½?æ˜¯è¯¥ä½œï¿½ï¿½?çš„ä¸€éƒ¨åˆ†    
    */
    public ConversationTuery hasMessages(HasMessagesArgumentsDefinition argsDef, MessageTueryDefinition queryDef) {
        startField("hasMessages");

        HasMessagesArguments args = new HasMessagesArguments(_queryBuilder);
        argsDef.define(args);
        HasMessagesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MessageTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
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
    * æœ¬ä¼šï¿½ï¿½?Conversationç»™ç¬¬ä¸‰æ–¹è½¯ä»¶å¦‚Githubï¿½ï¿½?é˜¿é‡Œäº‘ä»£ï¿½ï¿½?åˆ›å»ºçš„webhookï¼Œç¬¬
    * ä¸‰æ–¹è½¯ä»¶ï¿½?ï¿½æœ¬ä¼šï¿½ï¿½?æŽ¨ï¿½ï¿½?äº‹ä»¶æ¶ˆï¿½?ï¿½    
    */
    public ConversationTuery webhook(WebhookTueryDefinition queryDef) {
        return webhook(args -> {}, queryDef);
    }

    /**
    *    
    * æœ¬ä¼šï¿½ï¿½?Conversationç»™ç¬¬ä¸‰æ–¹è½¯ä»¶å¦‚Githubï¿½ï¿½?é˜¿é‡Œäº‘ä»£ï¿½ï¿½?åˆ›å»ºçš„webhookï¼Œç¬¬
    * ä¸‰æ–¹è½¯ä»¶ï¿½?ï¿½æœ¬ä¼šï¿½ï¿½?æŽ¨ï¿½ï¿½?äº‹ä»¶æ¶ˆï¿½?ï¿½    
    */
    public ConversationTuery webhook(WebhookArgumentsDefinition argsDef, WebhookTueryDefinition queryDef) {
        startField("webhook");

        WebhookArguments args = new WebhookArguments(_queryBuilder);
        argsDef.define(args);
        WebhookArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new WebhookTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
