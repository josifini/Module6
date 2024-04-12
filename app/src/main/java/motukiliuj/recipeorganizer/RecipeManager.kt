package motukiliuj.recipeorganizer

object RecipeManager {
    private val recipes = mutableListOf<Recipe>()

    fun addRecipe(recipe: Recipe) {
        recipes.add(recipe)
    }

    fun getAllRecipes(): List<Recipe> {
        return recipes
    }

    fun findRecipeByCategory(category: String): List<Recipe> {
        return recipes.filter { it.category == category }
    }

    fun searchRecipes(query: String): List<Recipe> {
        return recipes.filter { recipe ->
            recipe.title.contains(query, ignoreCase = true)
        }
    }
    // Add more methods as needed for updating and deleting recipes
}
