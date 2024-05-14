package components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import model.AppViewModel

@Composable
fun SubscribeButton(viewModel: AppViewModel, userEmail: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp), verticalAlignment = Alignment.CenterVertically) {
        HoverableButton("Subscribe to monthly newsletter") { viewModel.onSubscribe(userEmail) }
    }
}