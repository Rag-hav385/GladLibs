import java.util.*;
import edu.duke.*;
/**
 * Write a description of CodonCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CodonCount {
    private HashMap<String , Integer> map;

    public CodonCount(){
        this.map = new HashMap<String , Integer>();
    }
    
    public void buildCodonMap(int start , String dna){
        this.map.clear();
            for(int i = start ;i < dna.length() - 3 ;i = i + 3){
            
            String s = dna.substring(i,i+3);
            if(!this.map.containsKey(s)){
               this.map.put(s,1);
            }
            else{
                this.map.put(s , map.get(s) + 1);
            }
            
        }
    }
    
    public void getMostCommonCodon (){
        
        int Start = 0;
        String dna = "CAACCTTTAAAAGGAAGAAATCGCAGCAGCCCAGAACCAACTGCATAACATACAACCTTTAAAAGGAAGAAATCGCAGCAGCCCAGAACCAACTGCATAACATACAACCTTTAAAAGGAAGAAATCGCACCAGCCCAGAATCAACTGCATAACATACAAACTTTAAAAGGAAGAAATCTAACATACAACCTTTAAAAGGAAGAAATCGCACCAGCCCAGAATCAACTGCATAACATACAAACTTTAAAAGGAAGAAATCCAACCTTTAAAAGGAAGAAATCGCAGCAGCCCAGAACCAACTGCATAACATACAACCTTTAAAAGGAAGAAATCGCAGCAGCCCAGAACCAACTGCATAACATACAACCTTTAAAAGGAAGAAATCGCACCAGCCCAGAATCAACTGCATAACATACAAACTTTAAAAGGAAGAAATC";
        buildCodonMap(Start ,dna );
        
        int max = 0;
        String max_val = "";
        for(String S : this.map.keySet()){
            if(map.get(S) > max){
                max = this.map.get(S);
                max_val = S;
            }
        }
        
        System.out.println(max + " \t " + max_val);
        
    }
    
    public void printCodonCounts(int start , int end){
        int Start = 0;
        String dna = "CAACCTTTAAAAGGAAGAAATCGCAGCAGCCCAGAACCAACTGCATAACATACAACCTTTAAAAGGAAGAAATCGCAGCAGCCCAGAACCAACTGCATAACATACAACCTTTAAAAGGAAGAAATCGCACCAGCCCAGAATCAACTGCATAACATACAAACTTTAAAAGGAAGAAATCTAACATACAACCTTTAAAAGGAAGAAATCGCACCAGCCCAGAATCAACTGCATAACATACAAACTTTAAAAGGAAGAAATCCAACCTTTAAAAGGAAGAAATCGCAGCAGCCCAGAACCAACTGCATAACATACAACCTTTAAAAGGAAGAAATCGCAGCAGCCCAGAACCAACTGCATAACATACAACCTTTAAAAGGAAGAAATCGCACCAGCCCAGAATCAACTGCATAACATACAAACTTTAAAAGGAAGAAATC";
        this.buildCodonMap(Start , dna);
        int i = 0;
        for(String S : map.keySet()){
            if(map.get(S) >= start && map.get(S) <= end){
                System.out.println(S + " \t " + map.get(S));
                i = i + 1;
            }
        }
        System.out.println("i = " + i); 
    }
}
