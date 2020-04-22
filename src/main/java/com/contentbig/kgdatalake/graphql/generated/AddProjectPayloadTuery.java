// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 
*/
public class AddProjectPayloadTuery extends Tuery<AddProjectPayloadTuery> {
    AddProjectPayloadTuery(StringBuilder _queryBuilder) {
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
    public AddProjectPayloadTuery project(ProjectTueryDefinition queryDef) {
        return project(args -> {}, queryDef);
    }

    /**
    * 
    */
    public AddProjectPayloadTuery project(ProjectArgumentsDefinition argsDef, ProjectTueryDefinition queryDef) {
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
    public AddProjectPayloadTuery numUids() {
        startField("numUids");

        return this;
    }
}
