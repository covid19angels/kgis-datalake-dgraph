// Generated from graphql_java_gen gem  with template Operations.java.erb

package com.contentbig.kgdatalake.graphql.generated;

public class Operations {
    public static QueryTuery query(QueryTueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("{");
        QueryTuery query = new QueryTuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }

    public static MutationTuery mutation(MutationTueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("mutation{");
        MutationTuery query = new MutationTuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }
}
