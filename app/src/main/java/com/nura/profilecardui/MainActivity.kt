package com.nura.profilecardui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nura.profilecardui.ui.theme.ProfileCardUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCardUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ProfileCard("User")
                }
            }
        }
    }
}

@Composable
fun ProfileCard(user: User) {
    Card(
        modifier = Modifier.padding(16.dp),
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Display the profile picture
            Image(
                painter = rememberImagePainter(user.profilePictureUrl),
                contentDescription = "Profile picture",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )

            // Display the user's name
            Text(
                text = user.name,
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(top = 8.dp)
            )

            // Display the user's bio
            Text(
                text = user.bio,
                style = TextStyle(fontSize = 14.sp),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Display the user's email address
            Text(
                text = user.email,
                style = TextStyle(fontSize = 14.sp, color = Color.Gray)
            )

            // Button to view profile
            Button(
                onClick = { /* Navigate to user's profile */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF2196F3))
            ) {
                Text(
                    text = "View Profile",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}








