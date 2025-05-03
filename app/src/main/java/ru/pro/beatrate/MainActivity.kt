package ru.pro.beatrate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ru.pro.beatrate.ui.theme.BeatRateRecAppointmentAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BeatRateRecAppointmentAppTheme {
                // Вызываем наш экран:
                WelcomeScreen()
            }
        }
    }
}
