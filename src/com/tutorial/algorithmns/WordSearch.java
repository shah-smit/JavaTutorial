public class WordSearch {
    public static void main(String args[]) {
        
        String[][] wordssearch = {
            {"I","N","H","E","A","V","Y"},
            {"O","R","H","V","H","N","O"},
            {"E","R","A","P","M","O","C"},
            {"E","R","A","P","M","P","A"},
            {"E","R","A","P","M","A","T"},
        };
        
        String[][] words = {
            {"H","E","A","V","Y","",""},
            {"C","O","M","P","A","R","E"},
            {"C","A","T","","","",""},
        };
        
        for(int i=0; i<wordssearch.length; i++){
            
            for(int j=0; j<wordssearch[0].length; j++){
                String currChar = wordssearch[i][j];
                for(int k=0; k<words.length; k++){
                    int l = 0;
                    int currJ = j;
                    int currI = i;
                    if(currChar == words[k][l]){
                        System.out.println("Found Char: ("+i+","+j+") :"+currChar);
                        boolean reverse = false;
                        boolean downward = false;
                        whileLoop:
                        while(l < words[0].length  &&words[k][l] != "" && (currJ >= 0 && currJ < wordssearch[0].length)){
                            
                            if(words[k][l] == wordssearch[i][currJ]){
                                System.out.print(wordssearch[i][currJ]);        
                            }
                            else{
                                System.out.println("Incomplete word found");   
                                break whileLoop;
                            }

                            l = l+1;
                            if(reverse) currJ = currJ - 1;
                            else {
                                if(currJ+1 >= wordssearch[0].length){
                                    reverse = true;
                                    currJ = currJ - 1;
                                }
                                else currJ = currJ + 1;
                            }
                        }
                        System.out.println();
                    }
                }
                
                
            }
        }
    }
}
