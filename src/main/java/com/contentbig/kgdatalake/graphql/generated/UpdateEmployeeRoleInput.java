// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateEmployeeRoleInput implements Serializable {
    private EmployeeRoleFilter filter;

    private Input<EmployeeRolePatch> set = Input.undefined();

    private Input<EmployeeRolePatch> remove = Input.undefined();

    public UpdateEmployeeRoleInput(EmployeeRoleFilter filter) {
        this.filter = filter;
    }

    public EmployeeRoleFilter getFilter() {
        return filter;
    }

    public UpdateEmployeeRoleInput setFilter(EmployeeRoleFilter filter) {
        this.filter = filter;
        return this;
    }

    public EmployeeRolePatch getSet() {
        return set.getValue();
    }

    public Input<EmployeeRolePatch> getSetInput() {
        return set;
    }

    public UpdateEmployeeRoleInput setSet(EmployeeRolePatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateEmployeeRoleInput setSetInput(Input<EmployeeRolePatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public EmployeeRolePatch getRemove() {
        return remove.getValue();
    }

    public Input<EmployeeRolePatch> getRemoveInput() {
        return remove;
    }

    public UpdateEmployeeRoleInput setRemove(EmployeeRolePatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateEmployeeRoleInput setRemoveInput(Input<EmployeeRolePatch> remove) {
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
