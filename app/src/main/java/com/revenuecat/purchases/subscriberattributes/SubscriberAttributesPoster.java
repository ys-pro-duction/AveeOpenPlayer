package com.revenuecat.purchases.subscriberattributes;

import com.daaw.AbstractC1369Kg0;
import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC4192e90;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3986dR;
import com.daaw.LQ;
import com.daaw.NQ;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jk\u0010\u0013\u001a\u00020\u000b2 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "", "attributes", "appUserID", "Lkotlin/Function0;", "Lcom/daaw/G91;", "onSuccessHandler", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "onErrorHandler", "postSubscriberAttributes", "(Ljava/util/Map;Ljava/lang/String;Lcom/daaw/LQ;Lcom/daaw/dR;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ InterfaceC3986dR $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC3986dR interfaceC3986dR) {
            super(1);
            this.$onErrorHandler = interfaceC3986dR;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            G10.g(purchasesError, "error");
            this.$onErrorHandler.invoke(purchasesError, Boolean.FALSE, AbstractC1599Mm.k());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "responseCode", "Lorg/json/JSONObject;", "body", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass2 extends AbstractC4192e90 implements InterfaceC3986dR {
        final /* synthetic */ InterfaceC3986dR $onErrorHandler;
        final /* synthetic */ LQ $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LQ lq, InterfaceC3986dR interfaceC3986dR) {
            super(3);
            this.$onSuccessHandler = lq;
            this.$onErrorHandler = interfaceC3986dR;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws JSONException {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return G91.a;
        }

        public final void invoke(PurchasesError purchasesError, int i, JSONObject jSONObject) throws JSONException {
            G91 g91;
            G10.g(jSONObject, "body");
            if (purchasesError != null) {
                InterfaceC3986dR interfaceC3986dR = this.$onErrorHandler;
                boolean zIsServerError = RCHTTPStatusCodes.INSTANCE.isServerError(i);
                boolean z = false;
                boolean z2 = i == 404;
                if (!zIsServerError && !z2) {
                    z = true;
                }
                List<SubscriberAttributeError> listK = AbstractC1599Mm.k();
                if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    listK = BackendHelpersKt.getAttributeErrors(jSONObject);
                }
                interfaceC3986dR.invoke(purchasesError, Boolean.valueOf(z), listK);
                g91 = G91.a;
            } else {
                g91 = null;
            }
            if (g91 == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(BackendHelper backendHelper) {
        G10.g(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> attributes, String appUserID, LQ onSuccessHandler, InterfaceC3986dR onErrorHandler) {
        G10.g(attributes, "attributes");
        G10.g(appUserID, "appUserID");
        G10.g(onSuccessHandler, "onSuccessHandler");
        G10.g(onErrorHandler, "onErrorHandler");
        this.backendHelper.performRequest(new Endpoint.PostAttributes(appUserID), AbstractC1369Kg0.e(D61.a("attributes", attributes)), null, Delay.DEFAULT, new AnonymousClass1(onErrorHandler), new AnonymousClass2(onSuccessHandler, onErrorHandler));
    }
}
