package com.example.defaultingvalues.query

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class DefaultValueQueryDepth2 : Query {
    suspend fun returnTrueIfValueDefaults(parentQueryModel: ParentQueryModel): Boolean {
        return parentQueryModel.childQueryModel?.value == "defaultValue"
    }
}
data class ParentQueryModel(val childQueryModel: ChildQueryModel? = ChildQueryModel("defaultValue"))
data class ChildQueryModel(val value: String? = "defaultValue")
