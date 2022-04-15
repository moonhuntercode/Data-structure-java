import java.util.Scanner;

/**
 * CcolaE
 */
public class CcolaE {
    int MAX =10;
    int  [] Info= new int[MAX];
    int Ini, Fin;
    CcolaE(){
        Ini=0;
        Fin=-1;
    }
public int Leer_dato()
{
Scanner tecla =new Scanner(System.in);
int dato=tecla.nextInt();
return dato;
}
    public void insercion (int dato){
if (Fin==MAX-1) {
    System.out.println("cola llena");
} 
else {
    Fin++;
    Info[Ini]=dato;
}

    }
    public void Imprimir() {
        if (Ini<Fin) {
            System.out.println("cola vacia");
        } else {
            for (int i = Ini; i <=Fin; i++) {
                System.out.println(Info[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int option;
        CcolaE col=new CcolaE();
            System.out.println("1).insertar\n2).Imprimir\n7)Exit\n");
            System.out.println("________________ELIJA UNA OPCION");
            option=col.Leer_dato();
        do {
            switch (option) {
                case 1:System.out.println("agregando codigo a");
                    int dato=col.Leer_dato();
                    col.insercion(dato);
                    break;
                    case 2:col.Imprimir();
                    break;
                    case 7:System.exit(0);
                    break;
                default:System.out.println("tecla incorrecta");
                    break;
            }
        } while (option!=7);
    }
}