// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Tuery;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class PartyRoleNamePatch implements Serializable {
    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> group = Input.undefined();

    private Input<UserRef> creator = Input.undefined();

    private Input<DateTime> dateCreated = Input.undefined();

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public PartyRoleNamePatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public PartyRoleNamePatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
        if (namespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.namespaces = namespaces;
        return this;
    }

    public String getIdentifier() {
        return identifier.getValue();
    }

    public Input<String> getIdentifierInput() {
        return identifier;
    }

    public PartyRoleNamePatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public PartyRoleNamePatch setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public PartyRoleNamePatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public PartyRoleNamePatch setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public PartyRoleNamePatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public PartyRoleNamePatch setAlternateNameInput(Input<String> alternateName) {
        if (alternateName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.alternateName = alternateName;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public PartyRoleNamePatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public PartyRoleNamePatch setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getGroup() {
        return group.getValue();
    }

    public Input<String> getGroupInput() {
        return group;
    }

    public PartyRoleNamePatch setGroup(String group) {
        this.group = Input.optional(group);
        return this;
    }

    public PartyRoleNamePatch setGroupInput(Input<String> group) {
        if (group == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.group = group;
        return this;
    }

    public UserRef getCreator() {
        return creator.getValue();
    }

    public Input<UserRef> getCreatorInput() {
        return creator;
    }

    public PartyRoleNamePatch setCreator(UserRef creator) {
        this.creator = Input.optional(creator);
        return this;
    }

    public PartyRoleNamePatch setCreatorInput(Input<UserRef> creator) {
        if (creator == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.creator = creator;
        return this;
    }

    public DateTime getDateCreated() {
        return dateCreated.getValue();
    }

    public Input<DateTime> getDateCreatedInput() {
        return dateCreated;
    }

    public PartyRoleNamePatch setDateCreated(DateTime dateCreated) {
        this.dateCreated = Input.optional(dateCreated);
        return this;
    }

    public PartyRoleNamePatch setDateCreatedInput(Input<DateTime> dateCreated) {
        if (dateCreated == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateCreated = dateCreated;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.namespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("namespaces:");
            if (namespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NamespaceRef item1 : namespaces.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.identifier.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("identifier:");
            if (identifier.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, identifier.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, name.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.alternateName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("alternateName:");
            if (alternateName.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, alternateName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.group.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("group:");
            if (group.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, group.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.creator.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("creator:");
            if (creator.getValue() != null) {
                creator.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateCreated.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateCreated:");
            if (dateCreated.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, dateCreated.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
