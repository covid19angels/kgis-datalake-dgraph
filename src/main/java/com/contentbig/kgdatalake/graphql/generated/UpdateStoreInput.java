// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateStoreInput implements Serializable {
    private StoreFilter filter;

    private Input<StorePatch> set = Input.undefined();

    private Input<StorePatch> remove = Input.undefined();

    public UpdateStoreInput(StoreFilter filter) {
        this.filter = filter;
    }

    public StoreFilter getFilter() {
        return filter;
    }

    public UpdateStoreInput setFilter(StoreFilter filter) {
        this.filter = filter;
        return this;
    }

    public StorePatch getSet() {
        return set.getValue();
    }

    public Input<StorePatch> getSetInput() {
        return set;
    }

    public UpdateStoreInput setSet(StorePatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateStoreInput setSetInput(Input<StorePatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public StorePatch getRemove() {
        return remove.getValue();
    }

    public Input<StorePatch> getRemoveInput() {
        return remove;
    }

    public UpdateStoreInput setRemove(StorePatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateStoreInput setRemoveInput(Input<StorePatch> remove) {
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
