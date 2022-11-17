public class Main {
    public static void main(String[] args) {

        // İNTERFACE LER ASLA NEWLENEMEZ !

        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();

        // interface onu implemente eden class ın referans ını tutabilir.


    }
}