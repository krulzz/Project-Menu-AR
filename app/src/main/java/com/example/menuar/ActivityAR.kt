package com.example.menuar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.ar.core.Anchor
import com.google.ar.sceneform.AnchorNode
import com.google.ar.sceneform.rendering.ModelRenderable
import com.google.ar.sceneform.ux.ArFragment
import com.google.ar.sceneform.ux.TransformableNode

class ActivityAR : AppCompatActivity() {
    private lateinit var arFragment: ArFragment
    private var modelRenderable: ModelRenderable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ar)

        // Temukan ArFragment dari layout
        arFragment = supportFragmentManager.findFragmentById(R.id.arFragment) as ArFragment

        // Muat model 3D dari res/raw
        ModelRenderable.builder()
            .setSource(this, R.raw.tongseng_ayam) // Ganti nama file ini dengan nama model 3D lu
            .build()
            .thenAccept { renderable ->
                modelRenderable = renderable
            }
            .exceptionally { throwable ->
                Toast.makeText(this, "Tidak bisa memuat model: " + throwable.message, Toast.LENGTH_LONG).show()
                null
            }

        // Atur fungsi saat mendeteksi permukaan datar (plane)
        arFragment.setOnTapArPlaneListener { hitResult, plane, motionEvent ->
            if (modelRenderable == null) {
                return@setOnTapArPlaneListener
            }

            // Buat anchor di lokasi yang diklik
            val anchor: Anchor = hitResult.createAnchor()
            val anchorNode = AnchorNode(anchor)
            anchorNode.setParent(arFragment.arSceneView.scene)

            // Buat node 3D yang bisa diinteraksi
            val modelNode = TransformableNode(arFragment.transformationSystem)
            modelNode.setParent(anchorNode)
            modelNode.renderable = modelRenderable
            modelNode.select()
        }
    }
}