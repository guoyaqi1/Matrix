
public class IntegerMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class IntegerMatrix extends GenericMatrix{  
		    //ʵ��GenericMatrix�е�add���󷽷�
		    protected Integer add(Integer o1, Integer o2 ){  
		        return o1+o2;  
		    }  
		    //ʵ��GenericMatrix�е�mltiply���󷽷�
		    protected Integer multiply(Integer o1, Integer o2){  
		        return o1*o2;  
		    }  
		    //ʵ��GenericMatrix�е�zero���󷽷�
		    protected Integer zero(){  
		        return 0;  
		    }  
		}  
		  
		//Double����̳���GenericMatrix<��extends Number>�е�;
		class DoubleMatrix extends  GenericMatrix{  
		    //ʵ��GenericMatrix�е��������󷽷��� 
		    protected Double add(Double d1,Double d2){  
		        return d1+d2;  
		    }  
		    protected Double multiply(Double d1,Double d2){  
		        return d1*d2;  
		    }  
		    protected Double zero(){  
		        return 0.0;  
		    }  
		  
		}  
	}

}
