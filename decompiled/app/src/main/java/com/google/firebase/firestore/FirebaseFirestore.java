package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.daaw.AbstractC5806ju;
import com.daaw.AbstractC8342sy0;
import com.daaw.C0976Gm;
import com.daaw.C10125zL;
import com.daaw.C10129zM;
import com.daaw.C1657Na1;
import com.daaw.C3851cw;
import com.daaw.C4129dw;
import com.daaw.C7050oL;
import com.daaw.C7612qM;
import com.daaw.C9009vL;
import com.daaw.C9632xb;
import com.daaw.InterfaceC7086oU;
import com.daaw.InterfaceC7784qy;
import com.daaw.UI0;
import com.google.firebase.firestore.d;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseFirestore {
    public final Context a;
    public final C3851cw b;
    public final String c;
    public final AbstractC5806ju d;
    public final AbstractC5806ju e;
    public final C9632xb f;
    public final C7050oL g;
    public final C1657Na1 h;
    public final a i;
    public d j = new d.b().f();
    public volatile C10129zM k;
    public final InterfaceC7086oU l;

    public interface a {
    }

    public FirebaseFirestore(Context context, C3851cw c3851cw, String str, AbstractC5806ju abstractC5806ju, AbstractC5806ju abstractC5806ju2, C9632xb c9632xb, C7050oL c7050oL, a aVar, InterfaceC7086oU interfaceC7086oU) {
        this.a = (Context) AbstractC8342sy0.b(context);
        this.b = (C3851cw) AbstractC8342sy0.b((C3851cw) AbstractC8342sy0.b(c3851cw));
        this.h = new C1657Na1(c3851cw);
        this.c = (String) AbstractC8342sy0.b(str);
        this.d = (AbstractC5806ju) AbstractC8342sy0.b(abstractC5806ju);
        this.e = (AbstractC5806ju) AbstractC8342sy0.b(abstractC5806ju2);
        this.f = (C9632xb) AbstractC8342sy0.b(c9632xb);
        this.g = c7050oL;
        this.i = aVar;
        this.l = interfaceC7086oU;
    }

    public static FirebaseFirestore e() {
        C7050oL c7050oLL = C7050oL.l();
        if (c7050oLL != null) {
            return f(c7050oLL, "(default)");
        }
        throw new IllegalStateException("You must call FirebaseApp.initializeApp first.");
    }

    public static FirebaseFirestore f(C7050oL c7050oL, String str) {
        AbstractC8342sy0.c(c7050oL, "Provided FirebaseApp must not be null.");
        e eVar = (e) c7050oL.j(e.class);
        AbstractC8342sy0.c(eVar, "Firestore component is not present.");
        return eVar.a(str);
    }

    public static FirebaseFirestore h(Context context, C7050oL c7050oL, InterfaceC7784qy interfaceC7784qy, InterfaceC7784qy interfaceC7784qy2, String str, a aVar, InterfaceC7086oU interfaceC7086oU) {
        String strE = c7050oL.n().e();
        if (strE == null) {
            throw new IllegalArgumentException("FirebaseOptions.getProjectId() cannot be null");
        }
        C3851cw c3851cwC = C3851cw.c(strE, str);
        C9632xb c9632xb = new C9632xb();
        return new FirebaseFirestore(context, c3851cwC, c7050oL.m(), new C10125zL(interfaceC7784qy), new C9009vL(interfaceC7784qy2), c9632xb, c7050oL, aVar, interfaceC7086oU);
    }

    @Keep
    public static void setClientLanguage(String str) {
        C7612qM.g(str);
    }

    public C0976Gm a(String str) {
        AbstractC8342sy0.c(str, "Provided collection path must not be null.");
        b();
        return new C0976Gm(UI0.u(str), this);
    }

    public final void b() {
        if (this.k != null) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.k != null) {
                    return;
                }
                this.k = new C10129zM(this.a, new C4129dw(this.b, this.c, this.j.c(), this.j.e()), this.j, this.d, this.e, this.f, this.l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C10129zM c() {
        return this.k;
    }

    public C3851cw d() {
        return this.b;
    }

    public C1657Na1 g() {
        return this.h;
    }
}
