// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* Issue问题，进行讨论项目中的想法��?改进��?任务��?缺陷An Issue is a place to discuss ideas, enhancements, tasks, and bugs
* for a project.
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
    *     Issue创建人    
    */
    public IssueTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     Issue创建人    
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
    *     处�?�人，A list of Users assigned to this object.    
    */
    public IssueTuery assignees(UserTueryDefinition queryDef) {
        return assignees(args -> {}, queryDef);
    }

    /**
    *     处�?�人，A list of Users assigned to this object.    
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
    *     �?�与者，A list of Users that are participating in the Issue conversation.    
    */
    public IssueTuery participants(UserTueryDefinition queryDef) {
        return participants(args -> {}, queryDef);
    }

    /**
    *     �?�与者，A list of Users that are participating in the Issue conversation.    
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
    *     处�?�本Issue的任务    
    */
    public IssueTuery tasks(TaskTueryDefinition queryDef) {
        return tasks(args -> {}, queryDef);
    }

    /**
    *     处�?�本Issue的任务    
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
