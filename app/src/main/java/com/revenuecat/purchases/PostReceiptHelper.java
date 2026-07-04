package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC3986dR;
import com.daaw.LQ;
import com.daaw.NQ;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.subscriberattributes.BackendHelpersKt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0085\u0001\u0010'\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2$\u0010&\u001a \u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020\u001f0!j\u0002`%H\u0002¢\u0006\u0004\b'\u0010(JA\u0010+\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0*H\u0002¢\u0006\u0004\b+\u0010,J?\u0010-\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002¢\u0006\u0004\b-\u0010.Jq\u0010/\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\b/\u00100J\u007f\u00108\u001a\u00020\u001f2\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\"\b\u0002\u0010 \u001a\u001c\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u000105j\u0004\u0018\u0001`62\"\b\u0002\u0010&\u001a\u001c\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001f\u0018\u000105j\u0004\u0018\u0001`7¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0014\u0010C\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;)V", "", "appUserID", "purchaseToken", "", "isRestore", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "storeUserID", "marketplace", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/daaw/G91;", "onSuccess", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "onError", "postReceiptAndSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/daaw/NQ;Lcom/daaw/dR;)V", "errorHandlingBehavior", "Lkotlin/Function0;", "useOfflineEntitlementsCustomerInfoIfNeeded", "(Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/LQ;)V", "calculateOfflineCustomerInfo", "(Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "postTokenWithoutConsuming", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;ZLjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "postTransactionAndConsumeIfNeeded", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/daaw/bR;Lcom/daaw/bR;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "getFinishTransactions", "()Z", "finishTransactions", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    private final Backend backend;
    private final BillingAbstract billing;
    private final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    private final DeviceCache deviceCache;
    private final OfflineEntitlementsManager offlineEntitlementsManager;
    private final SubscriberAttributesManager subscriberAttributesManager;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NQ nq) {
            super(1);
            this.$onSuccess = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return G91.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            G10.g(customerInfo, "customerInfo");
            PostReceiptHelper.this.customerInfoUpdateHandler.notifyListeners(customerInfo);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$calculateOfflineCustomerInfo$2, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "unsyncedSubscriberAttributesByKey", "Lcom/daaw/G91;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103191 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ PostReceiptInitiationSource $initiationSource;
        final /* synthetic */ boolean $isRestore;
        final /* synthetic */ String $marketplace;
        final /* synthetic */ InterfaceC3986dR $onError;
        final /* synthetic */ NQ $onSuccess;
        final /* synthetic */ String $purchaseToken;
        final /* synthetic */ ReceiptInfo $receiptInfo;
        final /* synthetic */ String $storeUserID;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lorg/json/JSONObject;", "responseBody", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02751 extends AbstractC4192e90 implements InterfaceC3429bR {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ NQ $onSuccess;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02751(PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, NQ nq) {
                super(2);
                this.this$0 = postReceiptHelper;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onSuccess = nq;
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CustomerInfo) obj, (JSONObject) obj2);
                return G91.a;
            }

            public final void invoke(CustomerInfo customerInfo, JSONObject jSONObject) {
                G10.g(customerInfo, "customerInfo");
                G10.g(jSONObject, "responseBody");
                this.this$0.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
                this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                this.this$0.customerInfoUpdateHandler.cacheAndNotifyListeners(customerInfo);
                this.$onSuccess.invoke(customerInfo);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postReceiptAndSubscriberAttributes$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "responseBody", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass2 extends AbstractC4192e90 implements InterfaceC3986dR {
            final /* synthetic */ String $appUserID;
            final /* synthetic */ InterfaceC3986dR $onError;
            final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedSubscriberAttributesByKey;
            final /* synthetic */ PostReceiptHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PostReceiptHelper postReceiptHelper, String str, Map<String, SubscriberAttribute> map, InterfaceC3986dR interfaceC3986dR) {
                super(3);
                this.this$0 = postReceiptHelper;
                this.$appUserID = str;
                this.$unsyncedSubscriberAttributesByKey = map;
                this.$onError = interfaceC3986dR;
            }

            @Override // com.daaw.InterfaceC3986dR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
                return G91.a;
            }

            public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
                G10.g(purchasesError, "error");
                G10.g(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
                if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED) {
                    this.this$0.subscriberAttributesManager.markAsSynced(this.$appUserID, this.$unsyncedSubscriberAttributesByKey, BackendHelpersKt.getAttributeErrors(jSONObject));
                }
                this.$onError.invoke(purchasesError, postReceiptErrorHandlingBehavior, jSONObject);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103191(String str, String str2, boolean z, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, NQ nq, InterfaceC3986dR interfaceC3986dR) {
            super(1);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$isRestore = z;
            this.$receiptInfo = receiptInfo;
            this.$storeUserID = str3;
            this.$marketplace = str4;
            this.$initiationSource = postReceiptInitiationSource;
            this.$onSuccess = nq;
            this.$onError = interfaceC3986dR;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<String, SubscriberAttribute>) obj);
            return G91.a;
        }

        public final void invoke(Map<String, SubscriberAttribute> map) {
            G10.g(map, "unsyncedSubscriberAttributesByKey");
            PostReceiptHelper.this.backend.postReceiptData(this.$purchaseToken, this.$appUserID, this.$isRestore, !PostReceiptHelper.this.getFinishTransactions(), BackendHelpersKt.toBackendMap(map), this.$receiptInfo, this.$storeUserID, this.$marketplace, this.$initiationSource, new C02751(PostReceiptHelper.this, this.$appUserID, map, this.$onSuccess), new AnonymousClass2(PostReceiptHelper.this, this.$appUserID, map, this.$onError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103201 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ NQ $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103201(String str, NQ nq) {
            super(1);
            this.$purchaseToken = str;
            this.$onSuccess = nq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return G91.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            G10.g(customerInfo, "it");
            PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
            this.$onSuccess.invoke(customerInfo);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103212 extends AbstractC4192e90 implements InterfaceC3986dR {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ NQ $onError;
        final /* synthetic */ NQ $onSuccess;
        final /* synthetic */ String $purchaseToken;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ NQ $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NQ nq) {
                super(1);
                this.$onSuccess = nq;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return G91.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                G10.g(customerInfo, "it");
                this.$onSuccess.invoke(customerInfo);
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTokenWithoutConsuming$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02762 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ NQ $onError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02762(NQ nq, PurchasesError purchasesError) {
                super(0);
                this.$onError = nq;
                this.$backendError = purchasesError;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m76invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m76invoke() {
                this.$onError.invoke(this.$backendError);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103212(String str, String str2, NQ nq, NQ nq2) {
            super(3);
            this.$purchaseToken = str;
            this.$appUserID = str2;
            this.$onSuccess = nq;
            this.$onError = nq2;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            G10.g(purchasesError, "backendError");
            G10.g(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
            if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED) {
                PostReceiptHelper.this.deviceCache.addSuccessfullyPostedToken(this.$purchaseToken);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(postReceiptErrorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess), new C02762(this.$onError, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "info", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103221 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ InterfaceC3429bR $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103221(StoreTransaction storeTransaction, InterfaceC3429bR interfaceC3429bR) {
            super(1);
            this.$purchase = storeTransaction;
            this.$onSuccess = interfaceC3429bR;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return G91.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            G10.g(customerInfo, "info");
            PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase);
            InterfaceC3429bR interfaceC3429bR = this.$onSuccess;
            if (interfaceC3429bR != null) {
                interfaceC3429bR.invoke(this.$purchase, customerInfo);
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "errorHandlingBehavior", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103232 extends AbstractC4192e90 implements InterfaceC3986dR {
        final /* synthetic */ String $appUserID;
        final /* synthetic */ InterfaceC3429bR $onError;
        final /* synthetic */ InterfaceC3429bR $onSuccess;
        final /* synthetic */ StoreTransaction $purchase;

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
            final /* synthetic */ InterfaceC3429bR $onSuccess;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC3429bR interfaceC3429bR, StoreTransaction storeTransaction) {
                super(1);
                this.$onSuccess = interfaceC3429bR;
                this.$purchase = storeTransaction;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CustomerInfo) obj);
                return G91.a;
            }

            public final void invoke(CustomerInfo customerInfo) {
                G10.g(customerInfo, "customerInfo");
                InterfaceC3429bR interfaceC3429bR = this.$onSuccess;
                if (interfaceC3429bR != null) {
                    interfaceC3429bR.invoke(this.$purchase, customerInfo);
                }
            }
        }

        /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        public static final class C02772 extends AbstractC4192e90 implements LQ {
            final /* synthetic */ PurchasesError $backendError;
            final /* synthetic */ InterfaceC3429bR $onError;
            final /* synthetic */ StoreTransaction $purchase;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02772(InterfaceC3429bR interfaceC3429bR, StoreTransaction storeTransaction, PurchasesError purchasesError) {
                super(0);
                this.$onError = interfaceC3429bR;
                this.$purchase = storeTransaction;
                this.$backendError = purchasesError;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m77invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m77invoke() {
                InterfaceC3429bR interfaceC3429bR = this.$onError;
                if (interfaceC3429bR != null) {
                    interfaceC3429bR.invoke(this.$purchase, this.$backendError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103232(StoreTransaction storeTransaction, String str, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2) {
            super(3);
            this.$purchase = storeTransaction;
            this.$appUserID = str;
            this.$onSuccess = interfaceC3429bR;
            this.$onError = interfaceC3429bR2;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
            G10.g(purchasesError, "backendError");
            G10.g(postReceiptErrorHandlingBehavior, "errorHandlingBehavior");
            if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED) {
                PostReceiptHelper.this.billing.consumeAndSave(PostReceiptHelper.this.getFinishTransactions(), this.$purchase);
            }
            PostReceiptHelper.this.useOfflineEntitlementsCustomerInfoIfNeeded(postReceiptErrorHandlingBehavior, this.$appUserID, new AnonymousClass1(this.$onSuccess, this.$purchase), new C02772(this.$onError, this.$purchase, purchasesError));
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.PostReceiptHelper$useOfflineEntitlementsCustomerInfoIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class C103241 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ LQ $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103241(LQ lq) {
            super(1);
            this.$onError = lq;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "it");
            this.$onError.invoke();
        }
    }

    public PostReceiptHelper(AppConfig appConfig, Backend backend, BillingAbstract billingAbstract, CustomerInfoUpdateHandler customerInfoUpdateHandler, DeviceCache deviceCache, SubscriberAttributesManager subscriberAttributesManager, OfflineEntitlementsManager offlineEntitlementsManager) {
        G10.g(appConfig, "appConfig");
        G10.g(backend, "backend");
        G10.g(billingAbstract, "billing");
        G10.g(customerInfoUpdateHandler, "customerInfoUpdateHandler");
        G10.g(deviceCache, "deviceCache");
        G10.g(subscriberAttributesManager, "subscriberAttributesManager");
        G10.g(offlineEntitlementsManager, "offlineEntitlementsManager");
        this.appConfig = appConfig;
        this.backend = backend;
        this.billing = billingAbstract;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler;
        this.deviceCache = deviceCache;
        this.subscriberAttributesManager = subscriberAttributesManager;
        this.offlineEntitlementsManager = offlineEntitlementsManager;
    }

    private final void calculateOfflineCustomerInfo(String appUserID, NQ onSuccess, NQ onError) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(appUserID, new AnonymousClass1(onSuccess), new AnonymousClass2(onError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final void postReceiptAndSubscriberAttributes(String appUserID, String purchaseToken, boolean isRestore, ReceiptInfo receiptInfo, String storeUserID, String marketplace, PostReceiptInitiationSource initiationSource, NQ onSuccess, InterfaceC3986dR onError) {
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(appUserID, new C103191(purchaseToken, appUserID, isRestore, receiptInfo, storeUserID, marketplace, initiationSource, onSuccess, onError));
    }

    public static /* synthetic */ void postTransactionAndConsumeIfNeeded$default(PostReceiptHelper postReceiptHelper, StoreTransaction storeTransaction, StoreProduct storeProduct, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2, int i, Object obj) {
        if ((i & 32) != 0) {
            interfaceC3429bR = null;
        }
        if ((i & 64) != 0) {
            interfaceC3429bR2 = null;
        }
        postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, storeProduct, z, str, postReceiptInitiationSource, interfaceC3429bR, interfaceC3429bR2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior errorHandlingBehavior, String appUserID, NQ onSuccess, LQ onError) {
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(errorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME)) {
            calculateOfflineCustomerInfo(appUserID, onSuccess, new C103241(onError));
        } else {
            onError.invoke();
        }
    }

    public final void postTokenWithoutConsuming(String purchaseToken, String storeUserID, ReceiptInfo receiptInfo, boolean isRestore, String appUserID, String marketplace, PostReceiptInitiationSource initiationSource, NQ onSuccess, NQ onError) {
        G10.g(purchaseToken, "purchaseToken");
        G10.g(receiptInfo, "receiptInfo");
        G10.g(appUserID, "appUserID");
        G10.g(initiationSource, "initiationSource");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        postReceiptAndSubscriberAttributes(appUserID, purchaseToken, isRestore, receiptInfo, storeUserID, marketplace, initiationSource, new C103201(purchaseToken, onSuccess), new C103212(purchaseToken, appUserID, onSuccess, onError));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction purchase, StoreProduct storeProduct, boolean isRestore, String appUserID, PostReceiptInitiationSource initiationSource, InterfaceC3429bR onSuccess, InterfaceC3429bR onError) {
        G10.g(purchase, "purchase");
        G10.g(appUserID, "appUserID");
        G10.g(initiationSource, "initiationSource");
        postReceiptAndSubscriberAttributes(appUserID, purchase.getPurchaseToken(), isRestore, new ReceiptInfo(purchase.getProductIds(), purchase.getPresentedOfferingIdentifier(), purchase.getSubscriptionOptionId(), storeProduct, null, null, purchase.getReplacementMode(), 48, null), purchase.getStoreUserID(), purchase.getMarketplace(), initiationSource, new C103221(purchase, onSuccess), new C103232(purchase, appUserID, onSuccess, onError));
    }
}
