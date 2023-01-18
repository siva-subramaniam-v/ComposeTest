package com.example.composetest

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
        // Single required argument
        fun passId(id: Int) = this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = "$id")
        // Multiple required arguments
        fun passNameAndId(
            id: Int,
            name: String
        ) = "detail_screen/$id/$name"
    }
}
