// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateWebhookInput implements Serializable {
    private WebhookFilter filter;

    private Input<WebhookPatch> set = Input.undefined();

    private Input<WebhookPatch> remove = Input.undefined();

    public UpdateWebhookInput(WebhookFilter filter) {
        this.filter = filter;
    }

    public WebhookFilter getFilter() {
        return filter;
    }

    public UpdateWebhookInput setFilter(WebhookFilter filter) {
        this.filter = filter;
        return this;
    }

    public WebhookPatch getSet() {
        return set.getValue();
    }

    public Input<WebhookPatch> getSetInput() {
        return set;
    }

    public UpdateWebhookInput setSet(WebhookPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateWebhookInput setSetInput(Input<WebhookPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public WebhookPatch getRemove() {
        return remove.getValue();
    }

    public Input<WebhookPatch> getRemoveInput() {
        return remove;
    }

    public UpdateWebhookInput setRemove(WebhookPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateWebhookInput setRemoveInput(Input<WebhookPatch> remove) {
        if (remove == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.remove = remove;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("filter:");
        filter.appendTo(_queryBuilder);

        if (this.set.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("set:");
            if (set.getValue() != null) {
                set.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.remove.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("remove:");
            if (remove.getValue() != null) {
                remove.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
