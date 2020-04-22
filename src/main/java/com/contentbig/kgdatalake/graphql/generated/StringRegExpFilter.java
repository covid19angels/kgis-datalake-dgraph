// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Tuery;

import java.io.Serializable;

public class StringRegExpFilter implements Serializable {
    private Input<String> regexp = Input.undefined();

    public String getRegexp() {
        return regexp.getValue();
    }

    public Input<String> getRegexpInput() {
        return regexp;
    }

    public StringRegExpFilter setRegexp(String regexp) {
        this.regexp = Input.optional(regexp);
        return this;
    }

    public StringRegExpFilter setRegexpInput(Input<String> regexp) {
        if (regexp == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.regexp = regexp;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.regexp.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("regexp:");
            if (regexp.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, regexp.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
