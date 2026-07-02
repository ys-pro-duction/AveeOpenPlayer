package com.daaw;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxh;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class QV1 extends TT2 {
    public final Context e;
    public final InterfaceC7659qX2 f;
    public final String g;
    public final int h;
    public final boolean i;
    public InputStream j;
    public boolean k;
    public Uri l;
    public volatile zzaxh m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public InterfaceFutureC8236sc0 s;
    public final AtomicLong t;
    public final C3451bW1 u;

    public QV1(Context context, InterfaceC7659qX2 interfaceC7659qX2, String str, int i, InterfaceC3917d93 interfaceC3917d93, C3451bW1 c3451bW1) {
        super(false);
        this.e = context;
        this.f = interfaceC7659qX2;
        this.u = c3451bW1;
        this.g = str;
        this.h = i;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0L;
        this.t = new AtomicLong(-1L);
        this.s = null;
        this.i = ((Boolean) zzba.zzc().b(AbstractC9820yE1.O1)).booleanValue();
        k(interfaceC3917d93);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [com.daaw.dW1] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws Throwable {
        zzaxe zzaxeVarB;
        Long l;
        Throwable th;
        boolean z;
        boolean z2;
        long jB;
        StringBuilder sb;
        C5887kB1 c5887kB1;
        if (this.k) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r3 = 1;
        this.k = true;
        this.l = c5835k03.a;
        if (!this.i) {
            n(c5835k03);
        }
        this.m = zzaxh.e(c5835k03.a);
        ?? r4 = -1;
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.f4)).booleanValue()) {
            if (this.m != null) {
                this.m.I = c5835k03.f;
                this.m.J = BO2.c(this.g);
                this.m.K = this.h;
                zzaxeVarB = zzt.zzc().b(this.m);
            } else {
                zzaxeVarB = null;
            }
            if (zzaxeVarB != null && zzaxeVarB.v()) {
                this.n = zzaxeVarB.s();
                this.p = zzaxeVarB.E();
                this.q = zzaxeVarB.D();
                this.r = zzaxeVarB.e();
                this.o = true;
                if (!v()) {
                    this.j = zzaxeVarB.p();
                    if (this.i) {
                        n(c5835k03);
                    }
                    return -1L;
                }
            }
        } else if (this.m != null) {
            this.m.I = c5835k03.f;
            this.m.J = BO2.c(this.g);
            this.m.K = this.h;
            if (this.m.H) {
                l = (Long) zzba.zzc().b(AbstractC9820yE1.h4);
            } else {
                l = (Long) zzba.zzc().b(AbstractC9820yE1.g4);
            }
            long jLongValue = l.longValue();
            long jB2 = zzt.zzB().b();
            zzt.zzd();
            Future futureA = C5605jB1.a(this.e, this.m);
            try {
                try {
                    c5887kB1 = (C5887kB1) futureA.get(jLongValue, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                    z2 = false;
                } catch (ExecutionException | TimeoutException unused2) {
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    r3 = 0;
                }
                try {
                    this.n = c5887kB1.d();
                    this.p = c5887kB1.f();
                    this.q = c5887kB1.e();
                    this.r = c5887kB1.a();
                    if (!v()) {
                        this.j = c5887kB1.c();
                        if (this.i) {
                            n(c5835k03);
                        }
                        long jB3 = zzt.zzB().b() - jB2;
                        this.u.a.b0(true, jB3);
                        this.o = true;
                        zze.zza("Cache connection took " + jB3 + "ms");
                        return -1L;
                    }
                    long jB4 = zzt.zzB().b() - jB2;
                    this.u.a.b0(true, jB4);
                    this.o = true;
                    sb = new StringBuilder();
                    sb.append("Cache connection took ");
                    sb.append(jB4);
                } catch (InterruptedException unused3) {
                    z2 = true;
                    futureA.cancel(true);
                    Thread.currentThread().interrupt();
                    jB = zzt.zzB().b() - jB2;
                    this.u.a.b0(z2, jB);
                    this.o = z2;
                    sb = new StringBuilder();
                    r4 = z2;
                    sb.append("Cache connection took ");
                    sb.append(jB);
                } catch (ExecutionException | TimeoutException unused4) {
                    z = true;
                    futureA.cancel(true);
                    jB = zzt.zzB().b() - jB2;
                    this.u.a.b0(z, jB);
                    this.o = z;
                    sb = new StringBuilder();
                    r4 = z;
                    sb.append("Cache connection took ");
                    sb.append(jB);
                } catch (Throwable th3) {
                    th = th3;
                    long jB5 = zzt.zzB().b() - jB2;
                    this.u.a.b0(r3, jB5);
                    this.o = r3;
                    zze.zza("Cache connection took " + jB5 + "ms");
                    throw th;
                }
                sb.append("ms");
                zze.zza(sb.toString());
            } catch (Throwable th4) {
                th = th4;
                r3 = r4;
            }
        }
        this.o = false;
        if (this.m != null) {
            c5835k03 = new C5835k03(Uri.parse(this.m.B), null, c5835k03.e, c5835k03.f, c5835k03.g, null, c5835k03.i);
        }
        return this.f.a(c5835k03);
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws IOException {
        if (!this.k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.j;
        int iD = inputStream != null ? inputStream.read(bArr, i, i2) : this.f.d(bArr, i, i2);
        if (this.i && this.j == null) {
            return iD;
        }
        b(iD);
        return iD;
    }

    public final long o() {
        return this.r;
    }

    public final long p() {
        if (this.m == null) {
            return -1L;
        }
        if (this.t.get() != -1) {
            return this.t.get();
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = AbstractC9322wT1.a.S0(new Callable() { // from class: com.daaw.PV1
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.a.q();
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.s.isDone()) {
            return -1L;
        }
        try {
            this.t.compareAndSet(-1L, ((Long) this.s.get()).longValue());
            return this.t.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1L;
        }
    }

    public final /* synthetic */ Long q() {
        return Long.valueOf(zzt.zzc().a(this.m));
    }

    public final boolean r() {
        return this.n;
    }

    public final boolean s() {
        return this.q;
    }

    public final boolean t() {
        return this.p;
    }

    public final boolean u() {
        return this.o;
    }

    public final boolean v() {
        if (!this.i) {
            return false;
        }
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.i4)).booleanValue() || this.p) {
            return ((Boolean) zzba.zzc().b(AbstractC9820yE1.j4)).booleanValue() && !this.q;
        }
        return true;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.l;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() throws IOException {
        if (!this.k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.k = false;
        this.l = null;
        boolean z = (this.i && this.j == null) ? false : true;
        InputStream inputStream = this.j;
        if (inputStream != null) {
            AbstractC7656qX.a(inputStream);
            this.j = null;
        } else {
            this.f.zzd();
        }
        if (z) {
            l();
        }
    }
}
