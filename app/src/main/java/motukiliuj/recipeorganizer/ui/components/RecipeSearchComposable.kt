package motukiliuj.recipeorganizer.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import motukiliuj.recipeorganizer.RecipeManager

@Composable
fun RecipeSearchComposable() {
    var searchText by remember { mutableStateOf("") }
    var submitSearch by remember { mutableStateOf(false) }
    val searchResults by derivedStateOf {
        if (submitSearch) RecipeManager.searchRecipes(searchText.trim())
        else emptyList()
    }

    Column {
        Row {
            OutlinedTextField(
                value = searchText,
                onValueChange = { searchText = it },
                label = { Text("Search Recipes") },
                singleLine = true
            )
            Button(onClick = { submitSearch = !submitSearch }) {
                Text(if (submitSearch) "Clear" else "Search")
            }
        }

        if (submitSearch) {
            searchResults.forEach { recipe ->
                Text(text = "Recipe: ${recipe.title}")  // Display each recipe that matches the search
            }
        }
    }
}