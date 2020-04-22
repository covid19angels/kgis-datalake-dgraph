// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateSoftwareApplicationInput implements Serializable {
    private SoftwareApplicationFilter filter;

    private Input<SoftwareApplicationPatch> set = Input.undefined();

    private Input<SoftwareApplicationPatch> remove = Input.undefined();

    public UpdateSoftwareApplicationInput(SoftwareApplicationFilter filter) {
        this.filter = filter;
    }

    public SoftwareApplicationFilter getFilter() {
        return filter;
    }

    public UpdateSoftwareApplicationInput setFilter(SoftwareApplicationFilter filter) {
        this.filter = filter;
        return this;
    }

    public SoftwareApplicationPatch getSet() {
        return set.getValue();
    }

    public Input<SoftwareApplicationPatch> getSetInput() {
        return set;
    }

    public UpdateSoftwareApplicationInput setSet(SoftwareApplicationPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateSoftwareApplicationInput setSetInput(Input<SoftwareApplicationPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public SoftwareApplicationPatch getRemove() {
        return remove.getValue();
    }

    public Input<SoftwareApplicationPatch> getRemoveInput() {
        return remove;
    }

    public UpdateSoftwareApplicationInput setRemove(SoftwareApplicationPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateSoftwareApplicationInput setRemoveInput(Input<SoftwareApplicationPatch> remove) {
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
