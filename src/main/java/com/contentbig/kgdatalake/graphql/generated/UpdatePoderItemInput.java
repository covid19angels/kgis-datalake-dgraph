// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdatePoderItemInput implements Serializable {
    private PoderItemFilter filter;

    private Input<PoderItemPatch> set = Input.undefined();

    private Input<PoderItemPatch> remove = Input.undefined();

    public UpdatePoderItemInput(PoderItemFilter filter) {
        this.filter = filter;
    }

    public PoderItemFilter getFilter() {
        return filter;
    }

    public UpdatePoderItemInput setFilter(PoderItemFilter filter) {
        this.filter = filter;
        return this;
    }

    public PoderItemPatch getSet() {
        return set.getValue();
    }

    public Input<PoderItemPatch> getSetInput() {
        return set;
    }

    public UpdatePoderItemInput setSet(PoderItemPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdatePoderItemInput setSetInput(Input<PoderItemPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public PoderItemPatch getRemove() {
        return remove.getValue();
    }

    public Input<PoderItemPatch> getRemoveInput() {
        return remove;
    }

    public UpdatePoderItemInput setRemove(PoderItemPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdatePoderItemInput setRemoveInput(Input<PoderItemPatch> remove) {
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
