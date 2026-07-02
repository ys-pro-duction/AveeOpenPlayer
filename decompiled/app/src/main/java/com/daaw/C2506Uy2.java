package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Uy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2506Uy2 implements InterfaceC1447Kz2 {
    public final Context a;
    public final PS2 b;
    public final FF2 c;
    public final zzcaz d;

    public C2506Uy2(Context context, PS2 ps2, FF2 ff2, zzcaz zzcazVar) {
        this.a = context;
        this.b = ps2;
        this.c = ff2;
        this.d = zzcazVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.daaw.C2610Vy2 a() {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C2506Uy2.a():com.daaw.Vy2");
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 53;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return this.b.S0(new Callable() { // from class: com.daaw.Ty2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a();
            }
        });
    }
}
