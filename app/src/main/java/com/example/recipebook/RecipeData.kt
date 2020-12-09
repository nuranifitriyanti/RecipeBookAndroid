package com.example.recipebook

object RecipeData {
    private val recipeNames = arrayOf("Dalgona Coffee",
        "Pancake",
        "Dumplings",
        "Peanut Butter Banana Smoothie",
        "Mac and Cheese",
        "Easy Brownies",
        "French Toast",
        "Blueberry Muffins",
        "Virgin Mojito",
        "Simple Chicken Katsu"
    )

    private val recipeDetails = arrayOf("Time: 5 mins, Yield: 1 serving",
        "Time: 20 mins, Yield: 8 servings",
        "Time: 15 mins, Yield: 20 servings",
        "Time: 5 mins, Yield: 4 servings",
        "Time: 50 mins, Yield: 4 servings",
        "Time: 35 mins, Yield: 20 bars",
        "Time: 25 mins, Yield: 4 servings",
        "Time: 40 mins, Yield: 8 large muffins",
        "Non-alcoholic mojito\nTime: 10 mins, Yield: 4-6 servings",
        "Time: 20 mins, Yield: 4 servings"
    )

    private val recipeIngredients = arrayOf("""2 tbsp granulated sugar 
        |2 tbsp instant coffee 
        |2 tbsp cold water 
        |Ice as desired
        |Milk as desired
    """.trimMargin(),
    """1 1/2 cups all purpose flour 
        |3 1/2tsp aking powder
        |1 tsp salt
        |1 tbsp white sugar
        |1 1/4 cups milk
        |1 egg
        |3 tbsp butter; melted
    """.trimMargin(),
    """2 cups flour
        |1 1/2 tsp salt
        |1 tsp baking powder
        |2 tsp vegetable oil
        |1 cup warm water 
        |Broth as needed
        |Garnish (chopped chives or parsley) as desired
    """.trimMargin(),
    """2 bananas, broken into chunks
        |2 cups milk
        |1/2 cup peanut butter
        |2 tablespoons honey, or to taste
        |2 cups ice cubes
    """.trimMargin(),
    """8 ounces uncooked elbow macaroni
        |2 cups shredded sharp Cheddar cheese
        |½ cup grated Parmesan cheese
        |3 cups milk
        |¼ cup butter
        |2 ½ tablespoons all-purpose flour
        |2 tablespoons butter
        |½ cup bread crumbs
    """.trimMargin(),
    """1 cup butter, melted
        |2 cups white sugar
        |½ cup cocoa powder
        |1 teaspoon vanilla extract
        |4 eggs
        |1 ½ cups all-purpose flour
        |½ teaspoon baking powder
        |½ teaspoon salt
        |½ cup walnut halves
    """.trimMargin(),
    """4 eggs
        |2/3 cup milk
        |2 teaspoons of cinnamon
        |8 thick slices of 2-day-old bread (better if slightly stale)
        |Butter (can sub vegetable oil)
        |Maple syrup
        |
        |(Optional)
        |2 teaspoons freshly grated orange zest
        |1/4 cup Triple Sec
        |Fresh berries
    """.trimMargin(),
    """1 ½ cups all-purpose flour
        |¾ cup white sugar
        |½ teaspoon salt
        |2 teaspoons baking powder
        |⅓ cup vegetable oil
        |1 egg
        |⅓ cup milk, or more as needed
        |1 cup fresh blueberries
        |½ cup white sugar
        |⅓ cup all-purpose flour
        |¼ cup butter, cubed
        |1 ½ teaspoons ground cinnamon
    """.trimMargin(),
    """20g/¾oz bunch of mint
        |3 tbsp golden caster sugar, plus a little extra to taste if you like
        |150ml/¼ pint fresh lime juice (about 8 limes), plus a few lime slices or wedges to serve
        |2 handfuls ice
        |1 litre/1¾ pint chilled soda water
    """.trimMargin(),
    """4 skinless, boneless chicken breast halves - pounded to 1/2 inch thickness
        |salt and pepper to taste
        |2 tablespoons all-purpose flour
        |1 egg, beaten
        |1 cup panko bread crumbs
        |1 cup oil for frying, or as needed
    """.trimMargin()
    )

    private val recipeDirections = arrayOf("- In a medium bowl, combine sugar, coffee, and water. " +
            "Vigorously whisk until mixture turns silky smooth and shiny, then continue whisking " +
            "until it thickens and holds its lofty, foamy shape.\n\n" +
            "- Fill a glass most of the way full with ice and milk, then dollop and swirl the whipped " +
            "coffee mixture on top, mixing before drinking, if desired.",
            "- In a large bowl, sift together the flour, baking powder, salt and sugar. Make a " +
                    "well in the center and pour in the milk, egg and melted butter; mix until " +
                    "smooth.\n\n" +
                    "- Heat a lightly oiled griddle or frying pan over medium high heat. Pour or " +
                    "scoop the batter onto the griddle, using approximately 1/4 cup for each pancake. " +
                    "Brown on both sides and serve hot.",
            "- Combine flour, salt and baking powder. Add oil and water and mix until smooth. Add" +
                    " a bit more water until dumplings are soft and not at all dry. \n\n" +
                    "- Bring broth to a boil and add dumplings by spoonful. Reduce heat and cook " +
                    "dumplings 4-5 minutes. (Do in batches if you are using a small pan.)\n\n" +
                    "- Serve dumplings in broth garnished with chopped parsley or chives as desired.",
            "- Place bananas, milk, peanut butter, honey, and ice cubes in a blender; blend " +
                    "until smooth about 30 seconds.",
            "- Cook macaroni according to the package directions. Drain.\n\n" +
                    "- In a saucepan, melt butter or margarine over medium heat. Stir in enough flour " +
                    "to make a roux. Add milk to roux slowly, stirring constantly. Stir in cheeses, " +
                    "and cook over low heat until cheese is melted and the sauce is a little thick. " +
                    "Put macaroni in large casserole dish, and pour sauce over macaroni. Stir well.\n\n" +
                    "- Melt butter or margarine in a skillet over medium heat. Add breadcrumbs and brown. " +
                    "Spread over the macaroni and cheese to cover. Sprinkle with a little paprika.\n\n" +
                    "- Bake at 350 degrees F (175 degrees C) for 30 minutes. Serve.",
            "- Preheat the oven to 350 degrees F (175 degrees C). Grease a 9x13-inch pan.\n\n" +
                    "- Combine the melted butter, sugar, cocoa powder, vanilla, eggs, flour, " +
                    "baking powder, and salt. Spread the batter into the prepared pan. Decorate " +
                    "with walnut halves, if desired.\n\n" +
                    "- Bake in preheated oven for 20 to 30 minutes or until a toothpick inserted in " +
                    "the center comes out with crumbs, not wet. Cool on wire rack.",
            "- Make the egg mixture: In a medium bowl, whisk together the eggs, milk, and " +
                    "cinnamon. Stir in the orange zest and/or Triple Sec if using. Whisk the " +
                    "mixture until well blended and pour into a shallow bowl, wide enough to " +
                    "place a slice of the bread you will be using.\n\n" +
                    "- Soak bread slices in egg mixture: Place each slice of bread into the milk egg " +
                    "mixture, allowing the bread to soak in some of it.\n\n" +
                    "- Fry the french toast: Melt some butter in a large skillet over medium high" +
                    " heat. Shake off the excess egg mixture from the bread, and place the bread " +
                    "slices onto the hot skillet. Fry the French toast until browned on one side," +
                    " then flip and brown the other side.\n\n" +
                    "- Serve hot with butter, maple syrup, and if available, fresh berries.",
            "- Preheat oven to 400 degrees F (200 degrees C). Grease muffin cups or line with " +
                    "muffin liners.\n\n" +
                    "- Combine 1 1/2 cups flour, 3/4 cup sugar, salt and baking powder. Place " +
                    "vegetable oil into a 1 cup measuring cup; add the egg and add enough milk to" +
                    " reach the 1-cup mark. Mix this with flour mixture. Fold in blueberries. " +
                    "Fill muffin cups right to the top, and sprinkle with crumb topping mixture" +
                    ".\n\n" +
                    "- To Make Crumb Topping: Mix together 1/2 cup sugar, 1/3 cup flour, 1/4 cup " +
                    "butter, and 1 1/2 teaspoons cinnamon. Mix with fork, and sprinkle over " +
                    "muffins before baking.\n\n" +
                    "- Bake for 20 to 25 minutes in the preheated oven, or until done.",
            "- Pick the leaves from the mint and put in the base of a large jug. Sprinkle over the sugar," +
                    " then pour over the lime juice. Use the end of a rolling pin or wooden spoon to " +
                    "muddle everything together, crushing the mint leaves and dissolving the sugar.\n\n" +
                    "- Add some ice, then pour over the chilled soda water. Taste – you may like it a " +
                    "little sweeter, if so add pinches of extra sugar. Extra lime wedges (and ice) can be" +
                    " added to glasses for serving, or straight into the jug too.",
            "- Season the chicken breasts on both sides with salt and pepper. Place the flour, " +
                    "egg and panko crumbs into separate shallow dishes. Coat the chicken breasts " +
                    "in flour, shaking off any excess. Dip them into the egg, and then press into" +
                    " the panko crumbs until well coated on both sides.\n\n" +
                    "- Heat 1/4 inch of oil in a large skillet over medium-high heat. Place " +
                    "chicken in the hot oil, and cook 3 or 4 minutes per side, or until golden " +
                    "brown."
    )

    private val recipeImages = intArrayOf(R.drawable.dalgona,
        R.drawable.pancake,
        R.drawable.dumpling2,
        R.drawable.banana_smoothies,
        R.drawable.mac_n_cheese,
        R.drawable.brownie,
        R.drawable.french_toast,
        R.drawable.blueberry_muffins,
        R.drawable.mojito,
        R.drawable.chicken_katsu
    )

    val listData: ArrayList<Recipe>
        get() {
            val list = arrayListOf<Recipe>()
            for (position in recipeNames.indices) {
                val recipe = Recipe()
                recipe.name = recipeNames[position]
                recipe.detail = recipeDetails[position]
                recipe.photo = recipeImages[position]
                recipe.ingredients = recipeIngredients[position]
                recipe.directions = recipeDirections[position]
                list.add(recipe)
            }
            return list
        }
}