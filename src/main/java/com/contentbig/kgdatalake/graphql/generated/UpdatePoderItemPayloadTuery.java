// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdatePoderItemPayloadTuery extends Tuery<UpdatePoderItemPayloadTuery> {
    UpdatePoderItemPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PoderitemArguments extends Arguments {
        PoderitemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PoderitemArguments filter(PoderItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PoderitemArguments order(PoderItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PoderitemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PoderitemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PoderitemArgumentsDefinition {
        void define(PoderitemArguments args);
    }

    /**
    * 
    */
    public UpdatePoderItemPayloadTuery poderitem(PoderItemTueryDefinition queryDef) {
        return poderitem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdatePoderItemPayloadTuery poderitem(PoderitemArgumentsDefinition argsDef, PoderItemTueryDefinition queryDef) {
        startField("poderitem");

        PoderitemArguments args = new PoderitemArguments(_queryBuilder);
        argsDef.define(args);
        PoderitemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdatePoderItemPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
