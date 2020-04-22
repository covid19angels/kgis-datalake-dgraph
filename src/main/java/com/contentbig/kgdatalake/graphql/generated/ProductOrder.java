// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class ProductOrder implements Serializable {
    private Input<ProductOrderable> asc = Input.undefined();

    private Input<ProductOrderable> desc = Input.undefined();

    private Input<ProductOrder> then = Input.undefined();

    public ProductOrderable getAsc() {
        return asc.getValue();
    }

    public Input<ProductOrderable> getAscInput() {
        return asc;
    }

    public ProductOrder setAsc(ProductOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public ProductOrder setAscInput(Input<ProductOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public ProductOrderable getDesc() {
        return desc.getValue();
    }

    public Input<ProductOrderable> getDescInput() {
        return desc;
    }

    public ProductOrder setDesc(ProductOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public ProductOrder setDescInput(Input<ProductOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public ProductOrder getThen() {
        return then.getValue();
    }

    public Input<ProductOrder> getThenInput() {
        return then;
    }

    public ProductOrder setThen(ProductOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public ProductOrder setThenInput(Input<ProductOrder> then) {
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
