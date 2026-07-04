package com.daaw;

import com.daaw.AbstractC1316Jt;
import com.daaw.InterfaceC7784qy;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.Gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1004Gt implements InterfaceC0692Dt {
    public static final InterfaceC5772jn0 c = new b();
    public final InterfaceC7784qy a;
    public final AtomicReference b = new AtomicReference(null);

    /* JADX INFO: renamed from: com.daaw.Gt$b */
    public static final class b implements InterfaceC5772jn0 {
        public b() {
        }

        @Override // com.daaw.InterfaceC5772jn0
        public File a() {
            return null;
        }

        @Override // com.daaw.InterfaceC5772jn0
        public File b() {
            return null;
        }

        @Override // com.daaw.InterfaceC5772jn0
        public File c() {
            return null;
        }

        @Override // com.daaw.InterfaceC5772jn0
        public AbstractC1316Jt.a d() {
            return null;
        }

        @Override // com.daaw.InterfaceC5772jn0
        public File e() {
            return null;
        }

        @Override // com.daaw.InterfaceC5772jn0
        public File f() {
            return null;
        }

        @Override // com.daaw.InterfaceC5772jn0
        public File g() {
            return null;
        }
    }

    public C1004Gt(InterfaceC7784qy interfaceC7784qy) {
        this.a = interfaceC7784qy;
        interfaceC7784qy.a(new InterfaceC7784qy.a() { // from class: com.daaw.Et
            @Override // com.daaw.InterfaceC7784qy.a
            public final void a(InterfaceC7569qB0 interfaceC7569qB0) {
                C1004Gt.f(this.a, interfaceC7569qB0);
            }
        });
    }

    public static /* synthetic */ void f(C1004Gt c1004Gt, InterfaceC7569qB0 interfaceC7569qB0) {
        c1004Gt.getClass();
        C2106Rd0.f().b("Crashlytics native component now available.");
        c1004Gt.b.set((InterfaceC0692Dt) interfaceC7569qB0.get());
    }

    @Override // com.daaw.InterfaceC0692Dt
    public InterfaceC5772jn0 a(String str) {
        InterfaceC0692Dt interfaceC0692Dt = (InterfaceC0692Dt) this.b.get();
        return interfaceC0692Dt == null ? c : interfaceC0692Dt.a(str);
    }

    @Override // com.daaw.InterfaceC0692Dt
    public boolean b() {
        InterfaceC0692Dt interfaceC0692Dt = (InterfaceC0692Dt) this.b.get();
        return interfaceC0692Dt != null && interfaceC0692Dt.b();
    }

    @Override // com.daaw.InterfaceC0692Dt
    public boolean c(String str) {
        InterfaceC0692Dt interfaceC0692Dt = (InterfaceC0692Dt) this.b.get();
        return interfaceC0692Dt != null && interfaceC0692Dt.c(str);
    }

    @Override // com.daaw.InterfaceC0692Dt
    public void d(final String str, final String str2, final long j, final AbstractC3454bX0 abstractC3454bX0) {
        C2106Rd0.f().i("Deferring native open session: " + str);
        this.a.a(new InterfaceC7784qy.a() { // from class: com.daaw.Ft
            @Override // com.daaw.InterfaceC7784qy.a
            public final void a(InterfaceC7569qB0 interfaceC7569qB0) {
                ((InterfaceC0692Dt) interfaceC7569qB0.get()).d(str, str2, j, abstractC3454bX0);
            }
        });
    }
}
