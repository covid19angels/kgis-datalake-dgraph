// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.Tuery;

import java.io.Serializable;
import java.util.List;

public class ProjectFilter implements Serializable {
    private Input<List<ID>> id = Input.undefined();

    private Input<StringHashFilter> name = Input.undefined();

    private Input<ProjectFilter> and = Input.undefined();

    private Input<ProjectFilter> or = Input.undefined();

    private Input<ProjectFilter> not = Input.undefined();

    public List<ID> getId() {
        return id.getValue();
    }

    public Input<List<ID>> getIdInput() {
        return id;
    }

    public ProjectFilter setId(List<ID> id) {
        this.id = Input.optional(id);
        return this;
    }

    public ProjectFilter setIdInput(Input<List<ID>> id) {
        if (id == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.id = id;
        return this;
    }

    public StringHashFilter getName() {
        return name.getValue();
    }

    public Input<StringHashFilter> getNameInput() {
        return name;
    }

    public ProjectFilter setName(StringHashFilter name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProjectFilter setNameInput(Input<StringHashFilter> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public ProjectFilter getAnd() {
        return and.getValue();
    }

    public Input<ProjectFilter> getAndInput() {
        return and;
    }

    public ProjectFilter setAnd(ProjectFilter and) {
        this.and = Input.optional(and);
        return this;
    }

    public ProjectFilter setAndInput(Input<ProjectFilter> and) {
        if (and == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.and = and;
        return this;
    }

    public ProjectFilter getOr() {
        return or.getValue();
    }

    public Input<ProjectFilter> getOrInput() {
        return or;
    }

    public ProjectFilter setOr(ProjectFilter or) {
        this.or = Input.optional(or);
        return this;
    }

    public ProjectFilter setOrInput(Input<ProjectFilter> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    public ProjectFilter getNot() {
        return not.getValue();
    }

    public Input<ProjectFilter> getNotInput() {
        return not;
    }

    public ProjectFilter setNot(ProjectFilter not) {
        this.not = Input.optional(not);
        return this;
    }

    public ProjectFilter setNotInput(Input<ProjectFilter> not) {
        if (not == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.not = not;
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
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : id.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Tuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                name.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.and.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("and:");
            if (and.getValue() != null) {
                and.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.or.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("or:");
            if (or.getValue() != null) {
                or.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.not.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("not:");
            if (not.getValue() != null) {
                not.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
