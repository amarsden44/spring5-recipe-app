package guru.springframework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getRecipes(){
        List<Recipe> recipes = new ArrayList<>();
        recipeRepository.findAll().forEach(recipe -> recipes.add(recipe));

        return recipes;
    }
}
