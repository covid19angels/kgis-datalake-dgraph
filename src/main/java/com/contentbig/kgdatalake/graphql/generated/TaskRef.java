// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class TaskRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<IssueRef> about = Input.undefined();

    private Input<ProjectRef> isPartOf = Input.undefined();

    private Input<String> wbsNo = Input.undefined();

    private Input<TaskPriority> priority = Input.undefined();

    private Input<UserRef> creator = Input.undefined();

    private Input<List<UserRef>> watcher = Input.undefined();

    private Input<DateTime> planStart = Input.undefined();

    private Input<DateTime> planFinish = Input.undefined();

    private Input<Integer> percentComplete = Input.undefined();

    private Input<DateTime> createdAt = Input.undefined();

    private Input<DateTime> updatedAt = Input.undefined();

    private Input<TaskRef> parentTask = Input.undefined();

    private Input<TaskRef> previousTask = Input.undefined();

    private Input<List<TaskRef>> subTasks = Input.undefined();

    private Input<List<TaskRef>> dependsOn = Input.undefined();

    private Input<List<TaskAssignmentRef>> assignments = Input.undefined();

    private Input<TaskStatus> status = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public TaskRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public TaskRef setIdInput(Input<ID> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public TaskRef setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public TaskRef setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public TaskRef setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public TaskRef setIdentifierInput(Input<String> identifier) {
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

    public TaskRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public TaskRef setNameInput(Input<String> name) {
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

    public TaskRef setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public TaskRef setAlternateNameInput(Input<String> alternateName) {
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

    public TaskRef setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public TaskRef setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public IssueRef getAbout() {
        return about.getValue();
    }

    public Input<IssueRef> getAboutInput() {
        return about;
    }

    public TaskRef setAbout(IssueRef about) {
        this.about = Input.optional(about);
        return this;
    }

    public TaskRef setAboutInput(Input<IssueRef> about) {
        if (about == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.about = about;
        return this;
    }

    public ProjectRef getIsPartOf() {
        return isPartOf.getValue();
    }

    public Input<ProjectRef> getIsPartOfInput() {
        return isPartOf;
    }

    public TaskRef setIsPartOf(ProjectRef isPartOf) {
        this.isPartOf = Input.optional(isPartOf);
        return this;
    }

    public TaskRef setIsPartOfInput(Input<ProjectRef> isPartOf) {
        if (isPartOf == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isPartOf = isPartOf;
        return this;
    }

    public String getWbsNo() {
        return wbsNo.getValue();
    }

    public Input<String> getWbsNoInput() {
        return wbsNo;
    }

    public TaskRef setWbsNo(String wbsNo) {
        this.wbsNo = Input.optional(wbsNo);
        return this;
    }

    public TaskRef setWbsNoInput(Input<String> wbsNo) {
        if (wbsNo == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.wbsNo = wbsNo;
        return this;
    }

    public TaskPriority getPriority() {
        return priority.getValue();
    }

    public Input<TaskPriority> getPriorityInput() {
        return priority;
    }

    public TaskRef setPriority(TaskPriority priority) {
        this.priority = Input.optional(priority);
        return this;
    }

    public TaskRef setPriorityInput(Input<TaskPriority> priority) {
        if (priority == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.priority = priority;
        return this;
    }

    public UserRef getCreator() {
        return creator.getValue();
    }

    public Input<UserRef> getCreatorInput() {
        return creator;
    }

    public TaskRef setCreator(UserRef creator) {
        this.creator = Input.optional(creator);
        return this;
    }

    public TaskRef setCreatorInput(Input<UserRef> creator) {
        if (creator == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.creator = creator;
        return this;
    }

    public List<UserRef> getWatcher() {
        return watcher.getValue();
    }

    public Input<List<UserRef>> getWatcherInput() {
        return watcher;
    }

    public TaskRef setWatcher(List<UserRef> watcher) {
        this.watcher = Input.optional(watcher);
        return this;
    }

    public TaskRef setWatcherInput(Input<List<UserRef>> watcher) {
        if (watcher == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.watcher = watcher;
        return this;
    }

    public DateTime getPlanStart() {
        return planStart.getValue();
    }

    public Input<DateTime> getPlanStartInput() {
        return planStart;
    }

    public TaskRef setPlanStart(DateTime planStart) {
        this.planStart = Input.optional(planStart);
        return this;
    }

    public TaskRef setPlanStartInput(Input<DateTime> planStart) {
        if (planStart == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.planStart = planStart;
        return this;
    }

    public DateTime getPlanFinish() {
        return planFinish.getValue();
    }

    public Input<DateTime> getPlanFinishInput() {
        return planFinish;
    }

    public TaskRef setPlanFinish(DateTime planFinish) {
        this.planFinish = Input.optional(planFinish);
        return this;
    }

    public TaskRef setPlanFinishInput(Input<DateTime> planFinish) {
        if (planFinish == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.planFinish = planFinish;
        return this;
    }

    public Integer getPercentComplete() {
        return percentComplete.getValue();
    }

    public Input<Integer> getPercentCompleteInput() {
        return percentComplete;
    }

    public TaskRef setPercentComplete(Integer percentComplete) {
        this.percentComplete = Input.optional(percentComplete);
        return this;
    }

    public TaskRef setPercentCompleteInput(Input<Integer> percentComplete) {
        if (percentComplete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentComplete = percentComplete;
        return this;
    }

    public DateTime getCreatedAt() {
        return createdAt.getValue();
    }

    public Input<DateTime> getCreatedAtInput() {
        return createdAt;
    }

    public TaskRef setCreatedAt(DateTime createdAt) {
        this.createdAt = Input.optional(createdAt);
        return this;
    }

    public TaskRef setCreatedAtInput(Input<DateTime> createdAt) {
        if (createdAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAt = createdAt;
        return this;
    }

    public DateTime getUpdatedAt() {
        return updatedAt.getValue();
    }

    public Input<DateTime> getUpdatedAtInput() {
        return updatedAt;
    }

    public TaskRef setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = Input.optional(updatedAt);
        return this;
    }

    public TaskRef setUpdatedAtInput(Input<DateTime> updatedAt) {
        if (updatedAt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedAt = updatedAt;
        return this;
    }

    public TaskRef getParentTask() {
        return parentTask.getValue();
    }

    public Input<TaskRef> getParentTaskInput() {
        return parentTask;
    }

    public TaskRef setParentTask(TaskRef parentTask) {
        this.parentTask = Input.optional(parentTask);
        return this;
    }

    public TaskRef setParentTaskInput(Input<TaskRef> parentTask) {
        if (parentTask == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.parentTask = parentTask;
        return this;
    }

    public TaskRef getPreviousTask() {
        return previousTask.getValue();
    }

    public Input<TaskRef> getPreviousTaskInput() {
        return previousTask;
    }

    public TaskRef setPreviousTask(TaskRef previousTask) {
        this.previousTask = Input.optional(previousTask);
        return this;
    }

    public TaskRef setPreviousTaskInput(Input<TaskRef> previousTask) {
        if (previousTask == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.previousTask = previousTask;
        return this;
    }

    public List<TaskRef> getSubTasks() {
        return subTasks.getValue();
    }

    public Input<List<TaskRef>> getSubTasksInput() {
        return subTasks;
    }

    public TaskRef setSubTasks(List<TaskRef> subTasks) {
        this.subTasks = Input.optional(subTasks);
        return this;
    }

    public TaskRef setSubTasksInput(Input<List<TaskRef>> subTasks) {
        if (subTasks == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.subTasks = subTasks;
        return this;
    }

    public List<TaskRef> getDependsOn() {
        return dependsOn.getValue();
    }

    public Input<List<TaskRef>> getDependsOnInput() {
        return dependsOn;
    }

    public TaskRef setDependsOn(List<TaskRef> dependsOn) {
        this.dependsOn = Input.optional(dependsOn);
        return this;
    }

    public TaskRef setDependsOnInput(Input<List<TaskRef>> dependsOn) {
        if (dependsOn == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dependsOn = dependsOn;
        return this;
    }

    public List<TaskAssignmentRef> getAssignments() {
        return assignments.getValue();
    }

    public Input<List<TaskAssignmentRef>> getAssignmentsInput() {
        return assignments;
    }

    public TaskRef setAssignments(List<TaskAssignmentRef> assignments) {
        this.assignments = Input.optional(assignments);
        return this;
    }

    public TaskRef setAssignmentsInput(Input<List<TaskAssignmentRef>> assignments) {
        if (assignments == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.assignments = assignments;
        return this;
    }

    public TaskStatus getStatus() {
        return status.getValue();
    }

    public Input<TaskStatus> getStatusInput() {
        return status;
    }

    public TaskRef setStatus(TaskStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public TaskRef setStatusInput(Input<TaskStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.id.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("id:");
            if (id.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, id.getValue().toString());
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

        if (this.isPartOf.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isPartOf:");
            if (isPartOf.getValue() != null) {
                isPartOf.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.wbsNo.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("wbsNO:");
            if (wbsNo.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, wbsNo.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.priority.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("priority:");
            if (priority.getValue() != null) {
                _queryBuilder.append(priority.getValue().toString());
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

        if (this.watcher.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("watcher:");
            if (watcher.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (UserRef item1 : watcher.getValue()) {
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

        if (this.planStart.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("planStart:");
            if (planStart.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, planStart.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.planFinish.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("planFinish:");
            if (planFinish.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, planFinish.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.percentComplete.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("percentComplete:");
            if (percentComplete.getValue() != null) {
                _queryBuilder.append(percentComplete.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdAt:");
            if (createdAt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, createdAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.updatedAt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("updatedAt:");
            if (updatedAt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, updatedAt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.parentTask.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("parentTask:");
            if (parentTask.getValue() != null) {
                parentTask.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.previousTask.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("previousTask:");
            if (previousTask.getValue() != null) {
                previousTask.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.subTasks.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("subTasks:");
            if (subTasks.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (TaskRef item1 : subTasks.getValue()) {
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

        if (this.dependsOn.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dependsOn:");
            if (dependsOn.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (TaskRef item1 : dependsOn.getValue()) {
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

        if (this.assignments.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("assignments:");
            if (assignments.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (TaskAssignmentRef item1 : assignments.getValue()) {
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

        if (this.status.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("status:");
            if (status.getValue() != null) {
                _queryBuilder.append(status.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
