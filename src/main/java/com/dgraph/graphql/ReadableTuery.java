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
* ï¿½?ï¿½è¯»ç‰©
*/
public class ReadableTuery extends Tuery<ReadableTuery> {
    ReadableTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public class HasReadNotesArguments extends Arguments {
        HasReadNotesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasReadNotesArguments filter(ReadNoteFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments order(ReadNoteOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasReadNotesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasReadNotesArgumentsDefinition {
        void define(HasReadNotesArguments args);
    }

    /**
    *     ï¿½ï¿½?é˜…è¯»æ”¶ï¿½?ï¿½ã€‘ è®°å½•ï¿½ï¿½?ä¸ªäººé˜…è¯»æœ¬ï¿½?ï¿½æ¶ˆï¿½?ï¿½çš„æ—¶é—´,é€†å±žæ€§:
    * ReadNote.isReadNoteOf    
    */
    public ReadableTuery hasReadNotes(ReadNoteTueryDefinition queryDef) {
        return hasReadNotes(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?é˜…è¯»æ”¶ï¿½?ï¿½ã€‘ è®°å½•ï¿½ï¿½?ä¸ªäººé˜…è¯»æœ¬ï¿½?ï¿½æ¶ˆï¿½?ï¿½çš„æ—¶é—´,é€†å±žæ€§:
    * ReadNote.isReadNoteOf    
    */
    public ReadableTuery hasReadNotes(HasReadNotesArgumentsDefinition argsDef, ReadNoteTueryDefinition queryDef) {
        startField("hasReadNotes");

        HasReadNotesArguments args = new HasReadNotesArguments(_queryBuilder);
        argsDef.define(args);
        HasReadNotesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ReadableTuery onMessage(MessageTueryDefinition queryDef) {
        startInlineFragment("Message");
        queryDef.define(new MessageTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}