package com.akirachix.myarticles

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myarticles.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvArticle.layoutManager=LinearLayoutManager(this)
        displayArticles()
    }
    fun displayArticles(){
        val article1 = Article("Jordan B Peterson","12 Rules Of Life","16th","one","http")
        val article2 = Article("Jordan B Peterson","12 Rules Of Life","16th","one","http")
        val article3 = Article("Jordan B Peterson","12 Rules Of Life","16th","one","http")
        val article4 = Article("Jordan B Peterson","12 Rules Of Life","16th","one","http")
        val article5 = Article("Jordan B Peterson","12 Rules Of Life","16th","one","http")
        val article6 = Article("Jordan B Peterson","12 Rules Of Life","16th","one","http")
        val article7 = Article("Jordan B Peterson","12 Rules Of Life","16th","one","http")

        val articlesList= listOf(article1,article2,article3,article4,article5,article6,article7)
        val articleAdapter = ArticleAdapter(articlesList)
        binding.rvArticle.adapter = articleAdapter
    }
}