public class IfStatements{
public static void main(String[] args) {
    int x = 1;
    int y = 0;
    Boolean yn = true;
    String name = "Alex";


    if (x > y){
    System.out.println("yeehaw");
    }

    if (yn) {
        System.out.println("reee");
    }

// if (A){
//     // A
// } else if (B){
//     // B
// } else{
//     // fallback/C
// }

// primitives and objects are different when compared for equality

if (name == "Alex") {
    // Does not run
}

if (name.equals("Alex")){
    // Will run
}

if ("Alex".equals(name)){
    // Will run
}

if (!"Alex".equals(name)){
    // Will run
}


}
}












