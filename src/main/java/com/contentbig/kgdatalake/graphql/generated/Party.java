// Generated from graphql_java_gen gem  with template Interface.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import java.util.List;

/**
* Party 团体:代表有行动能力的个人或组织
*/

public interface Party {
    String getGraphQlTypeName();

    List<Ownership> getOwns();

    List<Namespace> getHasNamespaces();
}

