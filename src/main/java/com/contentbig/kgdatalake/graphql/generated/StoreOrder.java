// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class StoreOrder implements Serializable {
    private Input<StoreOrderable> asc = Input.undefined();

    private Input<StoreOrderable> desc = Input.undefined();

    private Input<StoreOrder> then = Input.undefined();

    public StoreOrderable getAsc() {
        return asc.getValue();
    }

    public Input<StoreOrderable> getAscInput() {
        return asc;
    }

    public StoreOrder setAsc(StoreOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public StoreOrder setAscInput(Input<StoreOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public StoreOrderable getDesc() {
        return desc.getValue();
    }

    public Input<StoreOrderable> getDescInput() {
        return desc;
    }

    public StoreOrder setDesc(StoreOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public StoreOrder setDescInput(Input<StoreOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public StoreOrder getThen() {
        return then.getValue();
    }

    public Input<StoreOrder> getThenInput() {
        return then;
    }

    public StoreOrder setThen(StoreOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public StoreOrder setThenInput(Input<StoreOrder> then) {
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
