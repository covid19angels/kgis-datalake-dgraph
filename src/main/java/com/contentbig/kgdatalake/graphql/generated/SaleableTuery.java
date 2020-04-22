// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Tuery;

/**
* �?�购物：�?�以购买订购的产��?或��?务Product，Service
*/
public class SaleableTuery extends Tuery<SaleableTuery> {
    SaleableTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    *     �?�以购买订购的产��?或��?务Product，Service    
    */
    public SaleableTuery isSaleable() {
        startField("isSaleable");

        return this;
    }

    public SaleableTuery onProduct(ProductTueryDefinition queryDef) {
        startInlineFragment("Product");
        queryDef.define(new ProductTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public SaleableTuery onProductModel(ProductModelTueryDefinition queryDef) {
        startInlineFragment("ProductModel");
        queryDef.define(new ProductModelTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
