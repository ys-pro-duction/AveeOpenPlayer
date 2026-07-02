package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.Receipt;
import com.daaw.AbstractC4192e90;
import com.daaw.C6190lF0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.NQ;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Lcom/daaw/G91;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class AmazonBilling$getMissingSkusForReceipts$1$1 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ InterfaceC3429bR $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ C6190lF0 $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$1(Map<String, String> map, Receipt receipt, C6190lF0 c6190lF0, AmazonBilling amazonBilling, InterfaceC3429bR interfaceC3429bR, Map<String, PurchasesError> map2) {
        super(1);
        this.$successMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = c6190lF0;
        this.this$0 = amazonBilling;
        this.$onCompletion = interfaceC3429bR;
        this.$errorMap = map2;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws JSONException {
        invoke((JSONObject) obj);
        return G91.a;
    }

    public final void invoke(JSONObject jSONObject) throws JSONException {
        G10.g(jSONObject, "response");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AmazonStrings.RECEIPT_DATA_RECEIVED, Arrays.copyOf(new Object[]{jSONObject.toString()}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map<String, String> map = this.$successMap;
        String receiptId = this.$receipt.getReceiptId();
        G10.f(receiptId, "receipt.receiptId");
        Object obj = jSONObject.get("termSku");
        G10.e(obj, "null cannot be cast to non-null type kotlin.String");
        map.put(receiptId, (String) obj);
        C6190lF0 c6190lF0 = this.$receiptsLeft;
        int i = c6190lF0.B - 1;
        c6190lF0.B = i;
        if (i == 0) {
            this.this$0.cache.cacheSkusByToken(this.$successMap);
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
