import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import components.EmailInputForm
import components.HoverableButton
import components.ListItemWithIcon
import components.SubscribeButton
import model.AppViewModel

@Composable
fun SubscriptionSuccess(viewModel: AppViewModel, modifier: Modifier = Modifier) {

    Row(modifier = modifier.clip(RoundedCornerShape(16.dp)).background(color = White)) {
        Column(modifier = Modifier.padding(64.dp), horizontalAlignment = Alignment.Start) {
            Image(
                painter = painterResource("image/icon-list.svg"),
                contentDescription = "Icon List",
                modifier = Modifier.padding(bottom = 24.dp).size(40.dp),
            )
            Text("Thanks for subscribing!", modifier = Modifier.padding(bottom = 32.dp), color = DarkSlateGrey, fontWeight = FontWeight.W700, fontSize = 48.sp)
            Text(
                buildAnnotatedString {
                    append("A confirmation email has been sent to ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                        append(viewModel.userEmailAddress ?: "your email")
                    }
                    append(". Please open it and click the button inside to confirm your subscription.")
                },
                modifier = Modifier.padding(bottom = 32.dp),
                color = DarkSlateGrey,
                fontWeight = FontWeight.W400,
                fontSize = 16.sp
            )
            HoverableButton("Dismiss message") { viewModel.onDismiss() }
        }
    }
}