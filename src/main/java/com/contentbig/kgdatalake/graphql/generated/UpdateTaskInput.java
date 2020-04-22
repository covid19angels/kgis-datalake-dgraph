// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateTaskInput implements Serializable {
    private TaskFilter filter;

    private Input<TaskPatch> set = Input.undefined();

    private Input<TaskPatch> remove = Input.undefined();

    public UpdateTaskInput(TaskFilter filter) {
        this.filter = filter;
    }

    public TaskFilter getFilter() {
        return filter;
    }

    public UpdateTaskInput setFilter(TaskFilter filter) {
        this.filter = filter;
        return this;
    }

    public TaskPatch getSet() {
        return set.getValue();
    }

    public Input<TaskPatch> getSetInput() {
        return set;
    }

    public UpdateTaskInput setSet(TaskPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateTaskInput setSetInput(Input<TaskPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public TaskPatch getRemove() {
        return remove.getValue();
    }

    public Input<TaskPatch> getRemoveInput() {
        return remove;
    }

    public UpdateTaskInput setRemove(TaskPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateTaskInput setRemoveInput(Input<TaskPatch> remove) {
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
