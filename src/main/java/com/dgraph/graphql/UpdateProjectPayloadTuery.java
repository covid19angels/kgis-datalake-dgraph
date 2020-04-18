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
public class UpdateProjectPayloadTuery extends Tuery<UpdateProjectPayloadTuery> {
    UpdateProjectPayloadTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class ProjectArguments extends Arguments {
        ProjectArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ProjectArguments filter(ProjectFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProjectArguments order(ProjectOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ProjectArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ProjectArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProjectArgumentsDefinition {
        void define(ProjectArguments args);
    }

    /**
    * 
    */
    public UpdateProjectPayloadTuery project(ProjectTueryDefinition queryDef) {
        return project(args -> {}, queryDef);
    }

    /**
    * 
    */
    public UpdateProjectPayloadTuery project(ProjectArgumentsDefinition argsDef, ProjectTueryDefinition queryDef) {
        startField("project");

        ProjectArguments args = new ProjectArguments(_queryBuilder);
        argsDef.define(args);
        ProjectArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProjectTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public UpdateProjectPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
