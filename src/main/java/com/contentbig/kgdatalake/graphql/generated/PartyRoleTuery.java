// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* ��?团体内部定义的角色】
*/
public class PartyRoleTuery extends Tuery<PartyRoleTuery> {
    PartyRoleTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public class PersonArguments extends Arguments {
        PersonArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PersonArguments filter(PersonFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface PersonArgumentsDefinition {
        void define(PersonArguments args);
    }

    /**
    *     在组织承担角色的个人    
    */
    public PartyRoleTuery person(PersonTueryDefinition queryDef) {
        return person(args -> {}, queryDef);
    }

    /**
    *     在组织承担角色的个人    
    */
    public PartyRoleTuery person(PersonArgumentsDefinition argsDef, PersonTueryDefinition queryDef) {
        startField("person");

        PersonArguments args = new PersonArguments(_queryBuilder);
        argsDef.define(args);
        PersonArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RoleNameArguments extends Arguments {
        RoleNameArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RoleNameArguments filter(PartyRoleNameFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RoleNameArgumentsDefinition {
        void define(RoleNameArguments args);
    }

    /**
    *     个人在团体内承担的角色    
    */
    public PartyRoleTuery roleName(PartyRoleNameTueryDefinition queryDef) {
        return roleName(args -> {}, queryDef);
    }

    /**
    *     个人在团体内承担的角色    
    */
    public PartyRoleTuery roleName(RoleNameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
        startField("roleName");

        RoleNameArguments args = new RoleNameArguments(_queryBuilder);
        argsDef.define(args);
        RoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ��?开始日期】 ��?事的开始日期和时间    
    */
    public PartyRoleTuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    *     ��?结�?�日期】 活动（事件）结�?�时间。 The end date and time of the item (in ISO 8601 date format).    
    */
    public PartyRoleTuery dateThrough() {
        startField("dateThrough");

        return this;
    }

    public PartyRoleTuery onEmployeeRole(EmployeeRoleTueryDefinition queryDef) {
        startInlineFragment("EmployeeRole");
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PartyRoleTuery onFollowerRole(FollowerRoleTueryDefinition queryDef) {
        startInlineFragment("FollowerRole");
        queryDef.define(new FollowerRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PartyRoleTuery onMemberRole(MemberRoleTueryDefinition queryDef) {
        startInlineFragment("MemberRole");
        queryDef.define(new MemberRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
