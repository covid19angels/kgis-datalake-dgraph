// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateDataCatalogPayloadTuery extends Tuery<UpdateDataCatalogPayloadTuery> {
    UpdateDataCatalogPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class DatacatalogArguments extends Arguments {
        DatacatalogArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DatacatalogArguments filter(DataCatalogFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DatacatalogArguments order(DataCatalogOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DatacatalogArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DatacatalogArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DatacatalogArgumentsDefinition {
        void define(DatacatalogArguments args);
    }

    /**
    * 
    */
    public UpdateDataCatalogPayloadTuery datacatalog(DataCatalogTueryDefinition queryDef) {
        return datacatalog(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateDataCatalogPayloadTuery datacatalog(DatacatalogArgumentsDefinition argsDef, DataCatalogTueryDefinition queryDef) {
        startField("datacatalog");

        DatacatalogArguments args = new DatacatalogArguments(_queryBuilder);
        argsDef.define(args);
        DatacatalogArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateDataCatalogPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
