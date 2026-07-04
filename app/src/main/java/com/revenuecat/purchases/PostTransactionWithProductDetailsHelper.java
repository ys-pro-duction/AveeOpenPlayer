package com.revenuecat.purchases;

import com.daaw.AbstractC2455Um;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J{\u0010\u0019\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\"\b\u0002\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u00142\"\b\u0002\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactions", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/daaw/G91;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "transactionPostSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "transactionPostError", "postTransactions", "(Ljava/util/List;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lcom/daaw/bR;Lcom/daaw/bR;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billingAbstract, PostReceiptHelper postReceiptHelper) {
        G10.g(billingAbstract, "billing");
        G10.g(postReceiptHelper, "postReceiptHelper");
        this.billing = billingAbstract;
        this.postReceiptHelper = postReceiptHelper;
    }

    public static /* synthetic */ void postTransactions$default(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, List list, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2, int i, Object obj) {
        if ((i & 16) != 0) {
            interfaceC3429bR = null;
        }
        if ((i & 32) != 0) {
            interfaceC3429bR2 = null;
        }
        postTransactionWithProductDetailsHelper.postTransactions(list, z, str, postReceiptInitiationSource, interfaceC3429bR, interfaceC3429bR2);
    }

    public final void postTransactions(List<StoreTransaction> transactions, boolean allowSharingPlayStoreAccount, String appUserID, PostReceiptInitiationSource initiationSource, InterfaceC3429bR transactionPostSuccess, InterfaceC3429bR transactionPostError) {
        G10.g(transactions, "transactions");
        G10.g(appUserID, "appUserID");
        PostReceiptInitiationSource postReceiptInitiationSource = initiationSource;
        G10.g(postReceiptInitiationSource, "initiationSource");
        for (StoreTransaction storeTransaction : transactions) {
            if (storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
                this.billing.queryProductDetailsAsync(storeTransaction.getType(), AbstractC2455Um.Q0(storeTransaction.getProductIds()), new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, allowSharingPlayStoreAccount, appUserID, postReceiptInitiationSource, transactionPostSuccess, transactionPostError), new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, allowSharingPlayStoreAccount, appUserID, initiationSource, transactionPostSuccess, transactionPostError));
            } else if (transactionPostError != null) {
                PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, null, 2, null);
                LogUtilsKt.errorLog(purchasesError);
                G91 g91 = G91.a;
                transactionPostError.invoke(storeTransaction, purchasesError);
            }
            postReceiptInitiationSource = initiationSource;
        }
    }
}
