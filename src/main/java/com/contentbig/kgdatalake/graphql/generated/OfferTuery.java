// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 商��?供应
*/
public class OfferTuery extends Tuery<OfferTuery> {
    OfferTuery(StringBuilder _queryBuilder) {
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
    public OfferTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public OfferTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public OfferTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public OfferTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public OfferTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public OfferTuery description() {
        startField("description");

        return this;
    }

    /**
    *     �?�购物的一个商��?供应    
    */
    public OfferTuery itemOffered(SaleableTueryDefinition queryDef) {
        startField("itemOffered");

        _queryBuilder.append('{');
        queryDef.define(new SaleableTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     供应商��?的组织或个人 Inverse property: makesOffer.    
    */
    public OfferTuery offeredBy(PartyTueryDefinition queryDef) {
        startField("offeredBy");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     商��?价格The offer price of a product, or of a price component when attached to PriceSpecification
    * and its subtypes.    
    */
    public OfferTuery price() {
        startField("price");

        return this;
    }

    /**
    *     ��?价格有效开始日期】    
    */
    public OfferTuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    *     ��?价格有效结�?�日期】    
    */
    public OfferTuery dateThrough() {
        startField("dateThrough");

        return this;
    }
}
