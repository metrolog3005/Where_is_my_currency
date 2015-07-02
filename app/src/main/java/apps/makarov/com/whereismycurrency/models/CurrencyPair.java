package apps.makarov.com.whereismycurrency.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by makarov on 02/07/15.
 */

public class CurrencyPair extends RealmObject{

    @PrimaryKey
    private String key;
    private String baseCurrency;
    private String compareCurrency;

    public CurrencyPair(){
    }

    public String getCompareCurrency() {
        return compareCurrency;
    }

    public void setCompareCurrency(String compareCurrency) {
        this.compareCurrency = compareCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public static String generateKey(CurrencyPair pair) {
        return pair.getBaseCurrency() + "_" + pair.getCompareCurrency();
    }

    public static CurrencyPair createPair(String baseCurrency, String compareCurrency){
        CurrencyPair pair = new CurrencyPair();
        pair.setBaseCurrency(baseCurrency);
        pair.setCompareCurrency(compareCurrency);
        pair.setKey(CurrencyPair.generateKey(pair));
        return pair;
    }
}
