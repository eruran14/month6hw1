package com.eru.month6hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.eru.month6hw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = arrayListOf<String>()
    private val listToSend = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillList()

        binding.recyclerView.layoutManager = GridLayoutManager(this, 3)

        val adapter = ImageAdapter(list, this) { position ->

            intent = Intent(this@MainActivity, SelectedImagesActivity::class.java)
            intent.putStringArrayListExtra("images",listToSend)
            listToSend.add(list[position])
        }

        binding.btnSend.setOnClickListener {
            startActivity(intent)
        }
        binding.recyclerView.adapter = adapter
    }

    private fun fillList() {
        list.add("https://images.pexels.com/photos/1884574/pexels-photo-1884574.jpeg")
        list.add("https://images.pexels.com/photos/2150/sky-space-dark-galaxy.jpg")
        list.add("https://images.pexels.com/photos/41162/moon-landing-apollo-11-nasa-buzz-aldrin-41162.jpeg")
        list.add("https://images.pexels.com/photos/1884574/pexels-photo-1884574.jpeg")
        list.add("https://images.pexels.com/photos/2150/sky-space-dark-galaxy.jpg")
        list.add("https://images.pexels.com/photos/41162/moon-landing-apollo-11-nasa-buzz-aldrin-41162.jpeg")
        list.add("https://images.pexels.com/photos/1884574/pexels-photo-1884574.jpeg")
        list.add("https://images.pexels.com/photos/2150/sky-space-dark-galaxy.jpg")
        list.add("https://images.pexels.com/photos/41162/moon-landing-apollo-11-nasa-buzz-aldrin-41162.jpeg")
        list.add("https://images.pexels.com/photos/1884574/pexels-photo-1884574.jpeg")
        list.add("https://images.pexels.com/photos/2150/sky-space-dark-galaxy.jpg")
        list.add("https://images.pexels.com/photos/41162/moon-landing-apollo-11-nasa-buzz-aldrin-41162.jpeg")
        list.add("https://images.pexels.com/photos/1884574/pexels-photo-1884574.jpeg")
        list.add("https://images.pexels.com/photos/2150/sky-space-dark-galaxy.jpg")
        list.add("https://images.pexels.com/photos/41162/moon-landing-apollo-11-nasa-buzz-aldrin-41162.jpeg")
        list.add("https://images.pexels.com/photos/1884574/pexels-photo-1884574.jpeg")
        list.add("https://images.pexels.com/photos/2150/sky-space-dark-galaxy.jpg")
        list.add("https://images.pexels.com/photos/41162/moon-landing-apollo-11-nasa-buzz-aldrin-41162.jpeg")
        list.add("https://images.pexels.com/photos/1884574/pexels-photo-1884574.jpeg")
    }
}