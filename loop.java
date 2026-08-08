public class loop {
    
    public static void main(String[] args) {
    //for(int i=0; i<=5 ; i++){
    //    System.out.println("HII");
    //}


    for(int i=1; i<=10 ; i +=  2){
        System.out.println(i);
    }

    for(int i=1; i<=5 ; i++){
        for(int j=1; j<=5 ; j++){
            System.out.print("* ");
        }
        System.out.println();
    } 

System.out.println();
    for(int i=1; i<=3; i++){
        for(int j=1; j<=3; j++){
            System.out.println("i= "+i+" j= "+j);
        }

    }
System.out.println();

    for(int i=1; i<=10; i++){
        if(i==5){
            break;
        }
        System.out.println(i);
        }
System.out.println();


        for(int i=1; i<=10; i++){
        if(i==5){
            continue;
        }
        System.out.println(i);
        }
 System.out.println();

    int i=1;
    while(i<=5){
        System.out.println(i);
        i++;
    }
System.out.println();


    int i1=1;
    do{

        System.out.println(i1);
        i1++;
        }
        while(i1<=5);
        System.out.println();


    int sum = 0;
    for(int n=1; n<=10; n++){
        sum=sum+n;

    }
    System.out.println(sum);



    System.out.println();


    int prime=0;
    for(int p=1; p<=100; p++){
        if(prime%p == 0){
            break;
        }
        System.out.println("Total prime numbers are: "+prime);
    }

    } 
}