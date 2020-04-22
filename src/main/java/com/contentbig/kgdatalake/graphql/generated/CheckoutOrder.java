// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class CheckoutOrder implements Serializable {
    private Input<CheckoutOrderable> asc = Input.undefined();

    private Input<CheckoutOrderable> desc = Input.undefined();

    private Input<CheckoutOrder> then = Input.undefined();

    public CheckoutOrderable getAsc() {
        return asc.getValue();
    }

    public Input<CheckoutOrderable> getAscInput() {
        return asc;
    }

    public CheckoutOrder setAsc(CheckoutOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public CheckoutOrder setAscInput(Input<CheckoutOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public CheckoutOrderable getDesc() {
        return desc.getValue();
    }

    public Input<CheckoutOrderable> getDescInput() {
        return desc;
    }

    public CheckoutOrder setDesc(CheckoutOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public CheckoutOrder setDescInput(Input<CheckoutOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public CheckoutOrder getThen() {
        return then.getValue();
    }

    public Input<CheckoutOrder> getThenInput() {
        return then;
    }

    public CheckoutOrder setThen(CheckoutOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public CheckoutOrder setThenInput(Input<CheckoutOrder> then) {
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
