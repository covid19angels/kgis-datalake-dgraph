// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateTaskAssignmentInput implements Serializable {
    private TaskAssignmentFilter filter;

    private Input<TaskAssignmentPatch> set = Input.undefined();

    private Input<TaskAssignmentPatch> remove = Input.undefined();

    public UpdateTaskAssignmentInput(TaskAssignmentFilter filter) {
        this.filter = filter;
    }

    public TaskAssignmentFilter getFilter() {
        return filter;
    }

    public UpdateTaskAssignmentInput setFilter(TaskAssignmentFilter filter) {
        this.filter = filter;
        return this;
    }

    public TaskAssignmentPatch getSet() {
        return set.getValue();
    }

    public Input<TaskAssignmentPatch> getSetInput() {
        return set;
    }

    public UpdateTaskAssignmentInput setSet(TaskAssignmentPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateTaskAssignmentInput setSetInput(Input<TaskAssignmentPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public TaskAssignmentPatch getRemove() {
        return remove.getValue();
    }

    public Input<TaskAssignmentPatch> getRemoveInput() {
        return remove;
    }

    public UpdateTaskAssignmentInput setRemove(TaskAssignmentPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateTaskAssignmentInput setRemoveInput(Input<TaskAssignmentPatch> remove) {
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
