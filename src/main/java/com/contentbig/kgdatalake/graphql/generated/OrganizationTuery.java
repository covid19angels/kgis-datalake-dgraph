// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* ��?机构】一个组织，例如学校��?�?�政府组织��?公�?���?俱��?部等,也�?�用于临时几个人组��?的�?�天��?组，房间
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
    *     ��?上级组织】 subOrganization的�??�?�属性，�?�包�?�这个组织的更大组织    
    */
    public OrganizationTuery parentOrganization(OrganizationTueryDefinition queryDef) {
        return parentOrganization(args -> {}, queryDef);
    }

    /**
    *     ��?上级组织】 subOrganization的�??�?�属性，�?�包�?�这个组织的更大组织    
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
    *     ��?��?机构】 两个组织之间的关系。其中第二个组织，例如以��?公�?�的�??字，属于第一个组织。    
    */
    public OrganizationTuery subOrganizations(OrganizationTueryDefinition queryDef) {
        return subOrganizations(args -> {}, queryDef);
    }

    /**
    *     ��?��?机构】 两个组织之间的关系。其中第二个组织，例如以��?公�?�的�??字，属于第一个组织。    
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
    *     ��?部门】 组织与该组织��?个部门之间的关系，也被�??述��?组织（��?许��?�?�的网�?�，标识，开放时间）。 例如：一家有�?�店的商店，或者是一间带咖啡厅的�?�包店。 A
    * relationship between an organization and a department of that organization, also described as an
    * organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy,
    * or a bakery with a cafe.    
    */
    public OrganizationTuery departments(OrganizationTueryDefinition queryDef) {
        return departments(args -> {}, queryDef);
    }

    /**
    *     ��?部门】 组织与该组织��?个部门之间的关系，也被�??述��?组织（��?许��?�?�的网�?�，标识，开放时间）。 例如：一家有�?�店的商店，或者是一间带咖啡厅的�?�包店。 A
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
    *     组织定义的角色�??称,hasPartyRoleName,逆属性 PartyRoleName.isPartyRoleNameOf    
    */
    public OrganizationTuery hasPartyRoleName(PartyRoleNameTueryDefinition queryDef) {
        return hasPartyRoleName(args -> {}, queryDef);
    }

    /**
    *     组织定义的角色�??称,hasPartyRoleName,逆属性 PartyRoleName.isPartyRoleNameOf    
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
