import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mikepenz.markdown.Markdown
import com.mikepenz.markdown.model.markdownColors
import com.mikepenz.markdown.model.markdownTypography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Markdown(
                        content = """
                            # Bem-vindo ao Meu App!

                            Este é um exemplo de markdown renderizado com:
                            - Suporte a listas
                            - **Texto em negrito**
                            - *Texto em itálico*

                            ## Subseção
                            Você pode adicionar mais conteúdo aqui.
                        """.trimIndent(),
                        modifier = Modifier.padding(16.dp),
                        colors = markdownColors(
                            text = MaterialTheme.colorScheme.onSurface
                        ),
                        typography = markdownTypography(
                            h1 = MaterialTheme.typography.headlineLarge,
                            h2 = MaterialTheme.typography.headlineMedium,
                            paragraph = MaterialTheme.typography.bodyMedium
                        )
                    )
                }
            }
        }
    }
}