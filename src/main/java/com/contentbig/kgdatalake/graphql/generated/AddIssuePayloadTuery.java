// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddIssuePayloadTuery extends Tuery<AddIssuePayloadTuery> {
    AddIssuePayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class IssueArguments extends Arguments {
        IssueArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IssueArguments filter(IssueFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public IssueArguments order(IssueOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public IssueArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public IssueArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IssueArgumentsDefinition {
        void define(IssueArguments args);
    }

    /**
    * 
    */
    public AddIssuePayloadTuery issue(IssueTueryDefinition queryDef) {
        return issue(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddIssuePayloadTuery issue(IssueArgumentsDefinition argsDef, IssueTueryDefinition queryDef) {
        startField("issue");

        IssueArguments args = new IssueArguments(_queryBuilder);
        argsDef.define(args);
        IssueArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public AddIssuePayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
