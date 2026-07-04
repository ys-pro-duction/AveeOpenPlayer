package com.daaw;

import com.google.android.gms.ads.internal.util.zzbq;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.dJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3956dJ1 extends AbstractC1841Ou1 {
    public final /* synthetic */ byte[] P;
    public final /* synthetic */ Map Q;
    public final /* synthetic */ C3996dT1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3956dJ1(zzbq zzbqVar, int i, String str, InterfaceC5808ju1 interfaceC5808ju1, InterfaceC5526iu1 interfaceC5526iu1, byte[] bArr, Map map, C3996dT1 c3996dT1) {
        super(i, str, interfaceC5808ju1, interfaceC5526iu1);
        this.P = bArr;
        this.Q = map;
        this.R = c3996dT1;
    }

    @Override // com.daaw.AbstractC4970gu1
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        o((String) obj);
    }

    @Override // com.daaw.AbstractC1841Ou1
    public final void o(String str) {
        this.R.g(str);
        super.o(str);
    }

    @Override // com.daaw.AbstractC4970gu1
    public final Map zzl() {
        Map map = this.Q;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.daaw.AbstractC4970gu1
    public final byte[] zzx() {
        byte[] bArr = this.P;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
