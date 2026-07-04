package com.revenuecat.purchases.subscriberattributes;

import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC4192e90;
import com.daaw.C6190lF0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.LQ;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.AttributionStrings;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1 extends AbstractC4192e90 implements LQ {
    final /* synthetic */ LQ $completion;
    final /* synthetic */ String $currentAppUserID;
    final /* synthetic */ C6190lF0 $currentSyncedAttributeCount;
    final /* synthetic */ String $syncingAppUserID;
    final /* synthetic */ Map<String, SubscriberAttribute> $unsyncedAttributesForUser;
    final /* synthetic */ int $unsyncedStoredAttributesCount;
    final /* synthetic */ SubscriberAttributesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesManager$synchronizeSubscriberAttributesForAllUsers$1$1$1(SubscriberAttributesManager subscriberAttributesManager, String str, Map<String, SubscriberAttribute> map, String str2, C6190lF0 c6190lF0, LQ lq, int i) {
        super(0);
        this.this$0 = subscriberAttributesManager;
        this.$syncingAppUserID = str;
        this.$unsyncedAttributesForUser = map;
        this.$currentAppUserID = str2;
        this.$currentSyncedAttributeCount = c6190lF0;
        this.$completion = lq;
        this.$unsyncedStoredAttributesCount = i;
    }

    @Override // com.daaw.LQ
    public /* bridge */ /* synthetic */ Object invoke() {
        m113invoke();
        return G91.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m113invoke() {
        this.this$0.markAsSynced(this.$syncingAppUserID, this.$unsyncedAttributesForUser, AbstractC1599Mm.k());
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        String str = String.format(AttributionStrings.ATTRIBUTES_SYNC_SUCCESS, Arrays.copyOf(new Object[]{this.$syncingAppUserID}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        if (!G10.c(this.$currentAppUserID, this.$syncingAppUserID)) {
            this.this$0.getDeviceCache().clearSubscriberAttributesIfSyncedForSubscriber(this.$syncingAppUserID);
        }
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
