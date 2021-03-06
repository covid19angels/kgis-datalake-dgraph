// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class WebhookOrder implements Serializable {
    private Input<WebhookOrderable> asc = Input.undefined();

    private Input<WebhookOrderable> desc = Input.undefined();

    private Input<WebhookOrder> then = Input.undefined();

    public WebhookOrderable getAsc() {
        return asc.getValue();
    }

    public Input<WebhookOrderable> getAscInput() {
        return asc;
    }

    public WebhookOrder setAsc(WebhookOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public WebhookOrder setAscInput(Input<WebhookOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public WebhookOrderable getDesc() {
        return desc.getValue();
    }

    public Input<WebhookOrderable> getDescInput() {
        return desc;
    }

    public WebhookOrder setDesc(WebhookOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public WebhookOrder setDescInput(Input<WebhookOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public WebhookOrder getThen() {
        return then.getValue();
    }

    public Input<WebhookOrder> getThenInput() {
        return then;
    }

    public WebhookOrder setThen(WebhookOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public WebhookOrder setThenInput(Input<WebhookOrder> then) {
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
