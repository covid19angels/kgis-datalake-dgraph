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
* ç”¨æˆ·è´¦ï¿½?ï¿½
*/
public class UserTuery extends Tuery<UserTuery> {
    UserTuery(StringBuilder _queryBuilder) {
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
    public UserTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UserTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public UserTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public UserTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public UserTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public UserTuery description() {
        startField("description");

        return this;
    }

    /**
    *     The username used to login.    We also want to make sure that usernames are unique. The @id
    * directive takes care of that - it also automatically adds hash searching, so we can drop the
    * @search(by: [hash]), though having it also causes no harm.    
    */
    public UserTuery username() {
        startField("username");

        return this;
    }

    /**
    *     The password used to login.    
    */
    public UserTuery password() {
        startField("password");

        return this;
    }

    /**
    *     The user's public profile bio.    
    */
    public UserTuery bio() {
        startField("bio");

        return this;
    }

    public class IsUserOfArguments extends Arguments {
        IsUserOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsUserOfArguments filter(PersonFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IsUserOfArgumentsDefinition {
        void define(IsUserOfArguments args);
    }

    /**
    *     ç”¨æˆ·è´¦ï¿½?ï¿½å¯¹åº”çš„äººï¼Œæœ‰è´¦ï¿½?ï¿½ä¸€å®šæœ‰ç›¸å…³çš„Personï¼Œé€†å±žæ€§
    * Person.hasUserï¼Œï¿½?ï¿½è€ƒInverse property: hasPart    
    */
    public UserTuery isUserOf(PersonTueryDefinition queryDef) {
        return isUserOf(args -> {}, queryDef);
    }

    /**
    *     ç”¨æˆ·è´¦ï¿½?ï¿½å¯¹åº”çš„äººï¼Œæœ‰è´¦ï¿½?ï¿½ä¸€å®šæœ‰ç›¸å…³çš„Personï¼Œé€†å±žæ€§
    * Person.hasUserï¼Œï¿½?ï¿½è€ƒInverse property: hasPart    
    */
    public UserTuery isUserOf(IsUserOfArgumentsDefinition argsDef, PersonTueryDefinition queryDef) {
        startField("isUserOf");

        IsUserOfArguments args = new IsUserOfArguments(_queryBuilder);
        argsDef.define(args);
        IsUserOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
