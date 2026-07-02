package com.daaw;

import android.util.Log;
import com.daaw.InterfaceC4204eC;
import j$.util.Objects;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.daaw.Dw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0704Dw {
    public static final b m = new b();
    public final OG a;
    public final int b;
    public final int c;
    public final InterfaceC2177Rv d;
    public final InterfaceC2283Sv e;
    public final InterfaceC6983o51 f;
    public final WI0 g;
    public final a h;
    public final EnumC4772gC i;
    public final EnumC9190vz0 j;
    public final b k;
    public volatile boolean l;

    /* JADX INFO: renamed from: com.daaw.Dw$a */
    public interface a {
        InterfaceC4204eC a();
    }

    /* JADX INFO: renamed from: com.daaw.Dw$b */
    public static class b {
        public OutputStream a(File file) {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dw$c */
    public class c implements InterfaceC4204eC.b {
        public final CG a;
        public final Object b;

        public c(CG cg, Object obj) {
            this.a = cg;
            this.b = obj;
        }

        @Override // com.daaw.InterfaceC4204eC.b
        public boolean a(File file) {
            OutputStream outputStreamA = null;
            try {
                outputStreamA = C0704Dw.this.k.a(file);
                boolean zA = this.a.a(this.b, outputStreamA);
                if (outputStreamA == null) {
                    return zA;
                }
                try {
                    outputStreamA.close();
                    return zA;
                } catch (IOException unused) {
                    return zA;
                }
            } catch (FileNotFoundException unused2) {
                if (outputStreamA != null) {
                    try {
                        outputStreamA.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                if (outputStreamA != null) {
                    try {
                        outputStreamA.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
    }

    public C0704Dw(OG og, int i, int i2, InterfaceC2177Rv interfaceC2177Rv, InterfaceC2283Sv interfaceC2283Sv, InterfaceC6983o51 interfaceC6983o51, WI0 wi0, a aVar, EnumC4772gC enumC4772gC, EnumC9190vz0 enumC9190vz0) {
        this(og, i, i2, interfaceC2177Rv, interfaceC2283Sv, interfaceC6983o51, wi0, aVar, enumC4772gC, enumC9190vz0, m);
    }

    public final KI0 b(Object obj) {
        long jB = AbstractC1357Kd0.b();
        this.h.a().b(this.a.b(), new c(this.e.b(), obj));
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Wrote source to cache", jB);
        }
        long jB2 = AbstractC1357Kd0.b();
        KI0 ki0I = i(this.a.b());
        if (Log.isLoggable("DecodeJob", 2) && ki0I != null) {
            j("Decoded source from cache", jB2);
        }
        return ki0I;
    }

    public void c() {
        this.l = true;
        this.d.cancel();
    }

    public KI0 d() {
        return m(g());
    }

    public final KI0 e(Object obj) {
        if (this.i.c()) {
            return b(obj);
        }
        long jB = AbstractC1357Kd0.b();
        KI0 ki0C = this.e.e().c(obj, this.b, this.c);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Decoded from source", jB);
        }
        return ki0C;
    }

    public KI0 f() {
        if (!this.i.a()) {
            return null;
        }
        long jB = AbstractC1357Kd0.b();
        KI0 ki0I = i(this.a);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Decoded transformed from cache", jB);
        }
        long jB2 = AbstractC1357Kd0.b();
        KI0 ki0K = k(ki0I);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transcoded transformed from cache", jB2);
        }
        return ki0K;
    }

    public final KI0 g() {
        try {
            long jB = AbstractC1357Kd0.b();
            Object objA = this.d.a(this.j);
            if (Log.isLoggable("DecodeJob", 2)) {
                j("Fetched data", jB);
            }
            if (this.l) {
                this.d.b();
                return null;
            }
            KI0 ki0E = e(objA);
            this.d.b();
            return ki0E;
        } catch (Throwable th) {
            this.d.b();
            throw th;
        }
    }

    public KI0 h() {
        if (!this.i.c()) {
            return null;
        }
        long jB = AbstractC1357Kd0.b();
        KI0 ki0I = i(this.a.b());
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Decoded source from cache", jB);
        }
        return m(ki0I);
    }

    public final KI0 i(H70 h70) {
        File fileA = this.h.a().a(h70);
        if (fileA == null) {
            return null;
        }
        try {
            KI0 ki0C = this.e.f().c(fileA, this.b, this.c);
            if (ki0C == null) {
            }
            return ki0C;
        } finally {
            this.h.a().c(h70);
        }
    }

    public final void j(String str, long j) {
        AbstractC1357Kd0.a(j);
        Objects.toString(this.a);
    }

    public final KI0 k(KI0 ki0) {
        if (ki0 == null) {
            return null;
        }
        return this.g.a(ki0);
    }

    public final KI0 l(KI0 ki0) {
        if (ki0 == null) {
            return null;
        }
        KI0 ki0A = this.f.a(ki0, this.b, this.c);
        if (!ki0.equals(ki0A)) {
            ki0.c();
        }
        return ki0A;
    }

    public final KI0 m(KI0 ki0) {
        long jB = AbstractC1357Kd0.b();
        KI0 ki0L = l(ki0);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transformed resource from source", jB);
        }
        n(ki0L);
        long jB2 = AbstractC1357Kd0.b();
        KI0 ki0K = k(ki0L);
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Transcoded transformed from source", jB2);
        }
        return ki0K;
    }

    public final void n(KI0 ki0) {
        if (ki0 == null || !this.i.a()) {
            return;
        }
        long jB = AbstractC1357Kd0.b();
        this.h.a().b(this.a, new c(this.e.d(), ki0));
        if (Log.isLoggable("DecodeJob", 2)) {
            j("Wrote transformed from source to cache", jB);
        }
    }

    public C0704Dw(OG og, int i, int i2, InterfaceC2177Rv interfaceC2177Rv, InterfaceC2283Sv interfaceC2283Sv, InterfaceC6983o51 interfaceC6983o51, WI0 wi0, a aVar, EnumC4772gC enumC4772gC, EnumC9190vz0 enumC9190vz0, b bVar) {
        this.a = og;
        this.b = i;
        this.c = i2;
        this.d = interfaceC2177Rv;
        this.e = interfaceC2283Sv;
        this.f = interfaceC6983o51;
        this.g = wi0;
        this.h = aVar;
        this.i = enumC4772gC;
        this.j = enumC9190vz0;
        this.k = bVar;
    }
}
