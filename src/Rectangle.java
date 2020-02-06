public class Rectangle {
    private double length;
    private double width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
      return this.length * this.width;
    }
    public double diagonal(){
        return (Math.sqrt(this.length * this.length + this.width * this.width));
    }
    public String issquare(){
        if(this.length == this.width ){
            return "this is a square";
        }else{
            return "this is not a square";
        }
    }
}
