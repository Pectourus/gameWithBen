import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class UI extends Application {

    public static void main(String[] args) {
        try {
            launch(args);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.exit(0);
        }
    }

    @Override
    public void start(Stage mainStage) {
        mainStage.setTitle("Test");

        BorderPane root = new BorderPane();

        Scene mainScene = new Scene(root);
        mainStage.setScene(mainScene);

        Canvas canvas = new Canvas();
        GraphicsConfiguration context = canvas.getGraphicsConfiguration();

        root.setCenter(canvas);
    }
}
