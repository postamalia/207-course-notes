/**
 * represents a 2d rectangle with width and height.
 */

public class Rectangle {
  private double width;
  private double height;

  /**
   * constructs a rectangle with the given width and height.
   *
   * @param w the desired width
   * @param h the desired height
   */

  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * calculates and returns the rectangle's area.
   *
   * @return width multiplied by height
   *
   */

  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor the factor by which to scale the rectangle
   */

  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * compares this rectangle's size to another rectangle's size.
   *
   * @param other the other rectangle
   *
   * @return the bool resulting from the comparison of areas
   *
   */

  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}
