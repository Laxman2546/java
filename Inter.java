interface user {
    void name();
}

class userName implements user {
    public void name() {
        System.out.println("iam name");
    }
}

abstract class shape {
    String color;

    shape(String color) {
        this.color = color;
        System.out.println(color);
    }

    public abstract int length();
}

class circle extends shape {
    private int radius;
    
    public circle(String color,int radius) {
        super(color);
        this.radius = radius;
        calcRadius(radius);
    }
    public int calcRadius(int radius) {
        return length();
    }
    @Override
    public int length() {
        return  (int)Math.PI * radius;        
    }
}

class Inter{
   public static void main(String[] args){
       circle cr = new circle("blue",12);

       int len = cr.calcRadius(24);
       System.out.println(len);
   }    
}