
package lista2.ex6;


public class Lista2Ex6 {

    public static void main(String[] args) {
        
        int[] num = {2, 434 ,36, 890, 34, 12, 10};
        int[] den = {23, 0, 43, 22, 66, -1, -5};
        
        for(int i = 0 ; i < num.length; i++){
            try{
                if(den[i] < 0){
                    throw new ExceptionC();
                }
                
                if(den[i] % 2 != 0){
                    throw new ExceptionB(num[i], den[i]);
                }
                
                if(den[i] == 0){
                    throw new ExceptionA();
                }
            System.out.println(num[i] + "/" + den[i] + "=" + (num[i]/den[i]) );
                
            }
            catch(ExceptionC e){
                System.out.println("Excessao C");
                e.printStackTrace();
            }
            catch(ExceptionB e){
                System.out.println("Excessao B");
                e.printStackTrace();
            }
            catch(ExceptionA e){
                System.out.println("Excessao A");
                e.printStackTrace();
            }
        }
    }
}
