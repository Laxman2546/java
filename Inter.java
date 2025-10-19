interface user {
    void name();
}

class userName implements user {
       public void name() {
        System.out.println("iam name");
    }
}


class Inter{
   public static void main(String[] args){
       userName name = new userName();
       name.name();
   }    
}