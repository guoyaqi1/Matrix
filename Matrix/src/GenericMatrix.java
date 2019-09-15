
public class GenericMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class GenericMatrix<E extends Number>{  
    //������Ԫ����ӵĳ��󷽷�;
    protected abstract E add(E o1, E o2);
    //�����������Ԫ����˵ĳ��󷽷�
    protected abstract E multiply(E o1, E o2);
    //���������ĳ��󷽷�
    protected abstract E zero(); 
    
    //�������������,�÷���E����ʾ�࣬���Է����ǷǾ�̬�ģ�
    public E[][] addMatrix(E[][] matrix1, E[][] matrix2){  
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)){  
            throw new RuntimeException("The matrices do not have the same size!");  
        }
        //ע��E[][] result = new Number[matrix.length][matrix1[0].length]�ǲ��Եģ�
        //��Ϊ�����÷����������������飬Ҫ�ã�E[][]����ת�����ܴ������飻
        //������matrix1�;���matrix2�Ĵ�С�Ƿ����,matrix1.lengthΪ������matrix1[0].lengthΪ����
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
