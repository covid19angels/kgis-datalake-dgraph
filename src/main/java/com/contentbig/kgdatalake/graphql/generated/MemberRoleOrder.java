// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class MemberRoleOrder implements Serializable {
    private Input<MemberRoleOrderable> asc = Input.undefined();

    private Input<MemberRoleOrderable> desc = Input.undefined();

    private Input<MemberRoleOrder> then = Input.undefined();

    public MemberRoleOrderable getAsc() {
        return asc.getValue();
    }

    public Input<MemberRoleOrderable> getAscInput() {
        return asc;
    }

    public MemberRoleOrder setAsc(MemberRoleOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public MemberRoleOrder setAscInput(Input<MemberRoleOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public MemberRoleOrderable getDesc() {
        return desc.getValue();
    }

    public Input<MemberRoleOrderable> getDescInput() {
        return desc;
    }

    public MemberRoleOrder setDesc(MemberRoleOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public MemberRoleOrder setDescInput(Input<MemberRoleOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public MemberRoleOrder getThen() {
        return then.getValue();
    }

    public Input<MemberRoleOrder> getThenInput() {
        return then;
    }

    public MemberRoleOrder setThen(MemberRoleOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public MemberRoleOrder setThenInput(Input<MemberRoleOrder> then) {
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
