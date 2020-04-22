// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Input;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class TaskAssignmentPatch implements Serializable {
    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<TaskRef> about = Input.undefined();

    private Input<ReviewRef> comment = Input.undefined();

    private Input<DateTime> readAt = Input.undefined();

    private Input<DateTime> acceptedAt = Input.undefined();

    private Input<DateTime> assignedAt = Input.undefined();

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public TaskAssignmentPatch setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public TaskAssignmentPatch setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public TaskAssignmentPatch setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public TaskAssignmentPatch setIdentifierInput(Input<String> identifier) {
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

    public TaskAssignmentPatch setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public TaskAssignmentPatch setNameInput(Input<String> name) {
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

    public TaskAssignmentPatch setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public TaskAssignmentPatch setAlternateNameInput(Input<String> alternateName) {
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

    public TaskAssignmentPatch setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public TaskAssignmentPatch setDescriptionInput(Input<String> description) {
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

    public TaskAssignmentPatch setAbout(TaskRef about) {
        this.about = Input.optional(about);
        return this;
    }

    public TaskAssignmentPatch setAboutInput(Input<TaskRef> about) {
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

    public TaskAssignmentPatch setComment(ReviewRef comment) {
        this.comment = Input.optional(comment);
        return this;
    }

    public TaskAssignmentPatch setCommentInput(Input<ReviewRef> comment) {
        if (comment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.comment = comment;
        return this;
    }

    public DateTime getReadAt() {
        return readAt.getValue();
    }

    public Input<DateTime> getReadAtInput() {
        return readAt;
    }

    public TaskAssignmentPatch setReadAt(DateTime readAt) {
        this.readAt = Input.optional(readAt);
        return this;
    }

    public TaskAssignmentPatch setReadAtInput(Input<DateTime> readAt) {
        if (readAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.readAt = readAt;
        return this;
    }

    public DateTime getAcceptedAt() {
        return acceptedAt.getValue();
    }

    public Input<DateTime> getAcceptedAtInput() {
        return acceptedAt;
    }

    public TaskAssignmentPatch setAcceptedAt(DateTime acceptedAt) {
        this.acceptedAt = Input.optional(acceptedAt);
        return this;
    }

    public TaskAssignmentPatch setAcceptedAtInput(Input<DateTime> acceptedAt) {
        if (acceptedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.acceptedAt = acceptedAt;
        return this;
    }

    public DateTime getAssignedAt() {
        return assignedAt.getValue();
    }

    public Input<DateTime> getAssignedAtInput() {
        return assignedAt;
    }

    public TaskAssignmentPatch setAssignedAt(DateTime assignedAt) {
        this.assignedAt = Input.optional(assignedAt);
        return this;
    }

    public TaskAssignmentPatch setAssignedAtInput(Input<DateTime> assignedAt) {
        if (assignedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.assignedAt = assignedAt;
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

        if (this.readAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("readAt:");
            if (readAt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, readAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.acceptedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("acceptedAt:");
            if (acceptedAt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, acceptedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.assignedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("assignedAt:");
            if (assignedAt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, assignedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
