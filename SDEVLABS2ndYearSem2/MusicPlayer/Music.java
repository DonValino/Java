import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioSpectrumListener;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.awt.Rectangle;

/**
 * Created by JakeValino on 13/02/2015.
 */
public class Music extends Application {
    boolean st = false;
public static void main(String [] args)
{
launch(args);
}

    @Override
    public void start(final Stage stage) throws Exception {
        stage.setTitle("Movie player");
        Group root = new Group();

        javafx.scene.media.Media media = new javafx.scene.media.Media("file:///Users/JakeValino/Downloads/2hp%20Nissan%20X-Trail%202014.mp4");
        final MediaPlayer player = new MediaPlayer(media);
        MediaView view = new MediaView(player);
      //  System.out.println("media.width" + media.getWidth());

        final Timeline slideIn = new Timeline();
        final Timeline slideOut = new Timeline();
        root.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                slideOut.play();

            }
        });
        root.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                slideIn.play();

            }
        });

        root.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!st)
                {
                    player.pause();
                    st = true;
                }
                else {
                    player.play();
                    st = false;
                }
            }
        });

        

        final VBox xbox = new VBox();
        final Slider slider = new Slider();
        xbox.getChildren().add(slider);

        final HBox hBox = new HBox(2);
        final  int bands = player.getAudioSpectrumNumBands();
        final javafx.scene.shape.Rectangle[] rects = new javafx.scene.shape.Rectangle[bands];
        for(int i = 0; i < rects.length;i++)
        {
            rects[i] = new javafx.scene.shape.Rectangle();
            rects[i].setFill(Color.GREENYELLOW);
            hBox.getChildren().add(rects[i]);
        }

        xbox.getChildren().add(hBox);
        root.getChildren().add(view);
        root.getChildren().add(xbox);
        
        Scene scene = new Scene(root, 400, 400, Color.BLACK);
        stage.setScene(scene);
        stage.show();

        player.play();
        player.setOnReady(new Runnable() {
            @Override
            public void run() {
                int w = player.getMedia().getWidth();
                int h = player.getMedia().getHeight();

                hBox.setMinWidth(w);
                int bandwidth = w/rects.length;
                for(javafx.scene.shape.Rectangle r:rects)
                {
                    r.setWidth(bandwidth);
                    r.setHeight(2);
                }
                stage.setMinWidth(w);
                stage.setMaxHeight(h);

               xbox.setMinSize(w,100);
                xbox.setTranslateY(h-100);

                slider.setMin(0.0);
                slider.setValue(0.0);
                slider.setMax(player.getTotalDuration().toSeconds());

                slideOut.getKeyFrames().addAll(
                        new KeyFrame(new Duration(0),
                                new KeyValue(xbox.translateYProperty(),h-100),
                                new KeyValue(xbox.opacityProperty(),0.9)
                        ),
                        new KeyFrame(new Duration(300),
                                new KeyValue(xbox.translateYProperty(),h),
                                new KeyValue(xbox.opacityProperty(),0.0)
                        )

                );
                
                slideIn.getKeyFrames().addAll(
                        new KeyFrame(new Duration(0),
                                new KeyValue(xbox.translateYProperty(),h),
                                new KeyValue(xbox.opacityProperty(),0.0)
                        ),

                new KeyFrame(new Duration(300),
                                new KeyValue(xbox.translateYProperty(),h-100),
                                new KeyValue(xbox.opacityProperty(),0.9)
                        )
                );


            }
        });
        player.currentTimeProperty().addListener(new ChangeListener<Duration>() {
            @Override
            public void changed(ObservableValue<? extends Duration> observableValue, Duration duration, Duration current) {
                slider.setValue(current.toSeconds());
            }
        });
        slider.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                player.seek(Duration.seconds(slider.getValue()));
            }
        });

        player.setAudioSpectrumListener(new AudioSpectrumListener() {
            @Override
            public void spectrumDataUpdate(double v, double v1, float[] mags, float[] floats1) {
                for(int i = 0; i < rects.length;i++)
                {
                    double h = mags[i] + 60;
                    if(h > 2) {
                        rects[i].setHeight(h);
                    }
                }
            }
        });
        //Controllers


    }
}
