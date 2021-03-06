// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateOwnershipInput implements Serializable {
    private OwnershipFilter filter;

    private Input<OwnershipPatch> set = Input.undefined();

    private Input<OwnershipPatch> remove = Input.undefined();

    public UpdateOwnershipInput(OwnershipFilter filter) {
        this.filter = filter;
    }

    public OwnershipFilter getFilter() {
        return filter;
    }

    public UpdateOwnershipInput setFilter(OwnershipFilter filter) {
        this.filter = filter;
        return this;
    }

    public OwnershipPatch getSet() {
        return set.getValue();
    }

    public Input<OwnershipPatch> getSetInput() {
        return set;
    }

    public UpdateOwnershipInput setSet(OwnershipPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateOwnershipInput setSetInput(Input<OwnershipPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public OwnershipPatch getRemove() {
        return remove.getValue();
    }

    public Input<OwnershipPatch> getRemoveInput() {
        return remove;
    }

    public UpdateOwnershipInput setRemove(OwnershipPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateOwnershipInput setRemoveInput(Input<OwnershipPatch> remove) {
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
