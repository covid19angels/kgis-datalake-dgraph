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
* ä¸ªäºº,ï¿½?ï¿½èƒ½åœ¨å¹³ï¿½?ï¿½é‡Œæœ‰ä¸€ä¸ªä¸”å”¯ä¸€çš„ç”¨æˆ·è´¦ï¿½?ï¿½User
*/
public class PersonTuery extends Tuery<PersonTuery> {
    PersonTuery(StringBuilder _queryBuilder) {
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
    public PersonTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public PersonTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public PersonTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public PersonTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public PersonTuery description() {
        startField("description");

        return this;
    }

    public class OwnsArguments extends Arguments {
        OwnsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OwnsArguments filter(OwnershipFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments order(OwnershipOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OwnsArgumentsDefinition {
        void define(OwnsArguments args);
    }

    /**
    * 
    */
    public PersonTuery owns(OwnershipTueryDefinition queryDef) {
        return owns(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonTuery owns(OwnsArgumentsDefinition argsDef, OwnershipTueryDefinition queryDef) {
        startField("owns");

        OwnsArguments args = new OwnsArguments(_queryBuilder);
        argsDef.define(args);
        OwnsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OwnershipTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasNamespacesArguments extends Arguments {
        HasNamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasNamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasNamespacesArgumentsDefinition {
        void define(HasNamespacesArguments args);
    }

    /**
    * 
    */
    public PersonTuery hasNamespaces(NamespaceTueryDefinition queryDef) {
        return hasNamespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonTuery hasNamespaces(HasNamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("hasNamespaces");

        HasNamespacesArguments args = new HasNamespacesArguments(_queryBuilder);
        argsDef.define(args);
        HasNamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ä¸ªäººèº«ä»½ï¿½ï¿½?ID    
    */
    public PersonTuery personalId() {
        startField("personalID");

        return this;
    }

    /**
    * ï¿½ï¿½?å§“ã€‘ å§“ã€‚ åœ¨ç¾Žå›½ï¼Œæ˜¯ä¸€ä¸ªäººå§“ï¿½??ä¸­çš„æœ€ï¿½?ï¿½ä¸€ä¸ªå­—ã€‚ Family name. In
    * the U.S., the last name of an Person. This can be used along with givenName instead of the name
    * property.
    */
    public PersonTuery familyName() {
        startField("familyName");

        return this;
    }

    /**
    * ï¿½ï¿½?ï¿½??ã€‘ ï¿½??ã€‚åœ¨ç¾Žå›½ï¼Œæ˜¯ä¸€ä¸ªäººï¿½??å­—ä¸­çš„ç¬¬ä¸€ä¸ªå­— Given name. In the U.S.,
    * the first name of a Person. This can be used along with familyName instead of the name property.
    */
    public PersonTuery givenName() {
        startField("givenName");

        return this;
    }

    public class HasUserArguments extends Arguments {
        HasUserArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasUserArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface HasUserArgumentsDefinition {
        void define(HasUserArguments args);
    }

    /**
    * æœ¬äººæ‰€æ‹¥æœ‰çš„ç”¨æˆ·è´¦ï¿½?ï¿½ï¼Œé€†å±žæ€§User.isUserOfï¼Œï¿½?ï¿½è€ƒInverse property: isPartOf
    */
    public PersonTuery hasUser(UserTueryDefinition queryDef) {
        return hasUser(args -> {}, queryDef);
    }

    /**
    * æœ¬äººæ‰€æ‹¥æœ‰çš„ç”¨æˆ·è´¦ï¿½?ï¿½ï¼Œé€†å±žæ€§User.isUserOfï¼Œï¿½?ï¿½è€ƒInverse property: isPartOf
    */
    public PersonTuery hasUser(HasUserArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("hasUser");

        HasUserArguments args = new HasUserArguments(_queryBuilder);
        argsDef.define(args);
        HasUserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
