package components

import model.AppViewModel
import CharcoalGrey
import DarkSlateGrey
import Grey
import Tomato
import White
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubscribeButton(viewModel: AppViewModel, userEmail: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp), verticalAlignment = Alignment.CenterVertically) {
        val interactionSource = remember { MutableInteractionSource() }
        val isHovered = interactionSource.collectIsHoveredAsState()

        val backgroundColor = if (isHovered.value) Tomato else DarkSlateGrey

        Button(
            onClick = { viewModel.onEmailChange(userEmail) },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = backgroundColor,
                contentColor = White
            ),
            modifier = Modifier.fillMaxWidth().height(50.dp).clip(RoundedCornerShape(8.dp)).hoverable(interactionSource)
        ) {
            Text("Subscribe to monthly newsletter", color = White, fontSize = 14.sp, fontWeight = FontWeight.W700)
        }
    }
}