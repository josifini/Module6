package motukiliuj.recipeorganizer.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import motukiliuj.recipeorganizer.RecipeManager

@Composable
fun RecipeListComposable() {
    Column {
        RecipeManager.getAllRecipes().forEach { recipe ->
            Text(text = "Title: ${recipe.title}, Category: ${recipe.category}")
        }
    }
}

