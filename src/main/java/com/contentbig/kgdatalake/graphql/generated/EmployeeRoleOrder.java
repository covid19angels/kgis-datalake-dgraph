// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class EmployeeRoleOrder implements Serializable {
    private Input<EmployeeRoleOrderable> asc = Input.undefined();

    private Input<EmployeeRoleOrderable> desc = Input.undefined();

    private Input<EmployeeRoleOrder> then = Input.undefined();

    public EmployeeRoleOrderable getAsc() {
        return asc.getValue();
    }

    public Input<EmployeeRoleOrderable> getAscInput() {
        return asc;
    }

    public EmployeeRoleOrder setAsc(EmployeeRoleOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public EmployeeRoleOrder setAscInput(Input<EmployeeRoleOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public EmployeeRoleOrderable getDesc() {
        return desc.getValue();
    }

    public Input<EmployeeRoleOrderable> getDescInput() {
        return desc;
    }

    public EmployeeRoleOrder setDesc(EmployeeRoleOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public EmployeeRoleOrder setDescInput(Input<EmployeeRoleOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public EmployeeRoleOrder getThen() {
        return then.getValue();
    }

    public Input<EmployeeRoleOrder> getThenInput() {
        return then;
    }

    public EmployeeRoleOrder setThen(EmployeeRoleOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public EmployeeRoleOrder setThenInput(Input<EmployeeRoleOrder> then) {
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
