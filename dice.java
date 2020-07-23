class dice
{
    public static void main()
    {   int d=(int)(Math.random()*6+1);

        if(d==6)
            System.out.println("[:::]");
        else if(d==5)
            System.out.println("[:.:]");
        else if(d==4)
            System.out.println("[::]");
        else if(d==3)
            System.out.println("[...]");
        else if(d==2)
            System.out.println("[..]");
        else if(d==1)
            System.out.println("[.]");
            }

}