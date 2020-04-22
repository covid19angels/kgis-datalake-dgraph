// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateCheckoutPayloadTuery extends Tuery<UpdateCheckoutPayloadTuery> {
    UpdateCheckoutPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CheckoutArguments extends Arguments {
        CheckoutArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CheckoutArguments filter(CheckoutFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutArguments order(CheckoutOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CheckoutArgumentsDefinition {
        void define(CheckoutArguments args);
    }

    /**
    * 
    */
    public UpdateCheckoutPayloadTuery checkout(CheckoutTueryDefinition queryDef) {
        return checkout(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateCheckoutPayloadTuery checkout(CheckoutArgumentsDefinition argsDef, CheckoutTueryDefinition queryDef) {
        startField("checkout");

        CheckoutArguments args = new CheckoutArguments(_queryBuilder);
        argsDef.define(args);
        CheckoutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateCheckoutPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
