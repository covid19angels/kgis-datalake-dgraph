// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddCheckoutItemPayloadTuery extends Tuery<AddCheckoutItemPayloadTuery> {
    AddCheckoutItemPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CheckoutitemArguments extends Arguments {
        CheckoutitemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CheckoutitemArguments filter(CheckoutItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutitemArguments order(CheckoutItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutitemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CheckoutitemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CheckoutitemArgumentsDefinition {
        void define(CheckoutitemArguments args);
    }

    /**
    * 
    */
    public AddCheckoutItemPayloadTuery checkoutitem(CheckoutItemTueryDefinition queryDef) {
        return checkoutitem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCheckoutItemPayloadTuery checkoutitem(CheckoutitemArgumentsDefinition argsDef, CheckoutItemTueryDefinition queryDef) {
        startField("checkoutitem");

        CheckoutitemArguments args = new CheckoutitemArguments(_queryBuilder);
        argsDef.define(args);
        CheckoutitemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddCheckoutItemPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
