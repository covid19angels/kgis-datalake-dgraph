// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddOwnershipPayloadTuery extends Tuery<AddOwnershipPayloadTuery> {
    AddOwnershipPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class OwnershipArguments extends Arguments {
        OwnershipArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OwnershipArguments filter(OwnershipFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnershipArguments order(OwnershipOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnershipArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public OwnershipArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OwnershipArgumentsDefinition {
        void define(OwnershipArguments args);
    }

    /**
    * 
    */
    public AddOwnershipPayloadTuery ownership(OwnershipTueryDefinition queryDef) {
        return ownership(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddOwnershipPayloadTuery ownership(OwnershipArgumentsDefinition argsDef, OwnershipTueryDefinition queryDef) {
        startField("ownership");

        OwnershipArguments args = new OwnershipArguments(_queryBuilder);
        argsDef.define(args);
        OwnershipArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OwnershipTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddOwnershipPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
