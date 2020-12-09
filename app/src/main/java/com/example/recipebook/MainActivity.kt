package com.example.recipebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvRecipe: RecyclerView
    private var list: ArrayList<Recipe> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Home"

        rvRecipe = findViewById(R.id.rv_recipe)
        rvRecipe.setHasFixedSize(true)

        list.addAll(RecipeData.listData)
        showRecipeDetail()
    }

    private fun showRecipeDetail() {
        rvRecipe.layoutManager = LinearLayoutManager(this)
        val listRecipeAdapter = ListRecipeAdapter(list)
        rvRecipe.adapter = listRecipeAdapter

        listRecipeAdapter.setOnItemClickCallback(object : ListRecipeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Recipe) {
                val moveWithDataIntent = Intent(this@MainActivity, RecipeDetail::class.java)
                moveWithDataIntent.putExtra(RecipeDetail.EXTRA_NAME, data.name)
                moveWithDataIntent.putExtra(RecipeDetail.EXTRA_DETAIL, data.detail)
                moveWithDataIntent.putExtra(RecipeDetail.EXTRA_IMAGE, data.photo)
                moveWithDataIntent.putExtra(RecipeDetail.EXTRA_INGREDIENTS, data.ingredients)
                moveWithDataIntent.putExtra(RecipeDetail.EXTRA_DIRECTIONS, data.directions)
                startActivity(moveWithDataIntent)
            }
        })
    }

    // menu about author
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_author -> {
                val moveWithIntent = Intent(this@MainActivity, About::class.java)
                startActivity(moveWithIntent)
            }
        }
    }
}