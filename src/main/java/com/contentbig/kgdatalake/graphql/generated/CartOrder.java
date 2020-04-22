// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class CartOrder implements Serializable {
    private Input<CartOrderable> asc = Input.undefined();

    private Input<CartOrderable> desc = Input.undefined();

    private Input<CartOrder> then = Input.undefined();

    public CartOrderable getAsc() {
        return asc.getValue();
    }

    public Input<CartOrderable> getAscInput() {
        return asc;
    }

    public CartOrder setAsc(CartOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public CartOrder setAscInput(Input<CartOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public CartOrderable getDesc() {
        return desc.getValue();
    }

    public Input<CartOrderable> getDescInput() {
        return desc;
    }

    public CartOrder setDesc(CartOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public CartOrder setDescInput(Input<CartOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public CartOrder getThen() {
        return then.getValue();
    }

    public Input<CartOrder> getThenInput() {
        return then;
    }

    public CartOrder setThen(CartOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public CartOrder setThenInput(Input<CartOrder> then) {
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
