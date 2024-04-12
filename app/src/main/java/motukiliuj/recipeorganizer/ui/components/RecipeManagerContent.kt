package motukiliuj.recipeorganizer.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun RecipeManagerContent() {
    Column {
        RecipeInputComposable {
            // Optionally trigger a state update or UI refresh after a recipe is added
        }
        RecipeSearchComposable()  // Allows users to search for recipes
        RecipeListComposable()  // Displays search results or all recipes
    }
}



