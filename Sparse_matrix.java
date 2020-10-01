public class SparseMatrix    
{    
    public static void main(String[] args) {    
        int rows, cols, size, count = 0;    
        
        int array[][] = {       
                        {1, 0, 0},    
                        {0, 2, 0},    
                        {0, 0, 3}    
                    };    
         
          rows = array.length;    
        cols = array[0].length;    
             
        size = rows * cols;    
               
        for(int i = 0; i < rows; i++){    
            for(int j = 0; j < cols; j++){    
                if(array[i][j] == 0)    
                    count++;    
                }    
            }    
                
        if(count > (size/2))    
            System.out.println("Given matrix is a sparse matrix");    
        else    
            System.out.println("Given matrix is not a sparse matrix");    
    }    
}
