import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Ex4{

	public int [] ex4_1(int [] a){
		Arrays.sort(a);
		return a;
	}

	public int [] ex4_2(int [] a){
		return a;

	}

	public String [] ex4_3(int [] a){
		
		String [] hantei = {"dummy"};
	
		return hantei;

	}

	public int ex4_4(int a){
        int answer = String.valueOf(a).length();
		
		return answer;

	}

	public int ex4_5(int a){
        int num = a + 1;
        int answer = 0;
        for(int i=0; i<num; i++){
            answer += i;
        }
		
		return answer;

	}

	public int [] ex4_6(int a){
		
		int [] ret = new int[1];
		
		return ret;

	}

	public boolean ex4_7(int a){
		
		return false;

	}

	public int ex4_8(int [] a){
		
		int ret = 0;
        for(int i=0; i<a.length; i++){
            ret += a[i];
        }
		
		return ret;

	}

	public int ex4_9(int [] a){
		
		int ret = 0;
        for(int i=0; i<a.length; i++){
            ret += a[i];
        }
        int answer = (int)(Math.floor(ret / a.length));
        return answer;
	}
}
