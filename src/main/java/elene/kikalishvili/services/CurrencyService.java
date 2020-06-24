package elene.kikalishvili.services;

import elene.kikalishvili.model.Currency;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class CurrencyService {
  public   List<Currency> currencyList=new ArrayList<Currency>();
    public List<Currency> getCurrencies(){
        currencyList.add(new Currency(1.0754, "jsjsds"));
        return currencyList;
    }

    @WebMethod
    public Currency getCurrency(Double cur) throws Exception {
        for (Currency i : currencyList) {
            if (i.getCur().equals(cur)) {
                return i;
            }
        }

        throw new Exception("error message");
    }

    @WebMethod
    public String getCurrencyDescription(Double cur) throws Exception {
        for (Currency i : currencyList) {
            if (i.getCur().equals(cur)) {
                return i.getDescription();
            }
        }

        throw new Exception("error message");
    }
}
