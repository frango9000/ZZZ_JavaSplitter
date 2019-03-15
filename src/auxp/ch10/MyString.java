package auxp.ch10;

import java.util.Arrays;

import static lib.Misc.IO.println;

public class MyString {

    char[] string;

    public MyString() {
    }

    public MyString(char[] string) {
        this.string = string;
    }

    public MyString(String s){
        string = new char[s.length()];
        for (int i = 0; i < string.length; i++) {
            string[i] = s.charAt(i);
        }
    }

    public int compare(String s){
        return Arrays.compare(string, s.toCharArray());
    }

    public MyString substring(int begin){
        StringBuilder sb = new StringBuilder();
        for (; begin < string.length; begin++) {
            sb.append(string[begin]);
        }
        return new MyString(sb.toString());
    }

    public MyString toUppercase(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length; i++) {
            sb.append(Character.toUpperCase(string[i]));
        }
        return new MyString(sb.toString());
    }
    public char[] toChars(){
        return string;
    }

    public void print(){
        println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length; i++) {
            sb.append(string[i]);
        }
        return sb.toString();
    }
}
