package ooga.Model.StageClasses;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Platform extends Rectangle {
  private Rectangle rectangle;
  private boolean hollow;

  /**
   * Constructor for creating a platform for a stage
   * @param x cord of platform
   * @param y cord of platform
   * @param width of platform
   * @param height of platform
   * @param isHollow whether player can fall through the platform
   */
  public Platform(int x, int y, int  width, int height, boolean isHollow){
    super(x, y, width, height);
    setHollow(isHollow);
    this.setFill(Color.TRANSPARENT);
    //this.setFill(Color.rgb(0, 0, 200, 0.5));

  }

  /**
   * Getter for whether players can fall through the platform
   * @return whether platform is hollow
   */
  public boolean getHollow(){
    return hollow;
  }

  /**
   * Method for setting whether players can fall through a platform
   * @param isHollow whether players can fall through the platform
   */
  public void setHollow(boolean isHollow){
    hollow = isHollow;
  }
}
