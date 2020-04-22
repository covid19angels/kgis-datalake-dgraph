// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddOfferPayloadTuery extends Tuery<AddOfferPayloadTuery> {
    AddOfferPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class OfferArguments extends Arguments {
        OfferArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OfferArguments filter(OfferFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OfferArguments order(OfferOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OfferArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public OfferArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OfferArgumentsDefinition {
        void define(OfferArguments args);
    }

    /**
    * 
    */
    public AddOfferPayloadTuery offer(OfferTueryDefinition queryDef) {
        return offer(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddOfferPayloadTuery offer(OfferArgumentsDefinition argsDef, OfferTueryDefinition queryDef) {
        startField("offer");

        OfferArguments args = new OfferArguments(_queryBuilder);
        argsDef.define(args);
        OfferArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OfferTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddOfferPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
