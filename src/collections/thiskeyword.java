package collections;

class thiskeyword{
    int rollno;
    String name;
    int fees;
    thiskeyword(int rollno,String name,int fees){
        this.rollno=rollno;
        this.name=name;
        this.fees=fees;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fees);
    }
    public static void main(String[]args){

        thiskeyword a=new thiskeyword(111,"aswer",3222);
        thiskeyword b=new thiskeyword(1112,"akdke",12334);
        a.display();
        b.display();
    }

}


