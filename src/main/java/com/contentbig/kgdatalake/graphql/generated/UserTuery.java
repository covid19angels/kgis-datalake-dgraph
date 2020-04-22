// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 用户账�?�
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
    *     用户账�?�对应的人，有账�?�一定有相关的Person，逆属性 Person.hasUser，�?�考Inverse property: hasPart    
    */
    public UserTuery isUserOf(PersonTueryDefinition queryDef) {
        return isUserOf(args -> {}, queryDef);
    }

    /**
    *     用户账�?�对应的人，有账�?�一定有相关的Person，逆属性 Person.hasUser，�?�考Inverse property: hasPart    
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
