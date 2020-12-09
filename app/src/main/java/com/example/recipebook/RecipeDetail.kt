package com.example.recipebook

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class RecipeDetail : AppCompatActivity() {
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_INGREDIENTS = "extra_ingredients"
        const val EXTRA_DIRECTIONS = "extra_directions"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvRecipeDetail: TextView = findViewById(R.id.tv_recipe_detail)
        val tvRecipeIngredients: TextView = findViewById(R.id.tv_ingredients)
        val tvRecipeDirections: TextView = findViewById(R.id.tv_directions)

        val name = intent.getStringExtra(EXTRA_NAME)
        val photo = intent.getIntExtra(EXTRA_IMAGE, 0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val ingredients = intent.getStringExtra(EXTRA_INGREDIENTS)
        val directions = intent.getStringExtra(EXTRA_DIRECTIONS)

        Glide.with(this).load(photo).apply(RequestOptions()).into(imgPhoto)
        tvRecipeDetail.text = detail
        tvRecipeIngredients.text = ingredients
        tvRecipeDirections.text = directions

        supportActionBar?.title = name
    }

    // menu share dan favorite
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail_recipe, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.favorite -> {
                Toast.makeText(this, "Added to favorite", Toast.LENGTH_SHORT).show()
            }
            R.id.share -> {
                Toast.makeText(this, "Shared", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
