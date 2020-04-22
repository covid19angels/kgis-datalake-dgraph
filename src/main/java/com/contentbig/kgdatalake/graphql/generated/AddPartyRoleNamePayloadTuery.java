// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddPartyRoleNamePayloadTuery extends Tuery<AddPartyRoleNamePayloadTuery> {
    AddPartyRoleNamePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class PartyrolenameArguments extends Arguments {
        PartyrolenameArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PartyrolenameArguments filter(PartyRoleNameFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PartyrolenameArguments order(PartyRoleNameOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public PartyrolenameArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public PartyrolenameArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PartyrolenameArgumentsDefinition {
        void define(PartyrolenameArguments args);
    }

    /**
    * 
    */
    public AddPartyRoleNamePayloadTuery partyrolename(PartyRoleNameTueryDefinition queryDef) {
        return partyrolename(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddPartyRoleNamePayloadTuery partyrolename(PartyrolenameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
        startField("partyrolename");

        PartyrolenameArguments args = new PartyrolenameArguments(_queryBuilder);
        argsDef.define(args);
        PartyrolenameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddPartyRoleNamePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
