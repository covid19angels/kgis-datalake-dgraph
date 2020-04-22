// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Input;

import java.io.Serializable;
import java.util.List;

public class AddProjectInput implements Serializable {
    private String name;

    private Input<List<PartyRoleNameRef>> hasPartyRoleName = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<ConversationRef>> availableConversations = Input.undefined();

    private Input<ConversationRef> defaultConversation = Input.undefined();

    private Input<List<TaskRef>> hasPart = Input.undefined();

    private Input<List<UserRef>> managers = Input.undefined();

    public AddProjectInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AddProjectInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<PartyRoleNameRef> getHasPartyRoleName() {
        return hasPartyRoleName.getValue();
    }

    public Input<List<PartyRoleNameRef>> getHasPartyRoleNameInput() {
        return hasPartyRoleName;
    }

    public AddProjectInput setHasPartyRoleName(List<PartyRoleNameRef> hasPartyRoleName) {
        this.hasPartyRoleName = Input.optional(hasPartyRoleName);
        return this;
    }

    public AddProjectInput setHasPartyRoleNameInput(Input<List<PartyRoleNameRef>> hasPartyRoleName) {
        if (hasPartyRoleName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasPartyRoleName = hasPartyRoleName;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddProjectInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddProjectInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public AddProjectInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddProjectInput setIdentifierInput(Input<String> identifier) {
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

    public AddProjectInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddProjectInput setAlternateNameInput(Input<String> alternateName) {
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

    public AddProjectInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddProjectInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<ConversationRef> getAvailableConversations() {
        return availableConversations.getValue();
    }

    public Input<List<ConversationRef>> getAvailableConversationsInput() {
        return availableConversations;
    }

    public AddProjectInput setAvailableConversations(List<ConversationRef> availableConversations) {
        this.availableConversations = Input.optional(availableConversations);
        return this;
    }

    public AddProjectInput setAvailableConversationsInput(Input<List<ConversationRef>> availableConversations) {
        if (availableConversations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.availableConversations = availableConversations;
        return this;
    }

    public ConversationRef getDefaultConversation() {
        return defaultConversation.getValue();
    }

    public Input<ConversationRef> getDefaultConversationInput() {
        return defaultConversation;
    }

    public AddProjectInput setDefaultConversation(ConversationRef defaultConversation) {
        this.defaultConversation = Input.optional(defaultConversation);
        return this;
    }

    public AddProjectInput setDefaultConversationInput(Input<ConversationRef> defaultConversation) {
        if (defaultConversation == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultConversation = defaultConversation;
        return this;
    }

    public List<TaskRef> getHasPart() {
        return hasPart.getValue();
    }

    public Input<List<TaskRef>> getHasPartInput() {
        return hasPart;
    }

    public AddProjectInput setHasPart(List<TaskRef> hasPart) {
        this.hasPart = Input.optional(hasPart);
        return this;
    }

    public AddProjectInput setHasPartInput(Input<List<TaskRef>> hasPart) {
        if (hasPart == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasPart = hasPart;
        return this;
    }

    public List<UserRef> getManagers() {
        return managers.getValue();
    }

    public Input<List<UserRef>> getManagersInput() {
        return managers;
    }

    public AddProjectInput setManagers(List<UserRef> managers) {
        this.managers = Input.optional(managers);
        return this;
    }

    public AddProjectInput setManagersInput(Input<List<UserRef>> managers) {
        if (managers == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.managers = managers;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Tuery.appendQuotedString(_queryBuilder, name.toString());

        if (this.hasPartyRoleName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasPartyRoleName:");
            if (hasPartyRoleName.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (PartyRoleNameRef item1 : hasPartyRoleName.getValue()) {
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

        if (this.availableConversations.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("availableConversations:");
            if (availableConversations.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ConversationRef item1 : availableConversations.getValue()) {
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

        if (this.defaultConversation.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("defaultConversation:");
            if (defaultConversation.getValue() != null) {
                defaultConversation.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.hasPart.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasPart:");
            if (hasPart.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (TaskRef item1 : hasPart.getValue()) {
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

        if (this.managers.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("managers:");
            if (managers.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (UserRef item1 : managers.getValue()) {
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

        _queryBuilder.append('}');
    }
}
