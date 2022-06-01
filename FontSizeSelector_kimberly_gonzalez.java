package fontsizeselector_kimberly_gonzalez;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * This application demonstrates the use of menu bars, adding menu items to
 * the menu bar, and writing event handlers for the menu items. Lastly, the 
 * event handlers applies an CSS style to change and apply the change in font sizes.
 * 
 * @author kgonz038
 */
public class FontSizeSelector_kimberly_gonzalez extends Application
{
    /**
     * Main method calls the launch method
     * 
     * @param args the command line arguments
     */
   public static void main(String[] args)
   {
      //Launches the application.
      launch(args);
   }
   
   /**
     * This start method contains the controls and containers 
     * 
     * @param primaryStage 
     */
   @Override
   public void start(Stage primaryStage)
   {
      //Constants for the scene dimensions
      final double WIDTH = 300.0, HEIGHT = 200.0;
      
      //Creates the sample text label with a string
      Label sampleText = new Label("Sample Text");
      
      //Creates the menu bar
      MenuBar menuBar = new MenuBar();
 
      //Creates the File menu
      Menu fileMenu = new Menu("File");
      
      //Creates an Exit menu item and is added to the File Menu
      MenuItem exitItem = new MenuItem("Exit");
      fileMenu.getItems().add(exitItem);
    
      //Registers event handlers for the Exit menu item, closes the stage window
       exitItem.setOnAction(event -> 
       {
           primaryStage.close();
       });

       //Creates the Font Size menu
       Menu fontMenu = new Menu("Font Size");
       
       //Creates the menu items for font sizes 6, 9, 12, 18, and 24
       MenuItem font6Item = new MenuItem("6 points");
       MenuItem font9Item = new MenuItem("9 points");
       MenuItem font12Item = new MenuItem("12 points");
       MenuItem font18Item = new MenuItem("18 points");
       MenuItem font24Item = new MenuItem("24 points");
       
       //Adds the font menu items to the Font Size menu
       fontMenu.getItems().addAll(font6Item, font9Item, 
               font12Item, font18Item, font24Item);

       //Registers event handlers for Font6 menu item, sets style font size to 6pt
       font6Item.setOnAction(event -> 
       {
           sampleText.setStyle("-fx-font-size: 6pt");
       });

       //Registers event handlers for Font9 menu item, sets style font size to 9pt
       font9Item.setOnAction(event -> 
       {
           sampleText.setStyle("-fx-font-size: 9pt");
       });

       //Registers event handlers for Font12 menu item, sets style font size to 12pt
       font12Item.setOnAction(event -> 
       {
           sampleText.setStyle("-fx-font-size: 12pt");
       });

       //Registers event handlers for Font18 menu item, sets style font size to 18pt
       font18Item.setOnAction(event -> 
       {
           sampleText.setStyle("-fx-font-size: 18pt");
       });

       //Registers event handlers for Font24 menu item, sets style font size to 24pt
       font24Item.setOnAction(event -> 
       {
           sampleText.setStyle("-fx-font-size: 24pt");
       });

       //Adds the two menus to the menu bar.
       menuBar.getMenus().addAll(fileMenu, fontMenu);

       //Creates a BorderPane with the sample text centered
       BorderPane borderPane = new BorderPane(sampleText);

       //Adds the menu bar to the top region
       borderPane.setTop(menuBar);

       //Creates a Scene and adds the border pane with the dimensions
       Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
       
       //Sets the Scene and displays the window
       primaryStage.setScene(scene);
       primaryStage.show();
   }
}