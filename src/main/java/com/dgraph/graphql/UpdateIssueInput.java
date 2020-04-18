// Generated from graphql_java_gen gem  with template Input.java.erb

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

public class UpdateIssueInput implements Serializable {
    private IssueFilter filter;

    private Input<IssuePatch> set = Input.undefined();

    private Input<IssuePatch> remove = Input.undefined();

    public UpdateIssueInput(IssueFilter filter) {
        this.filter = filter;
    }

    public IssueFilter getFilter() {
        return filter;
    }

    public UpdateIssueInput setFilter(IssueFilter filter) {
        this.filter = filter;
        return this;
    }

    public IssuePatch getSet() {
        return set.getValue();
    }

    public Input<IssuePatch> getSetInput() {
        return set;
    }

    public UpdateIssueInput setSet(IssuePatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateIssueInput setSetInput(Input<IssuePatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public IssuePatch getRemove() {
        return remove.getValue();
    }

    public Input<IssuePatch> getRemoveInput() {
        return remove;
    }

    public UpdateIssueInput setRemove(IssuePatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateIssueInput setRemoveInput(Input<IssuePatch> remove) {
        if (remove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remove = remove;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("filter:");
        filter.appendTo(_queryBuilder);

        if (this.set.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("set:");
            if (set.getValue() != null) {
                set.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remove:");
            if (remove.getValue() != null) {
                remove.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
