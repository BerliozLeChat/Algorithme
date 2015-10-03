/**
 * Classe du tri fusion
 * @author François Hallereau & Sullivan Pineau
 */
public class TriFusion {

    static int [] aux; //tableau auxiliaire, le tri fusion n'est pas sur place

    /**
     * fonction de tri
     * @param t le tableau à trier
     * @param l index de début
     * @param r index de fin
     */
    private static void sort(int[] t,int l , int r){
        if(r>l){//le tableau a plus d'une case
            int m = (r+l)/2;//index de la moitié du tableau
            sort(t,l,m);//appel de fonction sur les deux moitiés
            sort(t,m+1,r);
            //int []tmp = new int[r-l+1];
            merge(aux,l,t,l,m,t,m+1,r);//fusion des deux tableau dans aux
            for(int i=l;i<=r;i++)
                t[i]=aux[i];//on copie les valeurs de aux trié dans t
        }
    }

    /**
     * fonction de tri
     * @param t le tableau à trier
     */
    public static void sort(int t[]){
        aux=new int[t.length];
        sort(t,0,t.length-1);
    }

    /**
     * Fonction de fusion utilisé par le tri
     * @param res le tableau trié
     * @param l index de début
     * @param a sous tableau gauche
     * @param al index de début du sous tableau gauche
     * @param ar index de fin du sous tableau gauche
     * @param b sous tableau droit
     * @param bl index de début du sous tableau gauche
     * @param br index de fin du sous tableau droit
     */
    static void merge(int[] res, int l,
                      int [] a, int al, int ar,
                      int[] b,int bl,int br){
        int i=al;
        int j=bl;
        for(int k=l; k<=l+ar-al+br-bl+1;k++){
            if(i>ar){
                res[k]=b[j++];
            }
            else if(j>br){
                res[k]=a[i++];
            }
            else if(a[i]<b[j]){
                res[k]=a[i++];
            }
            else{
                res[k]=b[j++];
            }
        }
    }
}
