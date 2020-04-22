// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 工�?�或任务，需��?计划在��?段时间内完��?的工作
*/
public class TaskTuery extends Tuery<TaskTuery> {
    TaskTuery(StringBuilder _queryBuilder) {
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
    public TaskTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public TaskTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public TaskTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public TaskTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public TaskTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public TaskTuery description() {
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
        public AboutArguments filter(IssueFilter value) {
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
    *     The subject matter of the content.    
    */
    public TaskTuery about(IssueTueryDefinition queryDef) {
        return about(args -> {}, queryDef);
    }

    /**
    *     The subject matter of the content.    
    */
    public TaskTuery about(AboutArgumentsDefinition argsDef, IssueTueryDefinition queryDef) {
        startField("about");

        AboutArguments args = new AboutArguments(_queryBuilder);
        argsDef.define(args);
        AboutArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class IsPartOfArguments extends Arguments {
        IsPartOfArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public IsPartOfArguments filter(ProjectFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface IsPartOfArgumentsDefinition {
        void define(IsPartOfArguments args);
    }

    /**
    *     �?�照(组织之间或特定主题的人员之间的一个或多个消�?�。 �?�以使用isPartOf或hasPart属性将个人消�?�链接到会��?。)    
    */
    public TaskTuery isPartOf(ProjectTueryDefinition queryDef) {
        return isPartOf(args -> {}, queryDef);
    }

    /**
    *     �?�照(组织之间或特定主题的人员之间的一个或多个消�?�。 �?�以使用isPartOf或hasPart属性将个人消�?�链接到会��?。)    
    */
    public TaskTuery isPartOf(IsPartOfArgumentsDefinition argsDef, ProjectTueryDefinition queryDef) {
        startField("isPartOf");

        IsPartOfArguments args = new IsPartOfArguments(_queryBuilder);
        argsDef.define(args);
        IsPartOfArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProjectTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     任务WBS编�?�    
    */
    public TaskTuery wbsNo() {
        startField("wbsNO");

        return this;
    }

    /**
    *     任务优先级    
    */
    public TaskTuery priority() {
        startField("priority");

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
    *     任务创建人    
    */
    public TaskTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     任务创建人    
    */
    public TaskTuery creator(CreatorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class WatcherArguments extends Arguments {
        WatcherArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public WatcherArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WatcherArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public WatcherArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public WatcherArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface WatcherArgumentsDefinition {
        void define(WatcherArguments args);
    }

    /**
    *     任务关注人    
    */
    public TaskTuery watcher(UserTueryDefinition queryDef) {
        return watcher(args -> {}, queryDef);
    }

    /**
    *     任务关注人    
    */
    public TaskTuery watcher(WatcherArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("watcher");

        WatcherArguments args = new WatcherArguments(_queryBuilder);
        argsDef.define(args);
        WatcherArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     任务计划开始时间    
    */
    public TaskTuery planStart() {
        startField("planStart");

        return this;
    }

    /**
    *     任务计划结�?�时间    
    */
    public TaskTuery planFinish() {
        startField("planFinish");

        return this;
    }

    /**
    *     任务完��?百分比    
    */
    public TaskTuery percentComplete() {
        startField("percentComplete");

        return this;
    }

    /**
    *     任务创建时间    
    */
    public TaskTuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    *     任务修改时间    
    */
    public TaskTuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    public class ParentTaskArguments extends Arguments {
        ParentTaskArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ParentTaskArguments filter(TaskFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ParentTaskArgumentsDefinition {
        void define(ParentTaskArguments args);
    }

    /**
    *     任务上级    
    */
    public TaskTuery parentTask(TaskTueryDefinition queryDef) {
        return parentTask(args -> {}, queryDef);
    }

    /**
    *     任务上级    
    */
    public TaskTuery parentTask(ParentTaskArgumentsDefinition argsDef, TaskTueryDefinition queryDef) {
        startField("parentTask");

        ParentTaskArguments args = new ParentTaskArguments(_queryBuilder);
        argsDef.define(args);
        ParentTaskArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PreviousTaskArguments extends Arguments {
        PreviousTaskArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PreviousTaskArguments filter(TaskFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface PreviousTaskArgumentsDefinition {
        void define(PreviousTaskArguments args);
    }

    /**
    *     任务��?一�?�    
    */
    public TaskTuery previousTask(TaskTueryDefinition queryDef) {
        return previousTask(args -> {}, queryDef);
    }

    /**
    *     任务��?一�?�    
    */
    public TaskTuery previousTask(PreviousTaskArgumentsDefinition argsDef, TaskTueryDefinition queryDef) {
        startField("previousTask");

        PreviousTaskArguments args = new PreviousTaskArguments(_queryBuilder);
        argsDef.define(args);
        PreviousTaskArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubTasksArguments extends Arguments {
        SubTasksArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SubTasksArguments filter(TaskFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SubTasksArguments order(TaskOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SubTasksArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SubTasksArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubTasksArgumentsDefinition {
        void define(SubTasksArguments args);
    }

    /**
    *     任务下级    
    */
    public TaskTuery subTasks(TaskTueryDefinition queryDef) {
        return subTasks(args -> {}, queryDef);
    }

    /**
    *     任务下级    
    */
    public TaskTuery subTasks(SubTasksArgumentsDefinition argsDef, TaskTueryDefinition queryDef) {
        startField("subTasks");

        SubTasksArguments args = new SubTasksArguments(_queryBuilder);
        argsDef.define(args);
        SubTasksArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DependsOnArguments extends Arguments {
        DependsOnArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DependsOnArguments filter(TaskFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DependsOnArguments order(TaskOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public DependsOnArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DependsOnArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DependsOnArgumentsDefinition {
        void define(DependsOnArguments args);
    }

    /**
    *     任务��?赖    
    */
    public TaskTuery dependsOn(TaskTueryDefinition queryDef) {
        return dependsOn(args -> {}, queryDef);
    }

    /**
    *     任务��?赖    
    */
    public TaskTuery dependsOn(DependsOnArgumentsDefinition argsDef, TaskTueryDefinition queryDef) {
        startField("dependsOn");

        DependsOnArguments args = new DependsOnArguments(_queryBuilder);
        argsDef.define(args);
        DependsOnArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AssignmentsArguments extends Arguments {
        AssignmentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AssignmentsArguments filter(TaskAssignmentFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AssignmentsArguments order(TaskAssignmentOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AssignmentsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public AssignmentsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AssignmentsArgumentsDefinition {
        void define(AssignmentsArguments args);
    }

    /**
    *     任务分��?历�?�    
    */
    public TaskTuery assignments(TaskAssignmentTueryDefinition queryDef) {
        return assignments(args -> {}, queryDef);
    }

    /**
    *     任务分��?历�?�    
    */
    public TaskTuery assignments(AssignmentsArgumentsDefinition argsDef, TaskAssignmentTueryDefinition queryDef) {
        startField("assignments");

        AssignmentsArguments args = new AssignmentsArguments(_queryBuilder);
        argsDef.define(args);
        AssignmentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskAssignmentTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     任务状��?    
    */
    public TaskTuery status() {
        startField("status");

        return this;
    }
}
