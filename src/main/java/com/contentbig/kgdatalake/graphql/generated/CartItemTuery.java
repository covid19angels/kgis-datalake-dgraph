// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 购物车内物��?��?��?务��?优惠券等
*/
public class CartItemTuery extends Tuery<CartItemTuery> {
    CartItemTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public CartItemTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CartItemTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public CartItemTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public CartItemTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public CartItemTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public CartItemTuery description() {
        startField("description");

        return this;
    }

    public class IsItemOfArguments extends Arguments {
        IsItemOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsItemOfArguments filter(CartFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IsItemOfArgumentsDefinition {
        void define(IsItemOfArguments args);
    }

    /**
    *     所属购物车,    
    */
    public CartItemTuery isItemOf(CartTueryDefinition queryDef) {
        return isItemOf(args -> {}, queryDef);
    }

    /**
    *     所属购物车,    
    */
    public CartItemTuery isItemOf(IsItemOfArgumentsDefinition argsDef, CartTueryDefinition queryDef) {
        startField("isItemOf");

        IsItemOfArguments args = new IsItemOfArguments(_queryBuilder);
        argsDef.define(args);
        IsItemOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CartTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public CartItemTuery type() {
        startField("type");

        return this;
    }

    /**
    * 
    */
    public CartItemTuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    * 
    */
    public CartItemTuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * 
    */
    public CartItemTuery updatedAt() {
        startField("updatedAt");

        return this;
    }
}
