package com.revenuecat.purchases.common.offerings;

import com.daaw.AbstractC10146zQ0;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC4192e90;
import com.daaw.BY0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.NQ;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJW\u0010\u0017\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2$\u0010\u0014\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\u0004\u0012\u00020\u00130\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001b\u001a\u0004\u0018\u00010\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001f\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u000f2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006#"}, d2 = {"Lcom/revenuecat/purchases/common/offerings/OfferingsFactory;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/OfferingParser;", "offeringParser", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/OfferingParser;)V", "Lorg/json/JSONObject;", "offeringsJSON", "", "", "extractProductIdentifiers", "(Lorg/json/JSONObject;)Ljava/util/Set;", "productIds", "Lkotlin/Function1;", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/daaw/G91;", "onCompleted", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getStoreProductsById", "(Ljava/util/Set;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "allProductIdsInOfferings", "storeProductByID", "logMissingProducts", "(Ljava/util/Set;Ljava/util/Map;)Lcom/daaw/G91;", "Lcom/revenuecat/purchases/Offerings;", "onSuccess", "createOfferings", "(Lorg/json/JSONObject;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/OfferingParser;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OfferingsFactory {
    private final BillingAbstract billing;
    private final OfferingParser offeringParser;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "productsById", "Lcom/daaw/G91;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ Set<String> $allRequestedProductIdentifiers;
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Set<String> set, JSONObject jSONObject, NQ nq, NQ nq2) {
            super(1);
            this.$allRequestedProductIdentifiers = set;
            this.$offeringsJSON = jSONObject;
            this.$onError = nq;
            this.$onSuccess = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
            invoke((Map<String, ? extends List<? extends StoreProduct>>) obj);
            return G91.a;
        }

        public final void invoke(Map<String, ? extends List<? extends StoreProduct>> map) throws JSONException {
            G10.g(map, "productsById");
            OfferingsFactory.this.logMissingProducts(this.$allRequestedProductIdentifiers, map);
            Offerings offeringsCreateOfferings = OfferingsFactory.this.offeringParser.createOfferings(this.$offeringsJSON, map);
            if (offeringsCreateOfferings.getAll().isEmpty()) {
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND));
            } else {
                this.$onSuccess.invoke(offeringsCreateOfferings);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass2 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NQ nq) {
            super(1);
            this.$onError = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "subscriptionProducts", "Lcom/daaw/G91;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103541 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onCompleted;
        final /* synthetic */ NQ $onError;
        final /* synthetic */ Set<String> $productIds;
        final /* synthetic */ OfferingsFactory this$0;

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "inAppProducts", "Lcom/daaw/G91;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02851 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ NQ $onCompleted;
            final /* synthetic */ Map<String, List<StoreProduct>> $productsById;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02851(Map<String, List<StoreProduct>> map, NQ nq) {
                super(1);
                this.$productsById = map;
                this.$onCompleted = nq;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends StoreProduct>) obj);
                return G91.a;
            }

            public final void invoke(List<? extends StoreProduct> list) {
                G10.g(list, "inAppProducts");
                Map<String, List<StoreProduct>> map = this.$productsById;
                List<? extends StoreProduct> list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
                for (StoreProduct storeProduct : list2) {
                    arrayList.add(D61.a(storeProduct.getPurchasingData().getProductId(), AbstractC1496Lm.e(storeProduct)));
                }
                AbstractC1473Lg0.p(map, arrayList);
                this.$onCompleted.invoke(this.$productsById);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass2 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ NQ $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(NQ nq) {
                super(1);
                this.$onError = nq;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PurchasesError) obj);
                return G91.a;
            }

            public final void invoke(PurchasesError purchasesError) {
                G10.g(purchasesError, "it");
                this.$onError.invoke(purchasesError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103541(Set<String> set, OfferingsFactory offeringsFactory, NQ nq, NQ nq2) {
            super(1);
            this.$productIds = set;
            this.this$0 = offeringsFactory;
            this.$onCompleted = nq;
            this.$onError = nq2;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends StoreProduct>) obj);
            return G91.a;
        }

        public final void invoke(List<? extends StoreProduct> list) {
            G10.g(list, "subscriptionProducts");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String productId = ((StoreProduct) obj).getPurchasingData().getProductId();
                Object arrayList = linkedHashMap.get(productId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(productId, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Map mapX = AbstractC1473Lg0.x(linkedHashMap);
            Set<String> setH = AbstractC10146zQ0.h(this.$productIds, mapX.keySet());
            if (setH.isEmpty()) {
                this.$onCompleted.invoke(mapX);
            } else {
                this.this$0.billing.queryProductDetailsAsync(ProductType.INAPP, setH, new C02851(mapX, this.$onCompleted), new AnonymousClass2(this.$onError));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103552 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103552(NQ nq) {
            super(1);
            this.$onError = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "it");
            this.$onError.invoke(purchasesError);
        }
    }

    public OfferingsFactory(BillingAbstract billingAbstract, OfferingParser offeringParser) {
        G10.g(billingAbstract, "billing");
        G10.g(offeringParser, "offeringParser");
        this.billing = billingAbstract;
        this.offeringParser = offeringParser;
    }

    private final Set<String> extractProductIdentifiers(JSONObject offeringsJSON) throws JSONException {
        JSONArray jSONArray = offeringsJSON.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String strOptString = jSONArray2.getJSONObject(i2).optString("platform_product_identifier");
                G10.f(strOptString, "it");
                if (BY0.O(strOptString)) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    linkedHashSet.add(strOptString);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set<String> productIds, NQ onCompleted, NQ onError) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, productIds, new C103541(productIds, this, onCompleted, onError), new C103552(onError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G91 logMissingProducts(Set<String> allProductIdsInOfferings, Map<String, ? extends List<? extends StoreProduct>> storeProductByID) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : allProductIdsInOfferings) {
            if (!storeProductByID.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
        if (arrayList2 == null) {
            return null;
        }
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        String str = String.format(OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, Arrays.copyOf(new Object[]{AbstractC2455Um.n0(arrayList2, ", ", null, null, 0, null, null, 62, null)}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        return G91.a;
    }

    public final void createOfferings(JSONObject offeringsJSON, NQ onError, NQ onSuccess) {
        NQ nq;
        JSONException jSONException;
        G10.g(offeringsJSON, "offeringsJSON");
        G10.g(onError, "onError");
        G10.g(onSuccess, "onSuccess");
        try {
            Set<String> setExtractProductIdentifiers = extractProductIdentifiers(offeringsJSON);
            if (setExtractProductIdentifiers.isEmpty()) {
                try {
                    onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS));
                    return;
                } catch (JSONException e) {
                    jSONException = e;
                    nq = onError;
                }
            } else {
                nq = onError;
                try {
                    getStoreProductsById(setExtractProductIdentifiers, new AnonymousClass1(setExtractProductIdentifiers, offeringsJSON, nq, onSuccess), new AnonymousClass2(nq));
                    return;
                } catch (JSONException e2) {
                    e = e2;
                }
            }
        } catch (JSONException e3) {
            e = e3;
            nq = onError;
        }
        jSONException = e;
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{jSONException.getLocalizedMessage()}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        nq.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, jSONException.getLocalizedMessage()));
    }
}
