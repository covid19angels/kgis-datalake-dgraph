// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateProjectInput implements Serializable {
    private ProjectFilter filter;

    private Input<ProjectPatch> set = Input.undefined();

    private Input<ProjectPatch> remove = Input.undefined();

    public UpdateProjectInput(ProjectFilter filter) {
        this.filter = filter;
    }

    public ProjectFilter getFilter() {
        return filter;
    }

    public UpdateProjectInput setFilter(ProjectFilter filter) {
        this.filter = filter;
        return this;
    }

    public ProjectPatch getSet() {
        return set.getValue();
    }

    public Input<ProjectPatch> getSetInput() {
        return set;
    }

    public UpdateProjectInput setSet(ProjectPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateProjectInput setSetInput(Input<ProjectPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public ProjectPatch getRemove() {
        return remove.getValue();
    }

    public Input<ProjectPatch> getRemoveInput() {
        return remove;
    }

    public UpdateProjectInput setRemove(ProjectPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateProjectInput setRemoveInput(Input<ProjectPatch> remove) {
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
