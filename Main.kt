/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun main() {
    
     val array = arrayOf(intArrayOf(1,2),
                          intArrayOf(3,4),
                          intArrayOf(5,6,7))
                          
                          
       //Loop through each elemnet of arrayOf
       
       for(row in array )
       {
              for(column in row){
              println("$column")
       }
       }
       println()
                          
    
 
}
