// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class PoderOrder implements Serializable {
    private Input<PoderOrderable> asc = Input.undefined();

    private Input<PoderOrderable> desc = Input.undefined();

    private Input<PoderOrder> then = Input.undefined();

    public PoderOrderable getAsc() {
        return asc.getValue();
    }

    public Input<PoderOrderable> getAscInput() {
        return asc;
    }

    public PoderOrder setAsc(PoderOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public PoderOrder setAscInput(Input<PoderOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public PoderOrderable getDesc() {
        return desc.getValue();
    }

    public Input<PoderOrderable> getDescInput() {
        return desc;
    }

    public PoderOrder setDesc(PoderOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public PoderOrder setDescInput(Input<PoderOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public PoderOrder getThen() {
        return then.getValue();
    }

    public Input<PoderOrder> getThenInput() {
        return then;
    }

    public PoderOrder setThen(PoderOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public PoderOrder setThenInput(Input<PoderOrder> then) {
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
