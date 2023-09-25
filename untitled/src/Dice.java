public class Dice {
 int sides;
 String type;

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    void Roll(){
     System.out.println(getSides());
     System.out.println(getType());
 }
}
