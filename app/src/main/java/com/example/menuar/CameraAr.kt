package com.example.menuar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.ar.sceneform.ux.ArFragment

class CameraAr : ArFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Ganti kode ini.
        // ArFragment punya layout default-nya sendiri, jadi tidak perlu inflate layout manual.
        val view = super.onCreateView(inflater, container, savedInstanceState)

        // Hapus ArFragment default.
        // Ini bikin kita bisa custom fragment ini, misalnya nambahin UI lain.
        planeDiscoveryController.hide()
        planeDiscoveryController.setInstructionView(null)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // Di sini lo bisa mulai nambahin logic AR lo.
        // Misalnya:
        // - Tambahin listener untuk mendeteksi marker.
        // - Load model 3D.
        // - Set model 3D di atas marker.
        // Contoh:
        // arSceneView.scene.addOnUpdateListener { frameTime ->
        //     // Logic deteksi marker
        // }
    }
}