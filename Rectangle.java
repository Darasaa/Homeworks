/*4. დაწერეთ Rectangle-ს კლასი, რომელსაც ექნება height და width
პარამეტრები. დაწერეთ ამ კლასის შემდეგი
ფუნქციები:
- setDim, რომელიც იღებს ამ 2 პარამეტრს და ჩვენი კლასის
პარამეტრებს უსეტავს გადაცემულ მნიშვნელობებს.
- getArea, რომელიც გვიბრუნებს ოთხკუთხედის ფართობს
- getPerimeter, რომელიც გვიბრუნებს ოთხკუთხედის პერიმეტრს
გარდა ამ ფუნქციებისა, ჩვენი ორი პარამეტრის გეთერ/ სეტერებიც
აუცილებელია, და ასევე, RectanlgeTest კლასი, რომლის main
ფუნქციიდანაც შექმნით ამ კლასის ობიექტს
და გატესტავთ დაწერილი ფუნქციების სისწორეს.*/

public class Rectangle {
    private double height;
    private double width;

    Rectangle(){
        System.out.println("\nRectangle class created!");
    }

    Rectangle(double height, double width){
        setDim(height,width);
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setDim(double height, double width){
        setHeight(height);
        setWidth(width);
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return 2 * (height + width);
    }
    public void recData(){
        System.out.println("\n---Rectangle data is being printed---");
        System.out.println("სიმაღლე: " + height);
        System.out.println("სიგანე: " + width);
    }


}