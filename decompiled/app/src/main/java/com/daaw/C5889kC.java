package com.daaw;

import com.daaw.C5330iC;
import com.daaw.InterfaceC4204eC;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.kC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5889kC implements InterfaceC4204eC {
    public static C5889kC f;
    public final C5051hC a = new C5051hC();
    public final GM0 b = new GM0();
    public final File c;
    public final int d;
    public C5330iC e;

    public C5889kC(File file, int i) {
        this.c = file;
        this.d = i;
    }

    public static synchronized InterfaceC4204eC d(File file, int i) {
        try {
            if (f == null) {
                f = new C5889kC(file, i);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    @Override // com.daaw.InterfaceC4204eC
    public File a(H70 h70) {
        try {
            C5330iC.d dVarO0 = e().o0(this.b.a(h70));
            if (dVarO0 != null) {
                return dVarO0.a(0);
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.daaw.InterfaceC4204eC
    public void b(H70 h70, InterfaceC4204eC.b bVar) {
        String strA = this.b.a(h70);
        this.a.a(h70);
        try {
            C5330iC.b bVarW = e().W(strA);
            if (bVarW != null) {
                try {
                    if (bVar.a(bVarW.f(0))) {
                        bVarW.e();
                    }
                    bVarW.b();
                } catch (Throwable th) {
                    bVarW.b();
                    throw th;
                }
            }
            this.a.b(h70);
        } catch (IOException unused) {
            this.a.b(h70);
        } catch (Throwable th2) {
            this.a.b(h70);
            throw th2;
        }
    }

    @Override // com.daaw.InterfaceC4204eC
    public void c(H70 h70) {
        try {
            e().B0(this.b.a(h70));
        } catch (IOException unused) {
        }
    }

    public final synchronized C5330iC e() {
        try {
            if (this.e == null) {
                this.e = C5330iC.q0(this.c, 1, 1, this.d);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }
}
