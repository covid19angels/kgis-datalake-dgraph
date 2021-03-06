// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateDataCatalogInput implements Serializable {
    private DataCatalogFilter filter;

    private Input<DataCatalogPatch> set = Input.undefined();

    private Input<DataCatalogPatch> remove = Input.undefined();

    public UpdateDataCatalogInput(DataCatalogFilter filter) {
        this.filter = filter;
    }

    public DataCatalogFilter getFilter() {
        return filter;
    }

    public UpdateDataCatalogInput setFilter(DataCatalogFilter filter) {
        this.filter = filter;
        return this;
    }

    public DataCatalogPatch getSet() {
        return set.getValue();
    }

    public Input<DataCatalogPatch> getSetInput() {
        return set;
    }

    public UpdateDataCatalogInput setSet(DataCatalogPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateDataCatalogInput setSetInput(Input<DataCatalogPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public DataCatalogPatch getRemove() {
        return remove.getValue();
    }

    public Input<DataCatalogPatch> getRemoveInput() {
        return remove;
    }

    public UpdateDataCatalogInput setRemove(DataCatalogPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateDataCatalogInput setRemoveInput(Input<DataCatalogPatch> remove) {
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
