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

public class TaskOrder implements Serializable {
    private Input<TaskOrderable> asc = Input.undefined();

    private Input<TaskOrderable> desc = Input.undefined();

    private Input<TaskOrder> then = Input.undefined();

    public TaskOrderable getAsc() {
        return asc.getValue();
    }

    public Input<TaskOrderable> getAscInput() {
        return asc;
    }

    public TaskOrder setAsc(TaskOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public TaskOrder setAscInput(Input<TaskOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public TaskOrderable getDesc() {
        return desc.getValue();
    }

    public Input<TaskOrderable> getDescInput() {
        return desc;
    }

    public TaskOrder setDesc(TaskOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public TaskOrder setDescInput(Input<TaskOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public TaskOrder getThen() {
        return then.getValue();
    }

    public Input<TaskOrder> getThenInput() {
        return then;
    }

    public TaskOrder setThen(TaskOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public TaskOrder setThenInput(Input<TaskOrder> then) {
        if (then == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.then = then;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.asc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("asc:");
            if (asc.getValue() != null) {
                _queryBuilder.append(asc.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.desc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("desc:");
            if (desc.getValue() != null) {
                _queryBuilder.append(desc.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.then.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("then:");
            if (then.getValue() != null) {
                then.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
