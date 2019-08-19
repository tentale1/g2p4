import java.util.Scanner;

/**
 * Programa para hallar impuestos por tipo de carro
 * 
 * @author Sandra Martin, Israel Severiche, Jose Alvarez
 * @version 20190817
 */
public class impuestos
{
    public static void main(String[] args)
    {
        double cam, aut, pbca, pbau;
        double ic=0, nc, iau=0, nau;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("¿Cúal es el precio bruto de la camioneta?");
        pbca = Teclado.nextDouble();
        
        System.out.println("¿Cúal es el precio bruto del vehículo?");
        pbau = Teclado.nextDouble();
        
        if (pbca >= 0 && pbca < 80) {
            ic = 0;
            nc = pbca+ic;
            System.out.println("El impuesto de la camioneta es $ " + ic);
            System.out.println("El valor neto de la camioneta es de $ " + nc);
        } else if (pbca>=80) {
            ic = pbca/2;
            nc = pbca+ic;
            System.out.println("El impuesto de la camioneta es $ " + ic);
            System.out.println("El valor neto de la camioneta es de $ " + nc);
        } else {
            System.out.println("no hagas trampa");
        }
        
        if (pbau >= 0 && pbau < 20) {
            iau = 5;
            nau = pbau+iau;
            System.out.println("El impuesto del automovil es $ " + iau);
            System.out.println("El valor neto del automovil es de $ " + nau);
        } else if (pbau >= 20 && pbau <= 20) {
            iau = pbau/5;
            nau = pbau+iau;
            System.out.println("El impuesto del automovil es $ " + iau);
            System.out.println("El valor neto del automovil es de $ " + nau);
        } else if (pbau > 40) {
            iau = 9;
            nau = pbau+iau;
            System.out.println("El impuesto del automovil es $ " + iau);
            System.out.println("El valor neto del automovil es de $ " + nau);
        }else {
            System.out.println("no hagas trampa");
        }
    }
}
