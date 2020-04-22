// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdatePoderInput implements Serializable {
    private PoderFilter filter;

    private Input<PoderPatch> set = Input.undefined();

    private Input<PoderPatch> remove = Input.undefined();

    public UpdatePoderInput(PoderFilter filter) {
        this.filter = filter;
    }

    public PoderFilter getFilter() {
        return filter;
    }

    public UpdatePoderInput setFilter(PoderFilter filter) {
        this.filter = filter;
        return this;
    }

    public PoderPatch getSet() {
        return set.getValue();
    }

    public Input<PoderPatch> getSetInput() {
        return set;
    }

    public UpdatePoderInput setSet(PoderPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdatePoderInput setSetInput(Input<PoderPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public PoderPatch getRemove() {
        return remove.getValue();
    }

    public Input<PoderPatch> getRemoveInput() {
        return remove;
    }

    public UpdatePoderInput setRemove(PoderPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdatePoderInput setRemoveInput(Input<PoderPatch> remove) {
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