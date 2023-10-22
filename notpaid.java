package com.example.demo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class notpaid extends Application{
    public void start(Stage stage){
        MenuBar menueBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu aboutMenu = new Menu("About");
        Menu FormatMenu = new Menu("Format");
        Menu ViewMenu = new Menu("View");
        Menu HelpMenu = new Menu("Help");
        //creating menu for file menu
        MenuItem NewItem = new MenuItem("New");
        MenuItem OpenFileItem = new MenuItem("OpenFile");
        MenuItem SaveItem = new MenuItem("Save");
        MenuItem SaveAsItem = new MenuItem("SaveAs");
        MenuItem PageSetupItem = new MenuItem("PageSetup");
        MenuItem printItem = new MenuItem("Print");
        MenuItem ExitItem = new MenuItem("Exit");
        //create menu for Edit menu
        MenuItem CutItem = new MenuItem("Cut");
        MenuItem CopyItem = new MenuItem("Copy");
        MenuItem PastItem = new MenuItem("Past");
        MenuItem DeleteItem = new MenuItem("Delete");
        MenuItem FindItem = new MenuItem("Find");
        MenuItem FindNextItem = new MenuItem("FindNext");
        MenuItem FindPreviousItem = new MenuItem("FindPrevious");
        //about have nothing
        //create menu for Format menu
        MenuItem WordWrapItem = new MenuItem("WordWrap");
        MenuItem FontItem = new MenuItem("Font");
        //creating menu for view
        MenuItem ZoomItem = new MenuItem("Zoom");
        MenuItem StatusBarItem = new MenuItem("StatusBar");
        //Help
        MenuItem ViewHelpItem = new MenuItem("ViewHelp");
        MenuItem SendFeedbackItem = new MenuItem("SendFeedback");
        MenuItem AboutNotepadItem = new MenuItem("AboutNotepad");
        //Now adding Menu item for menu
        fileMenu.getItems().addAll(NewItem,OpenFileItem,SaveItem,SaveAsItem,PageSetupItem,printItem,ExitItem);
        editMenu.getItems().addAll(CutItem,CopyItem,PastItem,DeleteItem,FindItem,FindNextItem,FindPreviousItem);
        FormatMenu.getItems().addAll(WordWrapItem,FontItem);
        ViewMenu.getItems().addAll(ZoomItem,StatusBarItem);
        HelpMenu.getItems().addAll(ViewHelpItem,SendFeedbackItem,AboutNotepadItem);
        //adding menu to menu bar
        menueBar.getMenus().addAll(fileMenu,editMenu,aboutMenu,FormatMenu,ViewMenu,HelpMenu);
        BorderPane root = new BorderPane();
        root.setTop(menueBar);
        Scene scene = new Scene(root,1000,600);
        stage.setTitle("Notepaid");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}



