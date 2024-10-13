public class SieveOfErathothenes_CountPrime {
    public static void main(String[] args) {
        int n=225;
        int p= countPrime(n);
        System.out.println("The factors are of "+ n + " is: "+p);
    }

    private static int countPrime(int n){
        boolean [] isPrimeFact=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            isPrimeFact[i]=true;
        }
        if(n<=2){
            return 0;
        }
        for(int i=2;i<n;i++){
            if(isPrimeFact[i]==true && n%i==0){
                count++;
                for(int j=2*i;j<n;j=j+i){
                    isPrimeFact[j]=false;
                }
            }
        }
        return count;
    }
}
