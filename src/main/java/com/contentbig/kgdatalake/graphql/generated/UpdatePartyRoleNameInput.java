// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class UpdatePartyRoleNameInput implements Serializable {
    private PartyRoleNameFilter filter;

    private Input<PartyRoleNamePatch> set = Input.undefined();

    private Input<PartyRoleNamePatch> remove = Input.undefined();

    public UpdatePartyRoleNameInput(PartyRoleNameFilter filter) {
        this.filter = filter;
    }

    public PartyRoleNameFilter getFilter() {
        return filter;
    }

    public UpdatePartyRoleNameInput setFilter(PartyRoleNameFilter filter) {
        this.filter = filter;
        return this;
    }

    public PartyRoleNamePatch getSet() {
        return set.getValue();
    }

    public Input<PartyRoleNamePatch> getSetInput() {
        return set;
    }

    public UpdatePartyRoleNameInput setSet(PartyRoleNamePatch set) {
        this.set = Input.optional(set);
        return this;
    }

    public UpdatePartyRoleNameInput setSetInput(Input<PartyRoleNamePatch> set) {
        if (set == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.set = set;
        return this;
    }

    public PartyRoleNamePatch getRemove() {
        return remove.getValue();
    }

    public Input<PartyRoleNamePatch> getRemoveInput() {
        return remove;
    }

    public UpdatePartyRoleNameInput setRemove(PartyRoleNamePatch remove) {
        this.remove = Input.optional(remove);
        return this;
    }

    public UpdatePartyRoleNameInput setRemoveInput(Input<PartyRoleNamePatch> remove) {
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
