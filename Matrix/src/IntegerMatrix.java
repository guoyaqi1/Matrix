
public class IntegerMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class IntegerMatrix extends GenericMatrix{  
		    //实现GenericMatrix中的add抽象方法
		    protected Integer add(Integer o1, Integer o2 ){  
		        return o1+o2;  
		    }  
		    //实现GenericMatrix中的mltiply抽象方法
		    protected Integer multiply(Integer o1, Integer o2){  
		        return o1*o2;  
		    }  
		    //实现GenericMatrix中的zero抽象方法
		    protected Integer zero(){  
		        return 0;  
		    }  
		}  
		  
		//Double类类继承了GenericMatrix<？extends Number>中的;
		class DoubleMatrix extends  GenericMatrix{  
		    //实现GenericMatrix中的三个抽象方法； 
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
