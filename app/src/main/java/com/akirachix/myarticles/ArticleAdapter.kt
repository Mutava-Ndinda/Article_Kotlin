package com.akirachix.myarticles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ArticleAdapter (val articleList: List<Article>):RecyclerView.Adapter<ArticleViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.article_list_item,parent,false)
        return ArticleViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return articleList.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = articleList[position]
        holder.tvName.text=article.name
        holder.tvTitle.text=article.title
        holder.tvDate.text=article.date
        holder.tvPreview.text=article.preview
        holder.tvLink.text=article.link
    }
}

class ArticleViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvPreview = itemView.findViewById<TextView>(R.id.tvPreview)
    var tvLink = itemView.findViewById<TextView>(R.id.tvLink)
}