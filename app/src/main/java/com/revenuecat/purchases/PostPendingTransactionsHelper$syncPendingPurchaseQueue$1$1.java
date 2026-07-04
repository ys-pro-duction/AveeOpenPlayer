package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.NQ;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesByHashedToken", "Lcom/daaw/G91;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ NQ $onError;
    final /* synthetic */ NQ $onSuccess;
    final /* synthetic */ PostPendingTransactionsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z, String str, NQ nq, NQ nq2) {
        super(1);
        this.this$0 = postPendingTransactionsHelper;
        this.$allowSharingPlayStoreAccount = z;
        this.$appUserID = str;
        this.$onError = nq;
        this.$onSuccess = nq2;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, StoreTransaction>) obj);
        return G91.a;
    }

    public final void invoke(Map<String, StoreTransaction> map) {
        G10.g(map, "purchasesByHashedToken");
        for (Map.Entry<String, StoreTransaction> entry : map.entrySet()) {
            String key = entry.getKey();
            StoreTransaction value = entry.getValue();
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_HASH, Arrays.copyOf(new Object[]{value.getType(), key}, 2));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        }
        this.this$0.deviceCache.cleanPreviouslySentTokens(map.keySet());
        this.this$0.postTransactionsWithCompletion(this.this$0.deviceCache.getActivePurchasesNotInCache(map), this.$allowSharingPlayStoreAccount, this.$appUserID, this.$onError, this.$onSuccess);
    }
}
