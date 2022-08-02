package com.example.defaultingvalues.query

import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class DefaultValueQuery : Query {
    suspend fun returnTrueIfValueDefaults(topQueryModel: TopQueryModel): Boolean {
        return topQueryModel.bottomQueryModel?.value == "defaultValue"
    }
}
data class TopQueryModel(val bottomQueryModel: BottomQueryModel? = BottomQueryModel("defaultValue"))
data class BottomQueryModel(val value: String? = "defaultValue")
