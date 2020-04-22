// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Input;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class MessagePatch implements Serializable {
    private Input<List<ReadNoteRef>> hasReadNotes = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<ConversationRef>> isMessageOf = Input.undefined();

    private Input<UserRef> sender = Input.undefined();

    private Input<DateTime> dateSent = Input.undefined();

    private Input<UserRef> toRecipient = Input.undefined();

    private Input<DateTime> dateRead = Input.undefined();

    private Input<DateTime> dateReceived = Input.undefined();

    private Input<List<UserRef>> recipient = Input.undefined();

    private Input<List<ReviewRef>> hasReviews = Input.undefined();

    public List<ReadNoteRef> getHasReadNotes() {
        return hasReadNotes.getValue();
    }

    public Input<List<ReadNoteRef>> getHasReadNotesInput() {
        return hasReadNotes;
    }

    public MessagePatch setHasReadNotes(List<ReadNoteRef> hasReadNotes) {
        this.hasReadNotes = Input.optional(hasReadNotes);
        return this;
    }

    public MessagePatch setHasReadNotesInput(Input<List<ReadNoteRef>> hasReadNotes) {
        if (hasReadNotes == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasReadNotes = hasReadNotes;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public MessagePatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public MessagePatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public MessagePatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public MessagePatch setIdentifierInput(Input<String> identifier) {
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

    public MessagePatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public MessagePatch setNameInput(Input<String> name) {
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

    public MessagePatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public MessagePatch setAlternateNameInput(Input<String> alternateName) {
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

    public MessagePatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public MessagePatch setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<ConversationRef> getIsMessageOf() {
        return isMessageOf.getValue();
    }

    public Input<List<ConversationRef>> getIsMessageOfInput() {
        return isMessageOf;
    }

    public MessagePatch setIsMessageOf(List<ConversationRef> isMessageOf) {
        this.isMessageOf = Input.optional(isMessageOf);
        return this;
    }

    public MessagePatch setIsMessageOfInput(Input<List<ConversationRef>> isMessageOf) {
        if (isMessageOf == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isMessageOf = isMessageOf;
        return this;
    }

    public UserRef getSender() {
        return sender.getValue();
    }

    public Input<UserRef> getSenderInput() {
        return sender;
    }

    public MessagePatch setSender(UserRef sender) {
        this.sender = Input.optional(sender);
        return this;
    }

    public MessagePatch setSenderInput(Input<UserRef> sender) {
        if (sender == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.sender = sender;
        return this;
    }

    public DateTime getDateSent() {
        return dateSent.getValue();
    }

    public Input<DateTime> getDateSentInput() {
        return dateSent;
    }

    public MessagePatch setDateSent(DateTime dateSent) {
        this.dateSent = Input.optional(dateSent);
        return this;
    }

    public MessagePatch setDateSentInput(Input<DateTime> dateSent) {
        if (dateSent == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateSent = dateSent;
        return this;
    }

    public UserRef getToRecipient() {
        return toRecipient.getValue();
    }

    public Input<UserRef> getToRecipientInput() {
        return toRecipient;
    }

    public MessagePatch setToRecipient(UserRef toRecipient) {
        this.toRecipient = Input.optional(toRecipient);
        return this;
    }

    public MessagePatch setToRecipientInput(Input<UserRef> toRecipient) {
        if (toRecipient == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.toRecipient = toRecipient;
        return this;
    }

    public DateTime getDateRead() {
        return dateRead.getValue();
    }

    public Input<DateTime> getDateReadInput() {
        return dateRead;
    }

    public MessagePatch setDateRead(DateTime dateRead) {
        this.dateRead = Input.optional(dateRead);
        return this;
    }

    public MessagePatch setDateReadInput(Input<DateTime> dateRead) {
        if (dateRead == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateRead = dateRead;
        return this;
    }

    public DateTime getDateReceived() {
        return dateReceived.getValue();
    }

    public Input<DateTime> getDateReceivedInput() {
        return dateReceived;
    }

    public MessagePatch setDateReceived(DateTime dateReceived) {
        this.dateReceived = Input.optional(dateReceived);
        return this;
    }

    public MessagePatch setDateReceivedInput(Input<DateTime> dateReceived) {
        if (dateReceived == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dateReceived = dateReceived;
        return this;
    }

    public List<UserRef> getRecipient() {
        return recipient.getValue();
    }

    public Input<List<UserRef>> getRecipientInput() {
        return recipient;
    }

    public MessagePatch setRecipient(List<UserRef> recipient) {
        this.recipient = Input.optional(recipient);
        return this;
    }

    public MessagePatch setRecipientInput(Input<List<UserRef>> recipient) {
        if (recipient == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.recipient = recipient;
        return this;
    }

    public List<ReviewRef> getHasReviews() {
        return hasReviews.getValue();
    }

    public Input<List<ReviewRef>> getHasReviewsInput() {
        return hasReviews;
    }

    public MessagePatch setHasReviews(List<ReviewRef> hasReviews) {
        this.hasReviews = Input.optional(hasReviews);
        return this;
    }

    public MessagePatch setHasReviewsInput(Input<List<ReviewRef>> hasReviews) {
        if (hasReviews == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.hasReviews = hasReviews;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.hasReadNotes.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasReadNotes:");
            if (hasReadNotes.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReadNoteRef item1 : hasReadNotes.getValue()) {
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

        if (this.isMessageOf.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isMessageOf:");
            if (isMessageOf.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ConversationRef item1 : isMessageOf.getValue()) {
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

        if (this.sender.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("sender:");
            if (sender.getValue() != null) {
                sender.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateSent.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateSent:");
            if (dateSent.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, dateSent.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.toRecipient.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("toRecipient:");
            if (toRecipient.getValue() != null) {
                toRecipient.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateRead.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateRead:");
            if (dateRead.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, dateRead.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dateReceived.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dateReceived:");
            if (dateReceived.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, dateReceived.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.recipient.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("recipient:");
            if (recipient.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (UserRef item1 : recipient.getValue()) {
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

        if (this.hasReviews.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("hasReviews:");
            if (hasReviews.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ReviewRef item1 : hasReviews.getValue()) {
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