
public class GenericMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class GenericMatrix<E extends Number>{  
    //将矩阵元素相加的抽象方法;
    protected abstract E add(E o1, E o2);
    //将矩阵的两个元素相乘的抽象方法
    protected abstract E multiply(E o1, E o2);
    //定义零矩阵的抽象方法
    protected abstract E zero(); 
    
    //将两个矩阵相加,用泛型E来表示类，所以方法是非静态的；
    public E[][] addMatrix(E[][] matrix1, E[][] matrix2){  
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)){  
            throw new RuntimeException("The matrices do not have the same size!");  
        }
        //注意E[][] result = new Number[matrix.length][matrix1[0].length]是不对的，
        //因为不能用泛型类型来创建数组，要用（E[][]）来转换才能创建数组；
        //检查矩阵matrix1和矩阵matrix2的大小是否相等,matrix1.length为行数，matrix1[0].length为列数
        E[][] result = (E[][])new Number[matrix1.length][matrix1[0].length];  
        for(int i=0;i<result.length;i++) 
            for(int j=0;j<result[i].length;j++) {
                result[i][j]=add(matrix1[i][j],matrix2[i][j]);
            }
        return result;             
    }
    public E[][] multiplyMatrix(E[][] matrix1, E[][] matrix2){
        if (matrix1[0].length != matrix2.length){  
            throw new RuntimeException("The matrices do not have the same size!");  
        }
        E[][] result = (E[][])new Number[matrix1.length][matrix2[0].length];  
        for(int i=0;i<result.length;i++) {
            for(int j=0;j<result[0].length;j++) {
                result[i][j]=zero();
                for(int k=0;k<matrix1[0].length;k++) {
                    result[i][j]=add(result[i][j],multiply(matrix1[i][k],matrix2[k][j]));
                }
            }
        }
        return result;
    }
    public static void printResult(Number[][] m1,Number[][] m2,Number[][] m3,char op) {
        for(int i=0;i<m1.length;i++) {
            for(int j=0;j<m1[0].length;j++)
                System.out.print(" "+m1[i][j]);
            if(i==m1.length/2)
                System.out.print(" "+op+ " ");
            else
                System.out.print("   ");
            for(int j=0;j<m2.length;j++)
                System.out.print(" "+m2[i][j]);
            if(i==m1.length/2)
                System.out.print(" = ");
            else
                System.out.print("   ");
            for(int j=0;j<m3.length;j++)
                System.out.print(m3[i][j]+" ");
            System.out.println();
        }
    }
}
