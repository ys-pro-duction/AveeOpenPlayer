package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductType;
import com.daaw.AY0;
import com.daaw.AbstractC10178zY0;
import com.daaw.AbstractC2455Um;
import com.daaw.BY0;
import com.daaw.DY0;
import com.daaw.G10;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"pattern", "Ljava/util/regex/Pattern;", "createPeriod", "Lcom/revenuecat/purchases/models/Period;", "", "createPrice", "Lcom/revenuecat/purchases/models/Price;", "marketplace", "parsePriceUsingRegex", "Ljava/math/BigDecimal;", "toStoreProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/amazon/device/iap/model/Product;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StoreProductConversionsKt {
    private static final Pattern pattern;

    static {
        Pattern patternCompile = Pattern.compile("(\\d+[[\\.,\\s]\\d+]*)");
        G10.f(patternCompile, "compile(\"(\\\\d+[[\\\\.,\\\\s]\\\\d+]*)\")");
        pattern = patternCompile;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Period createPeriod(String str) {
        String str2;
        Integer numG;
        G10.g(str, "<this>");
        switch (str.hashCode()) {
            case -2115097178:
                if (str.equals("BiMonthly")) {
                    return new Period(2, Period.Unit.MONTH, "P2M");
                }
                break;
            case -1707840351:
                if (str.equals("Weekly")) {
                    return new Period(1, Period.Unit.WEEK, "P1W");
                }
                break;
            case -1393678355:
                if (str.equals("Monthly")) {
                    return new Period(1, Period.Unit.MONTH, "P1M");
                }
                break;
            case -580032564:
                if (str.equals("Annually")) {
                    return new Period(1, Period.Unit.YEAR, "P1Y");
                }
                break;
            case -308855462:
                if (str.equals("SemiAnnually")) {
                    return new Period(6, Period.Unit.MONTH, "P6M");
                }
                break;
            case 347098056:
                if (str.equals("BiWeekly")) {
                    return new Period(2, Period.Unit.WEEK, "P2W");
                }
                break;
            case 937940249:
                if (str.equals("Quarterly")) {
                    return new Period(3, Period.Unit.MONTH, "P3M");
                }
                break;
        }
        List listG0 = BY0.g0(str, new String[]{" "}, false, 0, 6, null);
        if (listG0.size() != 2) {
            listG0 = null;
        }
        if (listG0 == null || (str2 = (String) AbstractC2455Um.g0(listG0)) == null || (numG = AbstractC10178zY0.g(str2)) == null) {
            return null;
        }
        int iIntValue = numG.intValue();
        String strValueOf = String.valueOf(DY0.G0((CharSequence) listG0.get(1)));
        G10.e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        G10.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return Period.INSTANCE.create('P' + iIntValue + upperCase);
    }

    public static final Price createPrice(String str, String str2) {
        G10.g(str, "<this>");
        G10.g(str2, "marketplace");
        BigDecimal priceUsingRegex = parsePriceUsingRegex(str);
        if (priceUsingRegex == null) {
            priceUsingRegex = BigDecimal.ZERO;
        }
        G10.f(priceUsingRegex, "priceNumeric");
        BigDecimal bigDecimalMultiply = priceUsingRegex.multiply(new BigDecimal(UtilsKt.MICROS_MULTIPLIER));
        G10.f(bigDecimalMultiply, "this.multiply(other)");
        return new Price(str, bigDecimalMultiply.longValue(), ISO3166Alpha2ToISO42170Converter.INSTANCE.convertOrEmpty(str2));
    }

    public static final BigDecimal parsePriceUsingRegex(String str) {
        String strS;
        G10.g(str, "<this>");
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? matcher : null) == null) {
            return null;
        }
        String strGroup = matcher.group();
        G10.f(strGroup, "dirtyPrice");
        String string = BY0.D0(AY0.s(AY0.s(AY0.s(strGroup, " ", "", false, 4, null), " ", "", false, 4, null), " ", "", false, 4, null)).toString();
        List listG0 = BY0.g0(string, new String[]{".", ","}, false, 0, 6, null);
        if (listG0.size() != 1) {
            if (((String) AbstractC2455Um.p0(listG0)).length() == 3) {
                strS = AY0.s(AY0.s(string, ".", "", false, 4, null), ",", "", false, 4, null);
            } else {
                strS = AbstractC2455Um.n0(AbstractC2455Um.Z(listG0, 1), "", null, null, 0, null, null, 62, null) + '.' + ((String) AbstractC2455Um.p0(listG0));
            }
            string = strS;
        }
        return new BigDecimal(BY0.D0(string).toString());
    }

    public static final StoreProduct toStoreProduct(Product product, String str) {
        G10.g(product, "<this>");
        G10.g(str, "marketplace");
        if (product.getPrice() == null) {
            LogIntent logIntent = LogIntent.AMAZON_ERROR;
            String str2 = String.format(AmazonStrings.PRODUCT_PRICE_MISSING, Arrays.copyOf(new Object[]{product.getSku()}, 1));
            G10.f(str2, "format(this, *args)");
            LogWrapperKt.log(logIntent, str2);
            return null;
        }
        String price = product.getPrice();
        G10.f(price, "price");
        Price priceCreatePrice = createPrice(price, str);
        String sku = product.getSku();
        G10.f(sku, ProxyAmazonBillingActivity.EXTRAS_SKU);
        ProductType productType = product.getProductType();
        G10.f(productType, "productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        String title = product.getTitle();
        G10.f(title, "title");
        String description = product.getDescription();
        G10.f(description, "description");
        String subscriptionPeriod = product.getSubscriptionPeriod();
        Period periodCreatePeriod = subscriptionPeriod != null ? createPeriod(subscriptionPeriod) : null;
        String smallIconUrl = product.getSmallIconUrl();
        G10.f(smallIconUrl, "smallIconUrl");
        String freeTrialPeriod = product.getFreeTrialPeriod();
        Period periodCreatePeriod2 = freeTrialPeriod != null ? createPeriod(freeTrialPeriod) : null;
        JSONObject json = product.toJSON();
        G10.f(json, "this.toJSON()");
        return new AmazonStoreProduct(sku, revenueCatProductType, title, description, periodCreatePeriod, priceCreatePrice, null, null, smallIconUrl, periodCreatePeriod2, json, null);
    }
}
