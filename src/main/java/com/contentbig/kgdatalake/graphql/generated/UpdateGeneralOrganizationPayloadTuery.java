// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateGeneralOrganizationPayloadTuery extends Tuery<UpdateGeneralOrganizationPayloadTuery> {
    UpdateGeneralOrganizationPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class GeneralorganizationArguments extends Arguments {
        GeneralorganizationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public GeneralorganizationArguments filter(GeneralOrganizationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public GeneralorganizationArguments order(GeneralOrganizationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public GeneralorganizationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public GeneralorganizationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface GeneralorganizationArgumentsDefinition {
        void define(GeneralorganizationArguments args);
    }

    /**
    * 
    */
    public UpdateGeneralOrganizationPayloadTuery generalorganization(GeneralOrganizationTueryDefinition queryDef) {
        return generalorganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateGeneralOrganizationPayloadTuery generalorganization(GeneralorganizationArgumentsDefinition argsDef, GeneralOrganizationTueryDefinition queryDef) {
        startField("generalorganization");

        GeneralorganizationArguments args = new GeneralorganizationArguments(_queryBuilder);
        argsDef.define(args);
        GeneralorganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new GeneralOrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateGeneralOrganizationPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
