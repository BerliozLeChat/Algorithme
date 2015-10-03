/**
 * Application
 * TP1 
 * @author François Hallereau & Sullivan Pineau
 */
public class Application {
    public static void main (String[] args){
        System.out.println("Question 1 :");
        int[] tab = {42,12,75,17,35,4,21,9};
        System.out.println(question1(tab));
    }

    public static String question1(int[] tab){
        TriFusion.sort(tab);
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int i=0;i<8;++i){
            str.append(tab[i]);
            str.append(",");
        }
        str.deleteCharAt(str.lastIndexOf(","));
        str.append("]");
        return str.toString();
    }
}
