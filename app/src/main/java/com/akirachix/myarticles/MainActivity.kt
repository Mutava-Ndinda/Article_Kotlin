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
        val article1 = Article("Jordan B Peterson","12 Rules Of Life","Published:16th","one.....","View more")
        val article2 = Article("Jordan B Peterson","12 Rules Of Life","Published:16th","two...","View more")
        val article3 = Article("Jordan B Peterson","12 Rules Of Life","Published:16th","three...","View more")
        val article4 = Article("Jordan B Peterson","12 Rules Of Life","Published:16th","four...","View more")
        val article5 = Article("Jordan B Peterson","12 Rules Of Life","Published:16th","five...","View more")
        val article6 = Article("Jordan B Peterson","12 Rules Of Life","Published:16th","six...","View more")
        val article7 = Article("Jordan B Peterson","12 Rules Of Life","Published:16th","seven...","View more")

        val articlesList= listOf(article1,article2,article3,article4,article5,article6,article7)
        val articleAdapter = ArticleAdapter(articlesList)
        binding.rvArticle.adapter = articleAdapter
    }
}