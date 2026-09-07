package com.example.tugas2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugas2.ui.theme.Tugas2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Hana()
            }
        }
    }


@Composable
fun Hana() {
    Row (
        modifier = Modifier.padding(top=50.dp)
    ){
        Image(
            painter = painterResource(R.drawable.hana_foto),
            contentDescription = "Foto Hana",
            modifier = Modifier.size(150.dp)
        )
        Column (
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(text = "NIM    : 24515040711028")
            Text(text = "Nama : Hana Naila Izzah")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   Hana()
}