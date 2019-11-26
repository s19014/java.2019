class Ex3{

	public String ex3_0(int n){
    String ret = "";
    if (n > 0) {
      ret = "その値は正です";
    } else {
      ret = "その値は０か負です";
    }
		return ret;
	}

	public int ex3_1(int n){
        int num = 0;
        if(n > 0){
            num = 1;
        }else if(n < 0){
            num = 1;
        }else {
            num = 0;
        }
		return num;

	}

	public String ex3_2(int a, int b){
        String ret = "";
        if (a % b == 0){
            ret = "4は12の約数です";
        }else {
            ret = "5は12の約数ではありません";
        }
		return ret;
	}

	public String ex3_3(int a, int b){
        String ret = "";
        if (a > b){
            ret = a + "の方が大きいです";
        }else if (a < b) {
            ret = b + "の方が大きいです";
        } else {
            ret = "同じ値です";
        }
		return ret;

	}

	public String ex3_4(int a){
        String ret = "";
        if (a > 0 && a % 5 == 0){
            ret = "その値は5で割り切れます";
        }else if (a > 0 && a % 5 != 0) {
            ret = "その値は5で割り切れません";
        }else {
            ret = "正でない整数値です";
        }
		return ret;

	}

	public String ex3_5(int a){
        String ret = "";
        if (a > 0 && a % 10 == 0){
            ret = "その値は10の倍数です";
        }else if (a > 0 && a % 10 != 0){
            ret = "その値は10の倍数ではありません";
        }else{
            ret = "正でない整数値です";
        }

		return ret;
	}
	
	public String ex3_6(int a){
        String ret = "";
        if(a > 0 && a % 3 == 0){
            ret = "その値は3で割り切れます";
        }else if(a > 0 && a % 3 == 1){
            ret = "その値を3で割った余りは1です";
        }else if(a > 0 && a % 3 == 2){
            ret = "その値を3で割った余りは2です";
        }else{
            ret = "正でない整数値です";
        }
		return ret;
	}

	public String ex3_7(int a){
        String ret = "";
        if(a > 100 || a < 0){
            ret = "範囲(0～100)外の値です";
        }else if(a <= 59){
            ret = "不可";
        }else if(a <= 69){
            ret = "可";
        }else if(a <= 79){
            ret = "良";
        }else{
            ret = "優";
        }
		return ret;
	}

	public double ex3_8(double a, double b){
        double num = 0;
        if(a > b){
            num = a;
        }else if(a < b){
            num = b;
        }else{
            num = 0;
        }
		return num;
	}

	public int ex3_9(int a, int b){
        int num = Math.abs(a - b);
		return num;
	}

	public String ex3_10(int a, int b){
        String ret = "";
        if(Math.abs(a - b) <= 10){
            ret = "それらの差は10以下です";
        }else{
            ret = "それらの差は11以上です";
        }
		return ret;
	}

	public int ex3_11(int a, int b, int c){
        int min = a;
        if(b <= min){
            min = b;
        }
        if(c <= min){
            min = c;
        }
		return min;
	}

	public int ex3_12(int a, int b, int c){
        int midle = a;
        if(a <= b && b <= c){
            midle = b;
        }
        if(c <= b && b <= a){
            midle = b;
        }
        if(a <= c && c <= b){
            midle = c;
        }
        if(b <= c && c <= a){
            midle = c;
        }
		return midle;
	}

	public String ex3_13(int a){
        String ret = "範囲(1～12)外の値です";
        if(a == 1 || a == 2 || a == 12){
            ret = "冬";
        }
        if(3 <= a && a <= 5){
            ret = "春";
        }
        if(6 <= a && a <= 8){
            ret = "夏";
        }
        if(9 <= a && a <= 11){
            ret = "秋";
        }
		return ret;
	}
}

