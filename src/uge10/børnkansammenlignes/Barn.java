package uge10.børnkansammenlignes;
public class Barn implements Comparable < Barn > {
    private String navn;
    private int år;
    private int måned;
    private int dag;


    public Barn(String navn, int år, int måned, int dag){
        this.navn = navn;
        this.år = år;
        this.måned = måned;
        this.dag = dag;
    }
    public int compareTo(Barn other){
        if (år != other.år){
            return other.år-år;
        } else if (måned != other.måned){
            return other.måned-måned;
        } else if (dag != other.dag){
            return other.dag-dag;
        } else {
            // Sammenlign navne så det yngste er først.
            return navn.compareTo(other.navn);
        }

    }
    public String toString() {
        return navn + " born " + dag + "/" + måned + " " + år;
    }
}

