package com.revenuecat.purchases.common;

import com.daaw.AbstractC1369Kg0;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC1496Lm;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.C0576Cs0;
import com.daaw.C4293eY0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.NQ;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.strings.NetworkStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 w2\u00020\u0001:\u0001wB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013Js\u0010!\u001a\u00020 \"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015* \u0012\u0004\u0012\u00020\u0017\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00190\u00180\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"Jy\u0010$\u001a\u00020 \"\u0004\b\u0000\u0010#\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u0015* \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00190\u00180\u00162\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020 ¢\u0006\u0004\b&\u0010'JK\u00101\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 0,2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/¢\u0006\u0004\b1\u00102J¹\u0001\u0010B\u001a\u00020 2\u0006\u00103\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020*2 \u00107\u001a\u001c\u0012\u0004\u0012\u00020(\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020(\u0012\u0006\u0012\u0004\u0018\u00010\u000106062\u0006\u00109\u001a\u0002082\b\u0010:\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010(2\u0006\u0010=\u001a\u00020<2\u001c\u0010.\u001a\u0018\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0/j\u0002`?2$\u00100\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020 0@j\u0002`A¢\u0006\u0004\bB\u0010CJK\u0010D\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0,2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/¢\u0006\u0004\bD\u00102JK\u0010H\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\u0006\u0010E\u001a\u00020(2\u0018\u0010F\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0,¢\u0006\u0004\bH\u0010IJI\u0010L\u001a\u00020 2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020>0J2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0,2\u0018\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/¢\u0006\u0004\bL\u0010MJ5\u0010O\u001a\u00020 2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020 0,2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0,¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020 ¢\u0006\u0004\bQ\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010SR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010SR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010TR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010URª\u0001\u0010X\u001aB\u0012\u0004\u0012\u00020\u0017\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 0,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/0\u0019j\u0002`V0\u00180\u00162F\u0010W\u001aB\u0012\u0004\u0012\u00020\u0017\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020 0,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/0\u0019j\u0002`V0\u00180\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]Rê\u0001\u0010`\u001ab\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020(0Jj\u0002`^\u0012N\u0012L\u0012H\u0012F\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0/j\u0002`?\u0012\"\u0012 \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020 0@j\u0002`A0\u0019j\u0002`_0\u00180\u00162f\u0010W\u001ab\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020(0Jj\u0002`^\u0012N\u0012L\u0012H\u0012F\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0/j\u0002`?\u0012\"\u0012 \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020 0@j\u0002`A0\u0019j\u0002`_0\u00180\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010[\"\u0004\bb\u0010]Rª\u0001\u0010d\u001aB\u0012\u0004\u0012\u00020\u0017\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/0\u0019j\u0002`c0\u00180\u00162F\u0010W\u001aB\u0012\u0004\u0012\u00020\u0017\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/0\u0019j\u0002`c0\u00180\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010Y\u001a\u0004\be\u0010[\"\u0004\bf\u0010]R¾\u0001\u0010h\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020(0Jj\u0002`^\u00128\u00126\u00122\u00120\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0,0\u0019j\u0002`g0\u00180\u00162P\u0010W\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020(0Jj\u0002`^\u00128\u00126\u00122\u00120\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0,0\u0019j\u0002`g0\u00180\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010Y\u001a\u0004\bi\u0010[\"\u0004\bj\u0010]R¾\u0001\u0010l\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020(0Jj\u0002`^\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/0\u0019j\u0002`k0\u00180\u00162P\u0010W\u001aL\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020(0Jj\u0002`^\u00128\u00126\u00122\u00120\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020 0,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020 0/0\u0019j\u0002`k0\u00180\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010Y\u001a\u0004\bm\u0010[\"\u0004\bn\u0010]R\u009e\u0001\u0010p\u001a<\u0012\u0004\u0012\u00020(\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020 0,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0,0\u0019j\u0002`o0\u00180\u00162@\u0010W\u001a<\u0012\u0004\u0012\u00020(\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020 0,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020 0,0\u0019j\u0002`o0\u00180\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010Y\u001a\u0004\bq\u0010[\"\u0004\br\u0010]R\u0011\u0010v\u001a\u00020s8F¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006x"}, d2 = {"Lcom/revenuecat/purchases/common/Backend;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "diagnosticsDispatcher", "Lcom/revenuecat/purchases/common/HTTPClient;", "httpClient", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/HTTPClient;Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "responseCode", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "determinePostReceiptErrorHandlingBehavior", "(ILcom/revenuecat/purchases/PurchasesError;)Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "S", "E", "", "Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;", "", "Lcom/daaw/Cs0;", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "call", "cacheKey", "functions", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lcom/daaw/G91;", "addBackgroundAwareCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/BackgroundAwareCallbackCacheKey;Lcom/daaw/Cs0;Lcom/revenuecat/purchases/common/Delay;)V", "K", "addCallback", "(Ljava/util/Map;Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Ljava/lang/Object;Lcom/daaw/Cs0;Lcom/revenuecat/purchases/common/Delay;)V", "close", "()V", "", "appUserID", "", "appInBackground", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lkotlin/Function2;", "onError", "getCustomerInfo", "(Ljava/lang/String;ZLcom/daaw/NQ;Lcom/daaw/bR;)V", "purchaseToken", "isRestore", "observerMode", "", "subscriberAttributes", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "storeAppUserID", "marketplace", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataSuccessCallback;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "postReceiptData", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Lcom/revenuecat/purchases/common/ReceiptInfo;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/daaw/bR;Lcom/daaw/dR;)V", "getOfferings", "newAppUserID", "onSuccessHandler", "onErrorHandler", "logIn", "(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/bR;Lcom/daaw/NQ;)V", "", "diagnosticsList", "postDiagnostics", "(Ljava/util/List;Lcom/daaw/NQ;Lcom/daaw/bR;)V", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "getProductEntitlementMapping", "(Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "clearCaches", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/HTTPClient;", "Lcom/revenuecat/purchases/common/BackendHelper;", "Lcom/revenuecat/purchases/common/CustomerInfoCallback;", "<set-?>", "callbacks", "Ljava/util/Map;", "getCallbacks", "()Ljava/util/Map;", "setCallbacks", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/common/CallbackCacheKey;", "Lcom/revenuecat/purchases/common/PostReceiptCallback;", "postReceiptCallbacks", "getPostReceiptCallbacks", "setPostReceiptCallbacks", "Lcom/revenuecat/purchases/common/OfferingsCallback;", "offeringsCallbacks", "getOfferingsCallbacks", "setOfferingsCallbacks", "Lcom/revenuecat/purchases/common/IdentifyCallback;", "identifyCallbacks", "getIdentifyCallbacks", "setIdentifyCallbacks", "Lcom/revenuecat/purchases/common/DiagnosticsCallback;", "diagnosticsCallbacks", "getDiagnosticsCallbacks", "setDiagnosticsCallbacks", "Lcom/revenuecat/purchases/common/ProductEntitlementCallback;", "productEntitlementCallbacks", "getProductEntitlementCallbacks", "setProductEntitlementCallbacks", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "getVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "verificationMode", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Backend {

    @Deprecated
    public static final String APP_USER_ID = "app_user_id";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String FETCH_TOKEN = "fetch_token";

    @Deprecated
    public static final String NEW_APP_USER_ID = "new_app_user_id";
    private final AppConfig appConfig;
    private final BackendHelper backendHelper;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<C0576Cs0>> callbacks;
    private volatile Map<List<String>, List<C0576Cs0>> diagnosticsCallbacks;
    private final Dispatcher diagnosticsDispatcher;
    private final Dispatcher dispatcher;
    private final HTTPClient httpClient;
    private volatile Map<List<String>, List<C0576Cs0>> identifyCallbacks;
    private volatile Map<BackgroundAwareCallbackCacheKey, List<C0576Cs0>> offeringsCallbacks;
    private volatile Map<List<String>, List<C0576Cs0>> postReceiptCallbacks;
    private volatile Map<String, List<C0576Cs0>> productEntitlementCallbacks;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/Backend$Companion;", "", "()V", "APP_USER_ID", "", "FETCH_TOKEN", "NEW_APP_USER_ID", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        private Companion() {
        }
    }

    public Backend(AppConfig appConfig, Dispatcher dispatcher, Dispatcher dispatcher2, HTTPClient hTTPClient, BackendHelper backendHelper) {
        G10.g(appConfig, "appConfig");
        G10.g(dispatcher, "dispatcher");
        G10.g(dispatcher2, "diagnosticsDispatcher");
        G10.g(hTTPClient, "httpClient");
        G10.g(backendHelper, "backendHelper");
        this.appConfig = appConfig;
        this.dispatcher = dispatcher;
        this.diagnosticsDispatcher = dispatcher2;
        this.httpClient = hTTPClient;
        this.backendHelper = backendHelper;
        this.callbacks = new LinkedHashMap();
        this.postReceiptCallbacks = new LinkedHashMap();
        this.offeringsCallbacks = new LinkedHashMap();
        this.identifyCallbacks = new LinkedHashMap();
        this.diagnosticsCallbacks = new LinkedHashMap();
        this.productEntitlementCallbacks = new LinkedHashMap();
    }

    private final synchronized <S, E> void addBackgroundAwareCallback(Map<BackgroundAwareCallbackCacheKey, List<C0576Cs0>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, C0576Cs0 c0576Cs0, Delay delay) {
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2;
        try {
            BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, false, 1, null);
            boolean zContainsKey = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
            if (backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey) {
                String str = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITHOUT_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1));
                G10.f(str, "format(this, *args)");
                LogUtilsKt.warnLog(str);
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKeyCopy$default;
            } else {
                backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
            }
            addCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey2, c0576Cs0, delay);
            BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKeyCopy$default2 = BackgroundAwareCallbackCacheKey.copy$default(backgroundAwareCallbackCacheKey, null, true, 1, null);
            boolean zContainsKey2 = map.containsKey(backgroundAwareCallbackCacheKeyCopy$default);
            if (!backgroundAwareCallbackCacheKey.getAppInBackground() && zContainsKey2) {
                String str2 = String.format(NetworkStrings.SAME_CALL_SCHEDULED_WITH_JITTER, Arrays.copyOf(new Object[]{backgroundAwareCallbackCacheKeyCopy$default}, 1));
                G10.f(str2, "format(this, *args)");
                LogUtilsKt.warnLog(str2);
                List<C0576Cs0> listRemove = map.remove(backgroundAwareCallbackCacheKeyCopy$default2);
                if (listRemove != null) {
                    List<C0576Cs0> list = listRemove.isEmpty() ? null : listRemove;
                    if (list != null) {
                        if (map.containsKey(backgroundAwareCallbackCacheKey)) {
                            List<C0576Cs0> list2 = map.get(backgroundAwareCallbackCacheKey);
                            if (list2 != null) {
                                list2.addAll(list);
                            }
                        } else {
                            map.put(backgroundAwareCallbackCacheKey, list);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void addBackgroundAwareCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey, C0576Cs0 c0576Cs0, Delay delay, int i, Object obj) {
        if ((i & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addBackgroundAwareCallback(map, asyncCall, dispatcher, backgroundAwareCallbackCacheKey, c0576Cs0, delay);
    }

    private final <K, S, E> void addCallback(Map<K, List<C0576Cs0>> map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, K k, C0576Cs0 c0576Cs0, Delay delay) {
        if (!map.containsKey(k)) {
            map.put(k, AbstractC1599Mm.q(c0576Cs0));
            this.backendHelper.enqueue(asyncCall, dispatcher, delay);
            return;
        }
        C4293eY0 c4293eY0 = C4293eY0.a;
        String str = String.format(NetworkStrings.SAME_CALL_ALREADY_IN_PROGRESS, Arrays.copyOf(new Object[]{k}, 1));
        G10.f(str, "format(format, *args)");
        LogUtilsKt.debugLog(str);
        List<C0576Cs0> list = map.get(k);
        G10.d(list);
        list.add(c0576Cs0);
    }

    public static /* synthetic */ void addCallback$default(Backend backend, Map map, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Object obj, C0576Cs0 c0576Cs0, Delay delay, int i, Object obj2) {
        if ((i & 16) != 0) {
            delay = Delay.NONE;
        }
        backend.addCallback(map, asyncCall, dispatcher, obj, c0576Cs0, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostReceiptErrorHandlingBehavior determinePostReceiptErrorHandlingBehavior(int responseCode, PurchasesError purchasesError) {
        return RCHTTPStatusCodes.INSTANCE.isServerError(responseCode) ? PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME : purchasesError.getCode() == PurchasesErrorCode.UnsupportedError ? PostReceiptErrorHandlingBehavior.SHOULD_NOT_CONSUME : PostReceiptErrorHandlingBehavior.SHOULD_BE_CONSUMED;
    }

    public final void clearCaches() {
        this.httpClient.clearCaches();
    }

    public final void close() {
        this.dispatcher.close();
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<C0576Cs0>> getCallbacks() {
        return this.callbacks;
    }

    public final void getCustomerInfo(String appUserID, boolean appInBackground, NQ onSuccess, InterfaceC3429bR onError) {
        Throwable th;
        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey;
        Throwable th2;
        Delay delay;
        G10.g(appUserID, "appUserID");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        final Endpoint.GetCustomerInfo getCustomerInfo = new Endpoint.GetCustomerInfo(appUserID);
        String path = getCustomerInfo.getPath();
        synchronized (this) {
            try {
                if (this.postReceiptCallbacks.isEmpty()) {
                    try {
                        backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(AbstractC1496Lm.e(path), appInBackground);
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(AbstractC2455Um.A0(AbstractC1496Lm.e(path), String.valueOf(this.callbacks.size())), appInBackground);
                }
                final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getCustomerInfo$call$1
                    @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                    public HTTPResult call() {
                        return this.this$0.httpClient.performRequest(this.this$0.appConfig.getBaseURL(), getCustomerInfo, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
                    }

                    @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                    public void onCompletion(HTTPResult result) {
                        List<C0576Cs0> listRemove;
                        G10.g(result, "result");
                        Backend backend = this.this$0;
                        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey2;
                        synchronized (backend) {
                            listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey3);
                        }
                        if (listRemove != null) {
                            for (C0576Cs0 c0576Cs0 : listRemove) {
                                NQ nq = (NQ) c0576Cs0.a();
                                InterfaceC3429bR interfaceC3429bR = (InterfaceC3429bR) c0576Cs0.b();
                                try {
                                    if (BackendHelperKt.isSuccessful(result)) {
                                        nq.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result));
                                    } else {
                                        PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                                        LogUtilsKt.errorLog(purchasesError);
                                        interfaceC3429bR.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode())));
                                    }
                                } catch (JSONException e) {
                                    PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e);
                                    LogUtilsKt.errorLog(purchasesError2);
                                    interfaceC3429bR.invoke(purchasesError2, Boolean.FALSE);
                                }
                            }
                        }
                    }

                    @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
                    public void onError(PurchasesError error) {
                        List<C0576Cs0> listRemove;
                        G10.g(error, "error");
                        Backend backend = this.this$0;
                        BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey3 = backgroundAwareCallbackCacheKey2;
                        synchronized (backend) {
                            listRemove = backend.getCallbacks().remove(backgroundAwareCallbackCacheKey3);
                        }
                        if (listRemove != null) {
                            Iterator<T> it = listRemove.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC3429bR) ((C0576Cs0) it.next()).b()).invoke(error, Boolean.FALSE);
                            }
                        }
                    }
                };
                synchronized (this) {
                    if (appInBackground) {
                        try {
                            delay = Delay.DEFAULT;
                        } catch (Throwable th4) {
                            th2 = th4;
                            throw th2;
                        }
                    } else {
                        try {
                            delay = Delay.NONE;
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            throw th2;
                        }
                    }
                    try {
                        addBackgroundAwareCallback(this.callbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey2, D61.a(onSuccess, onError), delay);
                        G91 g91 = G91.a;
                    } catch (Throwable th6) {
                        th = th6;
                        th2 = th;
                        throw th2;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        }
    }

    public final synchronized Map<List<String>, List<C0576Cs0>> getDiagnosticsCallbacks() {
        return this.diagnosticsCallbacks;
    }

    public final synchronized Map<List<String>, List<C0576Cs0>> getIdentifyCallbacks() {
        return this.identifyCallbacks;
    }

    public final void getOfferings(String appUserID, boolean appInBackground, NQ onSuccess, InterfaceC3429bR onError) throws Throwable {
        Throwable th;
        Delay delay;
        G10.g(appUserID, "appUserID");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        final Endpoint.GetOfferings getOfferings = new Endpoint.GetOfferings(appUserID);
        final BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey = new BackgroundAwareCallbackCacheKey(AbstractC1496Lm.e(getOfferings.getPath()), appInBackground);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getOfferings$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.this$0.httpClient.performRequest(this.this$0.appConfig.getBaseURL(), getOfferings, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<C0576Cs0> listRemove;
                G10.g(result, "result");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    for (C0576Cs0 c0576Cs0 : listRemove) {
                        NQ nq = (NQ) c0576Cs0.a();
                        InterfaceC3429bR interfaceC3429bR = (InterfaceC3429bR) c0576Cs0.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                nq.invoke(result.getBody());
                            } catch (JSONException e) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                interfaceC3429bR.invoke(purchasesError, Boolean.FALSE);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError2);
                            interfaceC3429bR.invoke(purchasesError2, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode())));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C0576Cs0> listRemove;
                G10.g(error, "error");
                Backend backend = this.this$0;
                BackgroundAwareCallbackCacheKey backgroundAwareCallbackCacheKey2 = backgroundAwareCallbackCacheKey;
                synchronized (backend) {
                    listRemove = backend.getOfferingsCallbacks().remove(backgroundAwareCallbackCacheKey2);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC3429bR) ((C0576Cs0) it.next()).b()).invoke(error, Boolean.FALSE);
                    }
                }
            }
        };
        synchronized (this) {
            if (appInBackground) {
                try {
                    delay = Delay.DEFAULT;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } else {
                try {
                    delay = Delay.NONE;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
            try {
                addBackgroundAwareCallback(this.offeringsCallbacks, asyncCall, this.dispatcher, backgroundAwareCallbackCacheKey, D61.a(onSuccess, onError), delay);
                G91 g91 = G91.a;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final synchronized Map<BackgroundAwareCallbackCacheKey, List<C0576Cs0>> getOfferingsCallbacks() {
        return this.offeringsCallbacks;
    }

    public final synchronized Map<List<String>, List<C0576Cs0>> getPostReceiptCallbacks() {
        return this.postReceiptCallbacks;
    }

    public final synchronized Map<String, List<C0576Cs0>> getProductEntitlementCallbacks() {
        return this.productEntitlementCallbacks;
    }

    public final void getProductEntitlementMapping(NQ onSuccessHandler, NQ onErrorHandler) throws Throwable {
        G10.g(onSuccessHandler, "onSuccessHandler");
        G10.g(onErrorHandler, "onErrorHandler");
        final Endpoint.GetProductEntitlementMapping getProductEntitlementMapping = Endpoint.GetProductEntitlementMapping.INSTANCE;
        final String path = getProductEntitlementMapping.getPath();
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$getProductEntitlementMapping$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.this$0.httpClient.performRequest(this.this$0.appConfig.getBaseURL(), getProductEntitlementMapping, null, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<C0576Cs0> listRemove;
                G10.g(result, "result");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    for (C0576Cs0 c0576Cs0 : listRemove) {
                        NQ nq = (NQ) c0576Cs0.a();
                        NQ nq2 = (NQ) c0576Cs0.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            try {
                                nq.invoke(ProductEntitlementMapping.INSTANCE.fromJson(result.getBody()));
                            } catch (JSONException e) {
                                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                                LogUtilsKt.errorLog(purchasesError);
                                nq2.invoke(purchasesError);
                            }
                        } else {
                            PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(result);
                            LogUtilsKt.errorLog(purchasesError2);
                            nq2.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C0576Cs0> listRemove;
                G10.g(error, "error");
                Backend backend = this.this$0;
                String str = path;
                synchronized (backend) {
                    listRemove = backend.getProductEntitlementCallbacks().remove(str);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((NQ) ((C0576Cs0) it.next()).b()).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                addCallback(this.productEntitlementCallbacks, asyncCall, this.dispatcher, path, D61.a(onSuccessHandler, onErrorHandler), Delay.LONG);
                G91 g91 = G91.a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final SignatureVerificationMode getVerificationMode() {
        return this.httpClient.getSigningManager().getSignatureVerificationMode();
    }

    public final void logIn(final String appUserID, final String newAppUserID, InterfaceC3429bR onSuccessHandler, NQ onErrorHandler) {
        G10.g(appUserID, "appUserID");
        G10.g(newAppUserID, "newAppUserID");
        G10.g(onSuccessHandler, "onSuccessHandler");
        G10.g(onErrorHandler, "onErrorHandler");
        final List listP = AbstractC1599Mm.p(appUserID, newAppUserID);
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$logIn$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.httpClient.performRequest(this.appConfig.getBaseURL(), Endpoint.LogIn.INSTANCE, AbstractC1473Lg0.k(D61.a(Backend.APP_USER_ID, appUserID), D61.a(Backend.NEW_APP_USER_ID, newAppUserID)), AbstractC1599Mm.n(D61.a(Backend.APP_USER_ID, appUserID), D61.a(Backend.NEW_APP_USER_ID, newAppUserID)), this.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<C0576Cs0> listRemove;
                G10.g(result, "result");
                if (!BackendHelperKt.isSuccessful(result)) {
                    PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                    LogUtilsKt.errorLog(purchasesError);
                    onError(purchasesError);
                    return;
                }
                Backend backend = this;
                List<String> list = listP;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    for (C0576Cs0 c0576Cs0 : listRemove) {
                        InterfaceC3429bR interfaceC3429bR = (InterfaceC3429bR) c0576Cs0.a();
                        NQ nq = (NQ) c0576Cs0.b();
                        boolean z = result.getResponseCode() == 201;
                        if (result.getBody().length() > 0) {
                            interfaceC3429bR.invoke(CustomerInfoFactory.INSTANCE.buildCustomerInfo(result), Boolean.valueOf(z));
                        } else {
                            PurchasesError purchasesError2 = new PurchasesError(PurchasesErrorCode.UnknownError, null, 2, null);
                            LogUtilsKt.errorLog(purchasesError2);
                            nq.invoke(purchasesError2);
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C0576Cs0> listRemove;
                G10.g(error, "error");
                Backend backend = this;
                List<String> list = listP;
                synchronized (backend) {
                    listRemove = backend.getIdentifyCallbacks().remove(list);
                }
                if (listRemove != null) {
                    Iterator<T> it = listRemove.iterator();
                    while (it.hasNext()) {
                        ((NQ) ((C0576Cs0) it.next()).b()).invoke(error);
                    }
                }
            }
        };
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                addCallback$default(this, this.identifyCallbacks, asyncCall, this.dispatcher, listP, D61.a(onSuccessHandler, onErrorHandler), null, 16, null);
                G91 g91 = G91.a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void postDiagnostics(List<? extends JSONObject> diagnosticsList, NQ onSuccessHandler, InterfaceC3429bR onErrorHandler) throws Throwable {
        G10.g(diagnosticsList, "diagnosticsList");
        G10.g(onSuccessHandler, "onSuccessHandler");
        G10.g(onErrorHandler, "onErrorHandler");
        List<? extends JSONObject> list = diagnosticsList;
        final ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((JSONObject) it.next()).hashCode()));
        }
        final Map mapE = AbstractC1369Kg0.e(D61.a("entries", new JSONArray((Collection) diagnosticsList)));
        Dispatcher.AsyncCall asyncCall = new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.Backend$postDiagnostics$call$1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return this.this$0.httpClient.performRequest(this.this$0.appConfig.getDiagnosticsURL(), Endpoint.PostDiagnostics.INSTANCE, mapE, null, this.this$0.backendHelper.getAuthenticationHeaders$purchases_defaultsRelease(), (32 & 32) != 0 ? false : false);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                List<C0576Cs0> listRemove;
                G10.g(result, "result");
                Backend backend = this.this$0;
                List<String> list2 = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list2);
                }
                if (listRemove != null) {
                    for (C0576Cs0 c0576Cs0 : listRemove) {
                        NQ nq = (NQ) c0576Cs0.a();
                        InterfaceC3429bR interfaceC3429bR = (InterfaceC3429bR) c0576Cs0.b();
                        if (BackendHelperKt.isSuccessful(result)) {
                            nq.invoke(result.getBody());
                        } else {
                            PurchasesError purchasesError = ErrorsKt.toPurchasesError(result);
                            interfaceC3429bR.invoke(purchasesError, Boolean.valueOf(RCHTTPStatusCodes.INSTANCE.isServerError(result.getResponseCode()) || purchasesError.getCode() == PurchasesErrorCode.NetworkError));
                        }
                    }
                }
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                List<C0576Cs0> listRemove;
                G10.g(error, "error");
                Backend backend = this.this$0;
                List<String> list2 = arrayList;
                synchronized (backend) {
                    listRemove = backend.getDiagnosticsCallbacks().remove(list2);
                }
                if (listRemove != null) {
                    Iterator<T> it2 = listRemove.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC3429bR) ((C0576Cs0) it2.next()).b()).invoke(error, Boolean.valueOf(error.getCode() == PurchasesErrorCode.NetworkError));
                    }
                }
            }
        };
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                addCallback(this.diagnosticsCallbacks, asyncCall, this.diagnosticsDispatcher, arrayList, D61.a(onSuccessHandler, onErrorHandler), Delay.LONG);
                G91 g91 = G91.a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void postReceiptData(java.lang.String r27, java.lang.String r28, boolean r29, boolean r30, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r31, com.revenuecat.purchases.common.ReceiptInfo r32, java.lang.String r33, java.lang.String r34, com.revenuecat.purchases.PostReceiptInitiationSource r35, com.daaw.InterfaceC3429bR r36, com.daaw.InterfaceC3986dR r37) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.Backend.postReceiptData(java.lang.String, java.lang.String, boolean, boolean, java.util.Map, com.revenuecat.purchases.common.ReceiptInfo, java.lang.String, java.lang.String, com.revenuecat.purchases.PostReceiptInitiationSource, com.daaw.bR, com.daaw.dR):void");
    }

    public final synchronized void setCallbacks(Map<BackgroundAwareCallbackCacheKey, List<C0576Cs0>> map) {
        G10.g(map, "<set-?>");
        this.callbacks = map;
    }

    public final synchronized void setDiagnosticsCallbacks(Map<List<String>, List<C0576Cs0>> map) {
        G10.g(map, "<set-?>");
        this.diagnosticsCallbacks = map;
    }

    public final synchronized void setIdentifyCallbacks(Map<List<String>, List<C0576Cs0>> map) {
        G10.g(map, "<set-?>");
        this.identifyCallbacks = map;
    }

    public final synchronized void setOfferingsCallbacks(Map<BackgroundAwareCallbackCacheKey, List<C0576Cs0>> map) {
        G10.g(map, "<set-?>");
        this.offeringsCallbacks = map;
    }

    public final synchronized void setPostReceiptCallbacks(Map<List<String>, List<C0576Cs0>> map) {
        G10.g(map, "<set-?>");
        this.postReceiptCallbacks = map;
    }

    public final synchronized void setProductEntitlementCallbacks(Map<String, List<C0576Cs0>> map) {
        G10.g(map, "<set-?>");
        this.productEntitlementCallbacks = map;
    }
}
