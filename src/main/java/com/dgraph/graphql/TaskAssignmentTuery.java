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
* ä»»åŠ¡åˆ†æ´¾
*/
public class TaskAssignmentTuery extends Tuery<TaskAssignmentTuery> {
    TaskAssignmentTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class NamespacesArguments extends Arguments {
        NamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public NamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public NamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface NamespacesArgumentsDefinition {
        void define(NamespacesArguments args);
    }

    /**
    * 
    */
    public TaskAssignmentTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public TaskAssignmentTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("namespaces");

        NamespacesArguments args = new NamespacesArguments(_queryBuilder);
        argsDef.define(args);
        NamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * 
    */
    public TaskAssignmentTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public TaskAssignmentTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public TaskAssignmentTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public TaskAssignmentTuery description() {
        startField("description");

        return this;
    }

    public class AboutArguments extends Arguments {
        AboutArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AboutArguments filter(TaskFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AboutArgumentsDefinition {
        void define(AboutArguments args);
    }

    /**
    *     ç›¸å…³ä»»åŠ¡    
    */
    public TaskAssignmentTuery about(TaskTueryDefinition queryDef) {
        return about(args -> {}, queryDef);
    }

    /**
    *     ç›¸å…³ä»»åŠ¡    
    */
    public TaskAssignmentTuery about(AboutArgumentsDefinition argsDef, TaskTueryDefinition queryDef) {
        startField("about");

        AboutArguments args = new AboutArguments(_queryBuilder);
        argsDef.define(args);
        AboutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class CommentArguments extends Arguments {
        CommentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CommentArguments filter(ReviewFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CommentArgumentsDefinition {
        void define(CommentArguments args);
    }

    /**
    *     ä»»åŠ¡æœ¬æ¬¡åˆ†ï¿½ï¿½?è¯´æ˜Ž    
    */
    public TaskAssignmentTuery comment(ReviewTueryDefinition queryDef) {
        return comment(args -> {}, queryDef);
    }

    /**
    *     ä»»åŠ¡æœ¬æ¬¡åˆ†ï¿½ï¿½?è¯´æ˜Ž    
    */
    public TaskAssignmentTuery comment(CommentArgumentsDefinition argsDef, ReviewTueryDefinition queryDef) {
        startField("comment");

        CommentArguments args = new CommentArguments(_queryBuilder);
        argsDef.define(args);
        CommentArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReviewTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ä»»åŠ¡æ‰§è¡Œäºº    
    */
    public TaskAssignmentTuery assignee(PartyTueryDefinition queryDef) {
        startField("assignee");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ä»»åŠ¡åˆ†ï¿½ï¿½?äºº    
    */
    public TaskAssignmentTuery assigner(PartyTueryDefinition queryDef) {
        startField("assigner");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ä»»åŠ¡æ‰§è¡Œäººé˜…è¯»æ—¶é—´    
    */
    public TaskAssignmentTuery readAt() {
        startField("readAt");

        return this;
    }

    /**
    *     ä»»åŠ¡æ‰§è¡ŒäººæŽ¥æ”¶æ—¶é—´    
    */
    public TaskAssignmentTuery acceptedAt() {
        startField("acceptedAt");

        return this;
    }

    /**
    *     ä»»åŠ¡åˆ†ï¿½ï¿½?æ—¶é—´    
    */
    public TaskAssignmentTuery assignedAt() {
        startField("assignedAt");

        return this;
    }
}
