// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 资��?对象所属的namespace,根�?�一定规则由平�?�生��?或��?置定义如：io.shurui.store001.order,
* 默认值是default如果��?个角色拥有inamespace：'io.shurui'的�?���?，则拥有'io.shurui'一下所有��?namespace的相应�?���?
*/
public class NamespaceTuery extends Tuery<NamespaceTuery> {
    NamespaceTuery(StringBuilder _queryBuilder) {
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
    public NamespaceTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public NamespaceTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public NamespaceTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public NamespaceTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public NamespaceTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public NamespaceTuery description() {
        startField("description");

        return this;
    }

    /**
    *     资��?对象所属的namespace,根�?�一定规则由平�?�生��?或��?置定义如：io.shurui.store001.order, 默认值是default   
    * 如果��?个角色拥有inamespace：'io.shurui'的�?���?，则拥有'io.shurui'一下所有��?namespace的相应�?���?    
    */
    public NamespaceTuery namespace() {
        startField("namespace");

        return this;
    }

    /**
    *     拥有namespace的组织或用户    
    */
    public NamespaceTuery isNamespaceOf(PartyTueryDefinition queryDef) {
        startField("isNamespaceOf");

        _queryBuilder.append('{');
        queryDef.define(new PartyTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
