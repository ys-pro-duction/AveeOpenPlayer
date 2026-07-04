package com.daaw;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxh;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class ZU1 implements InterfaceC7659qX2 {
    public final Context a;
    public final InterfaceC7659qX2 b;
    public final String c;
    public final int d;
    public InputStream f;
    public boolean g;
    public Uri h;
    public volatile zzaxh i;
    public C5835k03 m;
    public boolean j = false;
    public boolean k = false;
    public final AtomicLong l = new AtomicLong(-1);
    public final boolean e = ((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue();

    public ZU1(Context context, InterfaceC7659qX2 interfaceC7659qX2, String str, int i, InterfaceC3917d93 interfaceC3917d93, YU1 yu1) {
        this.a = context;
        this.b = interfaceC7659qX2;
        this.c = str;
        this.d = i;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws IOException {
        Long l;
        if (this.g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.g = true;
        Uri uri = c5835k03.a;
        this.h = uri;
        this.m = c5835k03;
        this.i = zzaxh.e(uri);
        zzaxe zzaxeVarB = null;
        byte b = 0;
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.f4)).booleanValue()) {
            if (this.i != null) {
                this.i.I = c5835k03.f;
                this.i.J = BO2.c(this.c);
                this.i.K = this.d;
                zzaxeVarB = zzt.zzc().b(this.i);
            }
            if (zzaxeVarB != null && zzaxeVarB.v()) {
                this.j = zzaxeVarB.E();
                this.k = zzaxeVarB.D();
                if (!l()) {
                    this.f = zzaxeVarB.p();
                    return -1L;
                }
            }
        } else if (this.i != null) {
            this.i.I = c5835k03.f;
            this.i.J = BO2.c(this.c);
            this.i.K = this.d;
            if (this.i.H) {
                l = (Long) zzba.zzc().b(AbstractC9820yE1.h4);
            } else {
                l = (Long) zzba.zzc().b(AbstractC9820yE1.g4);
            }
            long jLongValue = l.longValue();
            zzt.zzB().b();
            zzt.zzd();
            Future futureA = C5605jB1.a(this.a, this.i);
            try {
                C5887kB1 c5887kB1 = (C5887kB1) futureA.get(jLongValue, TimeUnit.MILLISECONDS);
                c5887kB1.d();
                this.j = c5887kB1.f();
                this.k = c5887kB1.e();
                c5887kB1.a();
                if (l()) {
                    zzt.zzB().b();
                    throw null;
                }
                this.f = c5887kB1.c();
                zzt.zzB().b();
                throw null;
            } catch (InterruptedException unused) {
                futureA.cancel(false);
                Thread.currentThread().interrupt();
                zzt.zzB().b();
                throw null;
            } catch (ExecutionException | TimeoutException unused2) {
                futureA.cancel(false);
                zzt.zzB().b();
                throw null;
            }
        }
        if (this.i != null) {
            this.m = new C5835k03(Uri.parse(this.i.B), null, c5835k03.e, c5835k03.f, c5835k03.g, null, c5835k03.i);
        }
        return this.b.a(this.m);
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (!this.g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.b.d(bArr, i, i2);
    }

    public final boolean l() {
        if (!this.e) {
            return false;
        }
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.i4)).booleanValue() || this.j) {
            return ((Boolean) zzba.zzc().b(AbstractC9820yE1.j4)).booleanValue() && !this.k;
        }
        return true;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.h;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() throws IOException {
        if (!this.g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.g = false;
        this.h = null;
        InputStream inputStream = this.f;
        if (inputStream == null) {
            this.b.zzd();
        } else {
            AbstractC7656qX.a(inputStream);
            this.f = null;
        }
    }

    @Override // com.daaw.InterfaceC7659qX2, com.daaw.K83
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void k(InterfaceC3917d93 interfaceC3917d93) {
    }
}
