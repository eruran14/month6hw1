package com.eru.month6hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.eru.month6hw1.databinding.ActivitySelectedImagesBinding

class SelectedImagesActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelectedImagesBinding
    private var list = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectedImagesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = GridLayoutManager(this, 3)

        val image = intent.getStringArrayListExtra("images")

        if (image != null) {
            list.addAll(image)
        }

        val adapter = ImageAdapter(list, this) {
        }

        binding.recyclerView.adapter = adapter
    }
}