import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Recipe {
    public BufferedImage image;
    public String name;
    public String recipeExplanation;

    // ***********
    // READ THIS!!
    // ***********
    /* 
     * This variable will store the ingredients with their IDs, amount and amount kinds
     * 
     * For example if you want to store: 200 mililiter milk, 3 spoon sugar and 2 glasses flour the list should be like: 
     * See AmountKind.txt
     * (These are not real IDs but for the example think that: 
     *  -milk ID: 1021, 
     *  -sugar ID: 1103, 
     *  -flour ID: 1030 )
     * 
     *  Then the list will be:
     *  [
     *      [1021, 200, 7]
     *      [1103, 3, 3]
     *      [1030, 2, 5]
     *  ]
     */
    public ArrayList<int[]> ingridientList;
    
    //
    // RECIPE CREATE METHODS
    //

    // This method is for alredy ready ingredient recipes.
    public Recipe(BufferedImage image, String name, String recipeExplanation, ArrayList<int[]> ingridienList){
        this.image = image;
        this.name = name;
        this.recipeExplanation = recipeExplanation;
        this.ingridientList = ingridienList;
    }

    // This method is for empty ingredient recipes.
    public Recipe(BufferedImage image, String name, String recipeExplanation){
        this.image = image;
        this.name = name;
        this.recipeExplanation = recipeExplanation;
        this.ingridientList = new ArrayList<int[]>();
    }

    // This method is for adding a ingridient with seperate ID, amount and amount kind.
    public void addIngredient(int ID, int amount, int amountKind){
        int[] ingredient = new int[]
        {
            ID,
            amount,
            amountKind
        };

        ingridientList.add(ingredient);
    }

    // This method is for adding a ingridient with full info: ID, amount, amount kind
    public void addIngredient(int[] ingredient){
        ingridientList.add(ingredient);
    }

    // This method is for deleting the given ingredient of ID from the ingredient list.
    public void removeIngredient(int ID){
        for(int i = 0; i < ingridientList.size(); i++){
            if( ingridientList.get(i)[0] == ID )
                ingridientList.remove(i);
        }
    }

    // This method is for deleting the given ingredient of ID from the ingredient list.
    public void removeIngredient(float index){
        ingridientList.remove( (int)index );
    }

}
