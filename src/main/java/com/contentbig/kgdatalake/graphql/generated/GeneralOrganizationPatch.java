// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Tuery;

import java.io.Serializable;
import java.util.List;

public class GeneralOrganizationPatch implements Serializable {
    private Input<List<OwnershipRef>> owns = Input.undefined();

    private Input<List<NamespaceRef>> hasNamespaces = Input.undefined();

    private Input<List<PartyRoleNameRef>> hasPartyRoleName = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<ConversationRef>> availableConversations = Input.undefined();

    private Input<ConversationRef> defaultConversation = Input.undefined();

    public List<OwnershipRef> getOwns() {
        return owns.getValue();
    }

    public Input<List<OwnershipRef>> getOwnsInput() {
        return owns;
    }

    public GeneralOrganizationPatch setOwns(List<OwnershipRef> owns) {
        this.owns = Input.optional(owns);
        return this;
    }

    public GeneralOrganizationPatch setOwnsInput(Input<List<OwnershipRef>> owns) {
        if (owns == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.owns = owns;
        return this;
    }

    public List<NamespaceRef> getHasNamespaces() {
        return hasNamespaces.getValue();
    }

    public Input<List<NamespaceRef>> getHasNamespacesInput() {
        return hasNamespaces;
    }

    public GeneralOrganizationPatch setHasNamespaces(List<NamespaceRef> hasNamespaces) {
        this.hasNamespaces = Input.optional(hasNamespaces);
        return this;
    }

    public GeneralOrganizationPatch setHasNamespacesInput(Input<List<NamespaceRef>> hasNamespaces) {
        if (hasNamespaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasNamespaces = hasNamespaces;
        return this;
    }

    public List<PartyRoleNameRef> getHasPartyRoleName() {
        return hasPartyRoleName.getValue();
    }

    public Input<List<PartyRoleNameRef>> getHasPartyRoleNameInput() {
        return hasPartyRoleName;
    }

    public GeneralOrganizationPatch setHasPartyRoleName(List<PartyRoleNameRef> hasPartyRoleName) {
        this.hasPartyRoleName = Input.optional(hasPartyRoleName);
        return this;
    }

    public GeneralOrganizationPatch setHasPartyRoleNameInput(Input<List<PartyRoleNameRef>> hasPartyRoleName) {
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

    public GeneralOrganizationPatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public GeneralOrganizationPatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public GeneralOrganizationPatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public GeneralOrganizationPatch setIdentifierInput(Input<String> identifier) {
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

    public GeneralOrganizationPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public GeneralOrganizationPatch setNameInput(Input<String> name) {
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

    public GeneralOrganizationPatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public GeneralOrganizationPatch setAlternateNameInput(Input<String> alternateName) {
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

    public GeneralOrganizationPatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public GeneralOrganizationPatch setDescriptionInput(Input<String> description) {
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

    public GeneralOrganizationPatch setAvailableConversations(List<ConversationRef> availableConversations) {
        this.availableConversations = Input.optional(availableConversations);
        return this;
    }

    public GeneralOrganizationPatch setAvailableConversationsInput(Input<List<ConversationRef>> availableConversations) {
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

    public GeneralOrganizationPatch setDefaultConversation(ConversationRef defaultConversation) {
        this.defaultConversation = Input.optional(defaultConversation);
        return this;
    }

    public GeneralOrganizationPatch setDefaultConversationInput(Input<ConversationRef> defaultConversation) {
        if (defaultConversation == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.defaultConversation = defaultConversation;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.owns.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("owns:");
            if (owns.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (OwnershipRef item1 : owns.getValue()) {
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

        if (this.hasNamespaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasNamespaces:");
            if (hasNamespaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (NamespaceRef item1 : hasNamespaces.getValue()) {
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

        _queryBuilder.append('}');
    }
}
