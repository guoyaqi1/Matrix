
public class TestlntegerMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class testGenericMatrix{  
		    public static void main(String[] args){  
		        //创建Integer数组
		        Integer[][] m1 = new Integer[][]{{1,2,3},{4,5,6},{7,8,9}};  
		        Integer[][] m2 = new Integer[][]{{1,5,1},{2,4,2},{0,0,0}};
		        
		        //创建IntegerMatrix实例；
		        IntegerMatrix integerMatrix = new IntegerMatrix(); 
		        
		        System.out.println("整数加法 ");  
		        GenericMatrix.printResult(m1,m2,integerMatrix.addMatrix(m1,m2),'+');  
		        
		        System.out.println("整数乘法 ");  
		        GenericMatrix.printResult(m1,m2,integerMatrix.multiplyMatrix(m1,m2),'*'); 
		        //创建Double数组
		        Double[][] d1 = new Double[][]{{0.0, 1.0, 2.0}, {1.0, 2.0, 3.0}, {2.0, 3.0, 4.0}};  
		        Double[][] d2 = new Double[][]{{0.0, 0.5, 1.0}, {0.5, 1.0, 1.5}, {1.0, 1.5, 2.0}};  
		        
		        DoubleMatrix doubleMatrix = new DoubleMatrix();  
		        
		        System.out.println("浮点数加法 ");  
		        GenericMatrix.printResult(d1,d2,doubleMatrix.addMatrix(d1,d2),'+');  
		        
		        System.out.println("浮点数乘法");  
		        GenericMatrix.printResult(d1,d2,doubleMatrix.multiplyMatrix(d1,d2),'*');  
		  
		    }  
		  
		}  
	}

}
