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
* Canonical URL: http://cnschema.org/DataCatalogï¿½ï¿½?æ•°ï¿½?ï¿½ç›®å½•ã€‘æ•°ï¿½?ï¿½é›†çš„ç›®å½• A
* collection of datasets.
*/
public class DataCatalogTuery extends Tuery<DataCatalogTuery> {
    DataCatalogTuery(StringBuilder _queryBuilder) {
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
    public DataCatalogTuery namespaces(NamespaceTueryDefinition queryDef) {
        return namespaces(args -> {}, queryDef);
    }

    /**
    * 
    */
    public DataCatalogTuery namespaces(NamespacesArgumentsDefinition argsDef, NamespaceTueryDefinition queryDef) {
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
    public DataCatalogTuery identifier() {
        startField("identifier");

        return this;
    }

    /**
    * 
    */
    public DataCatalogTuery name() {
        startField("name");

        return this;
    }

    /**
    * 
    */
    public DataCatalogTuery alternateName() {
        startField("alternateName");

        return this;
    }

    /**
    * 
    */
    public DataCatalogTuery description() {
        startField("description");

        return this;
    }

    public class ParentDataCatalogArguments extends Arguments {
        ParentDataCatalogArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public ParentDataCatalogArguments filter(DataCatalogFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ParentDataCatalogArgumentsDefinition {
        void define(ParentDataCatalogArguments args);
    }

    /**
    *     ï¿½ï¿½?æ‰€åœ¨çˆ¶æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘æ‰€åœ¨çš„çˆ¶æ•°ï¿½?ï¿½é›†ç›®å½• A data catalog which
    * contains this dataset.    
    */
    public DataCatalogTuery parentDataCatalog(DataCatalogTueryDefinition queryDef) {
        return parentDataCatalog(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?æ‰€åœ¨çˆ¶æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘æ‰€åœ¨çš„çˆ¶æ•°ï¿½?ï¿½é›†ç›®å½• A data catalog which
    * contains this dataset.    
    */
    public DataCatalogTuery parentDataCatalog(ParentDataCatalogArgumentsDefinition argsDef, DataCatalogTueryDefinition queryDef) {
        startField("parentDataCatalog");

        ParentDataCatalogArguments args = new ParentDataCatalogArguments(_queryBuilder);
        argsDef.define(args);
        ParentDataCatalogArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class SubDataCatalogsArguments extends Arguments {
        SubDataCatalogsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * 
        */
        public SubDataCatalogsArguments filter(DataCatalogFilter value) {
            if (value != null) {
                startArgument("filter");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SubDataCatalogsArguments order(DataCatalogOrder value) {
            if (value != null) {
                startArgument("order");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * 
        */
        public SubDataCatalogsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * 
        */
        public SubDataCatalogsArguments offset(Integer value) {
            if (value != null) {
                startArgument("offset");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface SubDataCatalogsArgumentsDefinition {
        void define(SubDataCatalogsArguments args);
    }

    /**
    *     ï¿½ï¿½?åŒ…ï¿½?ï¿½ï¿½ï¿½?æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘åŒ…ï¿½?ï¿½ï¿½ï¿½?çš„æ•°ï¿½?ï¿½é›†ç›®å½•    
    */
    public DataCatalogTuery subDataCatalogs(DataCatalogTueryDefinition queryDef) {
        return subDataCatalogs(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?åŒ…ï¿½?ï¿½ï¿½ï¿½?æ•°ï¿½?ï¿½é›†ç›®å½•ã€‘åŒ…ï¿½?ï¿½ï¿½ï¿½?çš„æ•°ï¿½?ï¿½é›†ç›®å½•    
    */
    public DataCatalogTuery subDataCatalogs(SubDataCatalogsArgumentsDefinition argsDef, DataCatalogTueryDefinition queryDef) {
        startField("subDataCatalogs");

        SubDataCatalogsArguments args = new SubDataCatalogsArguments(_queryBuilder);
        argsDef.define(args);
        SubDataCatalogsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DataCatalogTuery(_queryBuilder));
        _queryBuilder.append('}');

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
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */
    public DataCatalogTuery creator(UserTueryDefinition queryDef) {
        return creator(args -> {}, queryDef);
    }

    /**
    *     ï¿½ï¿½?ä½œè€…ã€‘ è¯¥ CreativeWork çš„åˆ›ä½œè€…/ä½œè€…ã€‚    
    */
    public DataCatalogTuery creator(CreatorArgumentsDefinition argsDef, UserTueryDefinition queryDef) {
        startField("creator");

        CreatorArguments args = new CreatorArguments(_queryBuilder);
        argsDef.define(args);
        CreatorArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserTuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    *     ï¿½ï¿½?åˆ›å»ºæ—¥æœŸã€‘ åˆ›ä½œå‡ºCreativeWorkçš„æ—¥æœŸã€‚ The date on which the CreativeWork was
    * created or the item was added to a DataFeed. dateCreated    DateTime or Date or DataFeedItem or
    * CreativeWork    
    */
    public DataCatalogTuery dateCreated() {
        startField("dateCreated");

        return this;
    }
}
