// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateStorePayloadTuery extends Tuery<UpdateStorePayloadTuery> {
    UpdateStorePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class StoreArguments extends Arguments {
        StoreArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public StoreArguments filter(StoreFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StoreArguments order(StoreOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public StoreArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public StoreArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface StoreArgumentsDefinition {
        void define(StoreArguments args);
    }

    /**
    * 
    */
    public UpdateStorePayloadTuery store(StoreTueryDefinition queryDef) {
        return store(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateStorePayloadTuery store(StoreArgumentsDefinition argsDef, StoreTueryDefinition queryDef) {
        startField("store");

        StoreArguments args = new StoreArguments(_queryBuilder);
        argsDef.define(args);
        StoreArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new StoreTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateStorePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
