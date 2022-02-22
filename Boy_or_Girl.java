import java.util.*;
import java.io.*;
public class Boy_or_Girl{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        char[] arr = new char[l];
        for(int i =0; i<l; i++ ){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        int c = 1;
        String test= "";
        for(int i = 0; i< l-1; i ++){
            if( arr[i] != arr[i+1]){
                if(c ==1){test += arr[i];}
                else{c = 1;}
            }
            else {c ++;}
        }
        int res = test.length();
        if(c == 1){res ++;}
        System.out.print((res%2 == 0)?"CHAT WITH HER!":"IGNORE HIM!");        
    }
}


class Scanner 
    {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s){    br = new BufferedReader(new InputStreamReader(s));}

        public String next() throws IOException 
        {
            while (st == null || !st.hasMoreTokens()) 
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {return Integer.parseInt(next());}
        
        public long nextLong() throws IOException {return Long.parseLong(next());}

        public String nextLine() throws IOException {return br.readLine();}
        
        public double nextDouble() throws IOException
        {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if(x.charAt(0) == '-')
            {
                neg = true;
                start++;
            }
            for(int i = start; i < x.length(); i++)
                if(x.charAt(i) == '.')
                {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                }
                else
                {
                    sb.append(x.charAt(i));
                    if(dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg?-1:1);
        }
        
        public boolean ready() throws IOException {return br.ready();}


    }
