import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String s1= " John Smith";
        String s2=s1.trim();
        System.out.println("Before removing the space:"+s1+"\n"+"After removing:"+s2);

        String s3="John.Smith@ABC.com";
        System.out.println("Converting to lower:"+s3.toLowerCase());
        String validate = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.[A-Za-z]{2,}$";
        if(s3.matches(validate)){
            System.out.println("Valid");
        }
        else{
            System.out.println("InValid");
        }
        String id ="EMP-1023";
        String eid = "^[A-Za-z]-[0-9]";
        if(id.matches(eid)){
            System.out.println("Valid");
        }else {
            System.out.println("InValid");
        }
        String username= "Aishu Sheksindi";
        String gen_user []= username.split(" ");
        String u_name = gen_user[0].toLowerCase()+"."+gen_user[1].toLowerCase();
        System.out.println(u_name);

        String name= "Aishwarya Vel";
        int count =1;
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("COunt:"+count);
        String password = "Aishu@123";
        if(password.length()>8){
            System.out.println("Strong");
        }
        else{
            System.out.println("Weak");
        }

        int index= s3.indexOf('@');
        String masked= s3.charAt(0)+"***"+s3.substring(index);
        System.out.println("Masked mail:"+masked);

        String s4 = "aishu@gmail.com";
        int idx = s4.indexOf("@");
        System.out.println(s4.substring(idx+1));

        int cnt =0;
        String vowel = name.toLowerCase();
        for(int i=0; i<name.length();i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                cnt++;
            }
        }
        System.out.println(cnt);

        int up =0,low =0 ,digit =0,special =0;
        for(int i=0; i<name.length();i++){
            char c = name.charAt(i);
            if(Character.isUpperCase(c)){
                up++;
            } else if (Character.isLowerCase(c)) {
                low++;
            }
            else if (Character.isDigit(c)) {
                digit++;
            }
            else {
                special++;
            }
        }
        System.out.println(up+low+digit+special);

        String rev =" ";
        for(int i=name.length()-1;i>=0;i--){
           rev =rev +name.charAt(i);
        }
        System.out.println(rev);
        if(name.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }


        for(int i=0; i<name.length();i++){
            int ct=0;
            int max=0;
            char result = ' ';
            for(int j=0; j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                   ct++;
                }
                if(ct == 1){
                    System.out.println(name.charAt(i));
                    break;
                }
                if(ct>max){
                    max=ct;
                    result=name.charAt(i);
                }
            }
        }

        System.out.println(name.replace(' ','_'));
        String name2 = "Shakthi";
        System.out.println(name.equals(name2));

        String []sort = {"Hegde","Gubbi"};
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));

        String parts[]=name.split(" ");
        String code = ""+Character.toUpperCase(parts[0].charAt(0)) + Character.toUpperCase(parts[1].charAt(0))+id.substring(id.indexOf("-")+1);
        System.out.println(code);

        String emails[] ={"aishu@gmail.com","john@gmail.com","aishu@gmail.com"};
        for (int i=0; i< emails.length; i++){
            for (int j=i+1; j< emails.length; j++){
                if(emails[i].equalsIgnoreCase(emails[j])){
                    System.out.println("Duplicate:"+emails[i]);
                }
            }
        }



    }
}
