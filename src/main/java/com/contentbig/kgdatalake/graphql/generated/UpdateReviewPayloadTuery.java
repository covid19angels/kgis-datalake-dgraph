// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateReviewPayloadTuery extends Tuery<UpdateReviewPayloadTuery> {
    UpdateReviewPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ReviewArguments extends Arguments {
        ReviewArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ReviewArguments filter(ReviewFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReviewArguments order(ReviewOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReviewArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ReviewArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReviewArgumentsDefinition {
        void define(ReviewArguments args);
    }

    /**
    * 
    */
    public UpdateReviewPayloadTuery review(ReviewTueryDefinition queryDef) {
        return review(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateReviewPayloadTuery review(ReviewArgumentsDefinition argsDef, ReviewTueryDefinition queryDef) {
        startField("review");

        ReviewArguments args = new ReviewArguments(_queryBuilder);
        argsDef.define(args);
        ReviewArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReviewTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateReviewPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
