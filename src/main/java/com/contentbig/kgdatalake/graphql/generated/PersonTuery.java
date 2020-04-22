// Generated from graphql_java_gen gem  with template Tuery.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Tuery;

/**
* 个人,�?�能在平�?�里有一个且唯一的用户账�?�User
*/
public class PersonTuery extends Tuery<PersonTuery> {
    PersonTuery(StringBuilder _queryBuilder) {
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
    public PersonTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public PersonTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public PersonTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public PersonTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public PersonTuery description() {
        startField("description");

        return this;
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
    public PersonTuery owns(OwnershipTueryDefinition queryDef) {
        return owns(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonTuery owns(OwnsArgumentsDefinition argsDef, OwnershipTueryDefinition queryDef) {
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
    public PersonTuery hasNamespaces(NamespaceTueryDefinition queryDef) {
        return hasNamespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public PersonTuery hasNamespaces(HasNamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
        startField("hasNamespaces");

        HasNamespacesArguments args = new HasNamespacesArguments(_queryBuilder);
        argsDef.define(args);
        HasNamespacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new NamespaceTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     个人身份��?ID    
    */
    public PersonTuery personalId() {
        startField("personalID");

        return this;
    }

    /**
    * ��?姓】 姓。 在美国，是一个人姓�??中的最�?�一个字。 Family name. In the U.S., the last name of an Person. This can be
    * used along with givenName instead of the name property.
    */
    public PersonTuery familyName() {
        startField("familyName");

        return this;
    }

    /**
    * ��?�??】 �??。在美国，是一个人�??字中的第一个字 Given name. In the U.S., the first name of a Person. This can be used
    * along with familyName instead of the name property.
    */
    public PersonTuery givenName() {
        startField("givenName");

        return this;
    }

    public class HasUserArguments extends Arguments {
        HasUserArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public HasUserArguments filter(UserFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface HasUserArgumentsDefinition {
        void define(HasUserArguments args);
    }

    /**
    * 本人所拥有的用户账�?�，逆属性User.isUserOf，�?�考Inverse property: isPartOf
    */
    public PersonTuery hasUser(UserTueryDefinition queryDef) {
        return hasUser(args -> {}, queryDef);
    }

    /**
    * 本人所拥有的用户账�?�，逆属性User.isUserOf，�?�考Inverse property: isPartOf
    */
    public PersonTuery hasUser(HasUserArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("hasUser");

        HasUserArguments args = new HasUserArguments(_queryBuilder);
        argsDef.define(args);
        HasUserArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
