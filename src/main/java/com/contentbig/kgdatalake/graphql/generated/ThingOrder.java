// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class ThingOrder implements Serializable {
    private Input<ThingOrderable> asc = Input.undefined();

    private Input<ThingOrderable> desc = Input.undefined();

    private Input<ThingOrder> then = Input.undefined();

    public ThingOrderable getAsc() {
        return asc.getValue();
    }

    public Input<ThingOrderable> getAscInput() {
        return asc;
    }

    public ThingOrder setAsc(ThingOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public ThingOrder setAscInput(Input<ThingOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public ThingOrderable getDesc() {
        return desc.getValue();
    }

    public Input<ThingOrderable> getDescInput() {
        return desc;
    }

    public ThingOrder setDesc(ThingOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public ThingOrder setDescInput(Input<ThingOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public ThingOrder getThen() {
        return then.getValue();
    }

    public Input<ThingOrder> getThenInput() {
        return then;
    }

    public ThingOrder setThen(ThingOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public ThingOrder setThenInput(Input<ThingOrder> then) {
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
