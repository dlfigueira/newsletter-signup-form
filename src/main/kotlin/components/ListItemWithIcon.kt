package components

import DarkSlateGrey
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListItemWithIcon(text: String) {
    Row(modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource("image/icon-list.svg"),
            contentDescription = "Icon List",
            modifier = Modifier.padding(end = 12.dp).size(18.dp),
        )
        Text(text, color = DarkSlateGrey, fontWeight = FontWeight.W400, fontSize = 14.sp)
    }
}