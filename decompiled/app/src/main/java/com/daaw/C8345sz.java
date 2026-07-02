package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8345sz implements InterfaceC4577fX {
    public List a = new ArrayList();

    @Override // com.daaw.InterfaceC4577fX
    public void a(String str) {
        this.a.add(str);
    }

    public List b() {
        return this.a;
    }
}
