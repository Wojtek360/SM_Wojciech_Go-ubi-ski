package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspaceapp.ui.theme.ArtSpaceappTheme
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//import androidx.appcompat.app.AppCompatActivity

data class ArtWork(val imageID: Int,val title: String, val artist: String, val year:String)


class MainActivity : ComponentActivity() {
    private val ArtworksList = listOf(ArtWork(R.drawable.image1, "Starry Night", "Vincent van Gogh", "1889"),
        ArtWork(R.drawable.image2, "Mona Lisa", "Leonardo da Vinci", "1503"),
        ArtWork(R.drawable.image3, "The Persistence of Memory", "Salvador Dalí", "1931"))
    private var currentIndex = 0

    private lateinit var imageView: ImageView
    private lateinit var textTitle: TextView
    private lateinit var textArtist: TextView
    private lateinit var textYear: TextView
    private lateinit var btnNext: Button
    private lateinit var btnPrevious: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        textTitle = findViewById(R.id.textTitle)
        textArtist = findViewById(R.id.textArtist)
        textYear = findViewById(R.id.textYear)
        btnNext = findViewById(R.id.btnNext)
        btnPrevious = findViewById(R.id.btnPrevious)

        updateUI()

        btnNext.setOnClickListener {
            currentIndex = (currentIndex + 1) % ArtworksList.size
            updateUI()
        }

        btnPrevious.setOnClickListener {
            currentIndex = if (currentIndex - 1 < 0) ArtworksList.size - 1 else currentIndex - 1
            updateUI()
        }
    }

    private fun updateUI() {
        val current = ArtworksList[currentIndex]
        imageView.setImageResource(current.imageID)
        textTitle.text = current.title
        textArtist.text = current.artist
        textYear.text = current.year
    }



}












