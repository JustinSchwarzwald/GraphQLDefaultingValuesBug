package com.example.defaultingvalues.query

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class DefaultValueQueryDepth1 : Query {
    suspend fun returnTrueIfModelValueDefaults(queryModel: QueryModel?): Boolean {
        return queryModel?.value == "defaultValue"
    }
}
data class QueryModel(val value: String? = "defaultValue")
