// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateNamespacePayloadTuery extends Tuery<UpdateNamespacePayloadTuery> {
    UpdateNamespacePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class NamespaceArguments extends Arguments {
        NamespaceArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespaceArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespaceArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespaceArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespaceArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespaceArgumentsDefinition {
        void define(NamespaceArguments args);
    }

    /**
    * 
    */
    public UpdateNamespacePayloadTuery namespace(NamespaceTueryDefinition queryDef) {
        return namespace(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateNamespacePayloadTuery namespace(NamespaceArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("namespace");

        NamespaceArguments args = new NamespaceArguments(_queryBuilder);
        argsDef.define(args);
        NamespaceArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateNamespacePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
