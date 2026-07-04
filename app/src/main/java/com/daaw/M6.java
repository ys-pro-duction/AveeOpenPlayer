package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class M6 implements X6 {
    public final List a;

    public M6(List list) {
        this.a = list;
    }

    @Override // com.daaw.X6
    public boolean g() {
        return this.a.size() == 1 && ((Y70) this.a.get(0)).h();
    }

    @Override // com.daaw.X6
    public AbstractC9089ve h() {
        return ((Y70) this.a.get(0)).h() ? new C3016Zw0(this.a) : new C8042rt0(this.a);
    }

    @Override // com.daaw.X6
    public List i() {
        return this.a;
    }
}
