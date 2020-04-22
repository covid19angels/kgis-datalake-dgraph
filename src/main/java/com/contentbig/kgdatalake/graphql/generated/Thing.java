// Generated from graphql_java_gen gem  with template Interface.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import java.util.List;

/**
* A Thing with an ID，在KGIS平�?�内所有内容都是东西Thing,也就是资��?Resource
*/

public interface Thing {
    String getGraphQlTypeName();

    List<Namespace> getNamespaces();

    String getIdentifier();

    String getName();

    String getAlternateName();

    String getDescription();
}

