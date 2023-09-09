package u2java;
import java.util.Scanner;
public class Jersy {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
int a;
boolean t=true;
System.out.println("Bro guess the jersy of suresh raina");
a=sc.nextInt();
while(t) {
if(a==3) {
System.out.println("Bro well guessed");
t=false;}
else {
System.out.println("sorry bruh it is a wrong guess\nplease guess again");
a=sc.nextInt();
}
}
}
}