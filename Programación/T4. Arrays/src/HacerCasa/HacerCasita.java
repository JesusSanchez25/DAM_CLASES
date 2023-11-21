package HacerCasa;

import java.util.Scanner;

import static java.lang.System.in;

public class HacerCasita {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Inserte el tamaño en pixeles");
        int tamaño = 0;
        iniciarPaint();
        hacerCasa(tamaño);

    }

    private static void iniciarPaint (){
        System.out.println("$MouseEventSig=@'");
        System.out.println("[DllImport(\"user32.dll\",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]");
        System.out.println("public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);");
        System.out.println("'@");
        System.out.println("");
        System.out.println("$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name \"MouseEventWinApi\" -passThru");
        System.out.println("[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(10,1000)");
        System.out.println("$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)");
        System.out.println("$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)");
        System.out.println("Start-Sleep -Seconds 1");
        System.out.println("[System.Windows.Forms.SendKeys]::SendWait(\"Paint\")");
        System.out.println("[System.Windows.Forms.SendKeys]::SendWait(\"{enter}\")");
        System.out.println("Start-Sleep -Seconds 1");
        System.out.println("[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(1270,170)");
        System.out.println("$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)");
        System.out.println("$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)");
        System.out.println("");

}

    private static void hacerCasa(int tamaño){

        tamaño= 200;
        //Cuadrado
            System.out.println("Start-Sleep -Seconds 1");
            System.out.println("[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(506,50)");
            System.out.println("$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)");
            System.out.println("$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)");
            System.out.println("Start-Sleep -Seconds 1");
            System.out.println("");


            System.out.println("Start-Sleep -Seconds 1");
            System.out.printf("[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(675,520)\n");
            System.out.printf("$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)\n");

            System.out.println("Start-Sleep -Seconds 1");
            System.out.printf("[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point("+(675+tamaño)+","+(520+tamaño)+")\n");
            System.out.printf("$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)\n");

    }


}
