// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateProductModelInput implements Serializable {
    private ProductModelFilter filter;

    private Input<ProductModelPatch> set = Input.undefined();

    private Input<ProductModelPatch> remove = Input.undefined();

    public UpdateProductModelInput(ProductModelFilter filter) {
        this.filter = filter;
    }

    public ProductModelFilter getFilter() {
        return filter;
    }

    public UpdateProductModelInput setFilter(ProductModelFilter filter) {
        this.filter = filter;
        return this;
    }

    public ProductModelPatch getSet() {
        return set.getValue();
    }

    public Input<ProductModelPatch> getSetInput() {
        return set;
    }

    public UpdateProductModelInput setSet(ProductModelPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateProductModelInput setSetInput(Input<ProductModelPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public ProductModelPatch getRemove() {
        return remove.getValue();
    }

    public Input<ProductModelPatch> getRemoveInput() {
        return remove;
    }

    public UpdateProductModelInput setRemove(ProductModelPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateProductModelInput setRemoveInput(Input<ProductModelPatch> remove) {
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
