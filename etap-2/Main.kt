
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface {
                    MojaKlasa()
                }
            }
        }
    }
}

@Composable
fun Informacja(tekst: String) {
    Text(
        text = tekst,
        fontSize = 18.sp,
        modifier = Modifier.padding(8.dp)
    )
}

@Composable
fun MojaKlasa() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Moja klasa",
            fontSize = 28.sp
        )

        Informacja("Nazwa szkoły: Technikum")

        Text(
            text = "Klasa: 3",
            fontSize = 20.sp
        )

        Informacja("Kierunek: Technik informatyk")
    }
}

@Preview(showBackground = true)
@Composable
fun MojaKlasaPreview() {
    MaterialTheme {
        MojaKlasa()
    }
}

