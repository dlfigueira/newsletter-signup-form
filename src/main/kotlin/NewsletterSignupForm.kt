import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import components.EmailInputForm
import components.ListItemWithIcon
import components.SubscribeButton
import model.AppViewModel

@Composable
fun NewsletterSignupForm(viewModel: AppViewModel, modifier: Modifier = Modifier) {
    var userEmail by remember { mutableStateOf("") }

    Row(modifier = modifier.clip(RoundedCornerShape(16.dp)).background(color = White), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
        Column(modifier = Modifier.weight(1f).padding(32.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Text("Stay updated!", modifier = Modifier.padding(bottom = 16.dp), color = DarkSlateGrey, fontWeight = FontWeight.W700, fontSize = 54.sp)
            Text("Join 60,000+ product managers receiving monthly updates on:", modifier = Modifier.padding(bottom = 16.dp), color = DarkSlateGrey, fontWeight = FontWeight.W400, fontSize = 15.sp)
            ListItemWithIcon("Product management best practices")
            ListItemWithIcon("Measuring to ensure updates are a success")
            ListItemWithIcon("And much more!")
            EmailInputForm(viewModel, userEmail, onUserEmailChange = { userEmail = it })
            SubscribeButton(viewModel, userEmail)
        }
        Column(modifier = Modifier.weight(1f).padding(16.dp).clip(RoundedCornerShape(16.dp)), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource("image/illustration-sign-up-desktop.svg"),
                contentDescription = "Sign-Up Illustration",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
    }
}