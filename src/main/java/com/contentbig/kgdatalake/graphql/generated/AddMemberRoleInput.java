// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Tuery;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class AddMemberRoleInput implements Serializable {
    private String name;

    private Input<PersonRef> person = Input.undefined();

    private Input<PartyRoleNameRef> roleName = Input.undefined();

    private Input<DateTime> dateFrom = Input.undefined();

    private Input<DateTime> dateThrough = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<String> number = Input.undefined();

    public AddMemberRoleInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AddMemberRoleInput setName(String name) {
        this.name = name;
        return this;
    }

    public PersonRef getPerson() {
        return person.getValue();
    }

    public Input<PersonRef> getPersonInput() {
        return person;
    }

    public AddMemberRoleInput setPerson(PersonRef person) {
        this.person = Input.optional(person);
        return this;
    }

    public AddMemberRoleInput setPersonInput(Input<PersonRef> person) {
        if (person == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.person = person;
        return this;
    }

    public PartyRoleNameRef getRoleName() {
        return roleName.getValue();
    }

    public Input<PartyRoleNameRef> getRoleNameInput() {
        return roleName;
    }

    public AddMemberRoleInput setRoleName(PartyRoleNameRef roleName) {
        this.roleName = Input.optional(roleName);
        return this;
    }

    public AddMemberRoleInput setRoleNameInput(Input<PartyRoleNameRef> roleName) {
        if (roleName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.roleName = roleName;
        return this;
    }

    public DateTime getDateFrom() {
        return dateFrom.getValue();
    }

    public Input<DateTime> getDateFromInput() {
        return dateFrom;
    }

    public AddMemberRoleInput setDateFrom(DateTime dateFrom) {
        this.dateFrom = Input.optional(dateFrom);
        return this;
    }

    public AddMemberRoleInput setDateFromInput(Input<DateTime> dateFrom) {
        if (dateFrom == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateFrom = dateFrom;
        return this;
    }

    public DateTime getDateThrough() {
        return dateThrough.getValue();
    }

    public Input<DateTime> getDateThroughInput() {
        return dateThrough;
    }

    public AddMemberRoleInput setDateThrough(DateTime dateThrough) {
        this.dateThrough = Input.optional(dateThrough);
        return this;
    }

    public AddMemberRoleInput setDateThroughInput(Input<DateTime> dateThrough) {
        if (dateThrough == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateThrough = dateThrough;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddMemberRoleInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddMemberRoleInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public AddMemberRoleInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddMemberRoleInput setIdentifierInput(Input<String> identifier) {
        if (identifier == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.identifier = identifier;
        return this;
    }

    public String getAlternateName() {
        return alternateName.getValue();
    }

    public Input<String> getAlternateNameInput() {
        return alternateName;
    }

    public AddMemberRoleInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddMemberRoleInput setAlternateNameInput(Input<String> alternateName) {
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

    public AddMemberRoleInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddMemberRoleInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public String getNumber() {
        return number.getValue();
    }

    public Input<String> getNumberInput() {
        return number;
    }

    public AddMemberRoleInput setNumber(String number) {
        this.number = Input.optional(number);
        return this;
    }

    public AddMemberRoleInput setNumberInput(Input<String> number) {
        if (number == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.number = number;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Tuery.appendQuotedString(_queryBuilder, name.toString());

        if (this.person.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("person:");
            if (person.getValue() != null) {
                person.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.roleName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("roleName:");
            if (roleName.getValue() != null) {
                roleName.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateFrom.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateFrom:");
            if (dateFrom.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, dateFrom.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateThrough.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateThrough:");
            if (dateThrough.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, dateThrough.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

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

        if (this.number.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("number:");
            if (number.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, number.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
