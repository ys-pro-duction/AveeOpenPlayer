package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.j82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5592j82 extends AbstractC9351wa2 implements InterfaceC7273p72, Z72 {
    public final C4498fF2 C;
    public final AtomicBoolean D;

    public C5592j82(Set set, C4498fF2 c4498fF2) {
        super(set);
        this.D = new AtomicBoolean();
        this.C = c4498fF2;
    }

    private final void zzb() {
        zzs zzsVar;
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.C7)).booleanValue() && this.D.compareAndSet(false, true) && (zzsVar = this.C.g0) != null && zzsVar.zza == 3) {
            A0(new InterfaceC9072va2() { // from class: com.daaw.i82
                @Override // com.daaw.InterfaceC9072va2
                public final void zza(Object obj) {
                    this.a.B0((InterfaceC6162l82) obj);
                }
            });
        }
    }

    public final /* synthetic */ void B0(InterfaceC6162l82 interfaceC6162l82) {
        interfaceC6162l82.e(this.C.g0);
    }

    @Override // com.daaw.Z72
    public final void zzg() {
        if (this.C.b == 1) {
            zzb();
        }
    }

    @Override // com.daaw.InterfaceC7273p72
    public final void zzq() {
        int i = this.C.b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
