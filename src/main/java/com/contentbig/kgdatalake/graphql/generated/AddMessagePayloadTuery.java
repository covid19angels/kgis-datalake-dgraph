// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddMessagePayloadTuery extends Tuery<AddMessagePayloadTuery> {
    AddMessagePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class MessageArguments extends Arguments {
        MessageArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public MessageArguments filter(MessageFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MessageArguments order(MessageOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MessageArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public MessageArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MessageArgumentsDefinition {
        void define(MessageArguments args);
    }

    /**
    * 
    */
    public AddMessagePayloadTuery message(MessageTueryDefinition queryDef) {
        return message(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddMessagePayloadTuery message(MessageArgumentsDefinition argsDef, MessageTueryDefinition queryDef) {
        startField("message");

        MessageArguments args = new MessageArguments(_queryBuilder);
        argsDef.define(args);
        MessageArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MessageTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddMessagePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
