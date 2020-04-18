// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.dgraph.graphql;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Utils;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.math.BigDecimal;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* ï¿½ï¿½?è¯„è®ºã€‘å¯¹é¡¹ç›®çš„è¯„è®º - ä¾‹å¦‚å¯¹ï¿½?ï¿½å®¢æ–‡ç« çš„è¯„è®ºã€‚
* è¯¥è¯„è®ºçš„å†…å®¹æ˜¯é€šè¿‡textå±žæ€§è¡¨ç¤ºçš„ï¼Œå…¶ä¸»é¢˜é€šè¿‡aboutï¼Œä¸Žæ‰€æœ‰CreativeWorkså…±äº«
* çš„å±žæ€§ï¿½?ï¿½è¡¨è¾¾ A comment on an item - for example, a comment on a blog post. The comment's
* content is expressed via the text property, and its topic via about, properties shared with all
* CreativeWorks.
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
    *     è¯„ä¼°çš„äº‹ç‰©ï¼ŒitemReviewed    Thing    The item that is being reviewed/rated.    
    */
    public ReviewTuery itemReviewed(ThingTueryDefinition queryDef) {
        return itemReviewed(args -> {}, queryDef);
    }

    /**
    *     è¯„ä¼°çš„äº‹ç‰©ï¼ŒitemReviewed    Thing    The item that is being reviewed/rated.    
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
    *     è¯„ä¼°æ–¹ï¿½?ï¿½ï¼Œ    reviewAspect    Text    This Review or Rating is relevant to this part or
    * facet of the itemReviewed.    
    */
    public ReviewTuery reviewAspect() {
        startField("reviewAspect");

        return this;
    }

    /**
    *     è¯„ä¼°è¯´æ˜Žçš„å…·ä½“å†…å®¹    reviewBody    Text    The actual body of the review.    
    */
    public ReviewTuery reviewBody() {
        startField("reviewBody");

        return this;
    }

    /**
    *     è¯„åˆ†ï¼ŒratingValue     The rating for the content.    
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
    *     ï¿½ï¿½?ä½œè€…ã€‘ æ­¤å†…å®¹æˆ–è¯„åˆ†çš„ä½œè€…ã€‚    
    */
    public ReviewTuery author(UserTueryDefinition queryDef) {
        return author(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ æ­¤å†…å®¹æˆ–è¯„åˆ†çš„ä½œè€…ã€‚    
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
    *     ï¿½ï¿½?åˆ›å»ºæ—¥æœŸã€‘ åˆ›ä½œå‡ºCreativeWorkçš„æ—¥æœŸã€‚    
    */
    public ReviewTuery dateCreated() {
        startField("dateCreated");

        return this;
    }
}
