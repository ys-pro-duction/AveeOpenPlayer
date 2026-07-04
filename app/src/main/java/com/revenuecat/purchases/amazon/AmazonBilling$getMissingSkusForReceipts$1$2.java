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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class AmazonBilling$getMissingSkusForReceipts$1$2 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ Map<String, PurchasesError> $errorMap;
    final /* synthetic */ InterfaceC3429bR $onCompletion;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ C6190lF0 $receiptsLeft;
    final /* synthetic */ Map<String, String> $successMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonBilling$getMissingSkusForReceipts$1$2(Map<String, PurchasesError> map, Receipt receipt, C6190lF0 c6190lF0, InterfaceC3429bR interfaceC3429bR, Map<String, String> map2) {
        super(1);
        this.$errorMap = map;
        this.$receipt = receipt;
        this.$receiptsLeft = c6190lF0;
        this.$onCompletion = interfaceC3429bR;
        this.$successMap = map2;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G91.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        G10.g(purchasesError, "error");
        LogIntent logIntent = LogIntent.AMAZON_ERROR;
        String str = String.format(AmazonStrings.ERROR_FETCHING_RECEIPT_INFO, Arrays.copyOf(new Object[]{purchasesError}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map<String, PurchasesError> map = this.$errorMap;
        String receiptId = this.$receipt.getReceiptId();
        G10.f(receiptId, "receipt.receiptId");
        map.put(receiptId, purchasesError);
        C6190lF0 c6190lF0 = this.$receiptsLeft;
        int i = c6190lF0.B - 1;
        c6190lF0.B = i;
        if (i == 0) {
            this.$onCompletion.invoke(this.$successMap, this.$errorMap);
        }
    }
}
