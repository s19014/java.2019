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
		Arrays.sort(a);
        int[] nums = new int[a.length];

        for(int i=0; i < a.length; i++){
            nums[i] = a[a.length -1 -i];
        }
        for(int i=0; i < a.length; i++){
            a[i] = nums[i];
        }
        return a;
	}

	public String [] ex4_3(int [] a){
		
		String [] hantei = new String[a.length];
        for(int i=0; i < a.length; i++){
            if(a[i] < 0){
                hantei[i] = "負";
            }else if(a[i] > 0){
                hantei[i] = "正";
            }else{
                hantei[i] = "零";
            } 
        }
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
        int[] ret = new int[1];
		return ret;
    }

	public boolean ex4_7(int a){
        int count = 0;
        for(int i=2; i < a+1; i++){
            if(a % i == 0){
                count += 1;
            }
        }
		
		return count == 1;

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
        return ret;
    }
}
