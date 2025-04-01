import java.io.*;


import javax.swing.*;



public class Suma{





static boolean validar(String v){

  boolean estado=false;

for(int i=0;i<v.length();i++){

if(!(v.charAt(i)>=48 &&   v.charAt(i)<58)){

estado=true;

System.out.print("Solamente numeros de favor");
  
  break;
}
  

  
}
  


  return estado;
}

  


static void datos(){

BufferedReader entrada=new  BufferedReader(new InputStreamReader(System.in));
  
boolean estado;
String v;
int i=0;
int[] numeros=new int[2];
  
  
while(i<2){


System.out.print("Dame un numero de favor?:");
v=entrada.readLine();

estado=validar(v);


if(estado==false){

 numeros[i]=Integer.parseInt(v); 
i++;
  
}  

  
}

    proceso(numeros);
}


  static void proceso(int numeros[]){


JOPtionPane.showMessageDialog(null,"El resultado de la suma es:"+(numeros[0]+numeros[1]));

    
  }



  
  public static void main(String[]args) throws IOException{
datos();


    
  }


  
}
