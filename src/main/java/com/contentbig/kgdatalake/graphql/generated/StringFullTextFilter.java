// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Tuery;

import java.io.Serializable;

public class StringFullTextFilter implements Serializable {
    private Input<String> alloftext = Input.undefined();

    private Input<String> anyoftext = Input.undefined();

    public String getAlloftext() {
        return alloftext.getValue();
    }

    public Input<String> getAlloftextInput() {
        return alloftext;
    }

    public StringFullTextFilter setAlloftext(String alloftext) {
        this.alloftext = Input.optional(alloftext);
        return this;
    }

    public StringFullTextFilter setAlloftextInput(Input<String> alloftext) {
        if (alloftext == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alloftext = alloftext;
        return this;
    }

    public String getAnyoftext() {
        return anyoftext.getValue();
    }

    public Input<String> getAnyoftextInput() {
        return anyoftext;
    }

    public StringFullTextFilter setAnyoftext(String anyoftext) {
        this.anyoftext = Input.optional(anyoftext);
        return this;
    }

    public StringFullTextFilter setAnyoftextInput(Input<String> anyoftext) {
        if (anyoftext == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.anyoftext = anyoftext;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.alloftext.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alloftext:");
            if (alloftext.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, alloftext.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.anyoftext.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("anyoftext:");
            if (anyoftext.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, anyoftext.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
