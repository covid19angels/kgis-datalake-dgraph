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
* ï¿½ï¿½?å›¢ä½“å†…éƒ¨å®šä¹‰çš„è§’è‰²ã€‘
*/
public class PartyRoleTuery extends Tuery<PartyRoleTuery> {
    PartyRoleTuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public class PersonArguments extends Arguments {
        PersonArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public PersonArguments filter(PersonFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface PersonArgumentsDefinition {
        void define(PersonArguments args);
    }

    /**
    *     åœ¨ç»„ç»‡æ‰¿æ‹…è§’è‰²çš„ä¸ªäºº    
    */
    public PartyRoleTuery person(PersonTueryDefinition queryDef) {
        return person(args -> {}, queryDef);
    }

    /**
    *     åœ¨ç»„ç»‡æ‰¿æ‹…è§’è‰²çš„ä¸ªäºº    
    */
    public PartyRoleTuery person(PersonArgumentsDefinition argsDef, PersonTueryDefinition queryDef) {
        startField("person");

        PersonArguments args = new PersonArguments(_queryBuilder);
        argsDef.define(args);
        PersonArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PersonTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RoleNameArguments extends Arguments {
        RoleNameArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public RoleNameArguments filter(PartyRoleNameFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RoleNameArgumentsDefinition {
        void define(RoleNameArguments args);
    }

    /**
    *     ä¸ªäººåœ¨å›¢ä½“å†…æ‰¿æ‹…çš„è§’è‰²    
    */
    public PartyRoleTuery roleName(PartyRoleNameTueryDefinition queryDef) {
        return roleName(args -> {}, queryDef);
    }

    /**
    *     ä¸ªäººåœ¨å›¢ä½“å†…æ‰¿æ‹…çš„è§’è‰²    
    */
    public PartyRoleTuery roleName(RoleNameArgumentsDefinition argsDef, PartyRoleNameTueryDefinition queryDef) {
        startField("roleName");

        RoleNameArguments args = new RoleNameArguments(_queryBuilder);
        argsDef.define(args);
        RoleNameArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PartyRoleNameTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ï¿½ï¿½?å¼€å§‹æ—¥æœŸã€‘ ï¿½ï¿½?äº‹çš„å¼€å§‹æ—¥æœŸå’Œæ—¶é—´    
    */
    public PartyRoleTuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    *     ï¿½ï¿½?ç»“ï¿½?ï¿½æ—¥æœŸã€‘ æ´»åŠ¨ï¼ˆäº‹ä»¶ï¼‰ç»“ï¿½?ï¿½æ—¶é—´ã€‚ The end date and time of the
    * item (in ISO 8601 date format).    
    */
    public PartyRoleTuery dateThrough() {
        startField("dateThrough");

        return this;
    }

    public PartyRoleTuery onEmployeeRole(EmployeeRoleTueryDefinition queryDef) {
        startInlineFragment("EmployeeRole");
        queryDef.define(new EmployeeRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PartyRoleTuery onFollowerRole(FollowerRoleTueryDefinition queryDef) {
        startInlineFragment("FollowerRole");
        queryDef.define(new FollowerRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PartyRoleTuery onMemberRole(MemberRoleTueryDefinition queryDef) {
        startInlineFragment("MemberRole");
        queryDef.define(new MemberRoleTuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
