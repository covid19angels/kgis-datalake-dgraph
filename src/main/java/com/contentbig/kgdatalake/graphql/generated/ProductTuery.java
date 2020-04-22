// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 产��?
*/
public class ProductTuery extends Tuery<ProductTuery> {
    ProductTuery(StringBuilder _queryBuilder) {
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
    public ProductTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProductTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public ProductTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ProductTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ProductTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ProductTuery description() {
        startField("description");

        return this;
    }

    /**
    * 
    */
    public ProductTuery isSaleable() {
        startField("isSaleable");

        return this;
    }

    public class HasModelsArguments extends Arguments {
        HasModelsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasModelsArguments filter(ProductModelFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasModelsArguments order(ProductModelOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasModelsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasModelsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasModelsArgumentsDefinition {
        void define(HasModelsArguments args);
    }

    /**
    *     ��?型�?�】 产��?的型�?�。    
    */
    public ProductTuery hasModels(ProductModelTueryDefinition queryDef) {
        return hasModels(args -> {}, queryDef);
    }

    /**
    *     ��?型�?�】 产��?的型�?�。    
    */
    public ProductTuery hasModels(HasModelsArgumentsDefinition argsDef, ProductModelTueryDefinition queryDef) {
        startField("hasModels");

        HasModelsArguments args = new HasModelsArguments(_queryBuilder);
        argsDef.define(args);
        HasModelsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductModelTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
