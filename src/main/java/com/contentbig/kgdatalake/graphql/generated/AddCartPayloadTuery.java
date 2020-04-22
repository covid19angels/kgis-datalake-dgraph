// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddCartPayloadTuery extends Tuery<AddCartPayloadTuery> {
    AddCartPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CartArguments extends Arguments {
        CartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CartArguments filter(CartFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CartArguments order(CartOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CartArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CartArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CartArgumentsDefinition {
        void define(CartArguments args);
    }

    /**
    * 
    */
    public AddCartPayloadTuery cart(CartTueryDefinition queryDef) {
        return cart(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCartPayloadTuery cart(CartArgumentsDefinition argsDef, CartTueryDefinition queryDef) {
        startField("cart");

        CartArguments args = new CartArguments(_queryBuilder);
        argsDef.define(args);
        CartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddCartPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
