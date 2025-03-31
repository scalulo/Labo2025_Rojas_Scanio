public class Vocales {
    public static void main(String[] args) {
        String frase="Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        int vocales = 0;

        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u' || frase.charAt(i)=='A' || frase.charAt(i)=='E' || frase.charAt(i)=='I' || frase.charAt(i)=='O' || frase.charAt(i)=='U' ){
                vocales++;
            }
        }
        System.out.println(vocales);
    }
}
