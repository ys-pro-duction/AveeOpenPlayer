package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.G91;
import com.daaw.LQ;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class CustomerInfoUpdateHandler$notifyListeners$2$2 extends AbstractC4192e90 implements LQ {
    final /* synthetic */ CustomerInfo $customerInfo;
    final /* synthetic */ UpdatedCustomerInfoListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoUpdateHandler$notifyListeners$2$2(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    @Override // com.daaw.LQ
    public /* bridge */ /* synthetic */ Object invoke() {
        m75invoke();
        return G91.a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m75invoke() {
        this.$listener.onReceived(this.$customerInfo);
    }
}
