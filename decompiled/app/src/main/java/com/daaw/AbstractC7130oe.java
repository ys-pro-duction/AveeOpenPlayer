package com.daaw;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7130oe implements X6 {
    public final List a;

    public AbstractC7130oe(List list) {
        this.a = list;
    }

    @Override // com.daaw.X6
    public boolean g() {
        return this.a.isEmpty() || (this.a.size() == 1 && ((Y70) this.a.get(0)).h());
    }

    @Override // com.daaw.X6
    public List i() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
