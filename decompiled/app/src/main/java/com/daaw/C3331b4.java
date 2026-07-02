package com.daaw;

import android.os.Bundle;
import com.daaw.InterfaceC7784qy;
import com.daaw.W3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.b4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3331b4 {
    public final InterfaceC7784qy a;
    public volatile InterfaceC3609c4 b;
    public volatile InterfaceC0848Fg c;
    public final List d;

    public C3331b4(InterfaceC7784qy interfaceC7784qy) {
        this(interfaceC7784qy, new C3647cC(), new C8962v91());
    }

    public static /* synthetic */ void a(C3331b4 c3331b4, InterfaceC7569qB0 interfaceC7569qB0) {
        c3331b4.getClass();
        C2106Rd0.f().b("AnalyticsConnector now available.");
        W3 w3 = (W3) interfaceC7569qB0.get();
        C1108Ht c1108Ht = new C1108Ht(w3);
        C9443wt c9443wt = new C9443wt();
        if (g(w3, c9443wt) == null) {
            C2106Rd0.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        C2106Rd0.f().b("Registered Firebase Analytics listener.");
        C0640Dg c0640Dg = new C0640Dg();
        C3495bg c3495bg = new C3495bg(c1108Ht, 500, TimeUnit.MILLISECONDS);
        synchronized (c3331b4) {
            try {
                Iterator it = c3331b4.d.iterator();
                while (it.hasNext()) {
                    c0640Dg.a((InterfaceC0744Eg) it.next());
                }
                c9443wt.d(c0640Dg);
                c9443wt.e(c3495bg);
                c3331b4.c = c0640Dg;
                c3331b4.b = c3495bg;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(C3331b4 c3331b4, InterfaceC0744Eg interfaceC0744Eg) {
        synchronized (c3331b4) {
            try {
                if (c3331b4.c instanceof C3647cC) {
                    c3331b4.d.add(interfaceC0744Eg);
                }
                c3331b4.c.a(interfaceC0744Eg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static W3.a g(W3 w3, C9443wt c9443wt) {
        W3.a aVarB = w3.b("clx", c9443wt);
        if (aVarB != null) {
            return aVarB;
        }
        C2106Rd0.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        W3.a aVarB2 = w3.b("crash", c9443wt);
        if (aVarB2 != null) {
            C2106Rd0.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return aVarB2;
    }

    public InterfaceC3609c4 d() {
        return new InterfaceC3609c4() { // from class: com.daaw.Z3
            @Override // com.daaw.InterfaceC3609c4
            public final void a(String str, Bundle bundle) {
                this.a.b.a(str, bundle);
            }
        };
    }

    public InterfaceC0848Fg e() {
        return new InterfaceC0848Fg() { // from class: com.daaw.Y3
            @Override // com.daaw.InterfaceC0848Fg
            public final void a(InterfaceC0744Eg interfaceC0744Eg) {
                C3331b4.c(this.a, interfaceC0744Eg);
            }
        };
    }

    public final void f() {
        this.a.a(new InterfaceC7784qy.a() { // from class: com.daaw.a4
            @Override // com.daaw.InterfaceC7784qy.a
            public final void a(InterfaceC7569qB0 interfaceC7569qB0) {
                C3331b4.a(this.a, interfaceC7569qB0);
            }
        });
    }

    public C3331b4(InterfaceC7784qy interfaceC7784qy, InterfaceC0848Fg interfaceC0848Fg, InterfaceC3609c4 interfaceC3609c4) {
        this.a = interfaceC7784qy;
        this.c = interfaceC0848Fg;
        this.d = new ArrayList();
        this.b = interfaceC3609c4;
        f();
    }
}
