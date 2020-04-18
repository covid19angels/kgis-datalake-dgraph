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
* ç»„ç»‡å®šä¹‰çš„è§’è‰²ï¼Œç»„ç»‡å†…ç»Ÿç­¹å®šä¹‰
*/
public class PartyRoleNameTuery extends Tuery<PartyRoleNameTuery> {
    PartyRoleNameTuery(StringBuilder _queryBuilder) {
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
    public PartyRoleNameTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PartyRoleNameTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public PartyRoleNameTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public PartyRoleNameTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public PartyRoleNameTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public PartyRoleNameTuery description() {
        startField("description");

        return this;
    }

    /**
    *     isPartyRoleNameOf,é€†å±žæ€§ Organization.hasPartyRoleName    
    */
    public PartyRoleNameTuery isRoleNameOf(OrganizationTueryDefinition queryDef) {
        startField("isRoleNameOf");

        _queryBuilder.append('{');
        queryDef.define(new OrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     è§’è‰²åˆ†ç»„,å¦‚å‘˜å·¥è§’è‰²ç»„ï¿½ï¿½?ä¼šå‘˜è§’è‰²ç»„    
    */
    public PartyRoleNameTuery group() {
        startField("group");

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
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚è·ŸCreativeWorkçš„Authorå±žæ€§ä¸€æ ·ã€‚
    * The creator/author of this CreativeWork. This is the same as the Author property for
    * CreativeWork.creator    Organization or Person or CreativeWork or UserReviews    
    */
    public PartyRoleNameTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚è·ŸCreativeWorkçš„Authorå±žæ€§ä¸€æ ·ã€‚
    * The creator/author of this CreativeWork. This is the same as the Author property for
    * CreativeWork.creator    Organization or Person or CreativeWork or UserReviews    
    */
    public PartyRoleNameTuery creator(CreatorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
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
    public PartyRoleNameTuery dateCreated() {
        startField("dateCreated");

        return this;
    }
}
