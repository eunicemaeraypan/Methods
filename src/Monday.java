public class Monday {

    static void myMethod(String fname) {
        System.out.println(fname + " Boy");
    }


    public static void main(String[] args) {

        String str = "Eunice";
        countVowels(str);

        String string = "The quick brown fox jumps over the lazy dog";
        System.out.println(wordcount(string) + " words");

        myMethod("Ace");

        int n = 1;
        while (n<=6)
        {
            System.out.println("["+n+"]");
            n++;
        }

        int i = 0;
        while (i < 6)
        {
        System.out.println(i);
        i++;
        }

        int[] numbers = {10, 3, 5, -20, 0, 23};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum " + sum);


    }
    static int wordcount(String string){
        int count = 0;

        char ch[] = new char[string.length()];
        for(int i=0;i<string.length(); i++)
        {
            ch[i]=string.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;


    }

    public static void countVowels(String str){
        int vowelCount = 0;
        for(int i=0; i<str.length(); i++){
        if(isVowel(str.charAt(i))){
            ++vowelCount;
        }else{
            System.out.println("Vowel Count=" + vowelCount);
        }

        }
    }
    public static boolean isVowel(char ch){
        ch=Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }

}
