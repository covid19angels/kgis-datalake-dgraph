// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Tuery;

import java.io.Serializable;

public class NodeRef implements Serializable {
    private ID id;

    public NodeRef(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public NodeRef setId(ID id) {
        this.id = id;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        Tuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append('}');
    }
}
