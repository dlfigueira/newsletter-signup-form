package components

import model.AppViewModel
import CharcoalGrey
import DarkSlateGrey
import Grey
import Tomato
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EmailInputForm(viewModel: AppViewModel, userEmail: String, onUserEmailChange: (String) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 24.dp, bottom = 12.dp),
        verticalAlignment = Alignment.CenterVertically)
    {
        Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.Start) {
            Text("Email address", color = DarkSlateGrey, fontWeight = FontWeight.W700, fontSize = 12.sp)
        }
        if (!viewModel.isEmailValid()) {
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.End) {
                Text("Valid email required", color = Tomato, fontWeight = FontWeight.W700, fontSize = 12.sp)
            }
        }
    }
    Row(modifier = Modifier.fillMaxWidth().padding(bottom = 24.dp), verticalAlignment = Alignment.CenterVertically) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            OutlinedTextField(
                value = userEmail,
                onValueChange = onUserEmailChange,
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = if (viewModel.isEmailValid()) DarkSlateGrey else Color.Red,
                    unfocusedBorderColor = if (viewModel.isEmailValid()) CharcoalGrey else Color.Red,
                    backgroundColor = if (viewModel.isEmailValid()) Color.White else Color(0xFFFFEBEB),
                    cursorColor = if (viewModel.isEmailValid()) DarkSlateGrey else Color.Red
                ),
                placeholder = {
                    Text("email@company.com", color = Grey, fontWeight = FontWeight.W400, fontSize = 14.sp, textAlign = TextAlign.Center)
                }
            )
        }
    }
}