package motukiliuj.recipeorganizer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import motukiliuj.recipeorganizer.ui.components.RecipeManagerContent
import motukiliuj.recipeorganizer.ui.theme.RecipeOrganizerTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeOrganizerTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("Recipe Organizer") },
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.background
                            )
                        )
                    },
                    content = { innerPadding ->
                        Surface(
                            modifier = Modifier.padding(innerPadding).fillMaxSize(),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            RecipeManagerContent()
                        }
                    }
                )
            }
        }
    }
}
