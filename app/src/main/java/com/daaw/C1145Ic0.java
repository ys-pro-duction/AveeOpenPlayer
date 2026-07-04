package com.daaw;

import androidx.lifecycle.y;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: com.daaw.Ic0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1145Ic0 extends AbstractC1041Hc0 {
    public final InterfaceC1764Ob0 a;
    public final a b;

    /* JADX INFO: renamed from: com.daaw.Ic0$a */
    public static class a extends AbstractC8526te1 {
        public static final y.c d = new C0069a();
        public C3724cV0 b = new C3724cV0();
        public boolean c = false;

        /* JADX INFO: renamed from: com.daaw.Ic0$a$a, reason: collision with other inner class name */
        public static class C0069a implements y.c {
            @Override // androidx.lifecycle.y.c
            public AbstractC8526te1 a(Class cls) {
                return new a();
            }

            @Override // androidx.lifecycle.y.c
            public /* synthetic */ AbstractC8526te1 b(J50 j50, AbstractC5247hu abstractC5247hu) {
                return AbstractC9091ve1.a(this, j50, abstractC5247hu);
            }

            @Override // androidx.lifecycle.y.c
            public /* synthetic */ AbstractC8526te1 c(Class cls, AbstractC5247hu abstractC5247hu) {
                return AbstractC9091ve1.c(this, cls, abstractC5247hu);
            }
        }

        public static a f(C0313Ae1 c0313Ae1) {
            return (a) new androidx.lifecycle.y(c0313Ae1, d).b(a.class);
        }

        @Override // com.daaw.AbstractC8526te1
        public void d() {
            super.d();
            if (this.b.m() <= 0) {
                this.b.c();
            } else {
                AbstractC6314li0.a(this.b.n(0));
                throw null;
            }
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.b.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.b.m() <= 0) {
                    return;
                }
                AbstractC6314li0.a(this.b.n(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.k(0));
                printWriter.print(": ");
                throw null;
            }
        }

        public void g() {
            if (this.b.m() <= 0) {
                return;
            }
            AbstractC6314li0.a(this.b.n(0));
            throw null;
        }
    }

    public C1145Ic0(InterfaceC1764Ob0 interfaceC1764Ob0, C0313Ae1 c0313Ae1) {
        this.a = interfaceC1764Ob0;
        this.b = a.f(c0313Ae1);
    }

    @Override // com.daaw.AbstractC1041Hc0
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.daaw.AbstractC1041Hc0
    public void c() {
        this.b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractC8333sw.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
