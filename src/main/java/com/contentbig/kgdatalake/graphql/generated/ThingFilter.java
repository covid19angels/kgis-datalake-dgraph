// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class ThingFilter implements Serializable {
    private Input<StringHashFilter> name = Input.undefined();

    private Input<ThingFilter> and = Input.undefined();

    private Input<ThingFilter> or = Input.undefined();

    private Input<ThingFilter> not = Input.undefined();

    public StringHashFilter getName() {
        return name.getValue();
    }

    public Input<StringHashFilter> getNameInput() {
        return name;
    }

    public ThingFilter setName(StringHashFilter name) {
        this.name = Input.optional(name);
        return this;
    }

    public ThingFilter setNameInput(Input<StringHashFilter> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public ThingFilter getAnd() {
        return and.getValue();
    }

    public Input<ThingFilter> getAndInput() {
        return and;
    }

    public ThingFilter setAnd(ThingFilter and) {
        this.and = Input.optional(and);
        return this;
    }

    public ThingFilter setAndInput(Input<ThingFilter> and) {
        if (and == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.and = and;
        return this;
    }

    public ThingFilter getOr() {
        return or.getValue();
    }

    public Input<ThingFilter> getOrInput() {
        return or;
    }

    public ThingFilter setOr(ThingFilter or) {
        this.or = Input.optional(or);
        return this;
    }

    public ThingFilter setOrInput(Input<ThingFilter> or) {
        if (or == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.or = or;
        return this;
    }

    public ThingFilter getNot() {
        return not.getValue();
    }

    public Input<ThingFilter> getNotInput() {
        return not;
    }

    public ThingFilter setNot(ThingFilter not) {
        this.not = Input.optional(not);
        return this;
    }

    public ThingFilter setNotInput(Input<ThingFilter> not) {
        if (not == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.not = not;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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
