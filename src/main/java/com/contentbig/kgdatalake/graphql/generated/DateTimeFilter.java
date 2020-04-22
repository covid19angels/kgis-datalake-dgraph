// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Input;

import org.joda.time.DateTime;

import java.io.Serializable;

public class DateTimeFilter implements Serializable {
    private Input<DateTime> eq = Input.undefined();

    private Input<DateTime> le = Input.undefined();

    private Input<DateTime> lt = Input.undefined();

    private Input<DateTime> ge = Input.undefined();

    private Input<DateTime> gt = Input.undefined();

    public DateTime getEq() {
        return eq.getValue();
    }

    public Input<DateTime> getEqInput() {
        return eq;
    }

    public DateTimeFilter setEq(DateTime eq) {
        this.eq = Input.optional(eq);
        return this;
    }

    public DateTimeFilter setEqInput(Input<DateTime> eq) {
        if (eq == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.eq = eq;
        return this;
    }

    public DateTime getLe() {
        return le.getValue();
    }

    public Input<DateTime> getLeInput() {
        return le;
    }

    public DateTimeFilter setLe(DateTime le) {
        this.le = Input.optional(le);
        return this;
    }

    public DateTimeFilter setLeInput(Input<DateTime> le) {
        if (le == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.le = le;
        return this;
    }

    public DateTime getLt() {
        return lt.getValue();
    }

    public Input<DateTime> getLtInput() {
        return lt;
    }

    public DateTimeFilter setLt(DateTime lt) {
        this.lt = Input.optional(lt);
        return this;
    }

    public DateTimeFilter setLtInput(Input<DateTime> lt) {
        if (lt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.lt = lt;
        return this;
    }

    public DateTime getGe() {
        return ge.getValue();
    }

    public Input<DateTime> getGeInput() {
        return ge;
    }

    public DateTimeFilter setGe(DateTime ge) {
        this.ge = Input.optional(ge);
        return this;
    }

    public DateTimeFilter setGeInput(Input<DateTime> ge) {
        if (ge == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.ge = ge;
        return this;
    }

    public DateTime getGt() {
        return gt.getValue();
    }

    public Input<DateTime> getGtInput() {
        return gt;
    }

    public DateTimeFilter setGt(DateTime gt) {
        this.gt = Input.optional(gt);
        return this;
    }

    public DateTimeFilter setGtInput(Input<DateTime> gt) {
        if (gt == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.gt = gt;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.eq.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("eq:");
            if (eq.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, eq.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.le.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("le:");
            if (le.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, le.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.lt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("lt:");
            if (lt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, lt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.ge.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("ge:");
            if (ge.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, ge.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.gt.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("gt:");
            if (gt.getValue() != null) {
                Tuery.appendQuotedString(_queryBuilder, gt.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}