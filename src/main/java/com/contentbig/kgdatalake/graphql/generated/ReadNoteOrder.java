// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Input;

import java.io.Serializable;

public class ReadNoteOrder implements Serializable {
    private Input<ReadNoteOrderable> asc = Input.undefined();

    private Input<ReadNoteOrderable> desc = Input.undefined();

    private Input<ReadNoteOrder> then = Input.undefined();

    public ReadNoteOrderable getAsc() {
        return asc.getValue();
    }

    public Input<ReadNoteOrderable> getAscInput() {
        return asc;
    }

    public ReadNoteOrder setAsc(ReadNoteOrderable asc) {
        this.asc = Input.optional(asc);
        return this;
    }

    public ReadNoteOrder setAscInput(Input<ReadNoteOrderable> asc) {
        if (asc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.asc = asc;
        return this;
    }

    public ReadNoteOrderable getDesc() {
        return desc.getValue();
    }

    public Input<ReadNoteOrderable> getDescInput() {
        return desc;
    }

    public ReadNoteOrder setDesc(ReadNoteOrderable desc) {
        this.desc = Input.optional(desc);
        return this;
    }

    public ReadNoteOrder setDescInput(Input<ReadNoteOrderable> desc) {
        if (desc == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.desc = desc;
        return this;
    }

    public ReadNoteOrder getThen() {
        return then.getValue();
    }

    public Input<ReadNoteOrder> getThenInput() {
        return then;
    }

    public ReadNoteOrder setThen(ReadNoteOrder then) {
        this.then = Input.optional(then);
        return this;
    }

    public ReadNoteOrder setThenInput(Input<ReadNoteOrder> then) {
        if (then == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.then = then;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.asc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("asc:");
            if (asc.getValue() != null) {
                _queryBuilder.append(asc.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.desc.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("desc:");
            if (desc.getValue() != null) {
                _queryBuilder.append(desc.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.then.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("then:");
            if (then.getValue() != null) {
                then.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
