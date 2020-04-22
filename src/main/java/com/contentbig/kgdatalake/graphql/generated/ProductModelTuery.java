// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 产��?型�?�
*/
public class ProductModelTuery extends Tuery<ProductModelTuery> {
    ProductModelTuery(StringBuilder _queryBuilder) {
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
    public ProductModelTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProductModelTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public ProductModelTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ProductModelTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ProductModelTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ProductModelTuery description() {
        startField("description");

        return this;
    }

    /**
    * 
    */
    public ProductModelTuery isSaleable() {
        startField("isSaleable");

        return this;
    }

    public class IsModelOfArguments extends Arguments {
        IsModelOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsModelOfArguments filter(ProductFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IsModelOfArgumentsDefinition {
        void define(IsModelOfArguments args);
    }

    /**
    *     ��?产��?】 所属产��?。    
    */
    public ProductModelTuery isModelOf(ProductTueryDefinition queryDef) {
        return isModelOf(args -> {}, queryDef);
    }

    /**
    *     ��?产��?】 所属产��?。    
    */
    public ProductModelTuery isModelOf(IsModelOfArgumentsDefinition argsDef, ProductTueryDefinition queryDef) {
        startField("isModelOf");

        IsModelOfArguments args = new IsModelOfArguments(_queryBuilder);
        argsDef.define(args);
        IsModelOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
