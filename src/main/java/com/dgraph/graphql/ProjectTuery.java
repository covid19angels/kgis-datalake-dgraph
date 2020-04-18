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
* é¡¹ç›®ç»„ç»‡ï¼Œä»¥å®žçŽ°ç²¾å¿ƒè®¡åˆ’çš„ç‰¹å®šç›®æ ‡an individual or collaborative enterprise that is
* carefully planned to achieve a particular aim.
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
    *     ï¿½?ï¿½ä»¥è®¿é—®çš„ä¼šï¿½ï¿½?    
    */
    public ProjectTuery availableConversations(ConversationTueryDefinition queryDef) {
        return availableConversations(args -> {}, queryDef);
    }

    /**
    *     ï¿½?ï¿½ä»¥è®¿é—®çš„ä¼šï¿½ï¿½?    
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
    *     æœ¬ç»„ç»‡é»˜è®¤ï¿½?ï¿½è®¿é—®çš„ä¼šï¿½ï¿½?    
    */
    public ProjectTuery defaultConversation(ConversationTueryDefinition queryDef) {
        return defaultConversation(args -> {}, queryDef);
    }

    /**
    *     æœ¬ç»„ç»‡é»˜è®¤ï¿½?ï¿½è®¿é—®çš„ä¼šï¿½ï¿½?    
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
    *     ï¿½?ï¿½ç…§(ç»„ç»‡ä¹‹é—´æˆ–ç‰¹å®šä¸»é¢˜çš„äººå‘˜ä¹‹é—´çš„ä¸€ä¸ªæˆ–å¤šä¸ªæ¶ˆï¿½?ï¿½ã€‚
    * ï¿½?ï¿½ä»¥ä½¿ç”¨isPartOfæˆ–hasPartå±žæ€§å°†ä¸ªäººæ¶ˆï¿½?ï¿½é“¾æŽ¥åˆ°ä¼šï¿½ï¿½?ã€‚)    
    */
    public ProjectTuery hasPart(TaskTueryDefinition queryDef) {
        return hasPart(args -> {}, queryDef);
    }

    /**
    *     ï¿½?ï¿½ç…§(ç»„ç»‡ä¹‹é—´æˆ–ç‰¹å®šä¸»é¢˜çš„äººå‘˜ä¹‹é—´çš„ä¸€ä¸ªæˆ–å¤šä¸ªæ¶ˆï¿½?ï¿½ã€‚
    * ï¿½?ï¿½ä»¥ä½¿ç”¨isPartOfæˆ–hasPartå±žæ€§å°†ä¸ªäººæ¶ˆï¿½?ï¿½é“¾æŽ¥åˆ°ä¼šï¿½ï¿½?ã€‚)    
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
    *     é¡¹ç›®ä¸šä¸»èµžåŠ©äºº    
    */
    public ProjectTuery sponsor(PartyTueryDefinition queryDef) {
        return sponsor(args -> {}, queryDef);
    }

    /**
    *     é¡¹ç›®ä¸šä¸»èµžåŠ©äºº    
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
    *     é¡¹ç›®ç®¡ï¿½?ï¿½å‘˜    
    */
    public ProjectTuery managers(UserTueryDefinition queryDef) {
        return managers(args -> {}, queryDef);
    }

    /**
    *     é¡¹ç›®ç®¡ï¿½?ï¿½å‘˜    
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
