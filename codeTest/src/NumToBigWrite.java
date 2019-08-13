import java.util.Scanner;

public class NumToBigWrite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        for(int i = 0 ; i < len ; i++){
            System.out.print(NumToBigWrite(str.charAt(i)-'0'));
            if(str.charAt(i)-'0' != 0)
            System.out.print(level(len-i));
            boolean IfTheLastZero = true;
            for(int k = i+1 ;k < len ; k++){
                if(str.charAt(k)-'0' != 0){
                    IfTheLastZero = false;break;
                }
            }
            if(IfTheLastZero) return;
        }
    }

    public static String NumToBigWrite(int i){
        switch (i){
            case 1: return "壹";
            case 2: return "贰";
            case 3: return "叁";
            case 4: return "肆";
            case 5: return "伍";
            case 6: return "陆";
            case 7: return "柒";
            case 8: return "捌";
            case 9: return "玖";
            case 0: return "零";
            default: return "error";
        }
    }

    public static String level(int i){
        int level ;
        if(i > 4){
            level = i - 4;
        }else{
            level = i ;
        }
        switch (level){
            case 0: return "万";
            case 1: if(i > 4) return "万"; return "";
            case 2: return "拾";
            case 3: return "佰";
            case 4: return "仟";
            case 5: return "万";
            default: return "error_level";
        }
    }

}
