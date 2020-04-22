// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdateGeneralOrganizationInput implements Serializable {
    private GeneralOrganizationFilter filter;

    private Input<GeneralOrganizationPatch> set = Input.undefined();

    private Input<GeneralOrganizationPatch> remove = Input.undefined();

    public UpdateGeneralOrganizationInput(GeneralOrganizationFilter filter) {
        this.filter = filter;
    }

    public GeneralOrganizationFilter getFilter() {
        return filter;
    }

    public UpdateGeneralOrganizationInput setFilter(GeneralOrganizationFilter filter) {
        this.filter = filter;
        return this;
    }

    public GeneralOrganizationPatch getSet() {
        return set.getValue();
    }

    public Input<GeneralOrganizationPatch> getSetInput() {
        return set;
    }

    public UpdateGeneralOrganizationInput setSet(GeneralOrganizationPatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdateGeneralOrganizationInput setSetInput(Input<GeneralOrganizationPatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public GeneralOrganizationPatch getRemove() {
        return remove.getValue();
    }

    public Input<GeneralOrganizationPatch> getRemoveInput() {
        return remove;
    }

    public UpdateGeneralOrganizationInput setRemove(GeneralOrganizationPatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdateGeneralOrganizationInput setRemoveInput(Input<GeneralOrganizationPatch> remove) {
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
