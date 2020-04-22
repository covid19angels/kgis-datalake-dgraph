// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* A single line item in the checkout, grouped by variant and attributes.结算�?�内容项
*/
public class CheckoutItemTuery extends Tuery<CheckoutItemTuery> {
    CheckoutItemTuery(StringBuilder _queryBuilder) {
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
    public CheckoutItemTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public CheckoutItemTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public CheckoutItemTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public CheckoutItemTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public CheckoutItemTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public CheckoutItemTuery description() {
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
        public IsItemOfArguments filter(CheckoutFilter value) {
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
    *     所属结算�?�    
    */
    public CheckoutItemTuery isItemOf(CheckoutTueryDefinition queryDef) {
        return isItemOf(args -> {}, queryDef);
    }

    /**
    *     所属结算�?�    
    */
    public CheckoutItemTuery isItemOf(IsItemOfArgumentsDefinition argsDef, CheckoutTueryDefinition queryDef) {
        startField("isItemOf");

        IsItemOfArguments args = new IsItemOfArguments(_queryBuilder);
        argsDef.define(args);
        IsItemOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new CheckoutTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     The quantity of the line item.    
    */
    public CheckoutItemTuery quantity() {
        startField("quantity");

        return this;
    }

    /**
    *     Product/Service variant of the line item.    
    */
    public CheckoutItemTuery variant(SaleableTueryDefinition queryDef) {
        startField("variant");

        _queryBuilder.append('{');
        queryDef.define(new SaleableTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
