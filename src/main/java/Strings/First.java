package Strings;
//code of string reverse
public class First {

    public void reverse(){
        String name="Krushna";
        StringBuilder reverse=new StringBuilder();

        for(int i=name.length()-1;i>=0;i--){
            reverse.append(name.charAt(i));
        }

        System.out.println(reverse);
    }

    public static void main(String[] args) {
First obj=new First();
obj.reverse();

    }
}
