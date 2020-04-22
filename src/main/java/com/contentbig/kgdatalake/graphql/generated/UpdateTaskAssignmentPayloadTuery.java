// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class UpdateTaskAssignmentPayloadTuery extends Tuery<UpdateTaskAssignmentPayloadTuery> {
    UpdateTaskAssignmentPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class TaskassignmentArguments extends Arguments {
        TaskassignmentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public TaskassignmentArguments filter(TaskAssignmentFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public TaskassignmentArguments order(TaskAssignmentOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public TaskassignmentArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public TaskassignmentArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TaskassignmentArgumentsDefinition {
        void define(TaskassignmentArguments args);
    }

    /**
    * 
    */
    public UpdateTaskAssignmentPayloadTuery taskassignment(TaskAssignmentTueryDefinition queryDef) {
        return taskassignment(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateTaskAssignmentPayloadTuery taskassignment(TaskassignmentArgumentsDefinition argsDef, TaskAssignmentTueryDefinition queryDef) {
        startField("taskassignment");

        TaskassignmentArguments args = new TaskassignmentArguments(_queryBuilder);
        argsDef.define(args);
        TaskassignmentArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskAssignmentTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateTaskAssignmentPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
