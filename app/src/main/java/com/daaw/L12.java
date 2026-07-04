package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class L12 {
    public final Context a;
    public final zzg b;
    public final C2266Sq2 c;
    public final C4343ei2 d;
    public final PS2 e;
    public final Executor f;
    public final ScheduledExecutorService g;
    public ZO1 h;

    public L12(Context context, zzg zzgVar, C2266Sq2 c2266Sq2, C4343ei2 c4343ei2, PS2 ps2, PS2 ps22, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = zzgVar;
        this.c = c2266Sq2;
        this.d = c4343ei2;
        this.e = ps2;
        this.f = ps22;
        this.g = scheduledExecutorService;
    }

    public final InterfaceFutureC8236sc0 c(final String str, Random random) {
        return AbstractC7360pS2.f(j(str, this.d.a(), random), Throwable.class, new WR2() { // from class: com.daaw.E12
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h(str);
            }
        }, this.e);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 d(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) zzba.zzc().b(AbstractC9820yE1.x9), "10");
            return AbstractC7360pS2.h(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) zzba.zzc().b(AbstractC9820yE1.y9), "1");
        builderBuildUpon.appendQueryParameter((String) zzba.zzc().b(AbstractC9820yE1.x9), "12");
        if (str.contains((CharSequence) zzba.zzc().b(AbstractC9820yE1.z9))) {
            builderBuildUpon.authority((String) zzba.zzc().b(AbstractC9820yE1.A9));
        }
        return AbstractC7360pS2.n(AbstractC4839gS2.C(this.c.b(builderBuildUpon.build(), inputEvent)), new WR2() { // from class: com.daaw.H12
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                String str2 = (String) zzba.zzc().b(AbstractC9820yE1.x9);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return AbstractC7360pS2.h(builder2.toString());
            }
        }, this.f);
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 e(Uri.Builder builder, final Throwable th) {
        this.e.Z0(new Runnable() { // from class: com.daaw.D12
            @Override // java.lang.Runnable
            public final void run() {
                this.B.h(th);
            }
        });
        builder.appendQueryParameter((String) zzba.zzc().b(AbstractC9820yE1.x9), "9");
        return AbstractC7360pS2.h(builder.toString());
    }

    public final /* synthetic */ void h(Throwable th) {
        ZO1 zo1C = RO1.c(this.a);
        this.h = zo1C;
        zo1C.a(th, "AttributionReporting");
    }

    public final void i(String str, C6487mJ2 c6487mJ2, Random random) {
        AbstractC7360pS2.r(AbstractC7360pS2.o(j(str, this.d.a(), random), ((Integer) zzba.zzc().b(AbstractC9820yE1.B9)).intValue(), TimeUnit.MILLISECONDS, this.g), new K12(this, c6487mJ2, str), this.e);
    }

    public final InterfaceFutureC8236sc0 j(final String str, final InputEvent inputEvent, Random random) {
        final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        if (!str.contains((CharSequence) zzba.zzc().b(AbstractC9820yE1.v9)) || this.b.zzQ()) {
            return AbstractC7360pS2.h(str);
        }
        builderBuildUpon.appendQueryParameter((String) zzba.zzc().b(AbstractC9820yE1.w9), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
        if (inputEvent != null) {
            return AbstractC7360pS2.f(AbstractC7360pS2.n(AbstractC4839gS2.C(this.c.a()), new WR2() { // from class: com.daaw.F12
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return this.a.d(builderBuildUpon, str, inputEvent, (Integer) obj);
                }
            }, this.f), Throwable.class, new WR2() { // from class: com.daaw.G12
                @Override // com.daaw.WR2
                public final InterfaceFutureC8236sc0 zza(Object obj) {
                    return this.a.e(builderBuildUpon, (Throwable) obj);
                }
            }, this.e);
        }
        builderBuildUpon.appendQueryParameter((String) zzba.zzc().b(AbstractC9820yE1.x9), "11");
        return AbstractC7360pS2.h(builderBuildUpon.toString());
    }
}
