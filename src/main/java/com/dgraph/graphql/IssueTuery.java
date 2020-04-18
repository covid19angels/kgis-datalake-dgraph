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
* Issueé—®é¢˜ï¼Œè¿›è¡Œè®¨è®ºé¡¹ç›®ä¸­çš„æƒ³æ³•ï¿½ï¿½?æ”¹è¿›ï¿½ï¿½?ä»»åŠ¡ï¿½ï¿½?ç¼ºé™·An Issue is a
* place to discuss ideas, enhancements, tasks, and bugs for a project.
*/
public class IssueTuery extends Tuery<IssueTuery> {
    IssueTuery(StringBuilder _queryBuilder) {
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
    public IssueTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public IssueTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public IssueTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public IssueTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public IssueTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public IssueTuery description() {
        startField("description");

        return this;
    }

    public class CreatorArguments extends Arguments {
        CreatorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public CreatorArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface CreatorArgumentsDefinition {
        void define(CreatorArguments args);
    }

    /**
    *     Issueåˆ›å»ºäºº    
    */
    public IssueTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     Issueåˆ›å»ºäºº    
    */
    public IssueTuery creator(CreatorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AssigneesArguments extends Arguments {
        AssigneesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AssigneesArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AssigneesArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AssigneesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public AssigneesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AssigneesArgumentsDefinition {
        void define(AssigneesArguments args);
    }

    /**
    *     å¤„ï¿½?ï¿½äººï¼ŒA list of Users assigned to this object.    
    */
    public IssueTuery assignees(UserTueryDefinition queryDef) {
        return assignees(args -> {}, queryDef);
    }

    /**
    *     å¤„ï¿½?ï¿½äººï¼ŒA list of Users assigned to this object.    
    */
    public IssueTuery assignees(AssigneesArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("assignees");

        AssigneesArguments args = new AssigneesArguments(_queryBuilder);
        argsDef.define(args);
        AssigneesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ParticipantsArguments extends Arguments {
        ParticipantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ParticipantsArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ParticipantsArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ParticipantsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ParticipantsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ParticipantsArgumentsDefinition {
        void define(ParticipantsArguments args);
    }

    /**
    *     ï¿½?ï¿½ä¸Žè€…ï¼ŒA list of Users that are participating in the Issue conversation.    
    */
    public IssueTuery participants(UserTueryDefinition queryDef) {
        return participants(args -> {}, queryDef);
    }

    /**
    *     ï¿½?ï¿½ä¸Žè€…ï¼ŒA list of Users that are participating in the Issue conversation.    
    */
    public IssueTuery participants(ParticipantsArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("participants");

        ParticipantsArguments args = new ParticipantsArguments(_queryBuilder);
        argsDef.define(args);
        ParticipantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TasksArguments extends Arguments {
        TasksArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public TasksArguments filter(TaskFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public TasksArguments order(TaskOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public TasksArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public TasksArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TasksArgumentsDefinition {
        void define(TasksArguments args);
    }

    /**
    *     å¤„ï¿½?ï¿½æœ¬Issueçš„ä»»åŠ¡    
    */
    public IssueTuery tasks(TaskTueryDefinition queryDef) {
        return tasks(args -> {}, queryDef);
    }

    /**
    *     å¤„ï¿½?ï¿½æœ¬Issueçš„ä»»åŠ¡    
    */
    public IssueTuery tasks(TasksArgumentsDefinition argsDef, TaskTueryDefinition queryDef) {
        startField("tasks");

        TasksArguments args = new TasksArguments(_queryBuilder);
        argsDef.define(args);
        TasksArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
