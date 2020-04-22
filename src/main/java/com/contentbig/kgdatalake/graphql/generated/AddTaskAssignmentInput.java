// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Tuery;
import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class AddTaskAssignmentInput implements Serializable {
    private String name;

    private DateTime readAt;

    private DateTime acceptedAt;

    private DateTime assignedAt;

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<TaskRef> about = Input.undefined();

    private Input<ReviewRef> comment = Input.undefined();

    public AddTaskAssignmentInput(String name, DateTime readAt, DateTime acceptedAt, DateTime assignedAt) {
        this.name = name;

        this.readAt = readAt;

        this.acceptedAt = acceptedAt;

        this.assignedAt = assignedAt;
    }

    public String getName() {
        return name;
    }

    public AddTaskAssignmentInput setName(String name) {
        this.name = name;
        return this;
    }

    public DateTime getReadAt() {
        return readAt;
    }

    public AddTaskAssignmentInput setReadAt(DateTime readAt) {
        this.readAt = readAt;
        return this;
    }

    public DateTime getAcceptedAt() {
        return acceptedAt;
    }

    public AddTaskAssignmentInput setAcceptedAt(DateTime acceptedAt) {
        this.acceptedAt = acceptedAt;
        return this;
    }

    public DateTime getAssignedAt() {
        return assignedAt;
    }

    public AddTaskAssignmentInput setAssignedAt(DateTime assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddTaskAssignmentInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddTaskAssignmentInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public AddTaskAssignmentInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddTaskAssignmentInput setIdentifierInput(Input<String> identifier) {
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

    public AddTaskAssignmentInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddTaskAssignmentInput setAlternateNameInput(Input<String> alternateName) {
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

    public AddTaskAssignmentInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddTaskAssignmentInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public TaskRef getAbout() {
        return about.getValue();
    }

    public Input<TaskRef> getAboutInput() {
        return about;
    }

    public AddTaskAssignmentInput setAbout(TaskRef about) {
        this.about = Input.optional(about);
        return this;
    }

    public AddTaskAssignmentInput setAboutInput(Input<TaskRef> about) {
        if (about == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.about = about;
        return this;
    }

    public ReviewRef getComment() {
        return comment.getValue();
    }

    public Input<ReviewRef> getCommentInput() {
        return comment;
    }

    public AddTaskAssignmentInput setComment(ReviewRef comment) {
        this.comment = Input.optional(comment);
        return this;
    }

    public AddTaskAssignmentInput setCommentInput(Input<ReviewRef> comment) {
        if (comment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.comment = comment;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Tuery.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("readAt:");
        Tuery.appendQuotedString(_queryBuilder, readAt.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("acceptedAt:");
        Tuery.appendQuotedString(_queryBuilder, acceptedAt.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("assignedAt:");
        Tuery.appendQuotedString(_queryBuilder, assignedAt.toString());

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

        if (this.about.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("about:");
            if (about.getValue() != null) {
                about.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.comment.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("comment:");
            if (comment.getValue() != null) {
                comment.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
