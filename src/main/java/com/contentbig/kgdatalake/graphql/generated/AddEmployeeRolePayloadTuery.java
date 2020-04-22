// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddEmployeeRolePayloadTuery extends Tuery<AddEmployeeRolePayloadTuery> {
    AddEmployeeRolePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class EmployeeroleArguments extends Arguments {
        EmployeeroleArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public EmployeeroleArguments filter(EmployeeRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeeroleArguments order(EmployeeRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeeroleArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeeroleArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface EmployeeroleArgumentsDefinition {
        void define(EmployeeroleArguments args);
    }

    /**
    * 
    */
    public AddEmployeeRolePayloadTuery employeerole(EmployeeRoleTueryDefinition queryDef) {
        return employeerole(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddEmployeeRolePayloadTuery employeerole(EmployeeroleArgumentsDefinition argsDef, EmployeeRoleTueryDefinition queryDef) {
        startField("employeerole");

        EmployeeroleArguments args = new EmployeeroleArguments(_queryBuilder);
        argsDef.define(args);
        EmployeeroleArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddEmployeeRolePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
