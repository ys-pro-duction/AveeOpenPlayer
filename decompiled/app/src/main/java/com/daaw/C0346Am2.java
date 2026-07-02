package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbvg;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.Am2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0346Am2 implements InterfaceC3811cn2 {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final C2766Xl2 a;
    public final PS2 b;
    public final FF2 c;
    public final ScheduledExecutorService d;
    public final C0679Dp2 e;
    public final TI2 f;
    public final Context g;

    public C0346Am2(Context context, FF2 ff2, C2766Xl2 c2766Xl2, PS2 ps2, ScheduledExecutorService scheduledExecutorService, C0679Dp2 c0679Dp2, TI2 ti2) {
        this.g = context;
        this.c = ff2;
        this.a = c2766Xl2;
        this.b = ps2;
        this.d = scheduledExecutorService;
        this.e = c0679Dp2;
        this.f = ti2;
    }

    @Override // com.daaw.InterfaceC3811cn2
    public final InterfaceFutureC8236sc0 a(zzbvg zzbvgVar) {
        Context context = this.g;
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0B = this.a.b(zzbvgVar);
        EI2 ei2A = DI2.a(context, 11);
        SI2.d(interfaceFutureC8236sc0B, ei2A);
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0N = AbstractC7360pS2.n(interfaceFutureC8236sc0B, new WR2() { // from class: com.daaw.xm2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.c((InputStream) obj);
            }
        }, this.b);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.s5)).booleanValue()) {
            interfaceFutureC8236sc0N = AbstractC7360pS2.f(AbstractC7360pS2.o(interfaceFutureC8236sc0N, ((Integer) zzba.zzc().b(AbstractC9820yE1.u5)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, new WR2() { // from class: com.daaw.ym2
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return AbstractC7360pS2.g(new C2350Tl2(5));
                }
            }, AbstractC9322wT1.f);
        }
        SI2.a(interfaceFutureC8236sc0N, this.f, ei2A);
        AbstractC7360pS2.r(interfaceFutureC8236sc0N, new C10248zm2(this), AbstractC9322wT1.f);
        return interfaceFutureC8236sc0N;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 c(InputStream inputStream) {
        return AbstractC7360pS2.h(new C9267wF2(new C8423tF2(this.c), C8988vF2.a(new InputStreamReader(inputStream))));
    }
}
