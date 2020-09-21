public class SinTable{
    public static void main(String[] args) {

        double angle = -90.0;
        int i = 1;
        double sine = Math.sin(angle*(Math.PI/180.0));
        float sine2 = (float)sine;

        System.out.println("angle\tsine\n-----\t--------");
        for (i = 1; i<=6; i++){
            System.out.println(angle + "\t" + sine2);
            angle = angle + 15.0;
            sine = Math.sin(angle*(Math.PI/180.0));
            sine2 = (float)sine;
            
        }
        if (i == 7){
            sine = Math.sin(angle*(Math.PI/180.0));
            System.out.println("  " + angle + "\t " + sine);
            
        }
        i = 7;
        angle = angle + 15.0;
        sine = Math.sin(angle*(Math.PI/180.0));
        sine2 = (float)sine;
        while (i >= 7 && i <= 13){
            System.out.println(" " + angle + "\t " + sine2);
            i = i + 1;
            angle = angle + 15.0;
            sine = Math.sin(angle*(Math.PI/180.0));
            sine2 = (float)sine;
            if(i==13){
                break;
            }
        }





    }
}