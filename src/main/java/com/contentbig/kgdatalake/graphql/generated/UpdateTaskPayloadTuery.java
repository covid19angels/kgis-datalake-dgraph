// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateTaskPayloadTuery extends Tuery<UpdateTaskPayloadTuery> {
    UpdateTaskPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class TaskArguments extends Arguments {
        TaskArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public TaskArguments filter(TaskFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public TaskArguments order(TaskOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public TaskArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public TaskArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TaskArgumentsDefinition {
        void define(TaskArguments args);
    }

    /**
    * 
    */
    public UpdateTaskPayloadTuery task(TaskTueryDefinition queryDef) {
        return task(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateTaskPayloadTuery task(TaskArgumentsDefinition argsDef, TaskTueryDefinition queryDef) {
        startField("task");

        TaskArguments args = new TaskArguments(_queryBuilder);
        argsDef.define(args);
        TaskArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateTaskPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
