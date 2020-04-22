// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateOfferInput implements Serializable {
    private OfferFilter filter;

    private Input<OfferPatch> set = Input.undefined();

    private Input<OfferPatch> remove = Input.undefined();

    public UpdateOfferInput(OfferFilter filter) {
        this.filter = filter;
    }

    public OfferFilter getFilter() {
        return filter;
    }

    public UpdateOfferInput setFilter(OfferFilter filter) {
        this.filter = filter;
        return this;
    }

    public OfferPatch getSet() {
        return set.getValue();
    }

    public Input<OfferPatch> getSetInput() {
        return set;
    }

    public UpdateOfferInput setSet(OfferPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateOfferInput setSetInput(Input<OfferPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public OfferPatch getRemove() {
        return remove.getValue();
    }

    public Input<OfferPatch> getRemoveInput() {
        return remove;
    }

    public UpdateOfferInput setRemove(OfferPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateOfferInput setRemoveInput(Input<OfferPatch> remove) {
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
