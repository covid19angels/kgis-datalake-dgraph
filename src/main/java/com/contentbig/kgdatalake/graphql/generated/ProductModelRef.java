// Generated from graphql_java_gen gem  with template Input.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.shopify.graphql.support.Tuery;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.List;

public class ProductModelRef implements Serializable {
    private Input<ID> id = Input.undefined();

    private Input<List<NamespaceRef>> namespaces = Input.undefined();

    private Input<String> identifier = Input.undefined();

    private Input<String> name = Input.undefined();

    private Input<String> alternateName = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<Boolean> isSaleable = Input.undefined();

    private Input<ProductRef> isModelOf = Input.undefined();

    public ID getId() {
        return id.getValue();
    }

    public Input<ID> getIdInput() {
        return id;
    }

    public ProductModelRef setId(ID id) {
        this.id = Input.optional(id);
        return this;
    }

    public ProductModelRef setIdInput(Input<ID> id) {
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

    public ProductModelRef setNamespaces(List<NamespaceRef> namespaces) {
        this.namespaces = Input.optional(namespaces);
        return this;
    }

    public ProductModelRef setNamespacesInput(Input<List<NamespaceRef>> namespaces) {
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

    public ProductModelRef setIdentifier(String identifier) {
        this.identifier = Input.optional(identifier);
        return this;
    }

    public ProductModelRef setIdentifierInput(Input<String> identifier) {
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

    public ProductModelRef setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProductModelRef setNameInput(Input<String> name) {
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

    public ProductModelRef setAlternateName(String alternateName) {
        this.alternateName = Input.optional(alternateName);
        return this;
    }

    public ProductModelRef setAlternateNameInput(Input<String> alternateName) {
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

    public ProductModelRef setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public ProductModelRef setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public Boolean getIsSaleable() {
        return isSaleable.getValue();
    }

    public Input<Boolean> getIsSaleableInput() {
        return isSaleable;
    }

    public ProductModelRef setIsSaleable(Boolean isSaleable) {
        this.isSaleable = Input.optional(isSaleable);
        return this;
    }

    public ProductModelRef setIsSaleableInput(Input<Boolean> isSaleable) {
        if (isSaleable == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isSaleable = isSaleable;
        return this;
    }

    public ProductRef getIsModelOf() {
        return isModelOf.getValue();
    }

    public Input<ProductRef> getIsModelOfInput() {
        return isModelOf;
    }

    public ProductModelRef setIsModelOf(ProductRef isModelOf) {
        this.isModelOf = Input.optional(isModelOf);
        return this;
    }

    public ProductModelRef setIsModelOfInput(Input<ProductRef> isModelOf) {
        if (isModelOf == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isModelOf = isModelOf;
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

        if (this.isSaleable.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isSaleable:");
            if (isSaleable.getValue() != null) {
                _queryBuilder.append(isSaleable.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isModelOf.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isModelOf:");
            if (isModelOf.getValue() != null) {
                isModelOf.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}