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
* ï¿½ï¿½?æœºæž„ã€‘ä¸€ä¸ªç»„ç»‡ï¼Œä¾‹å¦‚å­¦æ ¡ï¿½ï¿½?ï¿½?ï¿½æ”¿åºœç»„ç»‡ï¿½ï¿½?å…¬ï¿½?ï¿½ï¿½ï¿½?ä¿±ï¿½ï
* ¿½?éƒ¨ç­‰,ä¹Ÿï¿½?ï¿½ç”¨äºŽä¸´æ—¶å‡ ä¸ªäººç»„ï¿½ï¿½?çš„ï¿½?ï¿½å¤©ï¿½ï¿½?ç»„ï¼Œæˆ¿é—´
*/
public class OrganizationTuery extends Tuery<OrganizationTuery> {
    OrganizationTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
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
    *     ï¿½ï¿½?ä¸Šçº§ç»„ç»‡ã€‘
    * subOrganizationçš„ï¿½??ï¿½?ï¿½å±žæ€§ï¼Œï¿½?ï¿½åŒ…ï¿½?ï¿½è¿™ä¸ªç»„ç»‡çš„æ›´å¤§ç»„ç»‡    
    */
    public OrganizationTuery parentOrganization(OrganizationTueryDefinition queryDef) {
        return parentOrganization(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ä¸Šçº§ç»„ç»‡ã€‘
    * subOrganizationçš„ï¿½??ï¿½?ï¿½å±žæ€§ï¼Œï¿½?ï¿½åŒ…ï¿½?ï¿½è¿™ä¸ªç»„ç»‡çš„æ›´å¤§ç»„ç»‡    
    */
    public OrganizationTuery parentOrganization(ParentOrganizationArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
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
    *     ï¿½ï¿½?ï¿½ï¿½?æœºæž„ã€‘
    * ä¸¤ä¸ªç»„ç»‡ä¹‹é—´çš„å…³ç³»ã€‚å…¶ä¸­ç¬¬äºŒä¸ªç»„ç»‡ï¼Œä¾‹å¦‚ä»¥ï¿½ï¿½?å…¬ï¿½?ï¿½çš„ï¿½??å­—ï¼Œå±žäºŽ
    * ç¬¬ä¸€ä¸ªç»„ç»‡ã€‚    
    */
    public OrganizationTuery subOrganizations(OrganizationTueryDefinition queryDef) {
        return subOrganizations(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ï¿½ï¿½?æœºæž„ã€‘
    * ä¸¤ä¸ªç»„ç»‡ä¹‹é—´çš„å…³ç³»ã€‚å…¶ä¸­ç¬¬äºŒä¸ªç»„ç»‡ï¼Œä¾‹å¦‚ä»¥ï¿½ï¿½?å…¬ï¿½?ï¿½çš„ï¿½??å­—ï¼Œå±žäºŽ
    * ç¬¬ä¸€ä¸ªç»„ç»‡ã€‚    
    */
    public OrganizationTuery subOrganizations(SubOrganizationsArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
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
    *     ï¿½ï¿½?éƒ¨é—¨ã€‘
    * ç»„ç»‡ä¸Žè¯¥ç»„ç»‡ï¿½ï¿½?ä¸ªéƒ¨é—¨ä¹‹é—´çš„å…³ç³»ï¼Œä¹Ÿè¢«ï¿½??è¿°ï¿½ï¿½?ç»„ç»‡ï¼ˆï¿½ï¿½?è®¸ï¿½ï¿½?ï
    * ¿½?ï¿½çš„ç½‘ï¿½?ï¿½ï¼Œæ ‡è¯†ï¼Œå¼€æ”¾æ—¶é—´ï¼‰ã€‚
    * ä¾‹å¦‚ï¼šä¸€å®¶æœ‰ï¿½?ï¿½åº—çš„å•†åº—ï¼Œæˆ–è€…æ˜¯ä¸€é—´å¸¦å’–å•¡åŽ…çš„ï¿½?ï¿½åŒ…åº—ã€‚ A
    * relationship between an organization and a department of that organization, also described as an
    * organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy,
    * or a bakery with a cafe.    
    */
    public OrganizationTuery departments(OrganizationTueryDefinition queryDef) {
        return departments(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?éƒ¨é—¨ã€‘
    * ç»„ç»‡ä¸Žè¯¥ç»„ç»‡ï¿½ï¿½?ä¸ªéƒ¨é—¨ä¹‹é—´çš„å…³ç³»ï¼Œä¹Ÿè¢«ï¿½??è¿°ï¿½ï¿½?ç»„ç»‡ï¼ˆï¿½ï¿½?è®¸ï¿½ï¿½?ï
    * ¿½?ï¿½çš„ç½‘ï¿½?ï¿½ï¼Œæ ‡è¯†ï¼Œå¼€æ”¾æ—¶é—´ï¼‰ã€‚
    * ä¾‹å¦‚ï¼šä¸€å®¶æœ‰ï¿½?ï¿½åº—çš„å•†åº—ï¼Œæˆ–è€…æ˜¯ä¸€é—´å¸¦å’–å•¡åŽ…çš„ï¿½?ï¿½åŒ…åº—ã€‚ A
    * relationship between an organization and a department of that organization, also described as an
    * organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy,
    * or a bakery with a cafe.    
    */
    public OrganizationTuery departments(DepartmentsArgumentsDefinition argsDef, OrganizationTueryDefinition queryDef) {
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
    *     ç»„ç»‡å®šä¹‰çš„è§’è‰²ï¿½??ç§°,hasPartyRoleName,é€†å±žæ€§ PartyRoleName.isPartyRoleNameOf    
    */
    public OrganizationTuery hasPartyRoleName(PartyRoleNameTueryDefinition queryDef) {
        return hasPartyRoleName(args -> {}, queryDef);
    }

    /**
    *     ç»„ç»‡å®šä¹‰çš„è§’è‰²ï¿½??ç§°,hasPartyRoleName,é€†å±žæ€§ PartyRoleName.isPartyRoleNameOf    
    */
    public OrganizationTuery hasPartyRoleName(HasPartyRoleNameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
        startField("hasPartyRoleName");

        HasPartyRoleNameArguments args = new HasPartyRoleNameArguments(_queryBuilder);
        argsDef.define(args);
        HasPartyRoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public OrganizationTuery onGeneralOrganization(GeneralOrganizationTueryDefinition queryDef) {
        startInlineFragment("GeneralOrganization");
        queryDef.define(new GeneralOrganizationTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrganizationTuery onProject(ProjectTueryDefinition queryDef) {
        startInlineFragment("Project");
        queryDef.define(new ProjectTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public OrganizationTuery onStore(StoreTueryDefinition queryDef) {
        startInlineFragment("Store");
        queryDef.define(new StoreTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
