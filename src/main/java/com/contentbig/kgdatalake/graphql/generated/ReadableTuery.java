// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* �?�读物
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
    *     ��?阅读收�?�】 记录��?个人阅读本�?�消�?�的时间,逆属性: ReadNote.isReadNoteOf    
    */
    public ReadableTuery hasReadNotes(ReadNoteTueryDefinition queryDef) {
        return hasReadNotes(args -> {}, queryDef);
    }

    /**
    *     ��?阅读收�?�】 记录��?个人阅读本�?�消�?�的时间,逆属性: ReadNote.isReadNoteOf    
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
