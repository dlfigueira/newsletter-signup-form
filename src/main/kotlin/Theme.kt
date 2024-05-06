import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.sp
import java.io.File

val Tomato = Color.hsl(4F, 1F, 0.67F)
val DarkSlateGrey = Color.hsl(234F, 0.29F, 0.2F)
val CharcoalGrey = Color.hsl(235F, 0.18F, 0.26F)
val Grey = Color.hsl(231F, 0.07F, 0.6F)
val White = Color.hsl(0F, 0F, 1F)
val OffBlack = Color.hsl(234F, 0.29F, 0.15F)

val robotoFontFamily = FontFamily(
    Font(File("font/Roboto-Bold.ttf").path, weight = FontWeight.W700, style = FontStyle.Normal),
    Font(File("font/Roboto-Regular.ttf").path, weight = FontWeight.W400, style = FontStyle.Normal),
)

val defaultTypography =
    Typography(defaultFontFamily = robotoFontFamily, body1 = TextStyle(fontSize = 16.sp, color = CharcoalGrey))