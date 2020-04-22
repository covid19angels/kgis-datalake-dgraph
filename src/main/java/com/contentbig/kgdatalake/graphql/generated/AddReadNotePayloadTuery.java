// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddReadNotePayloadTuery extends Tuery<AddReadNotePayloadTuery> {
    AddReadNotePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ReadnoteArguments extends Arguments {
        ReadnoteArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ReadnoteArguments filter(ReadNoteFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReadnoteArguments order(ReadNoteOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ReadnoteArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ReadnoteArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReadnoteArgumentsDefinition {
        void define(ReadnoteArguments args);
    }

    /**
    * 
    */
    public AddReadNotePayloadTuery readnote(ReadNoteTueryDefinition queryDef) {
        return readnote(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddReadNotePayloadTuery readnote(ReadnoteArgumentsDefinition argsDef, ReadNoteTueryDefinition queryDef) {
        startField("readnote");

        ReadnoteArguments args = new ReadnoteArguments(_queryBuilder);
        argsDef.define(args);
        ReadnoteArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReadNoteTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddReadNotePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
