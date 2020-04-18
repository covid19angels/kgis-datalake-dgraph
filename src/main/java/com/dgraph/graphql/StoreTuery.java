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
* é›¶å”®åº—é“º
*/
public class StoreTuery extends Tuery<StoreTuery> {
    StoreTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public class OwnsArguments extends Arguments {
        OwnsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OwnsArguments filter(OwnershipFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments order(OwnershipOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public OwnsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface OwnsArgumentsDefinition {
        void define(OwnsArguments args);
    }

    /**
    * 
    */
    public StoreTuery owns(OwnershipTueryDefinition queryDef) {
        return owns(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreTuery owns(OwnsArgumentsDefinition argsDef, OwnershipTueryDefinition queryDef) {
        startField("owns");

        OwnsArguments args = new OwnsArguments(_queryBuilder);
        argsDef.define(args);
        OwnsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new OwnershipTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class HasNamespacesArguments extends Arguments {
        HasNamespacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasNamespacesArguments filter(NamespaceFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments order(NamespaceOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public HasNamespacesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface HasNamespacesArgumentsDefinition {
        void define(HasNamespacesArguments args);
    }

    /**
    * 
    */
    public StoreTuery hasNamespaces(NamespaceTueryDefinition queryDef) {
        return hasNamespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreTuery hasNamespaces(HasNamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("hasNamespaces");

        HasNamespacesArguments args = new HasNamespacesArguments(_queryBuilder);
        argsDef.define(args);
        HasNamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
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
    public StoreTuery parentOrganization(OrganizationTueryDefinition queryDef) {
        return parentOrganization(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreTuery parentOrganization(ParentOrganizationArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
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
    public StoreTuery subOrganizations(OrganizationTueryDefinition queryDef) {
        return subOrganizations(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreTuery subOrganizations(SubOrganizationsArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
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
    public StoreTuery departments(OrganizationTueryDefinition queryDef) {
        return departments(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreTuery departments(DepartmentsArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
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
    public StoreTuery hasPartyRoleName(PartyRoleNameTueryDefinition queryDef) {
        return hasPartyRoleName(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreTuery hasPartyRoleName(HasPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
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
    public StoreTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public StoreTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public StoreTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public StoreTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public StoreTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public StoreTuery description() {
        startField("description");

        return this;
    }

    public class EmployeesArguments extends Arguments {
        EmployeesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public EmployeesArguments filter(EmployeeRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeesArguments order(EmployeeRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public EmployeesArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface EmployeesArgumentsDefinition {
        void define(EmployeesArguments args);
    }

    /**
    *     ï¿½ï¿½?é›‡å‘˜ã€‘ ç»„ç»‡çš„é›‡å‘˜.åœ¨ç»„ç»‡æ‰¿æ‹…è§’è‰²çš„ä¸ªäººæœ‰æ—¶é—´ï¿½ï¿½?åˆ¶    
    */
    public StoreTuery employees(EmployeeRoleTueryDefinition queryDef) {
        return employees(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?é›‡å‘˜ã€‘ ç»„ç»‡çš„é›‡å‘˜.åœ¨ç»„ç»‡æ‰¿æ‹…è§’è‰²çš„ä¸ªäººæœ‰æ—¶é—´ï¿½ï¿½?åˆ¶    
    */
    public StoreTuery employees(EmployeesArgumentsDefinition argsDef, EmployeeRoleTueryDefinition queryDef) {
        startField("employees");

        EmployeesArguments args = new EmployeesArguments(_queryBuilder);
        argsDef.define(args);
        EmployeesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class FollowersArguments extends Arguments {
        FollowersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public FollowersArguments filter(FollowerRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FollowersArguments order(FollowerRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public FollowersArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public FollowersArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface FollowersArgumentsDefinition {
        void define(FollowersArguments args);
    }

    /**
    *     ï¿½ï¿½?å…³æ³¨ç»„ç»‡çš„äººã€‘ ç¤¾äº¤ç½‘ç»œä¸Šæœ¬ç»„ç»‡è¢«åˆ«äººå…³æ³¨    
    */
    public StoreTuery followers(FollowerRoleTueryDefinition queryDef) {
        return followers(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?å…³æ³¨ç»„ç»‡çš„äººã€‘ ç¤¾äº¤ç½‘ç»œä¸Šæœ¬ç»„ç»‡è¢«åˆ«äººå…³æ³¨    
    */
    public StoreTuery followers(FollowersArgumentsDefinition argsDef, FollowerRoleTueryDefinition queryDef) {
        startField("followers");

        FollowersArguments args = new FollowersArguments(_queryBuilder);
        argsDef.define(args);
        FollowersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new FollowerRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MembersArguments extends Arguments {
        MembersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public MembersArguments filter(MemberRoleFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MembersArguments order(MemberRoleOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public MembersArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public MembersArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface MembersArgumentsDefinition {
        void define(MembersArguments args);
    }

    /**
    *     ï¿½ï¿½?ä¼šå‘˜ã€‘ ç»„ç»‡æˆ–é¡¹ç›®çš„ï¿½ï¿½?å‘˜,åœ¨ç»„ç»‡æ‰¿æ‹…è§’è‰²çš„ä¸ªäººæœ‰æ—¶é—´ï¿½ï¿½?åˆ¶ 
    */
    public StoreTuery members(MemberRoleTueryDefinition queryDef) {
        return members(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ä¼šå‘˜ã€‘ ç»„ç»‡æˆ–é¡¹ç›®çš„ï¿½ï¿½?å‘˜,åœ¨ç»„ç»‡æ‰¿æ‹…è§’è‰²çš„ä¸ªäººæœ‰æ—¶é—´ï¿½ï¿½?åˆ¶ 
    */
    public StoreTuery members(MembersArgumentsDefinition argsDef, MemberRoleTueryDefinition queryDef) {
        startField("members");

        MembersArguments args = new MembersArguments(_queryBuilder);
        argsDef.define(args);
        MembersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MemberRoleTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ï¿½ï¿½?åˆ›å»ºæ—¥æœŸã€‘    
    */
    public StoreTuery dateCreated() {
        startField("dateCreated");

        return this;
    }

    /**
    *     ï¿½ï¿½?æ›´æ–°æ—¥æœŸã€‘    
    */
    public StoreTuery dateModified() {
        startField("dateModified");

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
    *     ï¿½ï¿½?åˆ›å»ºäººã€‘ è¯¥ç‰©ä½“çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */
    public StoreTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?åˆ›å»ºäººã€‘ è¯¥ç‰©ä½“çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */
    public StoreTuery creator(CreatorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
