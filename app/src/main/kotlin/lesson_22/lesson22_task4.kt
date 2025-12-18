package org.example.app.lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

class MainScreenViewModel() {
    private var mainScreenState = MainScreenState(
        data = "",
        isLoading = false,
    )

    fun loadData() {
        mainScreenState = mainScreenState.copy(
            data = "",
            isLoading = false,
        )
        println("no data.. $mainScreenState")

        mainScreenState = mainScreenState.copy(
            isLoading = true,
        )
        println("loading... $mainScreenState")

        mainScreenState = mainScreenState.copy(
            data = "Data from server",
            isLoading = false,
        )
        println("Loaded: $mainScreenState")
    }
}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false,
)