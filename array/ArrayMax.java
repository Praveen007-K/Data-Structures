package pkoder.dsa.array;

//when object of subclass is made it calls constructor of both parent and child
//when both constructors are parameterized it calls para const of sub and default of parent
//if super(para) then it calls para const of sub and parent
//if super(para) in non para of sub then it calls default const of sub and para const parent
//because super is given by compiler in both para and non para constructor of sub
class Arrayone extends Array{
	
    Arrayone(int length){
    	super(length);
    }
    public int max(){
        int m=items[0];
        for(int i=1;i<items.length;i++)
            if (items[i]>m)
                m = items[i];
        return m;
    }
}
public class ArrayMax {
    public static void main(String[] args) {
        Arrayone  b = new Arrayone (3);
        b.insert(1);
        b.insert(85);
        b.insert(14);
        b.print();
        System.out.println(b.max());
    }
}