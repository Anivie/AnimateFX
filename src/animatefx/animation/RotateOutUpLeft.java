package animatefx.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 * @author Loïc Sculier aka typhon0
 */
public class RotateOutUpLeft {

    /**
     * Create new RotateOutUpLeft
     *
     * @param node The node to affect
     */
    public RotateOutUpLeft(Node node) {
        RotateOutUpLeft(node);
    }

    private void RotateOutUpLeft(Node node) {
        node.setRotationAxis(Rotate.Z_AXIS);
        Rotate rotate = new Rotate(0, 0, node.getBoundsInLocal().getHeight());
        node.getTransforms().add(rotate);
        Timeline t =
                new Timeline(
                        new KeyFrame(Duration.millis(0),
                                new KeyValue(rotate.angleProperty(), 0, AnimateFXInterpolator.EASE),
                                new KeyValue(node.opacityProperty(), 1, AnimateFXInterpolator.EASE)
                        ),
                        new KeyFrame(Duration.millis(1000),
                                new KeyValue(rotate.angleProperty(), -45, AnimateFXInterpolator.EASE),
                                new KeyValue(node.opacityProperty(), 0, AnimateFXInterpolator.EASE)
                        )
                );
        t.play();
    }
}
