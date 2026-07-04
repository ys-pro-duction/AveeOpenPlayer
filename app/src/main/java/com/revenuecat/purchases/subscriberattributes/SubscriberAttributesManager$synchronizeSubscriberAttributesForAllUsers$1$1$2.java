package com.revenuecat.purchases.subscriberattributes;

import com.daaw.AbstractC4192e90;
import com.daaw.C6190lF0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3986dR;
import com.daaw.LQ;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "didBackendGetAttributes", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "attributeErrors", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ZLjava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2 extends AbstractC4192e90 implements InterfaceC3986dR {
    final /* synthetic */ LQ $completion;
    final /* synthetic */ C6190lF0 $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$2(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, C6190lF0 c6190lF0, LQ lq, int i) {
        super(3);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentSyncedAttributeCount = c6190lF0;
        this.$completion = lq;
        this.$unsyncedStoredAttributesCount = i;
    }

    @Override // com.daaw.InterfaceC3986dR
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue(), (List<SubscriberAttributeError>) obj3);
        return G91.a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z, List<SubscriberAttributeError> list) {
        G10.g(purchasesError, "error");
        G10.g(list, "attributeErrors");
        if (z) {
            this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, list);
        }
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(AttributionStrings.ATTRIBUTES_SYNC_ERROR, Arrays.copyOf(new Object[]{this.$syncingAppUserID, purchasesError}, 2));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        C6190lF0 c6190lF0 = this.$currentSyncedAttributeCount;
        int i = c6190lF0.B + 1;
        c6190lF0.B = i;
        LQ lq = this.$completion;
        if (lq == null || i != this.$unsyncedStoredAttributesCount) {
            return;
        }
        lq.invoke();
    }
}
