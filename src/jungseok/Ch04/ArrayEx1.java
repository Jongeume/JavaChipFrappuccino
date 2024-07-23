package jungseok.Ch04;

public class ArrayEx1 {
    public static void main(String[] args) {

        /*args = new String[5];
        args[1] = "응애";
        int tmp = args.length;
        System.out.printf("args 배열의 2번째 :\t%s%n", args[1]);
        System.out.printf("args 배열의 길이 :\t%d%n", tmp);
*/
        int tmp = args.length;
        System.out.println(tmp);
        for(int i = 0; i<args.length; ++i){
            System.out.println(args[i]);
        }
    }
}
