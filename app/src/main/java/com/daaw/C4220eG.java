package com.daaw;

/* JADX INFO: renamed from: com.daaw.eG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4220eG implements InterfaceC5143hZ {
    public final boolean B;

    public C4220eG(boolean z) {
        this.B = z;
    }

    @Override // com.daaw.InterfaceC5143hZ
    public boolean d() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC5143hZ
    public C7460po0 h() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
