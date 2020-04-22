// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddMemberRolePayloadTuery extends Tuery<AddMemberRolePayloadTuery> {
    AddMemberRolePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class MemberroleArguments extends Arguments {
        MemberroleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public MemberroleArguments filter(MemberRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MemberroleArguments order(MemberRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MemberroleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public MemberroleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MemberroleArgumentsDefinition {
        void define(MemberroleArguments args);
    }

    /**
    * 
    */
    public AddMemberRolePayloadTuery memberrole(MemberRoleTueryDefinition queryDef) {
        return memberrole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddMemberRolePayloadTuery memberrole(MemberroleArgumentsDefinition argsDef, MemberRoleTueryDefinition queryDef) {
        startField("memberrole");

        MemberroleArguments args = new MemberroleArguments(_queryBuilder);
        argsDef.define(args);
        MemberroleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MemberRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddMemberRolePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
