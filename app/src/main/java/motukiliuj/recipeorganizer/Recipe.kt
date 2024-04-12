package motukiliuj.recipeorganizer

data class Recipe(
    val id: Int,
    val title: String,
    val ingredients: List<String>,
    val instructions: String,
    val category: String
)

