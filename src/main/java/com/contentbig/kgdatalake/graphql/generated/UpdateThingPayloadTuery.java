// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateThingPayloadTuery extends Tuery<UpdateThingPayloadTuery> {
    UpdateThingPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ThingArguments extends Arguments {
        ThingArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ThingArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ThingArguments order(ThingOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ThingArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ThingArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ThingArgumentsDefinition {
        void define(ThingArguments args);
    }

    /**
    * 
    */
    public UpdateThingPayloadTuery thing(ThingTueryDefinition queryDef) {
        return thing(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateThingPayloadTuery thing(ThingArgumentsDefinition argsDef, ThingTueryDefinition queryDef) {
        startField("thing");

        ThingArguments args = new ThingArguments(_queryBuilder);
        argsDef.define(args);
        ThingArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateThingPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
