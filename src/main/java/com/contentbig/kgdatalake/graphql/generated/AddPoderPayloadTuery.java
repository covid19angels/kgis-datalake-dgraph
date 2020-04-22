// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddPoderPayloadTuery extends Tuery<AddPoderPayloadTuery> {
    AddPoderPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PoderArguments extends Arguments {
        PoderArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PoderArguments filter(PoderFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PoderArguments order(PoderOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PoderArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PoderArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PoderArgumentsDefinition {
        void define(PoderArguments args);
    }

    /**
    * 
    */
    public AddPoderPayloadTuery poder(PoderTueryDefinition queryDef) {
        return poder(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddPoderPayloadTuery poder(PoderArgumentsDefinition argsDef, PoderTueryDefinition queryDef) {
        startField("poder");

        PoderArguments args = new PoderArguments(_queryBuilder);
        argsDef.define(args);
        PoderArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PoderTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddPoderPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
