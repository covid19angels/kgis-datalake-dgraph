// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddUserPayloadTuery extends Tuery<AddUserPayloadTuery> {
    AddUserPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class UserArguments extends Arguments {
        UserArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public UserArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public UserArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public UserArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public UserArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UserArgumentsDefinition {
        void define(UserArguments args);
    }

    /**
    * 
    */
    public AddUserPayloadTuery user(UserTueryDefinition queryDef) {
        return user(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddUserPayloadTuery user(UserArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("user");

        UserArguments args = new UserArguments(_queryBuilder);
        argsDef.define(args);
        UserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddUserPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
