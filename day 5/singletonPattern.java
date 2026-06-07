public class singletonPattern {
    public static void main(String[] args){
        KYC kyc = KYC.geKyc(); //example of singleton pattern, where we cant create multiple objects, hence we call getKyc() function
        kyc.name="ABCD";
        kyc.contact=483922912L; //long int
    }
}

class KYC{
    String name; 
    long contact;
    private static KYC kyc = new KYC();

    public static KYC geKyc(){
        return kyc;
    }
    private KYC (){} //a private constructor
}
