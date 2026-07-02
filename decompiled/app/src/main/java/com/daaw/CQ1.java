package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes3.dex */
public final class CQ1 implements RewardItem {
    public final InterfaceC7351pQ1 a;

    public CQ1(InterfaceC7351pQ1 interfaceC7351pQ1) {
        this.a = interfaceC7351pQ1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        InterfaceC7351pQ1 interfaceC7351pQ1 = this.a;
        if (interfaceC7351pQ1 != null) {
            try {
                return interfaceC7351pQ1.zze();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        InterfaceC7351pQ1 interfaceC7351pQ1 = this.a;
        if (interfaceC7351pQ1 != null) {
            try {
                return interfaceC7351pQ1.zzf();
            } catch (RemoteException e) {
                AbstractC4274eT1.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
