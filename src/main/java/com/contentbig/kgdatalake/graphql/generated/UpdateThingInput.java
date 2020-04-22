// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateThingInput implements Serializable {
    private ThingFilter filter;

    private Input<ThingPatch> set = Input.undefined();

    private Input<ThingPatch> remove = Input.undefined();

    public UpdateThingInput(ThingFilter filter) {
        this.filter = filter;
    }

    public ThingFilter getFilter() {
        return filter;
    }

    public UpdateThingInput setFilter(ThingFilter filter) {
        this.filter = filter;
        return this;
    }

    public ThingPatch getSet() {
        return set.getValue();
    }

    public Input<ThingPatch> getSetInput() {
        return set;
    }

    public UpdateThingInput setSet(ThingPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateThingInput setSetInput(Input<ThingPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public ThingPatch getRemove() {
        return remove.getValue();
    }

    public Input<ThingPatch> getRemoveInput() {
        return remove;
    }

    public UpdateThingInput setRemove(ThingPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateThingInput setRemoveInput(Input<ThingPatch> remove) {
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
