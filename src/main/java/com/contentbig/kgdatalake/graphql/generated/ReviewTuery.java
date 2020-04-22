// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* ��?评论】对项目的评论 - 例如对�?�客文章的评论。 该评论的内容是通过text属性表示的，其主题通过about，与所有CreativeWorks共享的属性�?�表达 A comment on
* an item - for example, a comment on a blog post. The comment's content is expressed via the text
* property, and its topic via about, properties shared with all CreativeWorks.
*/
public class ReviewTuery extends Tuery<ReviewTuery> {
    ReviewTuery(StringBuilder _queryBuilder) {
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
    public ReviewTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ReviewTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public ReviewTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ReviewTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ReviewTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ReviewTuery description() {
        startField("description");

        return this;
    }

    public class ItemReviewedArguments extends Arguments {
        ItemReviewedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ItemReviewedArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ItemReviewedArgumentsDefinition {
        void define(ItemReviewedArguments args);
    }

    /**
    *     评估的事物，itemReviewed    Thing    The item that is being reviewed/rated.    
    */
    public ReviewTuery itemReviewed(ThingTueryDefinition queryDef) {
        return itemReviewed(args -> {}, queryDef);
    }

    /**
    *     评估的事物，itemReviewed    Thing    The item that is being reviewed/rated.    
    */
    public ReviewTuery itemReviewed(ItemReviewedArgumentsDefinition argsDef, ThingTueryDefinition queryDef) {
        startField("itemReviewed");

        ItemReviewedArguments args = new ItemReviewedArguments(_queryBuilder);
        argsDef.define(args);
        ItemReviewedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     评估方�?�，    reviewAspect    Text    This Review or Rating is relevant to this part or facet of
    * the itemReviewed.    
    */
    public ReviewTuery reviewAspect() {
        startField("reviewAspect");

        return this;
    }

    /**
    *     评估说明的具体内容    reviewBody    Text    The actual body of the review.    
    */
    public ReviewTuery reviewBody() {
        startField("reviewBody");

        return this;
    }

    /**
    *     评分，ratingValue     The rating for the content.    
    */
    public ReviewTuery ratingValue() {
        startField("ratingValue");

        return this;
    }

    public class AuthorArguments extends Arguments {
        AuthorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AuthorArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AuthorArgumentsDefinition {
        void define(AuthorArguments args);
    }

    /**
    *     ��?作者】 此内容或评分的作者。    
    */
    public ReviewTuery author(UserTueryDefinition queryDef) {
        return author(args -> {}, queryDef);
    }

    /**
    *     ��?作者】 此内容或评分的作者。    
    */
    public ReviewTuery author(AuthorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("author");

        AuthorArguments args = new AuthorArguments(_queryBuilder);
        argsDef.define(args);
        AuthorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ��?创建日期】 创作出CreativeWork的日期。    
    */
    public ReviewTuery dateCreated() {
        startField("dateCreated");

        return this;
    }
}
