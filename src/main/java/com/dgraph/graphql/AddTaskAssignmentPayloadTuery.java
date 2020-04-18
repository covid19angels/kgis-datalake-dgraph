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
* 
*/
public class AddTaskAssignmentPayloadTuery extends Tuery<AddTaskAssignmentPayloadTuery> {
    AddTaskAssignmentPayloadTuery(StringBuilder _queryBuilder) {
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
    public AddTaskAssignmentPayloadTuery taskassignment(TaskAssignmentTueryDefinition queryDef) {
        return taskassignment(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddTaskAssignmentPayloadTuery taskassignment(TaskassignmentArgumentsDefinition argsDef, TaskAssignmentTueryDefinition queryDef) {
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
    public AddTaskAssignmentPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
