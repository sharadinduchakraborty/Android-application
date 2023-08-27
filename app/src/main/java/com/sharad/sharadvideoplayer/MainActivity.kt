package com.sharad.sharadvideoplayer

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.Sharad.sharadvideoplayer.R

class MainActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView = findViewById(R.id.videoView)

        // Get the resource identifier of the video file in res/raw

        val videoResource = resources.getIdentifier("darth_vedar", "raw", packageName)
         // Replace with your video file's resource identifier

        // Create a media controller
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        // Set media controller to the VideoView
        videoView.setMediaController(mediaController)

        // Set the video URI and start playback
        videoView.setVideoURI(Uri.parse("C:/Users/shara/OneDrive/Pictures/DarthVader.mp4$packageName/$videoResource"))
        videoView.start()
    }
}



