package com.daaw;

import com.daaw.AbstractC5362iK;
import com.daaw.InterfaceC7942rZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7435pj0 implements InterfaceC7942rZ {
    public final a a = new a();

    /* JADX INFO: renamed from: com.daaw.pj0$a */
    public static class a {
        public final HashMap a = new HashMap();

        public boolean a(UI0 ui0) {
            AbstractC6557mb.d(ui0.p() % 2 == 1, "Expected a collection path.", new Object[0]);
            String strL = ui0.l();
            UI0 ui02 = (UI0) ui0.r();
            HashSet hashSet = (HashSet) this.a.get(strL);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.a.put(strL, hashSet);
            }
            return hashSet.add(ui02);
        }

        public List b(String str) {
            HashSet hashSet = (HashSet) this.a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.EMPTY_LIST;
        }
    }

    @Override // com.daaw.InterfaceC7942rZ
    public InterfaceC7942rZ.a a(Z01 z01) {
        return InterfaceC7942rZ.a.NONE;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public String c() {
        return null;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public List d(String str) {
        return this.a.b(str);
    }

    @Override // com.daaw.InterfaceC7942rZ
    public AbstractC5362iK.a e(Z01 z01) {
        return AbstractC5362iK.a.B;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public AbstractC5362iK.a f(String str) {
        return AbstractC5362iK.a.B;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public List g(Z01 z01) {
        return null;
    }

    @Override // com.daaw.InterfaceC7942rZ
    public void h(UI0 ui0) {
        this.a.a(ui0);
    }

    @Override // com.daaw.InterfaceC7942rZ
    public void start() {
    }

    @Override // com.daaw.InterfaceC7942rZ
    public void i(SY sy) {
    }

    @Override // com.daaw.InterfaceC7942rZ
    public void b(String str, AbstractC5362iK.a aVar) {
    }
}
