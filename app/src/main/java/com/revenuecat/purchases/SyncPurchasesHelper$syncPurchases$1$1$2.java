package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.NQ;
import com.revenuecat.purchases.SyncPurchasesHelper;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class SyncPurchasesHelper$syncPurchases$1$1$2 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ List<PurchasesError> $errors;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ StoreTransaction $lastPurchase;
    final /* synthetic */ NQ $onError;
    final /* synthetic */ NQ $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncPurchasesHelper$syncPurchases$1$1$2(StoreTransaction storeTransaction, List<PurchasesError> list, StoreTransaction storeTransaction2, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z, boolean z2, NQ nq, NQ nq2) {
        super(1);
        this.$purchase = storeTransaction;
        this.$errors = list;
        this.$lastPurchase = storeTransaction2;
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z;
        this.$isRestore = z2;
        this.$onSuccess = nq;
        this.$onError = nq2;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G91.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        G10.g(purchasesError, "error");
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(PurchaseStrings.SYNCING_PURCHASES_ERROR_DETAILS, Arrays.copyOf(new Object[]{this.$purchase, purchasesError}, 2));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.$errors.add(purchasesError);
        SyncPurchasesHelper.C103411.invoke$handleLastPurchase(this.$errors, this.this$0, this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError, this.$purchase, this.$lastPurchase);
    }
}
