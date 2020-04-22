// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Input;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public class AddTaskInput implements Serializable {
    private String name;

    private DateTime createdAt;

    private DateTime updatedAt;

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

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

    private Input<TaskRef> parentTask = Input.undefined();

    private Input<TaskRef> previousTask = Input.undefined();

    private Input<List<TaskRef>> subTasks = Input.undefined();

    private Input<List<TaskRef>> dependsOn = Input.undefined();

    private Input<List<TaskAssignmentRef>> assignments = Input.undefined();

    private Input<TaskStatus> status = Input.undefined();

    public AddTaskInput(String name, DateTime createdAt, DateTime updatedAt) {
        this.name = name;

        this.createdAt = createdAt;

        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public AddTaskInput setName(String name) {
        this.name = name;
        return this;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public AddTaskInput setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public AddTaskInput setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public List<NamespaceRef> getNamespaces() {
        return namespaces.getValue();
    }

    public Input<List<NamespaceRef>> getNamespacesInput() {
        return namespaces;
    }

    public AddTaskInput setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public AddTaskInput setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public AddTaskInput setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public AddTaskInput setIdentifierInput(Input<String> identifier) {
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

    public AddTaskInput setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public AddTaskInput setAlternateNameInput(Input<String> alternateName) {
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

    public AddTaskInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public AddTaskInput setDescriptionInput(Input<String> description) {
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

    public AddTaskInput setAbout(IssueRef about) {
        this.about = Input.optional(about);
        return this;
    }

    public AddTaskInput setAboutInput(Input<IssueRef> about) {
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

    public AddTaskInput setIsPartOf(ProjectRef isPartOf) {
        this.isPartOf = Input.optional(isPartOf);
        return this;
    }

    public AddTaskInput setIsPartOfInput(Input<ProjectRef> isPartOf) {
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

    public AddTaskInput setWbsNo(String wbsNo) {
        this.wbsNo = Input.optional(wbsNo);
        return this;
    }

    public AddTaskInput setWbsNoInput(Input<String> wbsNo) {
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

    public AddTaskInput setPriority(TaskPriority priority) {
        this.priority = Input.optional(priority);
        return this;
    }

    public AddTaskInput setPriorityInput(Input<TaskPriority> priority) {
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

    public AddTaskInput setCreator(UserRef creator) {
        this.creator = Input.optional(creator);
        return this;
    }

    public AddTaskInput setCreatorInput(Input<UserRef> creator) {
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

    public AddTaskInput setWatcher(List<UserRef> watcher) {
        this.watcher = Input.optional(watcher);
        return this;
    }

    public AddTaskInput setWatcherInput(Input<List<UserRef>> watcher) {
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

    public AddTaskInput setPlanStart(DateTime planStart) {
        this.planStart = Input.optional(planStart);
        return this;
    }

    public AddTaskInput setPlanStartInput(Input<DateTime> planStart) {
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

    public AddTaskInput setPlanFinish(DateTime planFinish) {
        this.planFinish = Input.optional(planFinish);
        return this;
    }

    public AddTaskInput setPlanFinishInput(Input<DateTime> planFinish) {
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

    public AddTaskInput setPercentComplete(Integer percentComplete) {
        this.percentComplete = Input.optional(percentComplete);
        return this;
    }

    public AddTaskInput setPercentCompleteInput(Input<Integer> percentComplete) {
        if (percentComplete == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.percentComplete = percentComplete;
        return this;
    }

    public TaskRef getParentTask() {
        return parentTask.getValue();
    }

    public Input<TaskRef> getParentTaskInput() {
        return parentTask;
    }

    public AddTaskInput setParentTask(TaskRef parentTask) {
        this.parentTask = Input.optional(parentTask);
        return this;
    }

    public AddTaskInput setParentTaskInput(Input<TaskRef> parentTask) {
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

    public AddTaskInput setPreviousTask(TaskRef previousTask) {
        this.previousTask = Input.optional(previousTask);
        return this;
    }

    public AddTaskInput setPreviousTaskInput(Input<TaskRef> previousTask) {
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

    public AddTaskInput setSubTasks(List<TaskRef> subTasks) {
        this.subTasks = Input.optional(subTasks);
        return this;
    }

    public AddTaskInput setSubTasksInput(Input<List<TaskRef>> subTasks) {
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

    public AddTaskInput setDependsOn(List<TaskRef> dependsOn) {
        this.dependsOn = Input.optional(dependsOn);
        return this;
    }

    public AddTaskInput setDependsOnInput(Input<List<TaskRef>> dependsOn) {
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

    public AddTaskInput setAssignments(List<TaskAssignmentRef> assignments) {
        this.assignments = Input.optional(assignments);
        return this;
    }

    public AddTaskInput setAssignmentsInput(Input<List<TaskAssignmentRef>> assignments) {
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

    public AddTaskInput setStatus(TaskStatus status) {
        this.status = Input.optional(status);
        return this;
    }

    public AddTaskInput setStatusInput(Input<TaskStatus> status) {
        if (status == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.status = status;
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
        _queryBuilder.append("createdAt:");
        Tuery.appendQuotedString(_queryBuilder, createdAt.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("updatedAt:");
        Tuery.appendQuotedString(_queryBuilder, updatedAt.toString());

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
