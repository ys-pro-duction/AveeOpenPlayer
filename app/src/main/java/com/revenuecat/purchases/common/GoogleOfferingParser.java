package com.revenuecat.purchases.common;

import com.daaw.AbstractC2455Um;
import com.daaw.G10;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u00062\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/GoogleOfferingParser;", "Lcom/revenuecat/purchases/common/OfferingParser;", "()V", "findMatchingProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "", "", "", "packageJson", "Lorg/json/JSONObject;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GoogleOfferingParser extends OfferingParser {
    @Override // com.revenuecat.purchases.common.OfferingParser
    public StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> productsById, JSONObject packageJson) throws JSONException {
        SubscriptionOption basePlan;
        G10.g(productsById, "productsById");
        G10.g(packageJson, "packageJson");
        String string = packageJson.getString("platform_product_identifier");
        String strOptString = packageJson.optString("platform_product_plan_identifier");
        G10.f(strOptString, "it");
        Object obj = null;
        if (strOptString.length() <= 0) {
            strOptString = null;
        }
        List<? extends StoreProduct> list = productsById.get(string);
        if (strOptString == null) {
            if (list == null || list.size() != 1) {
                list = null;
            }
            if (list != null) {
                if (list.get(0).getType() != ProductType.INAPP) {
                    list = null;
                }
                if (list != null) {
                    return (StoreProduct) AbstractC2455Um.g0(list);
                }
            }
            return null;
        }
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            SubscriptionOptions subscriptionOptions = ((StoreProduct) next).getSubscriptionOptions();
            if (G10.c((subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null) ? null : basePlan.getId(), strOptString)) {
                obj = next;
                break;
            }
        }
        return (StoreProduct) obj;
    }
}
