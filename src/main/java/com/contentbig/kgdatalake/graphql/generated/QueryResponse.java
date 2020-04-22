// Generated from graphql_java_gen gem  with template Responses.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;

import java.util.List;

public class QueryResponse {
    private TopLevelResponse response;
    private Query data;

    public QueryResponse(TopLevelResponse response) throws SchemaViolationError {
        this.response = response;
        this.data = response.getData() != null ? new Query(response.getData()) : null;
    }

    public Query getData() {
        return data;
    }

    public List<Error> getErrors() {
        return response.getErrors();
    }

    public String toJson() {
        return new Gson().toJson(response);
    }

    public String prettyPrintJson() {
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(response);
    }

    public static QueryResponse fromJson(String json) throws SchemaViolationError {
        final TopLevelResponse response = new Gson().fromJson(json, TopLevelResponse.class);
        return new QueryResponse(response);
    }
}