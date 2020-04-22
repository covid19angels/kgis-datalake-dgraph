// Generated from graphql_java_gen gem  with template Interface.java.erb

package com.contentbig.kgdatalake.graphql.generated;

import java.util.List;

/**
* ��?机构】一个组织，例如学校��?�?�政府组织��?公�?���?俱��?部等,也�?�用于临时几个人组��?的�?�天��?组，房间
*/

public interface Organization {
    String getGraphQlTypeName();

    List<Organization> getParentOrganization();

    List<Organization> getSubOrganizations();

    List<Organization> getDepartments();

    List<PartyRoleName> getHasPartyRoleName();
}

