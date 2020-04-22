// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Tuery;

import java.io.Serializable;
import java.util.List;

public class AddIssueInput implements Serializable {
    private String name;

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<UserRef> creator = Input.undefined();

    private Input<List<UserRef>> assignees = Input.undefined();

    private Input<List<UserRef>> participants = Input.undefined();

    private Input<List<TaskRef>> tasks = Input.undefined();

    public AddIssueInput(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public AddIssueInput setName(String name) {
        this.name = name;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddIssueInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddIssueInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public AddIssueInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddIssueInput setIdentifierInput(Input<String> identifier) {
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

    public AddIssueInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddIssueInput setAlternateNameInput(Input<String> alternateName) {
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

    public AddIssueInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddIssueInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public UserRef getCreator() {
        return creator.getValue();
    }

    public Input<UserRef> getCreatorInput() {
        return creator;
    }

    public AddIssueInput setCreator(UserRef creator) {
        this.creator = Input.optional(creator);
        return this;
    }

    public AddIssueInput setCreatorInput(Input<UserRef> creator) {
        if (creator == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.creator = creator;
        return this;
    }

    public List<UserRef> getAssignees() {
        return assignees.getValue();
    }

    public Input<List<UserRef>> getAssigneesInput() {
        return assignees;
    }

    public AddIssueInput setAssignees(List<UserRef> assignees) {
        this.assignees = Input.optional(assignees);
        return this;
    }

    public AddIssueInput setAssigneesInput(Input<List<UserRef>> assignees) {
        if (assignees == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.assignees = assignees;
        return this;
    }

    public List<UserRef> getParticipants() {
        return participants.getValue();
    }

    public Input<List<UserRef>> getParticipantsInput() {
        return participants;
    }

    public AddIssueInput setParticipants(List<UserRef> participants) {
        this.participants = Input.optional(participants);
        return this;
    }

    public AddIssueInput setParticipantsInput(Input<List<UserRef>> participants) {
        if (participants == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.participants = participants;
        return this;
    }

    public List<TaskRef> getTasks() {
        return tasks.getValue();
    }

    public Input<List<TaskRef>> getTasksInput() {
        return tasks;
    }

    public AddIssueInput setTasks(List<TaskRef> tasks) {
        this.tasks = Input.optional(tasks);
        return this;
    }

    public AddIssueInput setTasksInput(Input<List<TaskRef>> tasks) {
        if (tasks == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.tasks = tasks;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Tuery.appendQuotedString(_queryBuilder, name.toString());

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

        if (this.assignees.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("assignees:");
            if (assignees.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (UserRef item1 : assignees.getValue()) {
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

        if (this.participants.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("participants:");
            if (participants.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (UserRef item1 : participants.getValue()) {
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

        if (this.tasks.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("tasks:");
            if (tasks.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (TaskRef item1 : tasks.getValue()) {
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
