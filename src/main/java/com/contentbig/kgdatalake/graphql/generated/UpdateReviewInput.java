// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateReviewInput implements Serializable {
    private ReviewFilter filter;

    private Input<ReviewPatch> set = Input.undefined();

    private Input<ReviewPatch> remove = Input.undefined();

    public UpdateReviewInput(ReviewFilter filter) {
        this.filter = filter;
    }

    public ReviewFilter getFilter() {
        return filter;
    }

    public UpdateReviewInput setFilter(ReviewFilter filter) {
        this.filter = filter;
        return this;
    }

    public ReviewPatch getSet() {
        return set.getValue();
    }

    public Input<ReviewPatch> getSetInput() {
        return set;
    }

    public UpdateReviewInput setSet(ReviewPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateReviewInput setSetInput(Input<ReviewPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public ReviewPatch getRemove() {
        return remove.getValue();
    }

    public Input<ReviewPatch> getRemoveInput() {
        return remove;
    }

    public UpdateReviewInput setRemove(ReviewPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateReviewInput setRemoveInput(Input<ReviewPatch> remove) {
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
