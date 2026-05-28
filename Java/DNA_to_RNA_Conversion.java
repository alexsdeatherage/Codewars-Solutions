public class Bio {
    public String dnaToRna(String dna) {
        // create a new empty string
        String rna = "";
        // Iterate over dna string via for loop
        for (int c = 0; c < dna.length(); c++) {
        // Append char to empty string, if char == T, add U instead
          if (dna.charAt(c) == 'T') {
            rna = rna + "U";
          } else {
            rna = rna + dna.charAt(c);
          }
        }
          
        // return rna string
        return rna;
    } 
}