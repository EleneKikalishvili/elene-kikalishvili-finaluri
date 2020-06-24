package elene.kikalishvili.services;

import elene.kikalishvili.model.Currency;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CurrencyService {
    public List<Currency> getCurrencies(){
        List<Currency> currencyList=new ArrayList<Currency>();
        currencyList.add(new Currency("10
                ესტორნური კრონი", 1.0754));
        return currencyList;
    }

    @WebMethod
    public Currency getCurrency(){
        return new Currency(1,"zura",24);
    }
    @WebMethod
    public void getCurrencyDescription(Currency currency){
        System.out.println(currency);
    }
}
