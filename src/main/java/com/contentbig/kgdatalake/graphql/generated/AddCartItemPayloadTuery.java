// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddCartItemPayloadTuery extends Tuery<AddCartItemPayloadTuery> {
    AddCartItemPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class CartitemArguments extends Arguments {
        CartitemArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CartitemArguments filter(CartItemFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CartitemArguments order(CartItemOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public CartitemArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public CartitemArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface CartitemArgumentsDefinition {
        void define(CartitemArguments args);
    }

    /**
    * 
    */
    public AddCartItemPayloadTuery cartitem(CartItemTueryDefinition queryDef) {
        return cartitem(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddCartItemPayloadTuery cartitem(CartitemArgumentsDefinition argsDef, CartItemTueryDefinition queryDef) {
        startField("cartitem");

        CartitemArguments args = new CartitemArguments(_queryBuilder);
        argsDef.define(args);
        CartitemArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartItemTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddCartItemPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
