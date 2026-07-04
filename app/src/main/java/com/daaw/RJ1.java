package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbve;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class RJ1 implements InterfaceC2277St1 {
    public volatile CJ1 a;
    public final Context b;

    public RJ1(Context context) {
        this.b = context;
    }

    public static /* bridge */ /* synthetic */ void b(RJ1 rj1) {
        if (rj1.a == null) {
            return;
        }
        rj1.a.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.daaw.InterfaceC2277St1
    public final C3845cu1 zza(AbstractC4970gu1 abstractC4970gu1) throws C6933nu1 {
        Parcelable.Creator<zzbkt> creator = zzbkt.CREATOR;
        Map mapZzl = abstractC4970gu1.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbkt zzbktVar = new zzbkt(abstractC4970gu1.zzk(), strArr, strArr2);
        long jB = zzt.zzB().b();
        try {
            BT1 bt1 = new BT1();
            this.a = new CJ1(this.b, zzt.zzt().zzb(), new PJ1(this, bt1), new QJ1(this, bt1));
            this.a.checkAvailabilityAndConnect();
            NJ1 nj1 = new NJ1(this, zzbktVar);
            PS2 ps2 = AbstractC9322wT1.a;
            InterfaceFutureC8236sc0 interfaceFutureC8236sc0O = AbstractC7360pS2.o(AbstractC7360pS2.n(bt1, nj1, ps2), ((Integer) zzba.zzc().b(AbstractC9820yE1.p4)).intValue(), TimeUnit.MILLISECONDS, AbstractC9322wT1.d);
            interfaceFutureC8236sc0O.g(new OJ1(this), ps2);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) interfaceFutureC8236sc0O.get();
            zze.zza("Http assets remote cache took " + (zzt.zzB().b() - jB) + "ms");
            zzbkv zzbkvVar = (zzbkv) new zzbve(parcelFileDescriptor).e(zzbkv.CREATOR);
            if (zzbkvVar == null) {
                return null;
            }
            if (zzbkvVar.B) {
                throw new C6933nu1(zzbkvVar.C);
            }
            if (zzbkvVar.F.length != zzbkvVar.G.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = zzbkvVar.F;
                if (i >= strArr3.length) {
                    return new C3845cu1(zzbkvVar.D, zzbkvVar.E, map, zzbkvVar.H, zzbkvVar.I);
                }
                map.put(strArr3[i], zzbkvVar.G[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            zze.zza("Http assets remote cache took " + (zzt.zzB().b() - jB) + "ms");
            return null;
        } catch (Throwable th) {
            zze.zza("Http assets remote cache took " + (zzt.zzB().b() - jB) + "ms");
            throw th;
        }
    }
}
