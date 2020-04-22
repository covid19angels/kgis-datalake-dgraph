// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 项目组织，以实现精心计划的特定目标an individual or collaborative enterprise that is carefully planned to achieve a
* particular aim.
*/
public class ProjectTuery extends Tuery<ProjectTuery> {
    ProjectTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class ParentOrganizationArguments extends Arguments {
        ParentOrganizationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ParentOrganizationArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ParentOrganizationArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ParentOrganizationArgumentsDefinition {
        void define(ParentOrganizationArguments args);
    }

    /**
    * 
    */
    public ProjectTuery parentOrganization(OrganizationTueryDefinition queryDef) {
        return parentOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProjectTuery parentOrganization(ParentOrganizationArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
        startField("parentOrganization");

        ParentOrganizationArguments args = new ParentOrganizationArguments(_queryBuilder);
        argsDef.define(args);
        ParentOrganizationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubOrganizationsArguments extends Arguments {
        SubOrganizationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SubOrganizationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SubOrganizationsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubOrganizationsArgumentsDefinition {
        void define(SubOrganizationsArguments args);
    }

    /**
    * 
    */
    public ProjectTuery subOrganizations(OrganizationTueryDefinition queryDef) {
        return subOrganizations(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProjectTuery subOrganizations(SubOrganizationsArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
        startField("subOrganizations");

        SubOrganizationsArguments args = new SubOrganizationsArguments(_queryBuilder);
        argsDef.define(args);
        SubOrganizationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DepartmentsArguments extends Arguments {
        DepartmentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DepartmentsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public DepartmentsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface DepartmentsArgumentsDefinition {
        void define(DepartmentsArguments args);
    }

    /**
    * 
    */
    public ProjectTuery departments(OrganizationTueryDefinition queryDef) {
        return departments(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProjectTuery departments(DepartmentsArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
        startField("departments");

        DepartmentsArguments args = new DepartmentsArguments(_queryBuilder);
        argsDef.define(args);
        DepartmentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasPartyRoleNameArguments extends Arguments {
        HasPartyRoleNameArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasPartyRoleNameArguments filter(PartyRoleNameFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartyRoleNameArguments order(PartyRoleNameOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartyRoleNameArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartyRoleNameArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasPartyRoleNameArgumentsDefinition {
        void define(HasPartyRoleNameArguments args);
    }

    /**
    * 
    */
    public ProjectTuery hasPartyRoleName(PartyRoleNameTueryDefinition queryDef) {
        return hasPartyRoleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProjectTuery hasPartyRoleName(HasPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
        startField("hasPartyRoleName");

        HasPartyRoleNameArguments args = new HasPartyRoleNameArguments(_queryBuilder);
        argsDef.define(args);
        HasPartyRoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
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
    public ProjectTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public ProjectTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public ProjectTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public ProjectTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public ProjectTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public ProjectTuery description() {
        startField("description");

        return this;
    }

    public class AvailableConversationsArguments extends Arguments {
        AvailableConversationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public AvailableConversationsArguments filter(ConversationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AvailableConversationsArguments order(ConversationOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public AvailableConversationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public AvailableConversationsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AvailableConversationsArgumentsDefinition {
        void define(AvailableConversationsArguments args);
    }

    /**
    *     �?�以访问的会��?    
    */
    public ProjectTuery availableConversations(ConversationTueryDefinition queryDef) {
        return availableConversations(args -> {}, queryDef);
    }

    /**
    *     �?�以访问的会��?    
    */
    public ProjectTuery availableConversations(AvailableConversationsArgumentsDefinition argsDef, ConversationTueryDefinition queryDef) {
        startField("availableConversations");

        AvailableConversationsArguments args = new AvailableConversationsArguments(_queryBuilder);
        argsDef.define(args);
        AvailableConversationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DefaultConversationArguments extends Arguments {
        DefaultConversationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public DefaultConversationArguments filter(ConversationFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface DefaultConversationArgumentsDefinition {
        void define(DefaultConversationArguments args);
    }

    /**
    *     本组织默认�?�访问的会��?    
    */
    public ProjectTuery defaultConversation(ConversationTueryDefinition queryDef) {
        return defaultConversation(args -> {}, queryDef);
    }

    /**
    *     本组织默认�?�访问的会��?    
    */
    public ProjectTuery defaultConversation(DefaultConversationArgumentsDefinition argsDef, ConversationTueryDefinition queryDef) {
        startField("defaultConversation");

        DefaultConversationArguments args = new DefaultConversationArguments(_queryBuilder);
        argsDef.define(args);
        DefaultConversationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ConversationTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasPartArguments extends Arguments {
        HasPartArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasPartArguments filter(TaskFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartArguments order(TaskOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasPartArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasPartArgumentsDefinition {
        void define(HasPartArguments args);
    }

    /**
    *     �?�照(组织之间或特定主题的人员之间的一个或多个消�?�。 �?�以使用isPartOf或hasPart属性将个人消�?�链接到会��?。)    
    */
    public ProjectTuery hasPart(TaskTueryDefinition queryDef) {
        return hasPart(args -> {}, queryDef);
    }

    /**
    *     �?�照(组织之间或特定主题的人员之间的一个或多个消�?�。 �?�以使用isPartOf或hasPart属性将个人消�?�链接到会��?。)    
    */
    public ProjectTuery hasPart(HasPartArgumentsDefinition argsDef, TaskTueryDefinition queryDef) {
        startField("hasPart");

        HasPartArguments args = new HasPartArguments(_queryBuilder);
        argsDef.define(args);
        HasPartArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TaskTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SponsorArguments extends Arguments {
        SponsorArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SponsorArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SponsorArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SponsorArgumentsDefinition {
        void define(SponsorArguments args);
    }

    /**
    *     项目业主赞助人    
    */
    public ProjectTuery sponsor(PartyTueryDefinition queryDef) {
        return sponsor(args -> {}, queryDef);
    }

    /**
    *     项目业主赞助人    
    */
    public ProjectTuery sponsor(SponsorArgumentsDefinition argsDef, PartyTueryDefinition queryDef) {
        startField("sponsor");

        SponsorArguments args = new SponsorArguments(_queryBuilder);
        argsDef.define(args);
        SponsorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ManagersArguments extends Arguments {
        ManagersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ManagersArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ManagersArguments order(UserOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public ManagersArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public ManagersArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ManagersArgumentsDefinition {
        void define(ManagersArguments args);
    }

    /**
    *     项目管�?�员    
    */
    public ProjectTuery managers(UserTueryDefinition queryDef) {
        return managers(args -> {}, queryDef);
    }

    /**
    *     项目管�?�员    
    */
    public ProjectTuery managers(ManagersArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("managers");

        ManagersArguments args = new ManagersArguments(_queryBuilder);
        argsDef.define(args);
        ManagersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
