package com.revenuecat.purchases.google;

import com.android.billingclient.api.f;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC1703Nm;
import com.daaw.G10;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/android/billingclient/api/f;", "Lcom/revenuecat/purchases/models/StoreProduct;", "toInAppStoreProduct", "(Lcom/android/billingclient/api/f;)Lcom/revenuecat/purchases/models/StoreProduct;", "", "Lcom/android/billingclient/api/f$e;", "offerDetails", "Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toStoreProduct", "(Lcom/android/billingclient/api/f;Ljava/util/List;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/Price;", "createOneTimeProductPrice", "(Lcom/android/billingclient/api/f;)Lcom/revenuecat/purchases/models/Price;", "toStoreProducts", "(Ljava/util/List;)Ljava/util/List;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(com.android.billingclient.api.f fVar) {
        f.b bVarB;
        if (ProductTypeConversionsKt.toRevenueCatProductType(fVar.d()) != ProductType.INAPP || (bVarB = fVar.b()) == null) {
            return null;
        }
        String strA = bVarB.a();
        G10.f(strA, "it.formattedPrice");
        long jB = bVarB.b();
        String strC = bVarB.c();
        G10.f(strC, "it.priceCurrencyCode");
        return new Price(strA, jB, strC);
    }

    public static final StoreProduct toInAppStoreProduct(com.android.billingclient.api.f fVar) {
        G10.g(fVar, "<this>");
        return toStoreProduct(fVar, AbstractC1599Mm.k());
    }

    public static final GoogleStoreProduct toStoreProduct(com.android.billingclient.api.f fVar, List<f.e> list) {
        SubscriptionOptions subscriptionOptions;
        PricingPhase fullPricePhase;
        G10.g(fVar, "<this>");
        G10.g(list, "offerDetails");
        if (ProductTypeConversionsKt.toRevenueCatProductType(fVar.d()) == ProductType.SUBS) {
            List<f.e> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
            for (f.e eVar : list2) {
                String strC = fVar.c();
                G10.f(strC, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(eVar, strC, fVar));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price priceCreateOneTimeProductPrice = createOneTimeProductPrice(fVar);
        if (priceCreateOneTimeProductPrice != null) {
            price = priceCreateOneTimeProductPrice;
        } else if (price == null) {
            return null;
        }
        SubscriptionOption subscriptionOption = basePlan;
        Price price2 = price;
        String strC2 = fVar.c();
        G10.f(strC2, "productId");
        String id = subscriptionOption != null ? subscriptionOption.getId() : null;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(fVar.d());
        String strF = fVar.f();
        G10.f(strF, "title");
        String str = id;
        String strA = fVar.a();
        G10.f(strA, "description");
        return new GoogleStoreProduct(strC2, str, revenueCatProductType, price2, strF, strA, subscriptionOption != null ? subscriptionOption.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, fVar, null);
    }

    public static final List<StoreProduct> toStoreProducts(List<com.android.billingclient.api.f> list) {
        List listK;
        Map mapH;
        G10.g(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (com.android.billingclient.api.f fVar : list) {
            List listE = fVar.e();
            if (listE != null) {
                G10.f(listE, "subscriptionOfferDetails");
                listK = new ArrayList();
                for (Object obj : listE) {
                    f.e eVar = (f.e) obj;
                    G10.f(eVar, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(eVar)) {
                        listK.add(obj);
                    }
                }
            } else {
                listK = AbstractC1599Mm.k();
            }
            List listE2 = fVar.e();
            if (listE2 != null) {
                G10.f(listE2, "subscriptionOfferDetails");
                mapH = new LinkedHashMap();
                for (Object obj2 : listE2) {
                    String strA = ((f.e) obj2).a();
                    Object arrayList2 = mapH.get(strA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        mapH.put(strA, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
            } else {
                mapH = AbstractC1473Lg0.h();
            }
            if (listK.isEmpty()) {
                listK = null;
            }
            if (listK != null) {
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    List listK2 = (List) mapH.get(((f.e) it.next()).a());
                    if (listK2 == null) {
                        listK2 = AbstractC1599Mm.k();
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(fVar, listK2);
                    if (storeProduct != null) {
                        arrayList.add(storeProduct);
                    } else {
                        LogIntent logIntent = LogIntent.RC_ERROR;
                        String str = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{fVar.c()}, 1));
                        G10.f(str, "format(this, *args)");
                        LogWrapperKt.log(logIntent, str);
                    }
                }
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(fVar);
                if (inAppStoreProduct != null) {
                    arrayList.add(inAppStoreProduct);
                } else {
                    LogIntent logIntent2 = LogIntent.RC_ERROR;
                    String str2 = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{fVar.c()}, 1));
                    G10.f(str2, "format(this, *args)");
                    LogWrapperKt.log(logIntent2, str2);
                }
            }
        }
        return arrayList;
    }
}
