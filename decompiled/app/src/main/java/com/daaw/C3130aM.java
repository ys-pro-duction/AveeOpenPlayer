package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3130aM {
    public static final byte[] m = new byte[0];
    public final Context a;
    public final C7050oL b;
    public final C5925kL c;
    public final Executor d;
    public final C5786jq e;
    public final C5786jq f;
    public final C5786jq g;
    public final com.google.firebase.remoteconfig.internal.c h;
    public final C7748qq i;
    public final com.google.firebase.remoteconfig.internal.d j;
    public final RL k;
    public final C8026rq l;

    public C3130aM(Context context, C7050oL c7050oL, RL rl, C5925kL c5925kL, Executor executor, C5786jq c5786jq, C5786jq c5786jq2, C5786jq c5786jq3, com.google.firebase.remoteconfig.internal.c cVar, C7748qq c7748qq, com.google.firebase.remoteconfig.internal.d dVar, C8026rq c8026rq) {
        this.a = context;
        this.b = c7050oL;
        this.k = rl;
        this.c = c5925kL;
        this.d = executor;
        this.e = c5786jq;
        this.f = c5786jq2;
        this.g = c5786jq3;
        this.h = cVar;
        this.i = c7748qq;
        this.j = dVar;
        this.l = c8026rq;
    }

    public static /* synthetic */ Void a(C3130aM c3130aM, C5091hM c5091hM) {
        c3130aM.j.k(c5091hM);
        return null;
    }

    public static /* synthetic */ AbstractC6963o11 e(final C3130aM c3130aM, AbstractC6963o11 abstractC6963o11, AbstractC6963o11 abstractC6963o112, AbstractC6963o11 abstractC6963o113) {
        c3130aM.getClass();
        if (!abstractC6963o11.n() || abstractC6963o11.k() == null) {
            return A11.e(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) abstractC6963o11.k();
        return (!abstractC6963o112.n() || m(bVar, (com.google.firebase.remoteconfig.internal.b) abstractC6963o112.k())) ? c3130aM.f.i(bVar).g(c3130aM.d, new InterfaceC1519Ls() { // from class: com.daaw.ZL
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o114) {
                return Boolean.valueOf(this.a.n(abstractC6963o114));
            }
        }) : A11.e(Boolean.FALSE);
    }

    public static C3130aM j() {
        return k(C7050oL.l());
    }

    public static C3130aM k(C7050oL c7050oL) {
        return ((GG0) c7050oL.j(GG0.class)).f();
    }

    public static boolean m(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return bVar2 == null || !bVar.g().equals(bVar2.g());
    }

    public static List r(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public AbstractC6963o11 f() {
        final AbstractC6963o11 abstractC6963o11E = this.e.e();
        final AbstractC6963o11 abstractC6963o11E2 = this.f.e();
        return A11.j(abstractC6963o11E, abstractC6963o11E2).i(this.d, new InterfaceC1519Ls() { // from class: com.daaw.XL
            @Override // com.daaw.InterfaceC1519Ls
            public final Object a(AbstractC6963o11 abstractC6963o11) {
                return C3130aM.e(this.a, abstractC6963o11E, abstractC6963o11E2, abstractC6963o11);
            }
        });
    }

    public InterfaceC9428wq g(InterfaceC9149vq interfaceC9149vq) {
        return this.l.a(interfaceC9149vq);
    }

    public AbstractC6963o11 h() {
        return this.h.i().p(KL.a(), new InterfaceC9066vZ0() { // from class: com.daaw.YL
            @Override // com.daaw.InterfaceC9066vZ0
            public final AbstractC6963o11 a(Object obj) {
                return A11.e(null);
            }
        });
    }

    public AbstractC6963o11 i() {
        return h().p(this.d, new InterfaceC9066vZ0() { // from class: com.daaw.WL
            @Override // com.daaw.InterfaceC9066vZ0
            public final AbstractC6963o11 a(Object obj) {
                return this.a.f();
            }
        });
    }

    public InterfaceC5370iM l(String str) {
        return this.i.f(str);
    }

    public final boolean n(AbstractC6963o11 abstractC6963o11) {
        if (!abstractC6963o11.n()) {
            return false;
        }
        this.e.d();
        if (abstractC6963o11.k() == null) {
            return true;
        }
        s(((com.google.firebase.remoteconfig.internal.b) abstractC6963o11.k()).d());
        return true;
    }

    public AbstractC6963o11 o(final C5091hM c5091hM) {
        return A11.c(this.d, new Callable() { // from class: com.daaw.VL
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C3130aM.a(this.a, c5091hM);
            }
        });
    }

    public void p(boolean z) {
        this.l.c(z);
    }

    public void q() {
        this.f.e();
        this.g.e();
        this.e.e();
    }

    public void s(JSONArray jSONArray) {
        if (this.c == null) {
            return;
        }
        try {
            this.c.m(r(jSONArray));
        } catch (C3316b1 | JSONException unused) {
        }
    }
}
