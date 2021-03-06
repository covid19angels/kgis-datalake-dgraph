// Generated from graphql_java_gen gem  with template Enum.java.erb

package com.contentbig.kgdatalake.graphql.generated;

/**
* 
*/
public enum DgraphIndex {
    /**
    * 
    */
    BOOL,

    /**
    * 
    */
    DAY,

    /**
    * 
    */
    EXACT,

    /**
    * 
    */
    FLOAT,

    /**
    * 
    */
    FULLTEXT,

    /**
    * 
    */
    HASH,

    /**
    * 
    */
    HOUR,

    /**
    * 
    */
    INT,

    /**
    * 
    */
    MONTH,

    /**
    * 
    */
    REGEXP,

    /**
    * 
    */
    TERM,

    /**
    * 
    */
    TRIGRAM,

    /**
    * 
    */
    YEAR,

    UNKNOWN_VALUE;

    public static DgraphIndex fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "bool": {
                return BOOL;
            }

            case "day": {
                return DAY;
            }

            case "exact": {
                return EXACT;
            }

            case "float": {
                return FLOAT;
            }

            case "fulltext": {
                return FULLTEXT;
            }

            case "hash": {
                return HASH;
            }

            case "hour": {
                return HOUR;
            }

            case "int": {
                return INT;
            }

            case "month": {
                return MONTH;
            }

            case "regexp": {
                return REGEXP;
            }

            case "term": {
                return TERM;
            }

            case "trigram": {
                return TRIGRAM;
            }

            case "year": {
                return YEAR;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BOOL: {
                return "bool";
            }

            case DAY: {
                return "day";
            }

            case EXACT: {
                return "exact";
            }

            case FLOAT: {
                return "float";
            }

            case FULLTEXT: {
                return "fulltext";
            }

            case HASH: {
                return "hash";
            }

            case HOUR: {
                return "hour";
            }

            case INT: {
                return "int";
            }

            case MONTH: {
                return "month";
            }

            case REGEXP: {
                return "regexp";
            }

            case TERM: {
                return "term";
            }

            case TRIGRAM: {
                return "trigram";
            }

            case YEAR: {
                return "year";
            }

            default: {
                return "";
            }
        }
    }
}

