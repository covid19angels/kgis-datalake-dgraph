// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class ProductModelOrder implements Serializable {
    private Input<ProductModelOrderable> asc = Input.undefined();

    private Input<ProductModelOrderable> desc = Input.undefined();

    private Input<ProductModelOrder> then = Input.undefined();

    public ProductModelOrderable getAsc() {
        return asc.getValue();
    }

    public Input<ProductModelOrderable> getAscInput() {
        return asc;
    }

    public ProductModelOrder setAsc(ProductModelOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public ProductModelOrder setAscInput(Input<ProductModelOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public ProductModelOrderable getDesc() {
        return desc.getValue();
    }

    public Input<ProductModelOrderable> getDescInput() {
        return desc;
    }

    public ProductModelOrder setDesc(ProductModelOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public ProductModelOrder setDescInput(Input<ProductModelOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public ProductModelOrder getThen() {
        return then.getValue();
    }

    public Input<ProductModelOrder> getThenInput() {
        return then;
    }

    public ProductModelOrder setThen(ProductModelOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public ProductModelOrder setThenInput(Input<ProductModelOrder> then) {
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
