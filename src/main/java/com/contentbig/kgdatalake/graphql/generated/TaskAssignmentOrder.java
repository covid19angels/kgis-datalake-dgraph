// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class TaskAssignmentOrder implements Serializable {
    private Input<TaskAssignmentOrderable> asc = Input.undefined();

    private Input<TaskAssignmentOrderable> desc = Input.undefined();

    private Input<TaskAssignmentOrder> then = Input.undefined();

    public TaskAssignmentOrderable getAsc() {
        return asc.getValue();
    }

    public Input<TaskAssignmentOrderable> getAscInput() {
        return asc;
    }

    public TaskAssignmentOrder setAsc(TaskAssignmentOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public TaskAssignmentOrder setAscInput(Input<TaskAssignmentOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public TaskAssignmentOrderable getDesc() {
        return desc.getValue();
    }

    public Input<TaskAssignmentOrderable> getDescInput() {
        return desc;
    }

    public TaskAssignmentOrder setDesc(TaskAssignmentOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public TaskAssignmentOrder setDescInput(Input<TaskAssignmentOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public TaskAssignmentOrder getThen() {
        return then.getValue();
    }

    public Input<TaskAssignmentOrder> getThenInput() {
        return then;
    }

    public TaskAssignmentOrder setThen(TaskAssignmentOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public TaskAssignmentOrder setThenInput(Input<TaskAssignmentOrder> then) {
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
