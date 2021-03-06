// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddFollowerRolePayloadTuery extends Tuery<AddFollowerRolePayloadTuery> {
    AddFollowerRolePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class FollowerroleArguments extends Arguments {
        FollowerroleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FollowerroleArguments filter(FollowerRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FollowerroleArguments order(FollowerRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FollowerroleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FollowerroleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FollowerroleArgumentsDefinition {
        void define(FollowerroleArguments args);
    }

    /**
    * 
    */
    public AddFollowerRolePayloadTuery followerrole(FollowerRoleTueryDefinition queryDef) {
        return followerrole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddFollowerRolePayloadTuery followerrole(FollowerroleArgumentsDefinition argsDef, FollowerRoleTueryDefinition queryDef) {
        startField("followerrole");

        FollowerroleArguments args = new FollowerroleArguments(_queryBuilder);
        argsDef.define(args);
        FollowerroleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FollowerRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddFollowerRolePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
