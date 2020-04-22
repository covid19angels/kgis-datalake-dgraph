// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateProductModelPayloadTuery extends Tuery<UpdateProductModelPayloadTuery> {
    UpdateProductModelPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ProductmodelArguments extends Arguments {
        ProductmodelArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProductmodelArguments filter(ProductModelFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductmodelArguments order(ProductModelOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProductmodelArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProductmodelArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProductmodelArgumentsDefinition {
        void define(ProductmodelArguments args);
    }

    /**
    * 
    */
    public UpdateProductModelPayloadTuery productmodel(ProductModelTueryDefinition queryDef) {
        return productmodel(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateProductModelPayloadTuery productmodel(ProductmodelArgumentsDefinition argsDef, ProductModelTueryDefinition queryDef) {
        startField("productmodel");

        ProductmodelArguments args = new ProductmodelArguments(_queryBuilder);
        argsDef.define(args);
        ProductmodelArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProductModelTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateProductModelPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
