// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* [��?会员角色】OrganizationRole的��?类，�??述会员关系,有时间��?制](http://cnschema.org/EmployeeRole)
*/
public class MemberRoleTuery extends Tuery<MemberRoleTuery> {
    MemberRoleTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
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
    * 
    */
    public MemberRoleTuery person(PersonTueryDefinition queryDef) {
        return person(args -> {}, queryDef);
    }

    /**
    * 
    */
    public MemberRoleTuery person(PersonArgumentsDefinition argsDef, PersonTueryDefinition queryDef) {
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
    * 
    */
    public MemberRoleTuery roleName(PartyRoleNameTueryDefinition queryDef) {
        return roleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public MemberRoleTuery roleName(RoleNameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
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
    * 
    */
    public MemberRoleTuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    * 
    */
    public MemberRoleTuery dateThrough() {
        startField("dateThrough");

        return this;
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
    public MemberRoleTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public MemberRoleTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public MemberRoleTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public MemberRoleTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public MemberRoleTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public MemberRoleTuery description() {
        startField("description");

        return this;
    }

    /**
    *     ��?会员编�?�】    
    */
    public MemberRoleTuery number() {
        startField("number");

        return this;
    }
}
