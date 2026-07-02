package com.daaw;

/* JADX INFO: renamed from: com.daaw.jV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5688jV1 extends AbstractC2281Su1 {
    public static final C5688jV1 c = new C5688jV1();

    @Override // com.daaw.AbstractC2281Su1
    public final InterfaceC2697Wu1 b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new C2905Yu1() : "mvhd".equals(str) ? new C3009Zu1() : new C3292av1(str);
    }
}
