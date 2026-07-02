package com.revenuecat.purchases;

import android.app.Activity;
import android.content.Context;
import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC9588xQ0;
import com.daaw.E91;
import com.daaw.G10;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleProrationMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.ConfigureStrings;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0094\u00012\u00020\u0001:\u0002\u0094\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u001e\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\"J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020%¢\u0006\u0004\b&\u0010'J/\u0010/\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020.H\u0007¢\u0006\u0004\b/\u00100J'\u0010/\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020%H\u0007¢\u0006\u0004\b/\u00101J/\u00104\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020.H\u0007¢\u0006\u0004\b4\u00105J'\u00104\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020%H\u0007¢\u0006\u0004\b4\u00106J\u0015\u00108\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u000207¢\u0006\u0004\b8\u00109J#\u0010<\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u000107H\u0007¢\u0006\u0004\b>\u00109J\r\u0010?\u001a\u00020\u0006¢\u0006\u0004\b?\u0010\bJ\u0015\u0010@\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u000207¢\u0006\u0004\b@\u00109J\u001d\u0010@\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010\u001d\u001a\u000207¢\u0006\u0004\b@\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010\bJ'\u0010G\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u000e\b\u0002\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u001aH\u0007¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0006¢\u0006\u0004\bI\u0010\bJ#\u0010L\u001a\u00020\u00062\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000e0J¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00062\b\u0010N\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\u00062\b\u0010Q\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bR\u0010PJ\u0017\u0010T\u001a\u00020\u00062\b\u0010S\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bT\u0010PJ\u0017\u0010V\u001a\u00020\u00062\b\u0010U\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bV\u0010PJ\u0017\u0010X\u001a\u00020\u00062\b\u0010W\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bX\u0010PJ\u0017\u0010Z\u001a\u00020\u00062\b\u0010Y\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bZ\u0010PJ\u0017\u0010\\\u001a\u00020\u00062\b\u0010[\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\\\u0010PJ\u0017\u0010^\u001a\u00020\u00062\b\u0010]\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b^\u0010PJ\r\u0010_\u001a\u00020\u0006¢\u0006\u0004\b_\u0010\bJ\u0017\u0010a\u001a\u00020\u00062\b\u0010`\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\ba\u0010PJ\u0017\u0010c\u001a\u00020\u00062\b\u0010b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bc\u0010PJ\u0017\u0010e\u001a\u00020\u00062\b\u0010d\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\be\u0010PJ\u0017\u0010g\u001a\u00020\u00062\b\u0010f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bg\u0010PJ\u0017\u0010i\u001a\u00020\u00062\b\u0010h\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bi\u0010PJ\u0017\u0010k\u001a\u00020\u00062\b\u0010j\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bk\u0010PJ\u0017\u0010m\u001a\u00020\u00062\b\u0010l\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bm\u0010PJ\u0017\u0010o\u001a\u00020\u00062\b\u0010n\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bo\u0010PJ\u0017\u0010q\u001a\u00020\u00062\b\u0010p\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bq\u0010PJ\u0017\u0010s\u001a\u00020\u00062\b\u0010r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bs\u0010PJ\u0017\u0010u\u001a\u00020\u00062\b\u0010t\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bu\u0010PJ%\u0010v\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bv\u0010\u001fJ%\u0010w\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\bw\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010x\u001a\u0004\by\u0010zR-\u0010\u0082\u0001\u001a\u00020{2\u0006\u0010|\u001a\u00020{8F@FX\u0087\u000e¢\u0006\u0014\u0012\u0005\b\u0081\u0001\u0010\b\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0085\u0001\u001a\u00020{2\u0006\u0010|\u001a\u00020{8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u0083\u0001\u0010~\"\u0006\b\u0084\u0001\u0010\u0080\u0001R\u0014\u0010\u0088\u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R/\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010|\u001a\u0005\u0018\u00010\u0089\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0013\u0010\u008f\u0001\u001a\u00020{8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010~R\u0015\u0010\u0093\u0001\u001a\u00030\u0090\u00018F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/LifecycleDelegate;", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "purchasesOrchestrator", "<init>", "(Lcom/revenuecat/purchases/PurchasesOrchestrator;)V", "Lcom/daaw/G91;", "onAppBackgrounded", "()V", "onAppForegrounded", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "listener", "syncPurchases", "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V", "", "productID", "receiptID", "amazonUserID", "isoCurrencyCode", "", "price", "syncObserverModeAmazonPurchase", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "getOfferings", "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;)V", "", "productIds", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "callback", "getProducts", "(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchase", "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lcom/revenuecat/purchases/UpgradeInfo;", "upgradeInfo", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "purchaseProduct", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/UpgradeInfo;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)V", "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "purchasePackage", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/UpgradeInfo;Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;)V", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "restorePurchases", "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "newAppUserID", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logIn", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V", "logOut", "close", "getCustomerInfo", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "removeUpdatedCustomerInfoListener", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;)V", "invalidateCustomerInfoCache", "", "attributes", "setAttributes", "(Ljava/util/Map;)V", "email", "setEmail", "(Ljava/lang/String;)V", "phoneNumber", "setPhoneNumber", "displayName", "setDisplayName", "fcmToken", "setPushToken", "mixpanelDistinctID", "setMixpanelDistinctID", "onesignalID", "setOnesignalID", "airshipChannelID", "setAirshipChannelID", "firebaseAppInstanceID", "setFirebaseAppInstanceID", "collectDeviceIdentifiers", "adjustID", "setAdjustID", "appsflyerID", "setAppsflyerID", "fbAnonymousID", "setFBAnonymousID", "mparticleID", "setMparticleID", "cleverTapID", "setCleverTapID", "mediaSource", "setMediaSource", "campaign", "setCampaign", "adGroup", "setAdGroup", "ad", "setAd", "keyword", "setKeyword", "creative", "setCreative", "getSubscriptionSkus", "getNonSubscriptionSkus", "Lcom/revenuecat/purchases/PurchasesOrchestrator;", "getPurchasesOrchestrator$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/PurchasesOrchestrator;", "", "value", "getAllowSharingPlayStoreAccount", "()Z", "setAllowSharingPlayStoreAccount", "(Z)V", "getAllowSharingPlayStoreAccount$annotations", "allowSharingPlayStoreAccount", "getFinishTransactions", "setFinishTransactions", "finishTransactions", "getAppUserID", "()Ljava/lang/String;", "appUserID", "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "getUpdatedCustomerInfoListener", "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;", "setUpdatedCustomerInfoListener", "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V", "updatedCustomerInfoListener", "isAnonymous", "Lcom/revenuecat/purchases/Store;", "getStore", "()Lcom/revenuecat/purchases/Store;", ProductResponseJsonKeys.STORE, "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Purchases implements LifecycleDelegate {
    private static /* synthetic */ Purchases backingFieldSharedInstance;
    private final PurchasesOrchestrator purchasesOrchestrator;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String frameworkVersion = "7.0.0";

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010!\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010(\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\"8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b'\u0010\u0003\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\u00020)2\u0006\u0010\u0015\u001a\u00020)8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b.\u0010\u0003\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00105\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068F@AX\u0087\u000e¢\u0006\u0012\u0012\u0004\b4\u0010\u0003\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00107\u001a\u0002068\u0006X\u0087D¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\u0003\u001a\u0004\b9\u0010:R.\u0010B\u001a\u0004\u0018\u00010<2\b\u0010\u0015\u001a\u0004\u0018\u00010<8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bA\u0010\u0003\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010C\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0003\u001a\u0004\bC\u0010\u001dR$\u0010E\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u00101\"\u0004\bH\u00103¨\u0006I"}, d2 = {"Lcom/revenuecat/purchases/Purchases$Companion;", "", "<init>", "()V", "Lcom/revenuecat/purchases/PurchasesConfiguration;", "configuration", "Lcom/revenuecat/purchases/Purchases;", "configure", "(Lcom/revenuecat/purchases/PurchasesConfiguration;)Lcom/revenuecat/purchases/Purchases;", "Landroid/content/Context;", "context", "", "Lcom/revenuecat/purchases/models/BillingFeature;", "features", "Lcom/revenuecat/purchases/interfaces/Callback;", "", "callback", "Lcom/daaw/G91;", "canMakePayments", "(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V", "Lcom/revenuecat/purchases/common/PlatformInfo;", "value", "getPlatformInfo", "()Lcom/revenuecat/purchases/common/PlatformInfo;", "setPlatformInfo", "(Lcom/revenuecat/purchases/common/PlatformInfo;)V", "getPlatformInfo$annotations", "platformInfo", "getDebugLogsEnabled", "()Z", "setDebugLogsEnabled", "(Z)V", "getDebugLogsEnabled$annotations", "debugLogsEnabled", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "getLogLevel$annotations", "logLevel", "Lcom/revenuecat/purchases/LogHandler;", "getLogHandler", "()Lcom/revenuecat/purchases/LogHandler;", "setLogHandler", "(Lcom/revenuecat/purchases/LogHandler;)V", "getLogHandler$annotations", "logHandler", "getSharedInstance", "()Lcom/revenuecat/purchases/Purchases;", "setSharedInstance$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/Purchases;)V", "getSharedInstance$annotations", "sharedInstance", "", "frameworkVersion", "Ljava/lang/String;", "getFrameworkVersion", "()Ljava/lang/String;", "getFrameworkVersion$annotations", "Ljava/net/URL;", "getProxyURL", "()Ljava/net/URL;", "setProxyURL", "(Ljava/net/URL;)V", "getProxyURL$annotations", "proxyURL", "isConfigured", "isConfigured$annotations", "backingFieldSharedInstance", "Lcom/revenuecat/purchases/Purchases;", "getBackingFieldSharedInstance$purchases_defaultsRelease", "setBackingFieldSharedInstance$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void canMakePayments$default(Companion companion, Context context, List list, Callback callback, int i, Object obj) {
            if ((i & 2) != 0) {
                list = AbstractC1599Mm.k();
            }
            companion.canMakePayments(context, list, callback);
        }

        public static /* synthetic */ void getDebugLogsEnabled$annotations() {
        }

        public static /* synthetic */ void getFrameworkVersion$annotations() {
        }

        public static /* synthetic */ void getLogHandler$annotations() {
        }

        public static /* synthetic */ void getLogLevel$annotations() {
        }

        public static /* synthetic */ void getPlatformInfo$annotations() {
        }

        public static /* synthetic */ void getProxyURL$annotations() {
        }

        public static /* synthetic */ void getSharedInstance$annotations() {
        }

        public static /* synthetic */ void isConfigured$annotations() {
        }

        public final void canMakePayments(Context context, Callback<Boolean> callback) {
            G10.g(context, "context");
            G10.g(callback, "callback");
            canMakePayments$default(this, context, null, callback, 2, null);
        }

        public final Purchases configure(PurchasesConfiguration configuration) {
            G10.g(configuration, "configuration");
            if (isConfigured()) {
                LogUtilsKt.infoLog(ConfigureStrings.INSTANCE_ALREADY_EXISTS);
            }
            Purchases purchasesCreatePurchases$default = PurchasesFactory.createPurchases$default(new PurchasesFactory(null, 1, 0 == true ? 1 : 0), configuration, getPlatformInfo(), getProxyURL(), null, false, false, false, 120, null);
            Purchases.INSTANCE.setSharedInstance$purchases_defaultsRelease(purchasesCreatePurchases$default);
            return purchasesCreatePurchases$default;
        }

        public final Purchases getBackingFieldSharedInstance$purchases_defaultsRelease() {
            return Purchases.backingFieldSharedInstance;
        }

        public final boolean getDebugLogsEnabled() {
            return PurchasesOrchestrator.INSTANCE.getDebugLogsEnabled();
        }

        public final String getFrameworkVersion() {
            return Purchases.frameworkVersion;
        }

        public final synchronized LogHandler getLogHandler() {
            return PurchasesOrchestrator.INSTANCE.getLogHandler();
        }

        public final LogLevel getLogLevel() {
            return PurchasesOrchestrator.INSTANCE.getLogLevel();
        }

        public final PlatformInfo getPlatformInfo() {
            return PurchasesOrchestrator.INSTANCE.getPlatformInfo();
        }

        public final URL getProxyURL() {
            return PurchasesOrchestrator.INSTANCE.getProxyURL();
        }

        public final Purchases getSharedInstance() {
            Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                return backingFieldSharedInstance$purchases_defaultsRelease;
            }
            throw new E91(ConfigureStrings.NO_SINGLETON_INSTANCE);
        }

        public final boolean isConfigured() {
            return getBackingFieldSharedInstance$purchases_defaultsRelease() != null;
        }

        public final void setBackingFieldSharedInstance$purchases_defaultsRelease(Purchases purchases) {
            Purchases.backingFieldSharedInstance = purchases;
        }

        public final void setDebugLogsEnabled(boolean z) {
            PurchasesOrchestrator.INSTANCE.setDebugLogsEnabled(z);
        }

        public final synchronized void setLogHandler(LogHandler logHandler) {
            G10.g(logHandler, "value");
            PurchasesOrchestrator.INSTANCE.setLogHandler(logHandler);
        }

        public final void setLogLevel(LogLevel logLevel) {
            G10.g(logLevel, "value");
            PurchasesOrchestrator.INSTANCE.setLogLevel(logLevel);
        }

        public final void setPlatformInfo(PlatformInfo platformInfo) {
            G10.g(platformInfo, "value");
            PurchasesOrchestrator.INSTANCE.setPlatformInfo(platformInfo);
        }

        public final void setProxyURL(URL url) {
            PurchasesOrchestrator.INSTANCE.setProxyURL(url);
        }

        public final void setSharedInstance$purchases_defaultsRelease(Purchases purchases) {
            G10.g(purchases, "value");
            Purchases backingFieldSharedInstance$purchases_defaultsRelease = getBackingFieldSharedInstance$purchases_defaultsRelease();
            if (backingFieldSharedInstance$purchases_defaultsRelease != null) {
                backingFieldSharedInstance$purchases_defaultsRelease.close();
            }
            setBackingFieldSharedInstance$purchases_defaultsRelease(purchases);
        }

        private Companion() {
        }

        public final void canMakePayments(Context context, List<? extends BillingFeature> features, Callback<Boolean> callback) {
            G10.g(context, "context");
            G10.g(features, "features");
            G10.g(callback, "callback");
            if (getSharedInstance().getPurchasesOrchestrator().getAppConfig().getStore() == Store.PLAY_STORE) {
                PurchasesOrchestrator.INSTANCE.canMakePayments(context, features, callback);
            } else {
                LogWrapperKt.log(LogIntent.RC_ERROR, BillingStrings.CANNOT_CALL_CAN_MAKE_PAYMENTS);
                callback.onReceived(Boolean.TRUE);
            }
        }
    }

    public Purchases(PurchasesOrchestrator purchasesOrchestrator) {
        G10.g(purchasesOrchestrator, "purchasesOrchestrator");
        this.purchasesOrchestrator = purchasesOrchestrator;
    }

    public static final void canMakePayments(Context context, Callback<Boolean> callback) {
        INSTANCE.canMakePayments(context, callback);
    }

    public static final Purchases configure(PurchasesConfiguration purchasesConfiguration) {
        return INSTANCE.configure(purchasesConfiguration);
    }

    public static /* synthetic */ void getAllowSharingPlayStoreAccount$annotations() {
    }

    public static final boolean getDebugLogsEnabled() {
        return INSTANCE.getDebugLogsEnabled();
    }

    public static final String getFrameworkVersion() {
        return INSTANCE.getFrameworkVersion();
    }

    public static final synchronized LogHandler getLogHandler() {
        return INSTANCE.getLogHandler();
    }

    public static final LogLevel getLogLevel() {
        return INSTANCE.getLogLevel();
    }

    public static final PlatformInfo getPlatformInfo() {
        return INSTANCE.getPlatformInfo();
    }

    public static /* synthetic */ void getProducts$default(Purchases purchases, List list, ProductType productType, GetStoreProductsCallback getStoreProductsCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            productType = null;
        }
        purchases.getProducts(list, productType, getStoreProductsCallback);
    }

    public static final URL getProxyURL() {
        return INSTANCE.getProxyURL();
    }

    public static final Purchases getSharedInstance() {
        return INSTANCE.getSharedInstance();
    }

    public static final boolean isConfigured() {
        return INSTANCE.isConfigured();
    }

    public static /* synthetic */ void logIn$default(Purchases purchases, String str, LogInCallback logInCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            logInCallback = null;
        }
        purchases.logIn(str, logInCallback);
    }

    public static /* synthetic */ void logOut$default(Purchases purchases, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            receiveCustomerInfoCallback = null;
        }
        purchases.logOut(receiveCustomerInfoCallback);
    }

    public static final void setDebugLogsEnabled(boolean z) {
        INSTANCE.setDebugLogsEnabled(z);
    }

    public static final synchronized void setLogHandler(LogHandler logHandler) {
        INSTANCE.setLogHandler(logHandler);
    }

    public static final void setLogLevel(LogLevel logLevel) {
        INSTANCE.setLogLevel(logLevel);
    }

    public static final void setPlatformInfo(PlatformInfo platformInfo) {
        INSTANCE.setPlatformInfo(platformInfo);
    }

    public static final void setProxyURL(URL url) {
        INSTANCE.setProxyURL(url);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Purchases purchases, Activity activity, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = AbstractC1496Lm.e(InAppMessageType.BILLING_ISSUES);
        }
        purchases.showInAppMessagesIfNeeded(activity, list);
    }

    public static /* synthetic */ void syncPurchases$default(Purchases purchases, SyncPurchasesCallback syncPurchasesCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            syncPurchasesCallback = null;
        }
        purchases.syncPurchases(syncPurchasesCallback);
    }

    public final void close() {
        this.purchasesOrchestrator.close();
    }

    public final void collectDeviceIdentifiers() {
        this.purchasesOrchestrator.collectDeviceIdentifiers();
    }

    public final synchronized boolean getAllowSharingPlayStoreAccount() {
        return this.purchasesOrchestrator.getAllowSharingPlayStoreAccount();
    }

    public final synchronized String getAppUserID() {
        return this.purchasesOrchestrator.getAppUserID();
    }

    public final void getCustomerInfo(ReceiveCustomerInfoCallback callback) {
        G10.g(callback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(CacheFetchPolicy.INSTANCE.m66default(), callback);
    }

    public final synchronized boolean getFinishTransactions() {
        return this.purchasesOrchestrator.getFinishTransactions();
    }

    public final void getNonSubscriptionSkus(List<String> productIds, GetStoreProductsCallback callback) {
        G10.g(productIds, "productIds");
        G10.g(callback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(AbstractC2455Um.Q0(productIds), AbstractC9588xQ0.c(ProductType.INAPP), callback);
    }

    public final void getOfferings(ReceiveOfferingsCallback listener) {
        G10.g(listener, "listener");
        this.purchasesOrchestrator.getOfferings(listener);
    }

    public final void getProducts(List<String> productIds, GetStoreProductsCallback callback) {
        G10.g(productIds, "productIds");
        G10.g(callback, "callback");
        getProducts(productIds, null, callback);
    }

    /* JADX INFO: renamed from: getPurchasesOrchestrator$purchases_defaultsRelease, reason: from getter */
    public final /* synthetic */ PurchasesOrchestrator getPurchasesOrchestrator() {
        return this.purchasesOrchestrator;
    }

    public final Store getStore() {
        return this.purchasesOrchestrator.getStore();
    }

    public final void getSubscriptionSkus(List<String> productIds, GetStoreProductsCallback callback) {
        G10.g(productIds, "productIds");
        G10.g(callback, "callback");
        this.purchasesOrchestrator.getProductsOfTypes(AbstractC2455Um.Q0(productIds), AbstractC9588xQ0.c(ProductType.SUBS), callback);
    }

    public final synchronized UpdatedCustomerInfoListener getUpdatedCustomerInfoListener() {
        return this.purchasesOrchestrator.getUpdatedCustomerInfoListener();
    }

    public final void invalidateCustomerInfoCache() {
        this.purchasesOrchestrator.invalidateCustomerInfoCache();
    }

    public final boolean isAnonymous() {
        return this.purchasesOrchestrator.isAnonymous();
    }

    public final void logIn(String str) {
        G10.g(str, "newAppUserID");
        logIn$default(this, str, null, 2, null);
    }

    public final void logOut() {
        logOut$default(this, null, 1, null);
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppBackgrounded() {
        this.purchasesOrchestrator.onAppBackgrounded();
    }

    @Override // com.revenuecat.purchases.LifecycleDelegate
    public void onAppForegrounded() throws Throwable {
        this.purchasesOrchestrator.onAppForegrounded();
    }

    public final void purchase(PurchaseParams purchaseParams, PurchaseCallback callback) {
        G10.g(purchaseParams, "purchaseParams");
        G10.g(callback, "callback");
        this.purchasesOrchestrator.purchase(purchaseParams, callback);
    }

    public final void purchasePackage(Activity activity, Package packageToPurchase, UpgradeInfo upgradeInfo, ProductChangeCallback callback) {
        G10.g(activity, "activity");
        G10.g(packageToPurchase, "packageToPurchase");
        G10.g(upgradeInfo, "upgradeInfo");
        G10.g(callback, "callback");
        PurchasesOrchestrator purchasesOrchestrator = this.purchasesOrchestrator;
        PurchasingData purchasingData = packageToPurchase.getProduct().getPurchasingData();
        String offering = packageToPurchase.getOffering();
        String oldSku = upgradeInfo.getOldSku();
        GoogleProrationMode googleProrationModeFromPlayBillingClientMode = GoogleProrationMode.INSTANCE.fromPlayBillingClientMode(upgradeInfo.getProrationMode());
        purchasesOrchestrator.startDeprecatedProductChange(activity, purchasingData, offering, oldSku, googleProrationModeFromPlayBillingClientMode != null ? googleProrationModeFromPlayBillingClientMode.getAsGoogleReplacementMode$purchases_defaultsRelease() : null, callback);
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, ProductChangeCallback listener) {
        G10.g(activity, "activity");
        G10.g(storeProduct, "storeProduct");
        G10.g(upgradeInfo, "upgradeInfo");
        G10.g(listener, "listener");
        PurchasesOrchestrator purchasesOrchestrator = this.purchasesOrchestrator;
        PurchasingData purchasingData = storeProduct.getPurchasingData();
        String oldSku = upgradeInfo.getOldSku();
        GoogleProrationMode googleProrationModeFromPlayBillingClientMode = GoogleProrationMode.INSTANCE.fromPlayBillingClientMode(upgradeInfo.getProrationMode());
        purchasesOrchestrator.startDeprecatedProductChange(activity, purchasingData, null, oldSku, googleProrationModeFromPlayBillingClientMode != null ? googleProrationModeFromPlayBillingClientMode.getAsGoogleReplacementMode$purchases_defaultsRelease() : null, listener);
    }

    public final void removeUpdatedCustomerInfoListener() {
        this.purchasesOrchestrator.removeUpdatedCustomerInfoListener();
    }

    public final void restorePurchases(ReceiveCustomerInfoCallback callback) {
        G10.g(callback, "callback");
        this.purchasesOrchestrator.restorePurchases(callback);
    }

    public final void setAd(String ad) {
        this.purchasesOrchestrator.setAd(ad);
    }

    public final void setAdGroup(String adGroup) {
        this.purchasesOrchestrator.setAdGroup(adGroup);
    }

    public final void setAdjustID(String adjustID) {
        this.purchasesOrchestrator.setAdjustID(adjustID);
    }

    public final void setAirshipChannelID(String airshipChannelID) {
        this.purchasesOrchestrator.setAirshipChannelID(airshipChannelID);
    }

    public final synchronized void setAllowSharingPlayStoreAccount(boolean z) {
        this.purchasesOrchestrator.setAllowSharingPlayStoreAccount(z);
    }

    public final void setAppsflyerID(String appsflyerID) {
        this.purchasesOrchestrator.setAppsflyerID(appsflyerID);
    }

    public final void setAttributes(Map<String, String> attributes) {
        G10.g(attributes, "attributes");
        this.purchasesOrchestrator.setAttributes(attributes);
    }

    public final void setCampaign(String campaign) {
        this.purchasesOrchestrator.setCampaign(campaign);
    }

    public final void setCleverTapID(String cleverTapID) {
        this.purchasesOrchestrator.setCleverTapID(cleverTapID);
    }

    public final void setCreative(String creative) {
        this.purchasesOrchestrator.setCreative(creative);
    }

    public final void setDisplayName(String displayName) {
        this.purchasesOrchestrator.setDisplayName(displayName);
    }

    public final void setEmail(String email) {
        this.purchasesOrchestrator.setEmail(email);
    }

    public final void setFBAnonymousID(String fbAnonymousID) {
        this.purchasesOrchestrator.setFBAnonymousID(fbAnonymousID);
    }

    public final synchronized void setFinishTransactions(boolean z) {
        this.purchasesOrchestrator.setFinishTransactions(z);
    }

    public final void setFirebaseAppInstanceID(String firebaseAppInstanceID) {
        this.purchasesOrchestrator.setFirebaseAppInstanceID(firebaseAppInstanceID);
    }

    public final void setKeyword(String keyword) {
        this.purchasesOrchestrator.setKeyword(keyword);
    }

    public final void setMediaSource(String mediaSource) {
        this.purchasesOrchestrator.setMediaSource(mediaSource);
    }

    public final void setMixpanelDistinctID(String mixpanelDistinctID) {
        this.purchasesOrchestrator.setMixpanelDistinctID(mixpanelDistinctID);
    }

    public final void setMparticleID(String mparticleID) {
        this.purchasesOrchestrator.setMparticleID(mparticleID);
    }

    public final void setOnesignalID(String onesignalID) {
        this.purchasesOrchestrator.setOnesignalID(onesignalID);
    }

    public final void setPhoneNumber(String phoneNumber) {
        this.purchasesOrchestrator.setPhoneNumber(phoneNumber);
    }

    public final void setPushToken(String fcmToken) {
        this.purchasesOrchestrator.setPushToken(fcmToken);
    }

    public final synchronized void setUpdatedCustomerInfoListener(UpdatedCustomerInfoListener updatedCustomerInfoListener) {
        this.purchasesOrchestrator.setUpdatedCustomerInfoListener(updatedCustomerInfoListener);
    }

    public final void showInAppMessagesIfNeeded(Activity activity) {
        G10.g(activity, "activity");
        showInAppMessagesIfNeeded$default(this, activity, null, 2, null);
    }

    public final void syncObserverModeAmazonPurchase(String productID, String receiptID, String amazonUserID, String isoCurrencyCode, Double price) {
        G10.g(productID, "productID");
        G10.g(receiptID, "receiptID");
        G10.g(amazonUserID, "amazonUserID");
        this.purchasesOrchestrator.syncObserverModeAmazonPurchase(productID, receiptID, amazonUserID, isoCurrencyCode, price);
    }

    public final void syncPurchases() {
        syncPurchases$default(this, null, 1, null);
    }

    public static final void canMakePayments(Context context, List<? extends BillingFeature> list, Callback<Boolean> callback) {
        INSTANCE.canMakePayments(context, list, callback);
    }

    public final void getCustomerInfo(CacheFetchPolicy fetchPolicy, ReceiveCustomerInfoCallback callback) {
        G10.g(fetchPolicy, "fetchPolicy");
        G10.g(callback, "callback");
        this.purchasesOrchestrator.getCustomerInfo(fetchPolicy, callback);
    }

    public final void getProducts(List<String> productIds, ProductType type, GetStoreProductsCallback callback) {
        G10.g(productIds, "productIds");
        G10.g(callback, "callback");
        this.purchasesOrchestrator.getProducts(productIds, type, callback);
    }

    public final void logIn(String newAppUserID, LogInCallback callback) {
        G10.g(newAppUserID, "newAppUserID");
        this.purchasesOrchestrator.logIn(newAppUserID, callback);
    }

    public final void logOut(ReceiveCustomerInfoCallback callback) {
        this.purchasesOrchestrator.logOut(callback);
    }

    public final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes) {
        G10.g(activity, "activity");
        G10.g(inAppMessageTypes, "inAppMessageTypes");
        this.purchasesOrchestrator.showInAppMessagesIfNeeded(activity, inAppMessageTypes);
    }

    public final void syncPurchases(SyncPurchasesCallback listener) {
        this.purchasesOrchestrator.syncPurchases(listener);
    }

    public final void purchaseProduct(Activity activity, StoreProduct storeProduct, PurchaseCallback callback) {
        G10.g(activity, "activity");
        G10.g(storeProduct, "storeProduct");
        G10.g(callback, "callback");
        this.purchasesOrchestrator.startPurchase(activity, storeProduct.getPurchasingData(), null, null, callback);
    }

    public final void purchasePackage(Activity activity, Package packageToPurchase, PurchaseCallback listener) {
        G10.g(activity, "activity");
        G10.g(packageToPurchase, "packageToPurchase");
        G10.g(listener, "listener");
        this.purchasesOrchestrator.startPurchase(activity, packageToPurchase.getProduct().getPurchasingData(), packageToPurchase.getOffering(), null, listener);
    }
}
