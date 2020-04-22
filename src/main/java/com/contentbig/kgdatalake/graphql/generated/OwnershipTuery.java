// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* �??述产��?的所有者或所属机构的信�?�
*/
public class OwnershipTuery extends Tuery<OwnershipTuery> {
    OwnershipTuery(StringBuilder _queryBuilder) {
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
    public OwnershipTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public OwnershipTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public OwnershipTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public OwnershipTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public OwnershipTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public OwnershipTuery description() {
        startField("description");

        return this;
    }

    /**
    *     ��?获�?��?���?】 产��?获�?�的机构�?���? The organization or person from which the product was acquired.
    */
    public OwnershipTuery acquiredFrom(PartyTueryDefinition queryDef) {
        startField("acquiredFrom");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class OwnedArguments extends Arguments {
        OwnedArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public OwnedArguments filter(ThingFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface OwnedArgumentsDefinition {
        void define(OwnedArguments args);
    }

    /**
    *     ��?东西类型】 拥有的东西Thing。    
    */
    public OwnershipTuery owned(ThingTueryDefinition queryDef) {
        return owned(args -> {}, queryDef);
    }

    /**
    *     ��?东西类型】 拥有的东西Thing。    
    */
    public OwnershipTuery owned(OwnedArgumentsDefinition argsDef, ThingTueryDefinition queryDef) {
        startField("owned");

        OwnedArguments args = new OwnedArguments(_queryBuilder);
        argsDef.define(args);
        OwnedArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ThingTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ��?个人或组织】拥有者    
    */
    public OwnershipTuery owner(PartyTueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ��?开始日期】 ��?事的开始日期和时间    
    */
    public OwnershipTuery dateFrom() {
        startField("dateFrom");

        return this;
    }

    /**
    *     ��?结�?�日期】 活动（事件）结�?�时间。 The end date and time of the item (in ISO 8601 date format).    
    */
    public OwnershipTuery dateThrough() {
        startField("dateThrough");

        return this;
    }
}
