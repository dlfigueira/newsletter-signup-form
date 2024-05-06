import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import model.AppViewModel

@Composable
@Preview
fun App(viewModel: AppViewModel) {
    MaterialTheme(typography = defaultTypography) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize().background(color = OffBlack)
        ) {
            NewsletterSignupForm(viewModel, modifier = Modifier
                .fillMaxWidth(0.8f)
                .fillMaxHeight(0.8f))
        }
    }
}

fun main() = application {
    val viewModel = AppViewModel()

    Window(
        state = rememberWindowState(width = 1000.dp, height = 700.dp),
        onCloseRequest = ::exitApplication
    ) {
        App(viewModel)
    }
}
