package com.revenuecat.purchases;

import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.NQ;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Lcom/daaw/G91;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ InterfaceC3429bR $transactionPostError;
    final /* synthetic */ InterfaceC3429bR $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = interfaceC3429bR;
        this.$transactionPostError = interfaceC3429bR2;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return G91.a;
    }

    public final void invoke(List<? extends StoreProduct> list) {
        StoreProduct storeProduct;
        G10.g(list, "storeProducts");
        Object obj = null;
        if (this.$transaction.getType() == ProductType.SUBS) {
            StoreTransaction storeTransaction = this.$transaction;
            Iterator<T> it = list.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                SubscriptionOptions subscriptionOptions = ((StoreProduct) next).getSubscriptionOptions();
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    Iterator<SubscriptionOption> it2 = subscriptionOptions.iterator();
                    while (it2.hasNext()) {
                        if (G10.c(it2.next().getId(), storeTransaction.getSubscriptionOptionId())) {
                            obj = next;
                            break loop0;
                        }
                    }
                }
            }
            storeProduct = (StoreProduct) obj;
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (G10.c(((StoreProduct) next2).getId(), AbstractC2455Um.g0(storeTransaction2.getProductIds()))) {
                    obj = next2;
                    break;
                }
            }
            storeProduct = (StoreProduct) obj;
        }
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, storeProduct, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
