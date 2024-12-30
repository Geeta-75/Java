import java.io.*;
import java.util.*;

// Class representing the Recipe
class Recipe implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private List<String> ingredients;
    private String instructions;

    public Recipe(String name, List<String> ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}

// Manager class to handle recipe operations
class RecipeManager {
    private List<Recipe> recipes;
    private final String fileName = "recipes.txt";

    public RecipeManager() {
        recipes = new ArrayList<>();
        loadRecipes(); // Load recipes from file
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
        saveRecipes(); // Save using serialization
        writeRecipesToTextFile(); // Write to human-readable file
    }

    public void removeRecipe(String name) {
        recipes.removeIf(recipe -> recipe.getName().equalsIgnoreCase(name));
        saveRecipes();
        writeRecipesToTextFile();
    }

    public void updateRecipe(String name, Recipe updatedRecipe) {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getName().equalsIgnoreCase(name)) {
                recipes.set(i, updatedRecipe);
                break;
            }
        }
        saveRecipes();
        writeRecipesToTextFile();
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    // Load recipes using serialization
    private void loadRecipes() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            recipes = (List<Recipe>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No existing recipes found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Save recipes using serialization
    private void saveRecipes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(recipes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // New method to write recipes to a human-readable text file
    public void writeRecipesToTextFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("recipes_output.txt"))) {
            for (Recipe recipe : recipes) {
                writer.println("Recipe Name: " + recipe.getName());
                writer.println("Ingredients: " + String.join(", ", recipe.getIngredients()));
                writer.println("Instructions: " + recipe.getInstructions());
                writer.println(); // Blank line between recipes
            }
            System.out.println("Recipes written to recipes_output.txt file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Main class with a simple menu-driven interface
public class RecipeOrganizer {
    public static void main(String[] args) {
        RecipeManager manager = new RecipeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Recipe");
            System.out.println("2. Remove Recipe");
            System.out.println("3. Update Recipe");
            System.out.println("4. View Recipes");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter recipe name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ingredients (comma separated): ");
                    List<String> ingredients = Arrays.asList(scanner.nextLine().split(","));
                    System.out.print("Enter instructions: ");
                    String instructions = scanner.nextLine();
                    manager.addRecipe(new Recipe(name, ingredients, instructions));
                    break;
                case 2:
                    System.out.print("Enter recipe name to remove: ");
                    name = scanner.nextLine();
                    manager.removeRecipe(name);
                    break;
                case 3:
                    System.out.print("Enter recipe name to update: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new recipe name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new ingredients (comma separated): ");
                    List<String> newIngredients = Arrays.asList(scanner.nextLine().split(","));
                    System.out.print("Enter new instructions: ");
                    String newInstructions = scanner.nextLine();
                    manager.updateRecipe(name, new Recipe(newName, newIngredients, newInstructions));
                    break;
                case 4:
                    List<Recipe> recipes = manager.getRecipes();
                    for (Recipe recipe : recipes) {
                        System.out.println(recipe);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
