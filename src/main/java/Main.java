public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Finally block cant be null bug");
        }catch (Exception e){

        }finally {
            throw new IllegalAccessError();

        }
    }

    public int error(int i){
        return i;
    }
    
     public int myLatestMethodFromForked(int i){
        return i;
    }
    
     public int myBuggedMethodFromForked(){
         try{
             System.out.println("Finally block cant be null bug");
         }catch (Exception e){
         
         }finally {
             throw new IllegalAccessError();
        }
    }
}
