package services;

public class TaxBrazilService extends TaxService {

    @Override
    public double tax(double amount){
        return amount * 0.3;
    }
}
