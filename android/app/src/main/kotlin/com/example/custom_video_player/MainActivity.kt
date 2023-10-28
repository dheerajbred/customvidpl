package com.example.custom_video_player

import io.flutter.embedding.android.FlutterActivity
import android.os.Bundle
import com.google.android.gms.cast.framework.CastContext

class MainActivity: FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CastContext.getSharedInstance(this)
    }
}
